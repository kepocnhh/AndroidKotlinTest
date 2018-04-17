package android.kotlin.test.managers

import android.kotlin.test.components.Scopes
import android.kotlin.test.data.LocalDataAccess
import android.kotlin.test.modules.general.GeneralScope

class ScopesManager(local: LocalDataAccess): Scopes {
    override val general: Scopes.General = GeneralScope(local)
}