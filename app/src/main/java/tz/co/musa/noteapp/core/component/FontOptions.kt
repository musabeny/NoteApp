package tz.co.musa.noteapp.core.component

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import tz.co.musa.noteapp.presentation.note.NoteEvent

@Composable
fun FontOptions(
    onEvent: (NoteEvent)-> Unit
) {
    Column {
        Text("Font Options", fontWeight = FontWeight.Bold, fontSize = 16.sp)
        Spacer(modifier = Modifier.height(8.dp))
        Text("Default",
            style = TextStyle(fontFamily = FontFamily.Default),
            modifier = Modifier.clickable {
            onEvent(NoteEvent.ChangeFontStyle(TextStyle(fontFamily = FontFamily.Default)))
        })
        Text("Cursive",
            style = TextStyle(fontFamily = FontFamily.Cursive),
            modifier = Modifier.clickable {
            onEvent(NoteEvent.ChangeFontStyle(TextStyle(fontFamily = FontFamily.Cursive)))
        })
        Text("Serif",
            style = TextStyle(fontFamily = FontFamily.Serif),
            modifier = Modifier.clickable {
            onEvent(NoteEvent.ChangeFontStyle(TextStyle(fontFamily = FontFamily.Serif)))
        })
        Text("Monospace",
            style = TextStyle(fontFamily = FontFamily.Monospace),
            modifier = Modifier.clickable {
            onEvent(NoteEvent.ChangeFontStyle(TextStyle(fontFamily = FontFamily.Monospace)))
        })
        Text("SansSerif",
            style = TextStyle(fontFamily = FontFamily.SansSerif),
            modifier = Modifier.clickable {
            onEvent(NoteEvent.ChangeFontStyle(TextStyle(fontFamily = FontFamily.SansSerif)))
        })
    }
}
