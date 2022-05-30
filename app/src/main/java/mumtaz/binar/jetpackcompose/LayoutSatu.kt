package mumtaz.binar.jetpackcompose

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

class LayoutSatu : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting4("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting4(name: String) {
    val context = LocalContext.current
    var username by remember{ mutableStateOf("") }
    var password by remember{ mutableStateOf("") }
    var hasil by remember{ mutableStateOf("") }

    Column() {
        TextField(value = username, onValueChange = {username = it})
        TextField(value = password, onValueChange = {password = it})
        Button(onClick = {
            hasil = username + password
            context.startActivity(Intent(context, LayoutDua::class.java))
        }) {
            Text(text = "Login")
        }
        Text(text = hasil)
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview4() {
    JetpackComposeTheme {
        Greeting4("Android")
    }
}