package kg.tsi.geohis

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.cardview.widget.CardView

class MainActivityGenGeography : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_gen_geography)
        val click = findViewById<CardView>(R.id.map_button)


        click.setOnClickListener {
            startActivity(Intent(this, MainActivityGeoMap::class.java))

        }
    }
}