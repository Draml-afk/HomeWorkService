package com.bignerdranch.android.homeworkservice.data

import android.app.IntentService
import android.app.PendingIntent
import android.content.Intent
import android.util.Log
import android.widget.Toast
import com.bignerdranch.android.homeworkservice.MainActivity
import com.bignerdranch.android.homeworkservice.data.api.RetrofitInstance
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class MyService : IntentService("MyService") {
    override fun onHandleIntent(intent: Intent?) {

        val pending = intent?.getParcelableExtra<PendingIntent>(MainActivity.SERVICE_URL)


        RetrofitInstance.retroServer.getText(129884).enqueue(object :
            Callback<Result> {
            override fun onResponse(call: Call<Result>, response: Response<Result>) {

                val result = Intent()
                result.putExtra(
                    MainActivity.SERVICE_URL,
                    response.body()!!.info.licenseLinks[0]
                )
                pending?.send(
                    this@MyService,
                    MainActivity.REQUEST_CODE,
                    result

                )

                Log.d("happy", "onHandleIntent")
            }

            override fun onFailure(call: Call<Result>, t: Throwable) {
                Toast.makeText(this@MyService, "error $call", Toast.LENGTH_LONG).show()
            }
        })


    }
}