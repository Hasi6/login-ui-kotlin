package com.example.first_task

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_signup.*

class SignupActivity : AppCompatActivity() {

    var username: String = ""
    var password: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)
        try {
            this.supportActionBar!!.hide()
        } catch (e: NullPointerException) {
        }
    }

//    NAVIGATE TO LOGIN PAGE
    fun signUpPageLoginBtn(view: View){
        val loginIntent = Intent(this, LoginActivity::class.java)
        startActivity(loginIntent)
    }

//    SIGNUP BTN CLICKED
    fun SignUpBtnClicked(view:View){
    username = loginUsernameTxt.text.toString()
    password = loginPasswordTxt.text.toString()
    println("$username and $password")
}



}
