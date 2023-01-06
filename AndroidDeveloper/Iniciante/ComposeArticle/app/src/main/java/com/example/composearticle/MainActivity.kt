package com.example.composearticle

import android.app.Presentation
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composearticle.ui.theme.ComposeArticleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeArticleTheme {
                Surface(
                    color = MaterialTheme.colors.background
                ){

                }
            }
        }
    }
}

@Composable
fun BackgroundImage() {
    val image = painterResource(R.drawable.bg_compose_background)
    Column{
        Image(
            painter = image,
            contentDescription = null,
        )

    }
}

@Composable
fun PresentationText(title: String, fulltext: String) {
    Box{
        Text(
            text = title,
            fontSize = 36.sp,
            modifier = Modifier
                .padding(top = 100.dp, end = 16.dp)
        )
        Text(
            text = fulltext,
            fontSize = 24.sp,
            modifier = Modifier
        )
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun BackgroundImagePreview() {
    ComposeArticleTheme {
        BackgroundImage()
        PresentationText(title = "Teste de chamado", fulltext = "Bla bla bla bla")
    }
}