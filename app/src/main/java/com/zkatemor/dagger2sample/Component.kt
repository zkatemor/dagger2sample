package com.zkatemor.dagger2sample

import com.zkatemor.dagger2sample.module.NetworkModule
import com.zkatemor.dagger2sample.module.StorageModule
import dagger.Component

@Component(modules = [(StorageModule::class), (NetworkModule::class)])
interface Component {
    /*fun getNetworkUtils(): NetworkUtils
    fun getDatabaseHelper(): DatabaseHelper*/
    fun injectsMainActivity(mainActivity: MainActivity)
}