package tz.co.musa.noteapp.presentation.note

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import tz.co.musa.noteapp.domain.enums.MenuType
import javax.inject.Inject

@HiltViewModel
class NoteViewModel @Inject constructor():ViewModel() {

    private val _state = MutableStateFlow(NoteState())
    val state = _state.asStateFlow()
    fun onEvent(event: NoteEvent){
        when(event){
            is NoteEvent.AddNote -> {
                _state.update {
                    it.copy(note = event.note)
                }
            }
            is NoteEvent.SaveNote -> {
                 if(_state.value.note.isNotEmpty())
                _state.value.notes.add(_state.value.note)
                _state.update {
                    it.copy(note = "")
                }

            }
            is NoteEvent.ChangeColor -> {
                _state.update {
                    it.copy(fontColor = event.color)
                }
            }
            is NoteEvent.ChangeFont -> {
                _state.update {
                    it.copy(fontSize = event.font)
                }
            }
            is NoteEvent.ToggleMenu -> {
                _state.update {
                    it.copy(menuDisplay = !_state.value.menuDisplay)
                }
            }
            is NoteEvent.ChangeFontStyle -> {
                _state.update {
                    it.copy(menuType = MenuType.FontStyle)
                }
                _state.update {
                    it.copy(style = event.style)
                }
                _state.update {
                    it.copy(menuDisplay = false)
                }
            }

           is  NoteEvent.InsertMenuToggle -> {
                _state.update {
                    it.copy(menuType = MenuType.InsertOption)
                }
                _state.update {
                    it.copy(insertMenu = !_state.value.insertMenu)
                }
            }
            is NoteEvent.DisplayTable ->{
                _state.update {
                    it.copy(displayTable = !_state.value.displayTable)
                }
            }
            is NoteEvent.DisplaySpellCheck ->{
                _state.update {
                    it.copy(
                        displaySpellCheck = !_state.value.displaySpellCheck
                    )
                }
            }
            is NoteEvent.SaveAsMenu ->{
                _state.update {
                    it.copy(
                        saveMenu = !_state.value.saveMenu
                    )
                }
            }
            is NoteEvent.PrintOption ->{
                _state.update {
                    it.copy(
                        printOption = !_state.value.printOption
                    )
                }
            }
            is NoteEvent.NoteDialog ->{
                _state.update {
                    it.copy(noteDialog = !_state.value.noteDialog)
                }
            }

        }

    }
}