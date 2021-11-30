package kg.tsi.geohis

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivitySettings : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_settings)

        val back = findViewById<ImageView>(R.id.imageView3)

        back.setOnClickListener {
            startActivity(Intent(this, MainActivityMain::class.java))
        }
    }
}

