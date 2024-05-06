package com.example.androidworkshop.data

import androidx.room.Database
import androidx.room.RoomDatabase

const val DATABASE = "room_database"

@Database(entities = [Item::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    abstract fun itemDao(): ItemDao
}