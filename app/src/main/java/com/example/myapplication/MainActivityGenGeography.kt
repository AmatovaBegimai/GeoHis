package kg.tsi.geohis

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
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
            //navbar
            val click4 = findViewById<ImageView>(R.id.imageView6)

            click4.setOnClickListener {
                startActivity(Intent(this, MainActivityMain::class.java))

            }
            val click5 = findViewById<ImageView>(R.id.imageView7)

            click5.setOnClickListener {
                startActivity(Intent(this, MainActivityProfile::class.java))

            }
            val click6 = findViewById<ImageView>(R.id.imageView9)

            click6.setOnClickListener {
                startActivity(Intent(this, MainActivityRating::class.java))
            }
            //navbar
        }
    }
}