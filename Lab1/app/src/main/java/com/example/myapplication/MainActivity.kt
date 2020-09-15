package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    private var counter: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       // button1.setOnClickListener(this)

        button1.setOnClickListener{view ->
            counter++
            field.text = counter.toString()
        }

/*        Log.e("MainActivity", "onCreate")
       if (savedInstanceState == null) {
            Log.e("MainActivity", "Generet new double")
            counter = (Math.random() * 10)
        } else {
            Log.e("MainActivity", "SavedCounter")
            counter = savedInstanceState.getDouble("counter")

        }
        Log.e("Counter", counter.toString())*/
    }

    /*override fun onClick(p0: View?) {
        when(p0.id){
            button1.id -> {
                counter++
                field.text = counter.toString()
            }
            field.id -> {

            }
        }

    }*/

/*    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putDouble("counter", counter)
    }

    override fun onStart() {
        super.onStart()
        Log.e("MainActivity", "onStart")
    }

    override fun onRestart() {
        super.onRestart()
        Log.e("MainActivity","onRestart")
    }

    override fun onPause() {
        super.onPause()
        Log.e("MainActivity", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.e("MainActivity", "onStop")
    }

    override fun onDestroy() {
        Log.e("MainActivity", "onDestroy")
        super.onDestroy()
    }
*/
}