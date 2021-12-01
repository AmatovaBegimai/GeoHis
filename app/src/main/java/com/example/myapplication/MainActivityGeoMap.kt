package kg.tsi.geohis

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout

class MainActivityGeoMap : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_geo_map)

        val clickback = findViewById<ImageView>(R.id.imageView2)
        clickback.setOnClickListener {
            startActivity(Intent(this, MainActivityGenGeography::class.java))
            finish()
        }
        val button2 = findViewById<Button>(R.id.button)
        button2.setOnClickListener {
            startActivity(Intent(this, MainActivityLoseGame::class.java))
            finish()
        }
        val button1 = findViewById<Button>(R.id.button2)
        button1.setOnClickListener {
            startActivity(Intent(this, MainActivityLoseGame::class.java))
            finish()
        }
        val button3 = findViewById<Button>(R.id.button3)
        button3.setOnClickListener {
            startActivity(Intent(this, MainActivityLoseGame::class.java))
            finish()
        }
        val button4 = findViewById<Button>(R.id.button4)
        button4.setOnClickListener {
            startActivity(Intent(this, MainActivityLoseGame::class.java))
            finish()
        }
    }
}