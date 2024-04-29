package tz.co.musa.noteapp.core.component

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun Table() {
    // Example table data
    val tableData = listOf(
        listOf("Header 1", "Header 2", "Header 3"),
        listOf("Data 1", "Data 2", "Data 3"),
        listOf("Data 4", "Data 5", "Data 6")
    )

    Column {
        tableData.forEach { row ->
            Row(Modifier.padding(4.dp)) {
                row.forEach { cell ->
                    Box(
                        modifier = Modifier
                            .border(1.dp, Color.Black)
                            .padding(4.dp)
                            .weight(1f)
                            .heightIn(32.dp),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(text = cell)
                    }
                }
            }
        }
    }
}
