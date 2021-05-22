package org.algosketch.menu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.LinearLayout
import android.widget.Toast
import androidx.drawerlayout.widget.DrawerLayout

class MainActivity : AppCompatActivity() {
    lateinit var drawer: DrawerLayout
    var isDrawerOpen = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        drawer = findViewById(R.id.drawer)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater: MenuInflater = menuInflater
        //inflater.inflate(R.menu.menu1, menu)
        inflater.inflate(R.menu.drawer, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.search -> {
                Toast.makeText(this, "search menu clicked!", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.item2 -> {
                Toast.makeText(this, "item2 menu clicked!", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.btn_drawer -> {
                isDrawerOpen = !isDrawerOpen
                if(isDrawerOpen) drawer.openDrawer(Gravity.LEFT)
                else drawer.closeDrawer(Gravity.LEFT)
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}