package kg.tsi.geohis

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivityLoseGame : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_lose_game)

        val clickmenu = findViewById<Button>(R.id.menu_button)

        clickmenu.setOnClickListener {
            startActivity(Intent(this, MainActivityMain::class.java))
            finish()
        }
        val clicktry = findViewById<Button>(R.id.tryagain)

        clicktry.setOnClickListener {
            startActivity(Intent(this, MainActivityGeoBelgium::class.java))
            finish()
        }


        }
    }
