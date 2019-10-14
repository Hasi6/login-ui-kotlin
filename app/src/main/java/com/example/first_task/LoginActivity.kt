package com.example.first_task

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {
    var username: String = ""
    var password: String = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        try {
            this.supportActionBar!!.hide()
        } catch (e: NullPointerException) {
        }
        setContentView(R.layout.activity_login)
    }
//    NAVIGATE TO LOGIN PAGE
    fun loginPageSignUpBtnClicked(view: View){
        val signUpIntent = Intent(this, SignupActivity::class.java)
        startActivity(signUpIntent)
    }

    //    LOGIN BTN CLICKED
    fun loginBtnClicked(view:View){
        username = loginUsernameTxt.text.toString()
        password = loginPasswordTxt.text.toString()
        println("$username and $password")
    }

    //    FACEBOOK LOGIN CLICKED
    fun facebookLoginClicked(view:View){
        println("Hasi")
    }
}
