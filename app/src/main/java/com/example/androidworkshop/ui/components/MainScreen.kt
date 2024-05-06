package com.example.androidworkshop.ui.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.platform.SoftwareKeyboardController
import androidx.compose.ui.res.stringResource
import com.example.androidworkshop.R

@OptIn(ExperimentalComposeUiApi::class, ExperimentalMaterial3Api::class)
@Composable
fun MainScreen(
//    itemList: SnapshotStateList<Item>,
    viewModel: ToDoItemViewModel
) {
    val keyboardController: SoftwareKeyboardController? = LocalSoftwareKeyboardController.current
    var text: String by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .clickable { keyboardController?.hide() }
    ) {
        TopAppBar(
            title = { Text(text = stringResource(id = R.string.title)) }
        )
    }
}