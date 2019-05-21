package com.zkatemor.dagger2sample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.zkatemor.dagger2sample.app.App
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var databaseHelper: DatabaseHelper

    @Inject
    lateinit var networkUtils: NetworkUtils

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*databaseHelper = App.component!!.getDatabaseHelper()
        networkUtils = App.component!!.getNetworkUtils()*/

        App.component!!.injectsMainActivity(this)
    }
}
