package com.bignerdranch.android.homeworkservice


import android.os.Bundle
import android.util.Log
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.bignerdranch.android.homeworkservice.databinding.ActivityMainBinding
import com.bumptech.glide.Glide
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val retrofit = Retrofit.Builder()
            .baseUrl("https://api.artic.edu")
            .addConverterFactory(GsonConverterFactory.create())
            .build()


            val server = retrofit.create(ApiService::class.java)


//        binding.image.setImageDrawable(
//            ContextCompat.getDrawable(this, R.drawable.ic_launcher_background))

        binding.web.webViewClient = WebViewClient()

        lifecycleScope.launch {

            Log.d("happy",server.getText(129884)
                .data.apiLink)

            binding.web.loadUrl(server.getText(129884).data.apiLink)

        }

        binding.button.setOnClickListener {
            Glide
                .with(this@MainActivity)
                .load("https://cdn1.cruisedirect.com/sites/default/files/Caribbean_Hero_0.jpg")
                .error(R.drawable.ic_launcher_foreground)
                .into(binding.image);
        }

    }


}