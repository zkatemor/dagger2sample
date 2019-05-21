package com.zkatemor.dagger2sample.module

import com.zkatemor.dagger2sample.DatabaseHelper
import dagger.Module
import dagger.Provides

@Module
class StorageModule {
    @Provides
    fun provideDatabaseHelper(): DatabaseHelper {
        return DatabaseHelper()
    }
}