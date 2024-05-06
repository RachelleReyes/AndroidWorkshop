package com.example.androidworkshop.data

class ItemsRepositoryImpl(private val itemDao: ItemDao) : ItemsRepository {

    override fun getAllItems(): MutableList<Item> = itemDao.getAll()

    override suspend fun insertItem(item: Item) = itemDao.insert(item)

    override suspend fun deleteItem(item: Item) = itemDao.delete(item)
}
