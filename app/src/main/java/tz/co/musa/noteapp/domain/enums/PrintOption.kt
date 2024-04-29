package tz.co.musa.noteapp.domain.enums

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Landscape
import androidx.compose.material.icons.filled.Portrait
import androidx.compose.material.icons.filled.Print
import androidx.compose.ui.graphics.vector.ImageVector

enum class PrintOption(val icon: ImageVector, val title: String) {
    PRINT(Icons.Filled.Print, "Print"),
    PORTRAIT(Icons.Filled.Portrait, "Portrait"),
    LANDSCAPE(Icons.Filled.Landscape, "Landscape")

    // Add more print options as needed
}