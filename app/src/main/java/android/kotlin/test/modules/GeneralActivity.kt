package android.kotlin.test.modules

import android.app.Activity
import android.kotlin.test.App
import android.kotlin.test.R
import android.kotlin.test.contracts.GeneralContract
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class GeneralActivity : Activity() {
    private lateinit var presenter: GeneralContract.Presenter
    private val view = object : GeneralContract.View {
        override fun toAuth() {
            text.setText("to -> auth")
            Log.e(javaClass.simpleName, "to -> auth")
        }
        override fun toWork() {
            text.setText("to -> work")
            Log.e(javaClass.simpleName, "to -> work")
        }
    }

    private lateinit var text: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.general_screen)
        text = findViewById(R.id.text)
        text.setText("init")
        presenter = App.component.scopes.general.newPresenter(view)
        presenter.checkAuth()
    }
}