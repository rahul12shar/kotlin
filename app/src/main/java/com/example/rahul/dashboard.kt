package com.example.rahul

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cards.ui.theme.CardsTheme
import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.background


data class CardItem(val title: String, val iconRes: Int)

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CardsTheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize()
                ) { innerPadding ->
                    CardScreen(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

val cardItems = listOf(
    CardItem("Text", R.drawable.baseline_text_fields_24),
    CardItem("Address", R.drawable.baseline_location_pin_24),
    CardItem("Character", R.drawable.char1),
    CardItem("Bank card", R.drawable.baseline_credit_card_24),
    CardItem("Password", R.drawable.baseline_key_24),
    CardItem("Logistics", R.drawable.baseline_airport_shuttle_24)
)

@Composable
fun CardScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFF1BD29A)) // ✅ Set the background color here
            .padding(16.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 8.dp),
            horizontalArrangement = Arrangement.End,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.boy), // <-- Use any small profile icon you have
                contentDescription = "Profile",
                modifier = Modifier
                    .size(36.dp) // small size
                    .clip(CircleShape) // 🟠 This makes it perfectly round

            )
        }
        Text(
            text = "Card",
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold,
            color = Color.White, // 🟢 Make text white
            modifier = Modifier.padding(bottom = 4.dp)
        )
        Text(
            text = "Simple and easy to use app",
            fontSize = 16.sp,
            color = Color.White, // 🟢 Make text white
            modifier = Modifier.padding(bottom = 16.dp)
        )
        Spacer(modifier = Modifier.height(20.dp))


        LazyColumn(
            modifier = Modifier.weight(1f),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            items(cardItems.chunked(2)) { rowItems ->
                Row(
                    horizontalArrangement = Arrangement.spacedBy(12.dp),
                    modifier = Modifier.fillMaxWidth()
                ) {
                    for (item in rowItems) {
                        CardItemView(item, modifier = Modifier.weight(1f))
                    }
                    if (rowItems.size == 1) {
                        Spacer(modifier = Modifier.weight(1f))
                    }
                }
            }
        }

        Spacer(modifier = Modifier.height(1.dp))

        SettingsCard()
    }
}

@Composable
fun CardItemView(item: CardItem, modifier: Modifier = Modifier) {
    Card(
        modifier = modifier.height(160.dp),
        elevation = CardDefaults.cardElevation(8.dp)
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier.fillMaxSize().padding(8.dp)
        ) {
            Image(
                painter = painterResource(id = item.iconRes),
                contentDescription = item.title,
                modifier = Modifier.size(48.dp)
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = item.title, fontWeight = FontWeight.Bold)
        }
    }
}

@Composable
fun SettingsCard() {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(80.dp),
        elevation = CardDefaults.cardElevation(8.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start,
            modifier = Modifier.fillMaxSize().padding(16.dp)
        ) {
            Icon(
                painter = painterResource(id = R.drawable.baseline_settings_24),
                contentDescription = "Settings",
                modifier = Modifier.size(32.dp)
            )
            Spacer(modifier = Modifier.width(16.dp))
            Text(text = "Settings", fontSize = 18.sp, fontWeight = FontWeight.Bold)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CardsTheme {
        CardScreen()
    }
}