package android.kotlin.test

import android.app.Application
import android.kotlin.test.cache.RamCache
import android.kotlin.test.components.AppComponent
import android.kotlin.test.components.Scopes
import android.kotlin.test.managers.ScopesManager

class App: Application() {
    companion object {
        lateinit var component: AppComponent
    }

    override fun onCreate() {
        super.onCreate()
        component = MainComponent(ScopesManager(RamCache()))
    }
}

class MainComponent(override val scopes: Scopes) : AppComponent