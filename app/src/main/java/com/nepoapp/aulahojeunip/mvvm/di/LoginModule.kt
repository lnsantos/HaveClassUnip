package com.nepoapp.aulahojeunip.mvvm.di

import com.nepoapp.aulahojeunip.mvvm.viewModel.LoginViewModel
import org.koin.dsl.module

val loginModule = module {
    factory { LoginViewModel() }
}