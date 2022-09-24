package com.example.youtubeapi.di

import com.example.youtubeapi.ui.first.FirstViewModel
import com.example.youtubeapi.ui.second.SecondViewModel
import com.example.youtubeapi.ui.third.ThirdViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.module.Module
import org.koin.dsl.module

val viewModules : Module = module {
    viewModel { FirstViewModel(get()) }
    viewModel { SecondViewModel(get()) }
    viewModel { ThirdViewModel() }
}