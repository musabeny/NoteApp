package tz.co.musa.noteapp.presentation.note

import android.graphics.fonts.Font
import android.graphics.fonts.FontStyle
import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily

sealed interface NoteEvent {
  data class AddNote(val note:String):NoteEvent
  data object SaveNote:NoteEvent
  data object ToggleMenu:NoteEvent
  data class ChangeFont(val font: Float):NoteEvent
  data class ChangeColor(val color: Color) :NoteEvent
  data object InsertMenuToggle:NoteEvent
  data class ChangeFontStyle(val style: TextStyle = TextStyle(fontFamily = FontFamily.Default)):NoteEvent
  data object  DisplayTable:NoteEvent
  data object DisplaySpellCheck:NoteEvent
  data object SaveAsMenu:NoteEvent
  data object PrintOption:NoteEvent
  data class NoteDialog(val displayDialog:Boolean):NoteEvent
}