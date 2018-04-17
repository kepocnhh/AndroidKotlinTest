package android.kotlin.test.data

interface LocalDataAccess {
    fun getToken(): String?
    fun set(token: String)
    fun removeToken()
}