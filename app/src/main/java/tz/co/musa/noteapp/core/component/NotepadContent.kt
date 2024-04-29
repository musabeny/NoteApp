package tz.co.musa.noteapp.core.component

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun NotepadContent(
    notes: List<String>,
    style: TextStyle,
    color:Color,
    fontSize:Float
) {
    // Notepad content goes here

    Column(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxSize()
    ) {
        // Display existing notes
        notes.forEach { note ->
            Text(
                text = note,
                modifier = Modifier.padding(8.dp),
                style = style,
                color = color,
                fontSize = fontSize.sp
            )
        }
    }
//    Text("Your notes will be displayed here", modifier = Modifier.padding(16.dp))
}
