package mumtaz.binar.jetpackcompose.pertemuankedua

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import mumtaz.binar.jetpackcompose.pertemuankedua.ui.theme.JetpackComposeTheme

class MainActivityy : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting11("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting11(name: String) {
    val context = LocalContext.current
    Column() {
        Button(onClick = {
            context.startActivity(Intent(context, BoxActivity::class.java))
        }) {
            Text(text = "Box Activity")
        }
        Button(onClick = {
            context.startActivity(Intent(context, ScrollView::class.java))
        }) {
            Text(text = "ScrollView")
        }
        Button(onClick = {
            context.startActivity(Intent(context, CardView::class.java))
        }) {
            Text(text = "CardView")
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview11() {
    JetpackComposeTheme {
        Greeting11("Android")
    }
}