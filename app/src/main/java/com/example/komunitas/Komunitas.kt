package com.example.komunitas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.FrameLayout
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_user.*

class Komunitas : AppCompatActivity() {

    private var content: FrameLayout? = null

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_event -> {
                val fragment = EventFragment.newInstance()
                addfragment(fragment)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_akun -> {
                val fragment = AkunFragment.newInstance()
                addfragment(fragment)
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    private fun addfragment(fragment: Fragment){
        supportFragmentManager
            .beginTransaction()
            .setCustomAnimations(R.anim.design_bottom_sheet_slide_in, R.anim.design_bottom_sheet_slide_out)
            .replace(R.id.content, fragment, fragment.javaClass.getSimpleName())
            .commit()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_komunitas)
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
        val fragment = EventFragment.newInstance()
        addfragment(fragment)

    }
}
