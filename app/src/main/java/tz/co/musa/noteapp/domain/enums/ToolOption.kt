package tz.co.musa.noteapp.domain.enums

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Spellcheck
import androidx.compose.ui.graphics.vector.ImageVector

enum class ToolOption(val icon: ImageVector, val title: String) {
    CHECK_SPELL(Icons.Filled.Spellcheck, "Check Spelling")
    // Add more tool options as needed
}