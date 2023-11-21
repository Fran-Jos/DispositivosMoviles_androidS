package com.uce.fjchanataxi.p.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import com.uce.fjchanataxi.databinding.ActivityLoginBinding
import com.uce.fjchanataxi.p.logica.SingIn
import com.uce.fjchanataxi.p.ui.core.Constants

class LoginActivity : AppCompatActivity() {


    private lateinit var binding: ActivityLoginBinding
    private val singIn: SingIn = SingIn()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        //setContentView(R.layout.activity_login)
        setContentView(binding.root)
    }

    override fun onStart() {
        super.onStart()
        initControls()
    }

    fun initControls(){
        //var btn_login= findViewById<Button>(R.id.btn_login)
        //var et_usuario= findViewById<EditText>(R.id.et_usuario)
        /*btn_login.setOnClickListener {
            var u=et_usuario.text.toString()
            Toast.makeText(this, u, Toast.LENGTH_LONG).show()
        }*/

        binding.buttonLogin.setOnClickListener {
            var u=binding.txtUsuario.text.toString()
            var p=binding.editTextTextPassword.text.toString()
            if (!singIn.checkUserAndPassword(u,p)) {
                //Toast.makeText(this, "Bienvenido "+u, Toast.LENGTH_LONG).show()
                Snackbar.make(
                    binding.buttonLogin,
                    "Error de usuario o contraseña",
                    Snackbar.LENGTH_LONG
                ).show()
            }else{

                /*--------------------------------------------*/
                /* Explicito*/
                val intentImp =  Intent()

                intentImp.action = Intent.ACTION_SEND
                /*en el intent para encapsular lados , es el putExtra , tiene dos funciones clave y valor */
                intentImp.putExtra(Intent.EXTRA_TEXT , "mi primera chamba")

                intentImp.type = "text/plain"

                startActivity(intentImp)

                /*------------------------------------------*/


                val intentExp = Intent(this , MainActivity::class.java)
                intentExp.putExtra(Constants.TEXT_VARIABLE, "mi segunda chamba")
                startActivity(intentExp)
            }
        }
    }

  /*

    private  lateinit var  binding: ActivityLoginBinding
    /*private val singIn: SingIn = SingIn()*/

    private   val  SingIn : SingIn = SingIn()




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

    */

}