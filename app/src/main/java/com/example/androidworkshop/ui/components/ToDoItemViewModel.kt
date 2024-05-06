package com.example.androidworkshop.ui.components

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.androidworkshop.data.Item
import com.example.androidworkshop.data.ItemsRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class ToDoItemViewModel(
    private val itemsRepository: ItemsRepository
): ViewModel() {
    var itemList = mutableStateListOf<Item>()

    fun loadToDo() {
        viewModelScope.launch(Dispatchers.IO){
            itemsRepository.getAllItems().forEach { toDo ->
                itemList.add(toDo)
            }
        }
    }

    fun insertToDo(title: String) {
        viewModelScope.launch(Dispatchers.IO){
            itemsRepository.insertItem(Item(text = title))
            itemList.clear()
            loadToDo()
        }
    }

    fun deleteToDo(todo: Item) {
        viewModelScope.launch(Dispatchers.IO){
            itemsRepository.deleteItem(todo)
            itemList.clear()
            loadToDo()
        }
    }
}