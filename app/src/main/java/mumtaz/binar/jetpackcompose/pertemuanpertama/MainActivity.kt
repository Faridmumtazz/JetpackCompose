package mumtaz.binar.jetpackcompose.pertemuanpertama

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import mumtaz.binar.jetpackcompose.ui.theme.JetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting("Android")
                    Column() {
                        ButtonCustom(title = "Button 3", color = Color.Red )
                        ButtonCustom(title = "Button 4", color = Color.Blue )
                        ButtonCustom(title = "Button 5", color = Color.Black )
                    }
                }
            }
        }
    }
}

@Composable
fun ButtonCustom(title : String, color : Color){
    Button(
        onClick = {},
        modifier = Modifier.padding(10.dp),
        colors = ButtonDefaults.buttonColors(color)
    ) {
        Text(text = title)
    }
}

@Composable
fun Greeting(name: String) {


    Column(modifier = Modifier
        .border(width = 2.dp, color = Color.Red)
        .padding(15.dp)
        .fillMaxWidth()
        .height(200.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Hello $name!",
            color = Color.Black,
            modifier = Modifier.fillMaxWidth(),
            
        )
        Text(
            text = "Teks Kedua",
            modifier = Modifier.fillMaxWidth(),
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.padding(15.dp))
        
        Button(
            onClick = {},
            modifier = Modifier
                .fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(Color.Blue)
        ) {
            Text(text = "Simpan")
        }

        Row() {
            val mcontext = LocalContext.current
            Button(onClick = {
                mcontext.startActivity(Intent(mcontext, SplashActivity::class.java))
            }) {
                Text(text = "Button 2")
            }
            Button(onClick = {}) {
                Text(text = "Button 3")
            }

            Column() {
                Text(text = "Text 1")
                Text(text = "Text 2")
            }
        }

        var text by remember{ mutableStateOf("")}
        TextField(value = "Edittext", onValueChange = {text = it} )
        var text2 by remember{ mutableStateOf("")}
        TextField(value = "Edittext", onValueChange = {text2 = it} )
        OutlinedTextField(value = "input nama", onValueChange = {text = it})
    }
}

@Composable
fun TextCustom(){
    
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview() {
    JetpackComposeTheme {
        Greeting("Android")
    }
}