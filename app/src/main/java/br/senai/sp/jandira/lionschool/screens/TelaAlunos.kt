package br.senai.sp.jandira.lionschool.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.AbsoluteAlignment
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.lionschool.R
import br.senai.sp.jandira.lionschool.components.Alunos
import java.util.Locale

@Composable
fun TelaAlunos(modifier: Modifier = Modifier) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.linearGradient(
                    listOf(
                        Color(color = 0xFFFFFFFF),
                        Color(color = 0xFFFFFFFF)

                    )
                )
            ),

        ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxSize()
                .padding(horizontal = 16.dp, vertical = 16.dp)
        ) {
            Column(
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Row(
                        modifier = Modifier
                            .padding(top = 26.dp)
                            .background(Color.White),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Image(
                            modifier = Modifier
                                .padding(4.dp),
                            painter = painterResource(R.drawable.lion_logo),
                            contentDescription = stringResource(R.string.logo_description)
                        )
                        Text(
                            text = stringResource(R.string.lion_nome),
                            color = Color(0xFF3347B0),
                            fontWeight = FontWeight.Bold
                        )

                    }
                    Column {
                        Card(
                            modifier = Modifier,
                            colors = CardDefaults.cardColors(containerColor = Color(0xFFFFC23D)),
                            shape = CircleShape
                        ) {
                            Text(
                                modifier = Modifier
                                    .padding(10.dp),
                                text = stringResource(R.string.ds1),
                                fontSize = 25.sp,
                                fontWeight = FontWeight.Bold
                            )
                        }
                    }
                }

                Divider(
                    color = Color(0xFFFFC23D)
                )
                Column(
                    modifier = Modifier
                        .padding(top = 5.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    OutlinedTextField(
                        value = "",
                        onValueChange = {},
                        label = {
                            Text(text = stringResource(R.string.find_student)) },
                        trailingIcon = {
                            Icon(
                                imageVector = Icons.Default.Search,
                                contentDescription = "",
                                tint = (Color(color = 0xFF9E9FA4))
                            )
                        },
                        modifier = Modifier
                            .padding(10.dp)
                            .fillMaxWidth(),
                        shape = RoundedCornerShape(10.dp)
                    )
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier
                            .fillMaxWidth()
                    ) {
                        Button(
                            onClick = {},
                            modifier = Modifier
                                .padding(5.dp),
                            colors = ButtonDefaults.buttonColors(Color(0xFF3347B0))
                        ) {
                            Text(
                                text = stringResource(R.string.todos_curso)
                            )
                        }
                        Button(
                            onClick = {},
                            modifier = Modifier
                                .padding(5.dp),
                            colors = ButtonDefaults.buttonColors(Color(0xFFFFC23D))
                        ) {
                            Text(
                                text = stringResource(R.string.cursando),
                                color = Color(0xFF3347B0)
                            )
                        }
                        Button(
                            onClick = {},
                            modifier = Modifier
                                .padding(5.dp),
                            colors = ButtonDefaults.buttonColors(Color(0xFFFFC23D))
                        ) {
                            Text(
                                text = stringResource(R.string.finalizado),
                                color = Color(0xFF3347B0)
                            )
                        }
                    }
                    Row(
                        modifier = Modifier
                            .fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically

                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.lion_graduation),
                            contentDescription = "",
                            modifier = Modifier
                                .size(
                                    (50.dp)
                                )
                        )
                        Text(
                            text = stringResource(R.string.list_student),
                            color = Color(0xFF3347B0),
                            fontWeight = FontWeight.Bold,
                            fontSize = 22.sp
                        )

                    }
                }
            }
        }
    }
}


@Preview(showSystemUi = true)
@Composable
private fun TelaAlunosPreview() {
    TelaAlunos()
}