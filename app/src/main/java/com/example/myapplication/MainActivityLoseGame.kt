package kg.tsi.geohis

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivityLoseGame : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_lose_game)

        val click = findViewById<Button>(R.id.but_train)


        click.setOnClickListener {
            startActivity(Intent(this, MainActivityAncient::class.java))
        }
    }
}