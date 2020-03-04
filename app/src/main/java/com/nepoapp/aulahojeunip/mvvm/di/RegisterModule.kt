package com.nepoapp.aulahojeunip.mvvm.di

import com.nepoapp.aulahojeunip.mvvm.viewModel.RegisterViewModel
import org.koin.dsl.module

val registerModule = module {
    factory { RegisterViewModel() }
}