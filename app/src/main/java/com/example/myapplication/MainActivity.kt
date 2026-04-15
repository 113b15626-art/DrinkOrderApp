package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            DrinkOrderApp()
        }
    }
}

@Composable
fun DrinkOrderApp() {
    var drink by remember { mutableStateOf("珍珠奶茶") }
    var sugar by remember { mutableStateOf("全糖") }
    var ice by remember { mutableStateOf("正常冰") }
    var result by remember { mutableStateOf("") }

    Column(modifier = Modifier.padding(16.dp)) {

        Text("飲料：$drink")

        Row {
            Button(onClick = { drink = "珍珠奶茶" }) { Text("珍奶") }
            Button(onClick = { drink = "紅茶" }) { Text("紅茶") }
            Button(onClick = { drink = "綠茶" }) { Text("綠茶") }
        }

        Spacer(Modifier.height(10.dp))

        Text("甜度")
        Row {
            Button(onClick = { sugar = "全糖" }) { Text("全糖") }
            Button(onClick = { sugar = "半糖" }) { Text("半糖") }
            Button(onClick = { sugar = "無糖" }) { Text("無糖") }
        }

        Spacer(Modifier.height(10.dp))

        Text("冰塊")
        Row {
            Button(onClick = { ice = "正常冰" }) { Text("正常冰") }
            Button(onClick = { ice = "少冰" }) { Text("少冰") }
            Button(onClick = { ice = "去冰" }) { Text("去冰") }
        }

        Spacer(Modifier.height(10.dp))

        Button(onClick = {
            result = "你點的是：$drink + $sugar + $ice"
        }) {
            Text("確認訂單")
        }

        Spacer(Modifier.height(10.dp))

        Text(result)
    }
}