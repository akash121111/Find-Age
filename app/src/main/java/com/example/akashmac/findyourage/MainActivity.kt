package com.example.akashmac.findyourage

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        findAge.setOnClickListener {
//
//            val year:Int = age.text.toString().toInt()
//            val curYear=Calendar.getInstance().get(Calendar.YEAR)
//            val myAge=curYear-year
//            show.text ="Your Age Is $myAge Years on Earth"
//        }

    }
    fun bfindAge(view:View){
        val year:Int = age.text.toString().toInt()
        if(year.toInt()==0){
            show.text ="Invalid Input"
            return
        }
        val curYear=Calendar.getInstance().get(Calendar.YEAR)
        val myAge=curYear-year
        val avg=myAge / year.toInt()
        show.text ="Your Age Is $myAge Years on Earth"
    }
}
