package br.senai.jandira.sp.telaperfil

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.jandira.sp.telaperfil.ui.theme.TelaPerfilTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TelaPerfilTheme {
                TelaPerfil()
                }
            }
        }
    }

@Composable
fun TelaPerfil() {
    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Card(
            modifier = Modifier
                .height(70.dp)
                .fillMaxWidth(),
            shape = RoundedCornerShape(0.dp),
            colors = CardDefaults.cardColors(Color(0xFF213787))
        ) {
            Row(
                modifier = Modifier
                    .padding(12.dp)
                    .fillMaxWidth()
                    .fillMaxHeight(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {

                Image(
                    painter = painterResource(id = R.drawable.logo),
                    contentDescription = "",
                    modifier = Modifier
                        .height(60.dp)
                        .width(60.dp)
                )
                Text(
                    text = "MEU PERFIL",
                    fontSize = 20.sp,
                    color = Color(0xFFBCE0F6),
                )
                Card(
                    modifier = Modifier
                        .size(50.dp)
                        .border(4.dp, Color(0xFF9DBFEF), RoundedCornerShape(30.dp)),
                    shape = RoundedCornerShape(100.dp),
                ) {
                    Card {

                    }
                }
            }
        }

        Card(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(),
            colors = CardDefaults.cardColors(Color(0xFFE3EFFF)),
            shape = RoundedCornerShape(0.dp),
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight()
            ) {
                Card (
                    modifier = Modifier
                        .height(130.dp)
                        .fillMaxWidth(),
                    shape = RoundedCornerShape(0.dp),
                    colors = CardDefaults.cardColors(Color(0xFFC1DBFF))
                ){
                    Row (
                        modifier = Modifier
                            .padding(12.dp)
                            .fillMaxWidth()
                            .fillMaxHeight(),
                        verticalAlignment = Alignment.CenterVertically
                    ){
                        Card (
                            modifier = Modifier
                                .width(100.dp)
                                .height(100.dp),
                            shape = RoundedCornerShape(10.dp),
                            colors = CardDefaults.cardColors(Color(0xFFFFFFFF)),
                        ){

                        }
                        Spacer(modifier = Modifier.size(10.dp))
                        Card (
                            modifier = Modifier
                                .width(100.dp)
                                .height(100.dp),
                            shape = RoundedCornerShape(10.dp),
                            colors = CardDefaults.cardColors(Color(0xFFFFFFFF)),
                        ){

                        }
                        Spacer(modifier = Modifier.size(10.dp))
                        Card (
                            modifier = Modifier
                                .width(100.dp)
                                .height(100.dp),
                            shape = RoundedCornerShape(10.dp),
                            colors = CardDefaults.cardColors(Color(0xFFFFFFFF)),
                        ){

                        }
                        Spacer(modifier = Modifier.size(15.dp))
                        Image(
                            painter = painterResource(id = R.drawable.mais),
                            contentDescription = "",
                            modifier = Modifier
                                .height(10.dp)
                                .width(15.dp)
                        )
                    }


                }

                Column (
                    modifier = Modifier.fillMaxWidth().fillMaxHeight(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ){
                    Row (
                        modifier = Modifier
                            .padding(start = 25.dp, end = 25.dp, top = 35.dp)
                            .fillMaxWidth()
                            .height(50.dp),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ){
                        Text(
                            text = "Editar Perfil",
                            fontSize = 23.sp,
                            color = Color(0xFF1F55C6),
                            fontWeight = FontWeight.SemiBold
                        )
                        Card (
                            modifier = Modifier
                                .width(30.dp)
                                .height(30.dp),
                            shape = RoundedCornerShape(100.dp),
                            colors = CardDefaults.cardColors(Color(0xFFB1C5F0)),
                        ){
                            Image(
                                painter = painterResource(id = R.drawable.editar),
                                contentDescription = "",
                                modifier = Modifier
                                    .height(20.dp)
                                    .width(70.dp)
                            )
                        }

                    }
                    Card (
                        modifier = Modifier
                            .width(350.dp)
                            .height(370.dp)
                            .border(2.dp, Color(0xFF6188C5), RoundedCornerShape(10.dp)),
                        shape = RoundedCornerShape(10.dp),
                        colors = CardDefaults.cardColors(Color(0xFFC1DBFF)),
                    ){

                    }
                }

            }
        }
    }
}


                @Preview(showBackground = true, showSystemUi = true)
                @Composable
                fun GreetingPreview() {
                    TelaPerfilTheme {
                        TelaPerfil()
                    }
                }