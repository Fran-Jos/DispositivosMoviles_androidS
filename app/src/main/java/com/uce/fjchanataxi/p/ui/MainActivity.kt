package com.uce.fjchanataxi.p.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.creative.ipfyandroid.Ipfy
import com.creative.ipfyandroid.IpfyClass
import com.uce.fjchanataxi.R
import com.uce.fjchanataxi.databinding.ActivityLoginBinding
import com.uce.fjchanataxi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Ipfy.init(this) // this is a context of application
        //or you can also pass IpfyClass type to get either IPv4 address only or universal address IPv4/v6 as
        Ipfy.init(this, IpfyClass.IPv4) //to get only IPv4 address
        //and
        Ipfy.init(this,IpfyClass.UniversalIP) //to get Universal address in IPv4/v6

        getIpAddress()

    }

    private fun getIpAddress(){
        Ipfy.getInstance().getPublicIpObserver().observe(this, { ipData ->
           // ipData.currentIpAddress // this is a value which is your current public IP address, null if no/lost internet connection
           // ipData.lastStoredIpAddress // this is a previous IP address while network lost/reconnected and current IP address assigned to null/new one

            binding.tv.text= ipData.currentIpAddress

        })
    }
}