package android.kotlin.test.contracts


interface GeneralContract {
    interface Model {
        fun isAuthorized(): Boolean
        fun login(token: String)
        fun logout()
    }
    interface View {
        fun toAuth()
        fun toWork()
    }
    interface Presenter {
        fun checkAuth()
        fun enter(data: String)
        fun logout()
    }
}