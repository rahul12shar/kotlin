package com.example.rahul

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


class ProfileActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Scaffold { innerPadding->
                ProfileBody(innerPadding)

            }
        }
    }
}

@Composable
fun ProfileBody(innerPadding: PaddingValues){
    Column (
        modifier = Modifier
            .padding(innerPadding)
            .fillMaxSize()
            .background(color= Color.White)
    ){
        Row(
            modifier = Modifier.fillMaxWidth().padding(horizontal = 10.dp, vertical = 10.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            // method 1
            Icon(
                imageVector = Icons.Filled.KeyboardArrowLeft,
                tint = Color.Red,
                contentDescription = null,
                modifier = Modifier
                    .height(28.dp)
                    .width(28.dp)
            )
            Text(text = "Andrew", style = TextStyle(
                fontSize = 15.sp,
                // textDecoration = TextDecoration.Underline,
                fontWeight = FontWeight.Bold))

            // method 2
            Icon(
                painter = painterResource(R.drawable.baseline_account_box_24),
                tint = Color.Red,
                contentDescription = null,
            )

        }
        Row(
            modifier = Modifier.fillMaxWidth().padding(horizontal = 10.dp, vertical = 10.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween

        ){
            Image(
                painter= painterResource(R.drawable.baseline_account_box_24),
                // tint = Color.Red,
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .height(100.dp)
                    .width(100.dp)
                    .clip(shape= RoundedCornerShape(100.dp))
            )

            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                Text(text="174")
                Text(text= "Posts")
            }
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                Text(text="772k")
                Text(text= "Flowers")
            }
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                Text(text="185")
                Text(text= "Following")
            }
        }

        Column (
            modifier = Modifier.padding(horizontal = 15.dp, vertical = 15.dp)
        ){
            Text(text= "Andrew Queo",
                style = TextStyle(color=Color.Blue,
                    fontWeight = FontWeight.Bold))
            Text(text= "Artist",
                modifier = Modifier.alpha(alpha=0.5f))
            Text(text= "DESIGNER")
            Text(text = "isabella@art.design")
            Text(text= "Followed by jenna and anna")

        }
        Row{
            Button(onClick = {
                //TODD When button clicked
            },
                shape = RoundedCornerShape(10.dp),

            ) {
                Text("Follow")
            }
            OutlinedButton(onClick = {


            }) {
                Text("Message")
            }
            OutlinedButton(onClick = {
            }) {
                Text("Email")
            }
            OutlinedButton(onClick = {
            }) {
                Icon(imageVector = Icons.Default.KeyboardArrowDown, contentDescription = null)
            }

        }
    }

}

@Preview(showBackground =true)
@Composable
fun  PreviewProfile(){
    ProfileBody(innerPadding = PaddingValues(0.dp))
}

