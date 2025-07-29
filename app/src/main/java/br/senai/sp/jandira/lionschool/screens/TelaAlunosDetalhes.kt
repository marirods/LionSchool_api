package br.senai.sp.jandira.lionschool.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.lionschool.R

@Composable
fun TelaAlunosDetalhes() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        Box(
            modifier = Modifier
                .align(Alignment.TopEnd) // Alinha ao topo e à direita
                .padding(top = 40.dp, end = 10.dp) // Adiciona padding para afastamento das bordas
                .size(40.dp)
                .background(Color(0xFFF9B036), CircleShape)
                .wrapContentSize(Alignment.Center)

        ) {
            Text(
                text = stringResource(R.string.ds1),
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp,
                color = Color(0xFF3347B0)
            )
        }

        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFFF5F5F5))
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 16.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.lion_logo),
                    contentDescription = "Logo",
                    modifier = Modifier.size(50.dp)
                )
                Spacer(modifier = Modifier.width(8.dp))
                Column(horizontalAlignment = Alignment.Start) {
                    Text(
                        text = "Lion",
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFF3347B0),
                        fontSize = 20.sp
                    )
                    Text(
                        text = "School",
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFF3347B0),
                        fontSize = 20.sp
                    )
                }
            }

            Spacer(modifier = Modifier.height(8.dp))
            Divider(color = Color(0xFFFFC23D), thickness = 2.dp)

            Spacer(modifier = Modifier.height(16.dp))
            Image(
                painter = painterResource(id = R.drawable.perfil_img1),
                contentDescription = "Foto Aluno",
                modifier = Modifier
                    .size(100.dp)
                    .clip(CircleShape)
                    .border(3.dp, Color(0xFFFFC23D), CircleShape)
            )

            Spacer(modifier = Modifier.height(12.dp))

            Text(
                text = stringResource(R.string.Nome1),
                fontSize = 20.sp,
                fontWeight = FontWeight.SemiBold,
                color = Color(0xFF3347B0)
            )
            Text(
                text = stringResource(R.string.curso),
                fontSize = 14.sp,
                fontWeight = FontWeight.SemiBold,
                color = Color(0xFF3347B0)
            )

            Spacer(modifier = Modifier.height(24.dp))

            Card(
                colors = CardDefaults.cardColors(Color(0xFFACB1E5)),
                shape = RoundedCornerShape(20.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight(), // Usar wrapContentHeight para o card se ajustar ao conteúdo
                elevation = CardDefaults.cardElevation(8.dp)
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(16.dp),
                    horizontalAlignment = Alignment.Start // ALTERADO: Alinha o conteúdo da coluna à esquerda
                ) {
                    Text(
                        text = "Desempenho",
                        color = Color.White,
                        fontWeight = FontWeight.Bold,
                        fontSize = 16.sp,
                        modifier = Modifier.align(Alignment.CenterHorizontally) // Título centralizado
                    )
                    Spacer(modifier = Modifier.height(16.dp)) // Aumentado o espaçamento

                    val disciplinas = listOf(
                        Triple("SIOP", 77, Color(0xFF3BA935)),
                        Triple("INRI", 86, Color(0xFF3BA935)),
                        Triple("INNU", 59, Color(0xFFFFC23D)),
                        Triple("HA", 100, Color(0xFF3BA935)),
                        Triple("SERE", 44, Color(0xFFD23B3B)),
                        Triple("CAES", 52, Color(0xFFFFC23D))
                    )

                    disciplinas.forEach { (nome, nota, cor) ->
                        BarraDesempenho(nome, nota, cor)
                        Spacer(modifier = Modifier.height(8.dp)) // Aumentado o espaçamento entre as barras
                    }

                    Spacer(modifier = Modifier.weight(1f))

                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.fillMaxWidth(), // Garante que a Row ocupe a largura total
                        horizontalArrangement = Arrangement.Center // Centraliza o item "Concluído"
                    ) {
                        Icon(
                            imageVector = Icons.Default.CheckCircle,
                            contentDescription = "Concluído",
                            tint = Color(0xFF3BA935),
                            modifier = Modifier.size(20.dp)
                        )
                        Spacer(modifier = Modifier.width(4.dp))
                        Text(
                            text = "Concluído",
                            color = Color.White,
                            fontWeight = FontWeight.Bold,
                            fontSize = 16.sp
                        )
                    }
                    Spacer(modifier = Modifier.height(8.dp)) // Espaço no final do card para o "Concluído"
                }
            }
        }
    }
}


@Composable
fun BarraDesempenho(
    disciplina: String,
    nota: Int,
    cor: Color
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.fillMaxWidth()
    ) {
        Text(
            text = disciplina,
            modifier = Modifier.width(70.dp), // ALTERADO: Aumentei a largura para alinhar o início das barras
            color = Color.White,
            fontSize = 14.sp
        )
        LinearProgressIndicator(
            progress = nota / 100f,
            modifier = Modifier
                .weight(1f) // ALTERADO: Usa weight para a barra preencher o espaço restante
                .height(20.dp) // ALTERADO: Aumentei a altura da barra para se assemelhar à imagem
                .clip(RoundedCornerShape(20.dp)),
            color = cor,
            trackColor = Color.White
        )
        Spacer(modifier = Modifier.width(8.dp))
        Text(
            text = nota.toString(),
            color = Color.White,
            fontSize = 14.sp
        )
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun TelaAlunosDetalhesPreview() {
    TelaAlunosDetalhes()
}
