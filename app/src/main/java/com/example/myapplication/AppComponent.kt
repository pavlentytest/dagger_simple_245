package com.example.myapplication

import com.example.myapplication.module.DatabaseModule
import com.example.myapplication.module.NetworkModule
import dagger.Component

@Component(modules=[DatabaseModule::class,NetworkModule::class])
interface AppComponent {
    fun getDb() : DatabaseHelper
    fun getNt() : NetworkUtility

    fun injectToMainActivity(mainActivity: MainActivity)
}