package tz.co.musa.noteapp.presentation.note

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import tz.co.musa.noteapp.domain.enums.MenuType

data class NoteState(
    val notes: ArrayList<String> = ArrayList(),
    val menuDisplay:Boolean = false,
    val fontSize: Float = 16f,
    val fontColor: Color = Color.Black,
    val style: TextStyle = TextStyle(fontFamily = FontFamily.Default),
    val insertMenu:Boolean = false,
    val menuType: MenuType = MenuType.InsertOption,
    val displayTable:Boolean = false,
    val displaySpellCheck:Boolean = false,
    val saveMenu:Boolean = false,
    val printOption:Boolean = false,
    val noteDialog:Boolean = false,
    val note:String = ""

)
