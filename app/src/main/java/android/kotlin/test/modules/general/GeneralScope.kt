package android.kotlin.test.modules.general

import android.kotlin.test.components.Scopes
import android.kotlin.test.contracts.GeneralContract
import android.kotlin.test.data.LocalDataAccess

class GeneralScope(local: LocalDataAccess) : Scopes.General {
    private val model: GeneralContract.Model = GeneralModel(local)

    override fun newPresenter(view: GeneralContract.View): GeneralContract.Presenter = GeneralPresenter(view, model)
}