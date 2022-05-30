package mumtaz.binar.jetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import mumtaz.binar.jetpackcompose.ui.theme.JetpackComposeTheme

class LayoutTiga : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting6("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting6(name: String) {
    var total by remember{ mutableStateOf("") }
    var bayar by remember{ mutableStateOf("") }
    var hasil by remember{ mutableStateOf("") }

    Column() {
        TextField(value = total, onValueChange = {total = it})
        TextField(value = bayar, onValueChange = {bayar = it})
        Button(onClick = {
            hasil = (bayar.toInt() - total.toInt()).toString()
        }) {
            Text(text = "Hitung")
        }
        Text(text = hasil)
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview6() {
    JetpackComposeTheme {
        Greeting6("Android")
    }
}