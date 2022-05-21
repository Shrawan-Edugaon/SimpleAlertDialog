package com.example.simplealertdialog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    lateinit var mAlertButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mAlertButton = findViewById(R.id.btnAlert)
        mAlertButton.setOnClickListener {
            val mAlertsDialogBuilder = AlertDialog.Builder(this@MainActivity)
            mAlertsDialogBuilder.setTitle("This is Title..")
            mAlertsDialogBuilder.setIcon(R.mipmap.ic_launcher)
            mAlertsDialogBuilder.setMessage("Are you sure do you want to exit?")
            mAlertsDialogBuilder.setCancelable(false)
            mAlertsDialogBuilder.setPositiveButton("Yes"){_,_->
                finish()
            }
            mAlertsDialogBuilder.setNegativeButton("No"){_,_->
                Toast.makeText(this@MainActivity,"Clicked No Button",Toast.LENGTH_LONG).show()
            }
            mAlertsDialogBuilder.setNeutralButton("Cancel"){_,_->
                Toast.makeText(this@MainActivity,"click Cancel Button",Toast.LENGTH_LONG).show()
            }

            val mAlertDialog = mAlertsDialogBuilder.create()
            mAlertDialog.show()
        }
    }
}