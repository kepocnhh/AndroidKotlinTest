package android.kotlin.test.cache

import android.kotlin.test.data.LocalDataAccess

class RamCache: LocalDataAccess {
    var data: String? = null

    override fun getToken(): String? = data
    override fun set(token: String) {
        data = token
    }
    override fun removeToken() {
        data = null
    }
}