package kg.tsi.geohis

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import androidx.cardview.widget.CardView

class MainActivityMain : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_main)


        val main = findViewById<Button>(R.id.ancient_his)

        main.setOnClickListener {
            startActivity(Intent(this, MainActivityAncient::class.java))
        }

        val maingeo = findViewById<Button>(R.id.general_button)

        maingeo.setOnClickListener {
            startActivity(Intent(this, MainActivityGenGeography::class.java))
        }

        val mainset = findViewById<ImageView>(R.id.imageView)

        mainset.setOnClickListener {
            startActivity(Intent(this, MainActivitySettings::class.java))
        }

        val mainprof = findViewById<ImageView>(R.id.imageView7)

        mainprof.setOnClickListener {
            startActivity(Intent(this, MainActivityProfile::class.java))
        }


    }
}


