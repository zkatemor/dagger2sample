package com.zkatemor.dagger2sample.module

import dagger.Module
import dagger.Provides
import com.zkatemor.dagger2sample.NetworkUtils

@Module
class NetworkModule {
    @Provides
    fun provideNetworkUtils(): NetworkUtils {
        return NetworkUtils()
    }
}