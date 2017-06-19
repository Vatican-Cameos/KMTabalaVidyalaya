package `in`.goodiebag.kmtabalavidyalaya.activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

import `in`.goodiebag.kmtabalavidyalaya.R
import android.content.Context
import android.content.Intent

class MainMenuActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_menu)
    }

    companion object {
        fun getStartActivityIntent(context: Context): Intent {
            val intent = Intent(context, MainMenuActivity::class.java)
            return intent
        }
    }
}
