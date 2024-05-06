package com.example.androidworkshop.data

interface ItemsRepository {

    fun getAllItems(): MutableList<Item>

    suspend fun insertItem(item: Item)

    suspend fun deleteItem(item: Item)
}