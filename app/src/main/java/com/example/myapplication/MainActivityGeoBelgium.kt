package kg.tsi.geohis

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout

class MainActivityGeoBelgium : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_geo_belgium)

        val clickback = findViewById<ImageView>(R.id.imageView2)
        clickback.setOnClickListener {
            startActivity(Intent(this, MainActivityGenGeography::class.java))
            finish()
        }
        val  maps = findViewById<LinearLayout>(R.id.linearLayout)
        maps.setOnClickListener {
            startActivity(Intent(this, MainActivityMain::class.java))
            finish()
        }

    }
}