package android.kotlin.test.modules.general

import android.kotlin.test.contracts.GeneralContract
import android.kotlin.test.data.LocalDataAccess

class GeneralModel(private val local: LocalDataAccess): GeneralContract.Model {
    override fun isAuthorized(): Boolean = local.getToken() != null
    override fun login(token: String) = local.set(token)
    override fun logout() = local.removeToken()
}