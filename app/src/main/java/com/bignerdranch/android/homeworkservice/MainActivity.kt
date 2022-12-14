package com.bignerdranch.android.homeworkservice


import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity
import com.bignerdranch.android.homeworkservice.data.MyService
import com.bignerdranch.android.homeworkservice.databinding.ActivityMainBinding
import com.bumptech.glide.Glide


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.web.webViewClient = WebViewClient()


        val service = Intent(this, MyService::class.java)
        val pending = createPendingResult(
            REQUEST_CODE,
            Intent(),
            0
        )
        service.putExtra(SERVICE_URL, pending)

        startService(service)
        Log.d("happy", "start Service")


        binding.button.setOnClickListener {

            Glide
                .with(this@MainActivity)
                .load("https://answit.com/wp-content/uploads/2017/01/full-hd.jpg")
                .error(R.drawable.ic_launcher_foreground)
                .into(binding.image)
            Log.d("happy", "Glide")
        }
    }

    companion object {
        const val SERVICE_URL = "SERVICE URL"
        const val REQUEST_CODE = 11

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if (requestCode == REQUEST_CODE) {
            binding.buttonService.setOnClickListener {
                val site = data?.getStringExtra(SERVICE_URL) as String
                binding.web.loadUrl(site)
            }
        } else
            super.onActivityResult(requestCode, resultCode, data)
    }


}

