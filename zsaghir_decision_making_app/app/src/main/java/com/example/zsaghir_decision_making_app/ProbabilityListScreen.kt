package com.example.zsaghir_decision_making_app

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ProbabilityScreen(modifier: Modifier = Modifier) {
    var clickCount by remember { mutableStateOf(0) }
    var selectedButton by remember { mutableStateOf<String?>(null) }
    val button1Probability = remember { Button1Probability("Let's Go")}
    val button2Probability = remember { Button2Probability("we will see")}
    val button3Probability = remember { Button3Probability("good choice but..")}
    var decisionResult by remember { mutableStateOf("") }

    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Should I go to this restaurant?",
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 32.dp),
            fontSize = 28.sp,
            textAlign = TextAlign.Center
        )

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(
                space = 8.dp,
                alignment = Alignment.CenterHorizontally
            )
        ) {
            Button(
                onClick = {
                    clickCount++
                    selectedButton = button1Probability.name
                    decisionResult = button1Probability.behaviour()
                },
                colors = ButtonDefaults.buttonColors(
                    containerColor = if (selectedButton == button1Probability.name) {
                        Color(0xFFADD8E6)
                    } else {
                        Color.White
                    },
                    contentColor = Color.Black
                )
            ) {
                Text(button1Probability.choice())
            }

            Button(
                onClick = {
                    clickCount++
                    selectedButton = button2Probability.name
                    decisionResult = button2Probability.behaviour()
                },
                colors = ButtonDefaults.buttonColors(
                    containerColor = if (selectedButton == button2Probability.name) {
                        Color(0xFFADD8E6)
                    } else {
                        Color.White
                    },
                    contentColor = Color.Black
                )
            ) {
                Text(button2Probability.choice())
            }

            Button(
                onClick = {
                    clickCount++
                    selectedButton = button3Probability.name
                    decisionResult = button3Probability.behaviour()
                },
                colors = ButtonDefaults.buttonColors(
                    containerColor = if (selectedButton == button3Probability.name) {
                        Color(0xFFADD8E6)
                    } else {
                        Color.White
                    },
                    contentColor = Color.Black
                )
            ) {
                Text(button3Probability.choice())
            }
        }

        Text(
            text = if (decisionResult.isEmpty()) "Make a decision" else decisionResult,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 32.dp),
            fontSize = 32.sp,
            textAlign = TextAlign.Center
        )

        Text(
            text = "Total clicks: $clickCount",
            modifier = Modifier.padding(top = 16.dp),
            textAlign = TextAlign.Center
        )
    }
}
