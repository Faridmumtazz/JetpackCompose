package mumtaz.binar.jetpackcompose.pertemuanpertama

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import mumtaz.binar.jetpackcompose.ui.theme.JetpackComposeTheme

class LayoutDua : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting5("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting5(name: String) {
    val context = LocalContext.current
    var panjang by remember{ mutableStateOf("") }
    var lebar by remember{ mutableStateOf("") }
    var tinggi by remember{ mutableStateOf("") }
    var hasil by remember{ mutableStateOf("") }

    Column() {
        TextField(value = panjang, onValueChange = {panjang = it})
        TextField(value = lebar, onValueChange = {lebar = it})
        TextField(value = tinggi, onValueChange = {tinggi = it})
        Button(onClick = {
            hasil = (panjang.toInt() * lebar.toInt() * tinggi.toInt()).toString()
            context.startActivity(Intent(context, LayoutTiga::class.java))
        }) {
            Text(text = "Hitung")
        }
        Text(text = hasil)
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview5() {
    JetpackComposeTheme {
        Greeting5("Android")
    }
}