package com.example.myapplication

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var databaseHelper: DatabaseHelper
    @Inject
    lateinit var networkUtility: NetworkUtility

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //val app: AppComponent = (application as App).appComponent
       // databaseHelper = app.getDb()
        //networkUtility = app.getNt()
        (application as App).appComponent.injectToMainActivity(this)
        Log.d("RRR",databaseHelper.toString())
        Log.d("RRR",networkUtility.toString())

    }
}