package com.uce.fjchanataxi.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import com.uce.fjchanataxi.R
import com.uce.fjchanataxi.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private  lateinit var  binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }


    override fun onStart() {
        super.onStart()

        initControls()

    }

    fun initControls(){

      /*  binding.buttonLogin.setOnClickListener{
            var u = binding.editTextTextPassword.text.toString()
            Toast.makeText(this, u, Toast.LENGTH_SHORT).show()
        }*/

        val Usuario = "franJos"
        val Contraseña = "aasss"

        binding.buttonLogin.setOnClickListener{
            var c = binding.editTextTextPassword.text.toString()
            var u = binding.txtUsuario.text.toString()
            if (c.equals(Contraseña) and u.equals(Usuario) ){
                Snackbar.make(binding.buttonLogin,u, Snackbar.LENGTH_SHORT).show()
                Toast.makeText(this, "Correcto", Toast.LENGTH_SHORT).show()
            }else Snackbar.make(binding.buttonLogin,u, Snackbar.LENGTH_SHORT).show()

                /*Toast.makeText(this, "Usuario o contraseña incorrecto", Toast.LENGTH_SHORT).show()*/
        }


        /*btn_loguin.setOnClickListener{

            var text_user = findViewById<EditText>(R.id.editTextTextPassword)

            var btn_loguin  = findViewById<Button>(R.id.button_login)
            var u = text_user.text.toString();

            /*elemento de salida: mensaje flotante*/
            Toast.makeText(this,u,Toast.LENGTH_SHORT).show()

        }*/

    }

    override fun onDestroy() {
        super.onDestroy()
    }
}