package com.example.androidworkshop.ui.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androidworkshop.data.Item
import com.example.androidworkshop.ui.theme.AndroidWorkshopTheme

@Composable
fun ToDoItem(
    item: Item,
    onDelete: () -> Unit,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            modifier = Modifier
                .weight(1f)
                .padding(start = 16.dp),
            text = item.text
        )

        IconButton(onClick = onDelete) {
            Icon(Icons.Filled.Close, contentDescription = "Close")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ToDoItemPreview() {
    val exampleItem = Item(1, "Example")
    AndroidWorkshopTheme {
        ToDoItem(
            item = exampleItem,
            onDelete = { /*TODO*/ }
        )
    }
}
