package com.example.day18viewbindingcheckbox

import android.content.res.ColorStateList
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Toast
import com.example.day18viewbindingcheckbox.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button?.setOnClickListener {
            if(binding.checkBox?.isChecked == true){
                //open a new screen

            }else{
                //check box is not checked
                binding.checkBox?.buttonTintList = ColorStateList.valueOf(Color.RED)
                Toast.makeText(this,"please accept terms and codition",Toast.LENGTH_SHORT).show()
            }
        }
    }
}