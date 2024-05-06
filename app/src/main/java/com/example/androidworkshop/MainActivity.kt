package com.example.androidworkshop

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.example.androidworkshop.ui.components.MainScreen
import com.example.androidworkshop.ui.components.ToDoItemViewModel
import com.example.androidworkshop.ui.theme.AndroidWorkshopTheme
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : ComponentActivity() {
    private val viewModel: ToDoItemViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AndroidWorkshopTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                ) {
                    MainScreen(
                        itemList = viewModel.itemList,
                        viewModel = viewModel
                    )
                    viewModel.loadToDo()
                }
            }
        }
    }
}

