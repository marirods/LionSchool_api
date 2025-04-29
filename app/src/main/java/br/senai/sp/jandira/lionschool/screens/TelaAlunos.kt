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
import java.util.Locale

@Composable
fun TelaAlunos(modifier: Modifier = Modifier) {
    Box(
        modifier = Modifier
            .fillMaxSize()

    ) {
        Column(
            modifier = Modifier
                .padding(20.dp)
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
                Divider(
                    color = Color(0xFFFFC23D)
                )
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 5.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    OutlinedTextField(
                        modifier = Modifier
                            .fillMaxWidth(),
                        value = "",
                        onValueChange = {
                        },
                        label = { Text(text = stringResource(R.string.pesquisar)) },
                        leadingIcon = {
                            Icon(
                                imageVector = Icons.Default.Search,
                                contentDescription = "",
                                tint = (Color(color = 0xFF9E9FA4))
                            )
                        }
                    )
                    Row(
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
                            painter = painterResource(id = R.drawable.lion_list),
                            contentDescription = "",
                            modifier = Modifier
                                .size(
                                    (100.dp)
                                )
                        )
                        Text(
                            text = stringResource(R.string.list_student),
                            color = Color(0xFF3347B0),
                            fontWeight = FontWeight.Bold,
                            fontSize = 35.sp
                        )
                    }
                    Alunos(
                        image = painterResource(R.drawable.perfil_img1),
                        name = stringResource(R.string.perfil_name1),
                        statusColor = colorResource(R.color.cursando),
                        data = stringResource(R.string.data1),
                        id = stringResource(R.string.id1)
                    )
                    Alunos(
                        image = painterResource(R.drawable.perfil_img2),
                        name = stringResource(R.string.perfil_name2),
                        statusColor = colorResource(R.color.cursando),
                        data = stringResource(R.string.data2),
                        id = stringResource(R.string.id2)
                    )
                    Alunos(
                        image = painterResource(R.drawable.perfil_img3),
                        name = stringResource(R.string.perfil_name3),
                        statusColor = colorResource(R.color.finalizado),
                        data = stringResource(R.string.data3),
                        id = stringResource(R.string.id3)
                    )
                    Alunos(
                        image = painterResource(R.drawable.perfil_img4),
                        name = stringResource(R.string.perfil_name4),
                        statusColor = colorResource(R.color.finalizado),
                        data = stringResource(R.string.data4),
                        id = stringResource(R.string.id4)
                    )
                    Alunos(
                        image = painterResource(R.drawable.perfil_img5),
                        name = stringResource(R.string.perfil_name5),
                        statusColor = colorResource(R.color.finalizado),
                        data = stringResource(R.string.data5),
                        id = stringResource(R.string.id5)
                    )
                    Alunos(
                        image = painterResource(R.drawable.perfil_img67),
                        name = stringResource(R.string.perfil_name6),
                        statusColor = colorResource(R.color.finalizado),
                        data = stringResource(R.string.data6),
                        id = stringResource(R.string.id6)
                    )
                    Alunos(
                        image = painterResource(R.drawable.perfil_img67),
                        name = stringResource(R.string.perfil_name7),
                        statusColor = colorResource(R.color.finalizado),
                        data = stringResource(R.string.data7),
                        id = stringResource(R.string.id7)
                    )
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