package com.nepoapp.aulahojeunip.mvvm.di

import com.nepoapp.aulahojeunip.mvvm.viewModel.MainViewModel
import org.koin.dsl.module

val mainModule = module {
    factory { this }
    factory { MainViewModel() }
}