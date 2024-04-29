package tz.co.musa.noteapp.core.component

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import tz.co.musa.noteapp.presentation.note.NoteEvent

@Composable
fun ColorPicker( fontSize:Float,color: Color,onEvent: (NoteEvent) -> Unit) {
    val colors = listOf(Color.Black, Color.Red, Color.Green, Color.Blue)
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            "Font Color",
            fontWeight = FontWeight.Bold,
            fontSize = fontSize.sp,
            color = color
        )
        Spacer(modifier = Modifier.height(16.dp))
        colors.forEach { color ->
            Box(
                modifier = Modifier
                    .size(36.dp)
                    .background(color)
                    .clickable { onEvent(NoteEvent.ChangeColor(color)) }
            )
        }
    }
}
