package com.nepoapp.aulahojeunip.core.di

import android.app.Application
import com.nepoapp.aulahojeunip.mvvm.di.loginModule
import com.nepoapp.aulahojeunip.mvvm.di.mainModule
import com.nepoapp.aulahojeunip.mvvm.di.registerModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import org.koin.dsl.module

class ClassNowApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@ClassNowApplication)
            modules(arrayListOf(
                mainModule,
                registerModule,
                loginModule))
        }
    }

}