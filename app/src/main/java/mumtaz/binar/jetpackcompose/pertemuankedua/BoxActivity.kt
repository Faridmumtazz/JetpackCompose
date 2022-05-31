package mumtaz.binar.jetpackcompose.pertemuankedua

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import mumtaz.binar.jetpackcompose.pertemuankedua.ui.theme.JetpackComposeTheme
import mumtaz.binar.jetpackcompose.pertemuanpertama.MainActivity

class BoxActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting7("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting7(name: String) {
    val context = LocalContext.current
    Column(
        modifier = Modifier.padding(15.dp)
    ) {
        Row(
            modifier = Modifier
                .border(width = 2.dp, color = Color.Red)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            Text(text = "Text Row 1")
            Button(onClick = { }) {
                Text(text = "Button Row 1")
            }
        }
        
        Spacer(modifier = Modifier.padding(15.dp))
        
        Column(
            modifier = Modifier
                .border(width = 2.dp, color = Color.Green)
                .fillMaxWidth()
                .fillMaxHeight(0.3f),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "Text Column satu", fontSize = 25.sp, fontWeight = FontWeight.Bold)
            Button(onClick = {}, colors = ButtonDefaults.buttonColors(Color.Blue)) {
                Text(text = "Button Column 1")
            }
            Button(onClick = {}) {
                Text(text = "Button Column 2")
            }
        }
        Spacer(modifier = Modifier.padding(15.dp))
        Box(modifier = Modifier.background(Color.Gray)
            .fillMaxHeight(0.3f)
            .fillMaxWidth()
        ){
            Button(onClick = {}) {
                Text(text = "Button Box 1")
            }
            Button(onClick = {} , modifier = Modifier.padding(start = 100.dp)) {
                Text(text = "Button Box 2")
            }
        }

        
    }

//
//    Box ( modifier = Modifier
//        .fillMaxWidth()
//        .background(color = Color.Green)
//        .fillMaxHeight(0.3f)){
//        Button(onClick = { },
//            colors = ButtonDefaults.buttonColors(Color.Red)
//        ) {
//            Text(text = "Button 1")
//        }
//
//        Button(onClick = { },
//            modifier = Modifier.padding(start = 60.dp, top = 15.dp),
//            colors = ButtonDefaults.buttonColors(Color.DarkGray)
//        ) {
//            Text(text = "Button 2")
//        }
//    }


}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview7() {
    JetpackComposeTheme {
        Greeting7("Android")
    }
}