package kg.tsi.geohis

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

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


            val click2 = findViewById<ImageButton>(R.id.imageView2)

            click2.setOnClickListener {
                startActivity(Intent(this, MainActivityGeo_memory::class.java))

            }

        }
    }
}


