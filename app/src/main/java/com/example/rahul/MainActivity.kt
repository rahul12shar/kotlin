//package com.example.rahul
//
//
//
//
//
//// Instead of drawable resources, we'll use Material Icons
//data class CardItem(val title: String, val icon: androidx.compose.ui.graphics.vector.ImageVector)
//
//class MainActivity : ComponentActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
//        setContent {
//            CardsTheme {
//                Scaffold(
//                    modifier = Modifier.fillMaxSize()
//                ) { innerPadding ->
//                    CardScreen(modifier = Modifier.padding(innerPadding))
//                }
//            }
//        }
//    }
//}
//
//// Define cards with built-in icons
//val cardItems = listOf(
//    CardItem("Text", Icons.Default.TextFields),
//    CardItem("Address", Icons.Default.LocationOn),
//    CardItem("Character", Icons.Default.Face),
//    CardItem("Bank Card", Icons.Default.CreditCard),
//    CardItem("Password", Icons.Default.VpnKey),
//    CardItem("Logistics", Icons.Default.LocalShipping)
//)
//
//@Composable
//fun CardScreen(modifier: Modifier = Modifier) {
//    Column(
//        modifier = modifier
//            .fillMaxSize()
//            .background(Color(0xFF1BD29A))
//            .padding(16.dp)
//    ) {
//        Row(
//            modifier = Modifier
//                .fillMaxWidth()
//                .padding(bottom = 8.dp),
//            horizontalArrangement = Arrangement.End,
//            verticalAlignment = Alignment.CenterVertically
//        ) {
//            Icon(
//                imageVector = Icons.Default.Person,
//                contentDescription = "Profile",
//                modifier = Modifier
//                    .size(36.dp)
//                    .clip(CircleShape)
//            )
//        }
//
//        Text(
//            text = "Card",
//            fontSize = 28.sp,
//            fontWeight = FontWeight.Bold,
//            color = Color.White,
//            modifier = Modifier.padding(bottom = 4.dp)
//        )
//
//        Text(
//            text = "Simple and easy to use app",
//            fontSize = 16.sp,
//            color = Color.White,
//            modifier = Modifier.padding(bottom = 16.dp)
//        )
//
//        Spacer(modifier = Modifier.height(20.dp))
//
//        LazyColumn(
//            modifier = Modifier.weight(1f),
//            verticalArrangement = Arrangement.spacedBy(12.dp)
//        ) {
//            items(cardItems.chunked(2)) { rowItems ->
//                Row(
//                    horizontalArrangement = Arrangement.spacedBy(12.dp),
//                    modifier = Modifier.fillMaxWidth()
//                ) {
//                    for (item in rowItems) {
//                        CardItemView(item, modifier = Modifier.weight(1f))
//                    }
//                    if (rowItems.size == 1) {
//                        Spacer(modifier = Modifier.weight(1f))
//                    }
//                }
//            }
//        }
//
//        Spacer(modifier = Modifier.height(1.dp))
//
//        SettingsCard()
//    }
//}
//
//@Composable
//fun CardItemView(item: CardItem, modifier: Modifier = Modifier) {
//    Card(
//        modifier = modifier.height(160.dp),
//        elevation = CardDefaults.cardElevation(8.dp)
//    ) {
//        Column(
//            horizontalAlignment = Alignment.CenterHorizontally,
//            verticalArrangement = Arrangement.Center,
//            modifier = Modifier
//                .fillMaxSize()
//                .padding(8.dp)
//        ) {
//            Icon(
//                imageVector = item.icon,
//                contentDescription = item.title,
//                modifier = Modifier.size(48.dp)
//            )
//            Spacer(modifier = Modifier.height(8.dp))
//            Text(text = item.title, fontWeight = FontWeight.Bold)
//        }
//    }
//}
//
//@Composable
//fun SettingsCard() {
//    Card(
//        modifier = Modifier
//            .fillMaxWidth()
//            .height(80.dp),
//        elevation = CardDefaults.cardElevation(8.dp)
//    ) {
//        Row(
//            verticalAlignment = Alignment.CenterVertically,
//            horizontalArrangement = Arrangement.Start,
//            modifier = Modifier
//                .fillMaxSize()
//                .padding(16.dp)
//        ) {
//            Icon(
//                imageVector = Icons.Default.Settings,
//                contentDescription = "Settings",
//                modifier = Modifier.size(32.dp)
//            )
//            Spacer(modifier = Modifier.width(16.dp))
//            Text(text = "Settings", fontSize = 18.sp, fontWeight = FontWeight.Bold)
//        }
//    }
//}
//
//@Preview(showBackground = true)
//@Composable
//fun GreetingPreview() {
//    CardsTheme {
//        CardScreen()
//    }
//}





