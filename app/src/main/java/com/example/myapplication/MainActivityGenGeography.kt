package kg.tsi.geohis

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.cardview.widget.CardView

class MainActivityGenGeography : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_gen_geography)



        val clickback = findViewById<ImageView>(R.id.imageView2)
        clickback.setOnClickListener {
            startActivity(Intent(this, MainActivityMain::class.java))
            finish()
        }
        val clicksettings = findViewById<ImageView>(R.id.imageView)

        clicksettings.setOnClickListener {
            startActivity(Intent(this, MainActivitySettings::class.java))
            finish()
        }


        //navbar
        val clickprofile = findViewById<ImageView>(R.id.imageView7)

        clickprofile.setOnClickListener {
            startActivity(Intent(this, MainActivityProfile::class.java))
            finish()
        }
        val clickrating = findViewById<ImageView>(R.id.imageView9)

        clickrating.setOnClickListener {
            startActivity(Intent(this, MainActivityRating::class.java))
            finish()

        }
        val clickmain = findViewById<ImageView>(R.id.imageView6)

        clickmain.setOnClickListener {
            startActivity(Intent(this, MainActivityMain::class.java))
            finish()


        }
        //navbar

    val clickplay = findViewById<LinearLayout>(R.id.linear1)

    clickplay.setOnClickListener {
        startActivity(Intent(this, MainActivityGeoBelgium::class.java))
        finish()
    }
        val clickmapbut = findViewById<Button>(R.id.map_but)

        clickmapbut.setOnClickListener {
            startActivity(Intent(this, MainActivityGeoMap::class.java))
            finish()
        }
        val clickgeo = findViewById<Button>(R.id.but_train1)

        clickgeo.setOnClickListener {
            startActivity(Intent(this, MainActivityGeoBelgium::class.java))
            finish()
        }



        }
}

