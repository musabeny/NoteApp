package tz.co.musa.noteapp.domain.enums

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AttachFile
import androidx.compose.material.icons.filled.BarChart
import androidx.compose.material.icons.filled.FormatColorFill
import androidx.compose.material.icons.filled.Image
import androidx.compose.material.icons.filled.ImageAspectRatio
import androidx.compose.material.icons.filled.Link
import androidx.compose.ui.graphics.vector.ImageVector

enum class InsertOption(val icon: ImageVector, val title: String) {
    IMAGE(Icons.Filled.Image, "Image"),
    LINK(Icons.Filled.Link, "Link"),
    FILE(Icons.Filled.AttachFile, "File"),
    BACKGROUND_COLOR(Icons.Filled.FormatColorFill, "Background Color"),
    BACKGROUND_IMAGE(Icons.Filled.ImageAspectRatio, "Background Image"),
    BAR_CHART(Icons.Filled.BarChart, "Bar Chart"),

}