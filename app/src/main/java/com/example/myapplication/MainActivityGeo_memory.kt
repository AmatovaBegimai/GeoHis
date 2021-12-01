package kg.tsi.geohis

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.LinearLayout

class MainActivityGeo_memory : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_geo_memory)

        val clickback = findViewById<ImageView>(R.id.imageView2)
        clickback.setOnClickListener {
            startActivity(Intent(this, MainActivityGenGeography::class.java))
            finish()
        }
        val clicksettings = findViewById<ImageView>(R.id.settings1)
        clickback.setOnClickListener {
            startActivity(Intent(this, MainActivitySettings::class.java))
            finish()


        }
    }
}