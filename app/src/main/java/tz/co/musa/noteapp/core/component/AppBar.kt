package tz.co.musa.noteapp.core.component

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Print
import androidx.compose.material.icons.filled.Save
import androidx.compose.material.icons.filled.TableChart
import androidx.compose.material.icons.filled.TextFormat
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import tz.co.musa.noteapp.domain.enums.MenuType
import tz.co.musa.noteapp.domain.enums.PrintOption
import tz.co.musa.noteapp.domain.enums.SaveFormat
import tz.co.musa.noteapp.presentation.note.NoteEvent
import tz.co.musa.noteapp.domain.enums.ToolOption

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppBar(
    onEvent: (NoteEvent) -> Unit,
    showMenu:Boolean,
    style: TextStyle,
    insertMenu:Boolean,
    menuType: MenuType,
    spellCheck:Boolean,
    saveAsMenu:Boolean,
    printOption:Boolean
) {
    TopAppBar(
        title = { Text(
            text = "Notepad",
            style = style
        ) },
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = MaterialTheme.colorScheme.primary,
            titleContentColor = MaterialTheme.colorScheme.onPrimary
        ),
        actions = {
            IconButton(onClick = {
                onEvent(NoteEvent.ToggleMenu)
            }) {
                Icon(
                    Icons.Filled.TextFormat,
                    contentDescription = "TextFormat",
                    tint = MaterialTheme.colorScheme.onPrimary
                )

            }

            DropdownMenu(
                expanded = showMenu,
                onDismissRequest = {
                    onEvent(NoteEvent.ToggleMenu)
                },
                modifier = Modifier.padding(16.dp)
            ) {

                FontOptions(
                    onEvent = onEvent
                )
            }

            IconButton(onClick = {
                onEvent(NoteEvent.InsertMenuToggle)
            }) {
                Icon(
                    Icons.Filled.Add,
                    contentDescription = "Add Note",
                    tint = MaterialTheme.colorScheme.onPrimary
                )

            }
            DropdownMenu(
                expanded = insertMenu,
                onDismissRequest = {
                    onEvent(NoteEvent.InsertMenuToggle)
                },
                modifier = Modifier.padding(16.dp)
            ) {
                InsertMenu()
            }

            IconButton(onClick = {
                onEvent(NoteEvent.DisplayTable)
            }) {
                Icon(
                    Icons.Filled.TableChart,
                    contentDescription = "Add Table",
                    tint = MaterialTheme.colorScheme.onPrimary
                )

            }



            IconButton(onClick = {onEvent(NoteEvent.SaveAsMenu) }) {
                Icon(
                    Icons.Filled.Save,
                    contentDescription = "Save Menu",
                    tint = MaterialTheme.colorScheme.onPrimary
                )
            }

            DropdownMenu(
                expanded = saveAsMenu,
                onDismissRequest = {
                    onEvent(NoteEvent.SaveAsMenu)
                }
            ) {
                SaveFormat.entries.forEach { option ->
                    DropdownMenuItem(text = {
                        Row {
                            Icon(option.icon, contentDescription = option.title)
                            Spacer(modifier = Modifier.width(8.dp))
                            Text(option.title)
                        }
                    }, onClick = {})

                }
            }


            IconButton(onClick = {onEvent(NoteEvent.PrintOption) }) {
                Icon(
                    Icons.Filled.Print,
                    contentDescription = "Print Menu",
                    tint = MaterialTheme.colorScheme.onPrimary
                )
            }

            DropdownMenu(
                expanded = printOption,
                onDismissRequest = {
                    onEvent(NoteEvent.PrintOption)
                }
            ) {
                PrintOption.entries.forEach { option ->
                    DropdownMenuItem(text = {
                        Row {
                            Icon(option.icon, contentDescription = option.title)
                            Spacer(modifier = Modifier.width(8.dp))
                            Text(option.title)
                        }
                    }, onClick = {})

                }
            }



            IconButton(onClick = {onEvent(NoteEvent.DisplaySpellCheck) }) {
                Icon(
                    Icons.Filled.MoreVert,
                    contentDescription = "Tools",
                    tint = MaterialTheme.colorScheme.onPrimary
                )
            }

            DropdownMenu(
                expanded = spellCheck,
                onDismissRequest = {
                    onEvent(NoteEvent.DisplaySpellCheck)
                }
            ) {
                ToolOption.entries.forEach { option ->
                    DropdownMenuItem(text = {
                        Row {
                            Icon(option.icon, contentDescription = option.title)
                            Spacer(modifier = Modifier.width(8.dp))
                            Text(option.title)
                        }
                    }, onClick = {})

                }
            }



        }
    )
}