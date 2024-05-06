package com.example.androidworkshop.di

import androidx.room.Room
import com.example.androidworkshop.data.AppDatabase
import com.example.androidworkshop.data.DATABASE
import com.example.androidworkshop.data.ItemsRepository
import com.example.androidworkshop.data.ItemsRepositoryImpl
import com.example.androidworkshop.ui.components.ToDoItemViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module{

    single{ Room.databaseBuilder(get(), AppDatabase::class.java, DATABASE).build() }

//    single{ get<AppDatabase>().itemDao() }

    single<ItemsRepository> { ItemsRepositoryImpl(get()) }

    viewModel { ToDoItemViewModel(get()) }
}