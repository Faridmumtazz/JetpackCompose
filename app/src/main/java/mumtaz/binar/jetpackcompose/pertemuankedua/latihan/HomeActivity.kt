package mumtaz.binar.jetpackcompose.pertemuankedua.latihan

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import mumtaz.binar.jetpackcompose.R
import mumtaz.binar.jetpackcompose.pertemuankedua.Greeting8
import mumtaz.binar.jetpackcompose.pertemuankedua.Student
import mumtaz.binar.jetpackcompose.pertemuankedua.StudentRepository
import mumtaz.binar.jetpackcompose.pertemuankedua.latihan.ui.theme.JetpackComposeTheme

class HomeActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    val repo = CatatanRepository()
                    val data = repo.getAllData()
                    LazyColumn(){
                        items(items = data){catatan ->
                            Greeting14(catatan = catatan)
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting14(catatan: Catatan) {
    Column(
        modifier = Modifier.padding(15.dp)
    ) {
        Card(
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier
                .fillMaxWidth()
                .height(120.dp)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(15.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column(
                    modifier = Modifier.padding(10.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Text(
                        text = catatan.name,
                        color = Color.Black,
                        fontWeight = FontWeight.Normal
                    )
                    Text(
                        text = catatan.catatan,
                        color = Color.Black,
                        fontWeight = FontWeight.Normal,
                        modifier = Modifier.padding(start = 20.dp)
                    )
                }

            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview14() {
    JetpackComposeTheme {
        Greeting14(catatan = Catatan(0, "ana", "Besok kuliah"))
    }
}