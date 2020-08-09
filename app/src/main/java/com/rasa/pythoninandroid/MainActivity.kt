package com.rasa.pythoninandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.chaquo.python.Python
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val python = Python.getInstance()
        val helloModule = python.getModule("Hey")
        val callAttr = helloModule.callAttr("sayHello")
        Log.i("=============>", "onCreate:" + callAttr)
        tvHello.text = "" + callAttr
    }
}