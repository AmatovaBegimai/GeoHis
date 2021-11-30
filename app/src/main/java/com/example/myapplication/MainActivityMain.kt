package kg.tsi.geohis

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.cardview.widget.CardView

class MainActivityMain : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_main)

        val click = findViewById<Button>(R.id.ancient_his)

        click.setOnClickListener {
            startActivity(Intent(this, MainActivityAncient::class.java))

            }
            val click2 = findViewById<Button>(R.id.general_button)

            click2.setOnClickListener {
                startActivity(Intent(this, MainActivityGenGeography::class.java))
            }
        val click3 = findViewById<ImageButton>(R.id.imageView)

        click3.setOnClickListener {
            startActivity(Intent(this, MainActivitySettings::class.java))

        }


            }
}


