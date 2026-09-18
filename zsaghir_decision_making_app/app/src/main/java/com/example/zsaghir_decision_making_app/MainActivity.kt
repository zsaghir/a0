package com.example.zsaghir_decision_making_app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.zsaghir_decision_making_app.ui.theme.Zsaghir_decision_making_appTheme
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Zsaghir_decision_making_appTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { currentPadding ->
                    StudntInfo(
                        name = "1882307",
                        ccid = "zsaghir",
                        modifier = Modifier.padding(currentPadding)
                    )
                    Scaffold(
                        modifier = Modifier.fillMaxSize()
                    ) { currentPadding ->
                        ProbabilityScreen(
                            modifier = Modifier.padding(currentPadding)
                        )
                }}
            }
        }

    }
}

@Composable
fun StudntInfo(
    name: String,
    ccid: String,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier.fillMaxSize()
    ) {
        Card(
            modifier = Modifier
                .align(Alignment.TopEnd)
                .padding(12.dp)
        ) {
            Text(
                text = "Student Information\n Student ID: $name\n Student ccid: $ccid",
                modifier = Modifier.padding(8.dp)
            )
        }
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun ProbabilityScreenPreview() {
    Zsaghir_decision_making_appTheme {
        ProbabilityScreen()
    }
}
