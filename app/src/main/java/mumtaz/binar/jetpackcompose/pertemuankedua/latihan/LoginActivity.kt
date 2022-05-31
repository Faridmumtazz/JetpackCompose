package mumtaz.binar.jetpackcompose.pertemuankedua.latihan

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import mumtaz.binar.jetpackcompose.R
import mumtaz.binar.jetpackcompose.pertemuankedua.latihan.ui.theme.JetpackComposeTheme

class LoginActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting12("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting12(name: String) {
    val context = LocalContext.current

    Column(
        modifier = Modifier.padding(15.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Login",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
        )

        Image(painter = painterResource(R.drawable.ic_launcher_background), contentDescription = "icon")

        var email by remember{ mutableStateOf("") }
        OutlinedTextField(value = "Masukkan Email", onValueChange = { email = it}, modifier = Modifier.padding(10.dp).fillMaxWidth())
        var password by remember{ mutableStateOf("") }
        OutlinedTextField(value = "Masukkan Password", onValueChange = { password = it}, modifier = Modifier.padding(10.dp).fillMaxWidth())
        
        Button(onClick = {
            context.startActivity(Intent(context, HomeActivity::class.java))
        }, modifier = Modifier.padding(15.dp).fillMaxWidth()) {
            Text(text = "Login")
        }
        Button(onClick = {
            context.startActivity(Intent(context, RegisterActivity::class.java))
        }, colors = ButtonDefaults.buttonColors(Color.Transparent)) {
            Text(text = "Register")
        }


    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview12() {
    JetpackComposeTheme {
        Greeting12("Android")
    }
}