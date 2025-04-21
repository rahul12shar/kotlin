package com.example.rahul

import android.inputmethodservice.Keyboard.Row
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.rahul.ui.theme.RahulTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MainHeading()


        }


    }

}

@Composable
fun MainHeading(){
        Scaffold{ innerPadding->

            Column(
                modifier = Modifier.padding(innerPadding)
            ){
                Text(text = "Hello")
                Text(text = "world")
            }



        }

}



