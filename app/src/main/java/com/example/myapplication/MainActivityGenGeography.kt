package kg.tsi.geohis

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import androidx.cardview.widget.CardView

class MainActivityGenGeography : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_gen_geography)
        val click = findViewById<CardView>(R.id.map_button)


        click.setOnClickListener {
            startActivity(Intent(this, MainActivityGeoMap::class.java))

            }
        val click2 = findViewById<ImageView>(R.id.imageView2)

        click2.setOnClickListener {
            startActivity(Intent(this, MainActivityMain::class.java))

        }
        val click3 = findViewById<ImageButton>(R.id.imageView)

        click3.setOnClickListener {
            startActivity(Intent(this, MainActivitySettings::class.java))

        }

        }
    }
