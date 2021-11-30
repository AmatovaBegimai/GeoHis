package kg.tsi.geohis

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView

class MainActivityAncient : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_ancient)
        //body

        //body
        val click1 = findViewById<Button>(R.id.but_train)

        click1.setOnClickListener {
            startActivity(Intent(this, MainActivityGeo_memory::class.java))

        }
        val click2 = findViewById<Button>(R.id.back_ancient)

        click2.setOnClickListener {
            startActivity(Intent(this, MainActivityMain::class.java))

        }
        val click3 = findViewById<ImageButton>(R.id.imageView)

        click3.setOnClickListener {
            startActivity(Intent(this, MainActivitySettings::class.java))

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



