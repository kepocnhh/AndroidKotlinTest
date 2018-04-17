package android.kotlin.test.modules.general

import android.kotlin.test.contracts.GeneralContract

class GeneralPresenter(private val view: GeneralContract.View,
                       private val model: GeneralContract.Model): GeneralContract.Presenter {
    override fun checkAuth() = Thread({
        if(model.isAuthorized())
        {
            view.toWork()
        }
        else
        {
            view.toAuth()
        }
    }).start()
    override fun enter(data: String) = Thread({
        model.login(data)
        view.toWork()
    }).start()
    override fun logout() = Thread({
        model.logout()
        view.toAuth()
    }).start()
}