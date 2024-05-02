package com.example.myapplication.module

import com.example.myapplication.DatabaseHelper
import dagger.Module
import dagger.Provides

@Module
class DatabaseModule {
    @Provides
    fun getDatabaseHelper() : DatabaseHelper {
        return DatabaseHelper()
    }
}