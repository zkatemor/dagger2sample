package com.zkatemor.dagger2sample.app

import android.app.Application
import com.zkatemor.dagger2sample.Component
import com.zkatemor.dagger2sample.DaggerComponent

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        component = DaggerComponent.create()
    }

    companion object {
        var component: Component? = null
            private set
    }
}
