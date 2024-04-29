package tz.co.musa.noteapp.core.component

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import tz.co.musa.noteapp.presentation.note.NoteEvent

@Composable
fun AddNoteButton(
    onEvent: (NoteEvent)-> Unit
) {
    FloatingActionButton(
        onClick = {
             onEvent(NoteEvent.NoteDialog(true))
        },
        content = { Icon(Icons.Default.Add, contentDescription = "Add") }
    )
}