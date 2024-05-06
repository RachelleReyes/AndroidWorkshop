package com.example.androidworkshop.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface ItemDao {
    @Query("select * from item")
    fun getAll(): MutableList<Item>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(todo: Item)

    @Delete
    fun delete(todo: Item)
}