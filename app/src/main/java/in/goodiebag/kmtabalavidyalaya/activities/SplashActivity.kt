package `in`.goodiebag.kmtabalavidyalaya.activities

import `in`.goodiebag.kmtabalavidyalaya.R
import android.content.Intent
import android.media.MediaPlayer
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.splash_activity.*

class SplashActivity : AppCompatActivity() {
    lateinit var mediaPlayer: MediaPlayer
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash_activity)
        ripple.startRippleAnimation()
        mediaPlayer = MediaPlayer.create(this, R.raw.ringtaal)
        mediaPlayer.start()
        ripple.setOnClickListener {
            mediaPlayer.stop()
            ripple.stopRippleAnimation()
            val intent = MainMenuActivity.getStartActivityIntent(this)
            startActivity(intent)
        }
    }

}
