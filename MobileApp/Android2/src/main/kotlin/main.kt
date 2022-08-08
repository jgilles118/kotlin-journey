/*
 * Adding more to pointerEvents
 *
 * */
import androidx.compose.foundation.Arrangement
import androidx.compose.foundation.Column
import androidx.compose.foundation.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.application
import androidx.compose.ui.rememberWindowState

 fun main() = application {
	Window(
		onCloseRequest = ::exitApplication,
		title = "Gilles App2",
		state = rememberWindowState(width = 300.dp, height = 300.dp)
	){ 
        val counter = remember { mutableStateOf(0) }
        MaterialTheme { 
            Column(Modifier.fillmaxSize(), Arrangement.spaceBy(5.dp)) { Button(modifier = Modifier.align(Alignment.CenterHorizontally),
                onClick = { counter.value++ })

                { Text(if (counter.value == 0) "Hello Gilles" else "Clicked ${counter.value}!") }

                { Button(modifier = Modifier.align(Alignment.CenterHorizontally), onClick = { counter.value = 0 })
                    Text("Reset") }
            }

        }


    }
}
 
 

