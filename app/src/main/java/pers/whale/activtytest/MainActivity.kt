package pers.whale.activtytest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val TAG = "MainActivityTAG"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG, "MainActivity is Create!")

        //button已自动绑定
        button.setOnClickListener {
            val intent =Intent()
            intent.setClass(this,SecondActivity::class.java)
            startActivity(intent)

        }


    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "MainActivity is Start !")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "MainActivity is Resume !")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "MainActivity is pause !")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "MainActivity is stop !")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "MainActivity is destroy !")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "MainActivity is restart !")
    }
}
