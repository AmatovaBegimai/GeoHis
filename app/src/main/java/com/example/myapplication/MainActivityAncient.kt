package kg.tsi.geohis

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivityAncient : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_ancient)
        //body

        //body
        val click_ancient1 = findViewById<Button>(R.id.but_train)


        click_ancient1.setOnClickListener {
            startActivity(Intent(this, MainActivityGeo_memory::class.java))
        }
    }
}