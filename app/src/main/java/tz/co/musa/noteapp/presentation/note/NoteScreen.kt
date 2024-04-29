package tz.co.musa.noteapp.presentation.note

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Slider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import tz.co.musa.noteapp.core.component.AddNote
import tz.co.musa.noteapp.core.component.AddNoteButton
import tz.co.musa.noteapp.core.component.AppBar
import tz.co.musa.noteapp.core.component.ColorPicker
import tz.co.musa.noteapp.core.component.NotepadContent
import tz.co.musa.noteapp.core.component.Table

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NoteScreen(
    state: NoteState,
    onEvent: (NoteEvent) -> Unit
) {


    Scaffold(
        topBar = {
            AppBar(
                onEvent = onEvent,
                showMenu = state.menuDisplay,
                style = state.style,
                insertMenu = state.insertMenu,
                menuType = state.menuType,
                spellCheck = state.displaySpellCheck,
                saveAsMenu = state.saveMenu,
                printOption = state.printOption
            )
           },
        floatingActionButton = { AddNoteButton(onEvent) },
        content = {
            Column(modifier = Modifier
                .fillMaxSize()
                .padding(top = it.calculateTopPadding())){
                Slider(
                    value = state.fontSize,
                    onValueChange = { newValue ->
                        onEvent(NoteEvent.ChangeFont(newValue))
                         },
                    valueRange = 8f..32f,
                    steps = 25,
                    modifier = Modifier.padding(horizontal = 16.dp)
                )
                Spacer(modifier = Modifier.height(16.dp))
                ColorPicker(state.fontSize, color = state.fontColor, onEvent = onEvent)

                AnimatedVisibility(visible = state.displayTable) {
                    Table()
                }
                NotepadContent(notes = state.notes, style = state.style,
                    color = state.fontColor,
                    fontSize = state.fontSize
                )
                 AddNote(
                     onEvent = onEvent,
                     showDialog =state.noteDialog ,
                     note = state.note,
                     style = state.style
                 )


            }

        }
    )
}