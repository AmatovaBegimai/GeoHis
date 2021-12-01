package kg.tsi.geohis

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationView
import androidx.navigation.ui.AppBarConfiguration

class MainActivityAncient : AppCompatActivity() {

    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_ancient)

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
        val clickback = findViewById<Button>(R.id.back_ancient)
        clickback.setOnClickListener {
            startActivity(Intent(this, MainActivityMain::class.java))
            finish()
        }
        val clicksettings = findViewById<ImageButton>(R.id.imageView)

        clicksettings.setOnClickListener {
            startActivity(Intent(this, MainActivitySettings::class.java))
            finish()
        }
    }
}

