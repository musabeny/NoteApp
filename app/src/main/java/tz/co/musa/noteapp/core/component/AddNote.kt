package tz.co.musa.noteapp.core.component

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.window.Dialog
import tz.co.musa.noteapp.presentation.note.NoteEvent

@Composable
fun AddNote(
    onEvent: (NoteEvent) -> Unit,
    showDialog:Boolean,
     note:String,
    style:TextStyle
){
    AnimatedVisibility(visible = showDialog) {
        AlertDialog(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.5f),
            title = {
                    Text(text = "Ädd Note",style = style, fontWeight = FontWeight.Bold)
            },
            onDismissRequest = {
                    onEvent(NoteEvent.NoteDialog(false))
            },
            confirmButton = {
                 TextButton(onClick = {
                     onEvent(NoteEvent.SaveNote)
                     onEvent(NoteEvent.NoteDialog(false))
                 }) {
                     Text(text = "Add Note", style =style )
                 }

            },
            dismissButton = {
                TextButton(onClick = {
                    onEvent(NoteEvent.AddNote(""))
                    onEvent(NoteEvent.NoteDialog(false))

                }) {
                    Text(text = "Cancel", style =style )

                }
            },
            text = {
                TextField(
                    value = note,
                    onValueChange = {
                        onEvent(NoteEvent.AddNote(it))
                    },
                    modifier = Modifier.fillMaxSize(),
                    textStyle = MaterialTheme.typography.bodyMedium,
                    keyboardOptions = KeyboardOptions.Default.copy(
                        keyboardType = KeyboardType.Text,
                        imeAction = ImeAction.Default
                    ),
                    singleLine = false,
                    maxLines = Int.MAX_VALUE,
                    label = { Text("Enter your note") }
                )
            }
        )
    }


}