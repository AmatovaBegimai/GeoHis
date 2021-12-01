package kg.tsi.geohis

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivityMain : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_main)




            val bottomNav = findViewById<BottomNavigationView>(R.id.navbar)
            bottomNav.setOnNavigationItemSelectedListener {
                when (it.itemId) {
                    R.id.menu_button -> {
                        //todo переходы

                        //todo переходы
                        true
                    }
                    R.id.home -> {
                        //todo переходы

                        //todo переходы
                        true
                    }

                    else -> false
                }
            }
            //todo body

        }


    }



