package tz.co.musa.noteapp.core.component

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import tz.co.musa.noteapp.domain.enums.InsertOption

@Composable
fun InsertMenu() {
    Column(
        modifier = Modifier
            .padding(16.dp)
            .width(IntrinsicSize.Max)
    ) {
        InsertOption.entries.forEach { option ->
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .padding(vertical = 8.dp)
                    .clickable { /* Handle insert option selection */ }
            ) {
                Icon(option.icon, contentDescription = option.title)
                Spacer(modifier = Modifier.width(8.dp))
                Text(option.title)
            }
        }
    }
}
