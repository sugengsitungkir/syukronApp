package com.cloudidev.syukronApp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RelativeLayout

class MainActivity : AppCompatActivity() {

    /**
     * Created by Rdika19 13/08/2019 "Team Liquid/Dota2"|CloudiDev
     */

    internal lateinit var rellay_jadwal: RelativeLayout //rellay_jadwal
    internal lateinit var rellay_halal: RelativeLayout //rellay_halal
    internal lateinit var rellay_doaharian: RelativeLayout //rellay_doaharian


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rellay_jadwal = findViewById(R.id.rellay_jadwal)
        rellay_halal = findViewById(R.id.rellay_halal)
        rellay_doaharian = findViewById(R.id.rellay_doaharian)


        rellay_jadwal.setOnClickListener {
            val intent = Intent(this@MainActivity, Activity_Jadwal::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP)
            startActivity(intent)
        }
        rellay_halal.setOnClickListener {
            val intent = Intent(this@MainActivity, Activity_Halal::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP)
            startActivity(intent)
        }

        rellay_doaharian.setOnClickListener {
            val intent = Intent(this@MainActivity, Activity_DoaHarian::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP)
            startActivity(intent)

        }
    }
}