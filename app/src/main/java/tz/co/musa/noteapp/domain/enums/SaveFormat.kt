package tz.co.musa.noteapp.domain.enums

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DocumentScanner
import androidx.compose.material.icons.filled.PictureAsPdf
import androidx.compose.material.icons.filled.Save
import androidx.compose.material.icons.filled.TextFields
import androidx.compose.ui.graphics.vector.ImageVector

enum class SaveFormat(val icon: ImageVector, val title: String) {
    DOC(Icons.Filled.DocumentScanner, "Save as DOC"),
    TXT(Icons.Filled.TextFields, "Save as TXT"),
    WORD(Icons.Filled.Save, "Save as Word"),
    PDF(Icons.Filled.PictureAsPdf, "Save as PDF")
    // Add more save formats as needed
}