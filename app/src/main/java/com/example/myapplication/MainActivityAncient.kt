package kg.tsi.geohis

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationView
import androidx.navigation.ui.AppBarConfiguration

class MainActivityAncient : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_ancient)
        //body

        //body
        //navbar
        val navController = findViewById<BottomNavigationView>(R.id.navbar)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        val appBarConfiguration = AppBarConfiguration(setOf(
            R.id.mainmenu

                    setupActionBarWithNavController(navController, appBarConfiguration)
                navView.setupWithNavController(navController
    }


