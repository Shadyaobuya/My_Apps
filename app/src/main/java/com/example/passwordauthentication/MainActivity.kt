package com.example.passwordauthentication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.HideReturnsTransformationMethod
import android.text.method.PasswordTransformationMethod
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var userName=findViewById<EditText>(R.id.etPersonName)
        var password=findViewById<EditText>(R.id.etPassword)
        var confirmPass=findViewById<EditText>(R.id.etconfirmPassword)
        var signUpBtn=findViewById<Button>(R.id.btnSignup)
        var showPass=findViewById<Button>(R.id.cBShowPass)
//


        signUpBtn.setOnClickListener {
//            var name=userName.text.toString()
//            if (name.isEmpty()){
            if(userName.text.toString().isEmpty()){
                userName.setError("Field can't be Empty")
            }
             if(password.text.toString().isEmpty()){
                password.setError("Field can't be Empty")
//                Toast.makeText(baseContext,"Password can't be Empty", Toast.LENGTH_SHORT).show()
            }
            if(confirmPass.text.toString().isEmpty()){
                confirmPass.setError("You have to confirm your password")
//                Toast.makeText(baseContext,"You have to confirm your password",Toast.LENGTH_SHORT).show()
            }else{
                if (password==confirmPass){
                    if (password.length()<=6){
                        Toast.makeText(baseContext,"Password has to be more than 6 characters", Toast.LENGTH_SHORT).show()
                    }
//                    else if(password==password.toLowerCase()){
//                        Toast.makeText(baseContext,"Password have at least 1 UpperCase Letter", Toast.LENGTH_SHORT).show()
//
//                    }

                }
//                else{
//                    Toast.makeText(baseContext,"Check on your Password ", Toast.LENGTH_SHORT).show()
//
//                }
//            }

        }
    }
}}


