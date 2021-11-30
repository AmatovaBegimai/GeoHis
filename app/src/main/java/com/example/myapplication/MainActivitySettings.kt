package kg.tsi.geohis

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivitySettings : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_settings)
        val click = findViewById<Button>(R.id.but_train)


        click.setOnClickListener {
            startActivity(Intent(this, MainActivityAncient::class.java))
        }
    }
}