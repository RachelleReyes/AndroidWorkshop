package com.example.androidworkshop.ui.components

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.platform.SoftwareKeyboardController

@OptIn(ExperimentalMaterial3Api::class, ExperimentalComposeUiApi::class)
@Composable
fun MainScreen(
//    itemList: SnapshotStateList<Item>,
    viewModel: ToDoItemViewModel
) {
    val keyboardController: SoftwareKeyboardController? = LocalSoftwareKeyboardController.current
    var text: String by remember { mutableStateOf("") }

//    Column(
//        modifier = Modifier
//            .clickable { keyboardController?.hide() }
//    ) {
//        TopAppBar(
//            title = { Text(text = stringResource(id = R.string.title)) }
//        )
//
//        ToDoList(
//            list = itemList,
//            onDelete = { item ->
//                viewModel.deleteToDo(item)
//            },
//            modifier = Modifier.weight(1f)
//        )
//
//        Row(
//            modifier = Modifier
//                .fillMaxWidth()
//                .padding(vertical = 50.dp, horizontal = 20.dp)
//        ) {
//
//            OutlinedTextField(
//                value = text,
//                onValueChange = { text = it },
//                colors = TextFieldDefaults.colors(
//                    focusedIndicatorColor = Color.Transparent,
//                    unfocusedIndicatorColor = Color.Transparent,
//                ),
//                modifier = Modifier.border(
//                    BorderStroke(2.dp, Color.Gray)
//                )
//            )
//
//            Spacer(modifier = Modifier.weight(1f))
//
//            Button(
//                onClick = {
//                    if (text.isEmpty()) return@Button
//                    viewModel.insertToDo(text)
//                    text = ""
//                    keyboardController?.hide()
//                },
//                modifier = Modifier.align(Alignment.CenterVertically)
//            ) {
//                Text(text = stringResource(id = R.string.add))
//            }
//        }
//    }
}