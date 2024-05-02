package com.example.myapplication.module

import com.example.myapplication.DatabaseHelper
import com.example.myapplication.NetworkUtility
import dagger.Module
import dagger.Provides

@Module
class NetworkModule {
    @Provides
    fun getNetworkUtility() : NetworkUtility {
        return NetworkUtility()
    }
}