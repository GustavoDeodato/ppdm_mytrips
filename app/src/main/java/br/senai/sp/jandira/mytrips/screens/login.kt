package br.senai.sp.jandira.mytrips.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.mytrips.R

@Composable
fun Login() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFFFFFFFF))
    ){
        Column (
            modifier = Modifier
                .fillMaxSize(),
            verticalArrangement = Arrangement.SpaceBetween,
            horizontalAlignment = Alignment.End
        ) {
            Card(
                modifier = Modifier
                    .width(110.dp)
                    .height(40.dp),
                shape = RoundedCornerShape(
                    topEnd = 20.dp,
                    bottomStart = 20.dp
                ),
                colors = CardDefaults.cardColors(
                    containerColor = Color.Magenta
                )
            ) {}
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(500.dp)
                    .padding(12.dp)
            ) {
                Text(
                    text = stringResource(
                        R.string.login
                    ),
                    fontSize = 40.sp,
                    color = Color.Magenta,
                    fontWeight = FontWeight.ExtraBold
                )
                Text(
                    text = stringResource(
                        R.string.desc
                    ),
                    color = Color.Gray,

                    )
                OutlinedTextField(
                    value = "teste@gmail.com",
                    onValueChange = {},
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(
                            top = 8.dp
                        ),
                    shape = RoundedCornerShape(
                        topStart = 10.dp,
                        topEnd = 10.dp,
                        bottomStart = 10.dp,
                        bottomEnd = 10.dp
                    ),
                    leadingIcon = {
                        Image(painter = painterResource(
                        id = R.drawable.email
                    ),
                            contentDescription = "") }
                )
                OutlinedTextField(
                    value = "************",
                    onValueChange = {},
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(
                            top = 8.dp
                        ),
                    shape = RoundedCornerShape(
                        topStart = 10.dp,
                        topEnd = 10.dp,
                        bottomStart = 10.dp,
                        bottomEnd = 10.dp
                    ),
                    leadingIcon = { Image(painter = painterResource(
                        id = R.drawable.senha
                    ),
                        contentDescription = "") }
                )
                Column (
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(12.dp),
                    horizontalAlignment = Alignment.End
                ){
                    Button (
                        onClick = {},
                        modifier = Modifier.padding(10.dp),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color(0xFFDC00FF)
                        )

                        ) {
                        Text(
                            text = stringResource(
                                R.string.signin
                            )

                        )
                    }
                }

                Row (
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.End
                ){
                    Text(
                        text = stringResource(
                            R.string.donthave
                        )
                    )
                    Text(
                        text = stringResource(
                            R.string.signup
                        ),
                        color = Color.Magenta,
                        fontWeight = FontWeight.ExtraBold
                    )
                }
            }

            Column (
                modifier = Modifier
                    .fillMaxWidth()
            ){
                Card(
                    modifier = Modifier
                        .width(110.dp)
                        .height(40.dp),
                    shape = RoundedCornerShape(
                        topEnd = 20.dp,
                        bottomStart = 20.dp
                    ),
                    colors = CardDefaults.cardColors(
                        containerColor = Color.Magenta
                    )
                ) {}
            }
        }
    }
}


@Preview
@Composable
private fun LoginPreview() {
    Login()
}