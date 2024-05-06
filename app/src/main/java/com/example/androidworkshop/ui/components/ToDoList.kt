package com.example.androidworkshop.ui.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.androidworkshop.data.Item


@Composable
fun ToDoList(
    list: List<Item>,
    onDelete: (Item) -> Unit,
    modifier: Modifier = Modifier
) {
    LazyColumn(
        modifier = modifier
            .fillMaxWidth()
    ) {
        items(
            items = list,
            key = { item -> item.id }
        ) { item ->
            ToDoItem(
                item = item,
                onDelete = { onDelete(item) }
            )
        }
    }
}