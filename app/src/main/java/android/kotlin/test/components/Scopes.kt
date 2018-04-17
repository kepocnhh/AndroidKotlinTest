package android.kotlin.test.components

import android.kotlin.test.contracts.GeneralContract

interface Scopes {
    val general: General

    interface General {
        fun newPresenter(view: GeneralContract.View): GeneralContract.Presenter
    }
}