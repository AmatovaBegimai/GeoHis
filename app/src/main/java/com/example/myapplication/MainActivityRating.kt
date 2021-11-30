package kg.tsi.geohis

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class MainActivityRating : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_rating)

        val click3 = findViewById<ImageButton>(R.id.imageView)

        click3.setOnClickListener {
            startActivity(Intent(this, MainActivitySettings::class.java))

        }
    }
}