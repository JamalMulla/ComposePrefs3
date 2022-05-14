package com.jamal.composeprefs3sample

import android.content.Context
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.preferencesDataStore
import com.jamal.composeprefs3sample.ui.theme.ComposePrefsSampleTheme

val Context.dataStore: DataStore<Preferences> by preferencesDataStore(name = "settings")

@ExperimentalComposeUiApi
@OptIn(ExperimentalComposeUiApi::class)
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposePrefsSampleTheme {
                SettingsScreen()
            }
        }
    }
}
