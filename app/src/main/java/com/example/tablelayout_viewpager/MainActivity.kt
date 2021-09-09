package com.example.tablelayout_viewpager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {
    var tablayout:TabLayout? = null
    var viewpager:ViewPager? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tablayout = findViewById(R.id.main_tablayout)
        viewpager = findViewById(R.id.main_viewpager)

        tablayout!!.setupWithViewPager(viewpager)

        val tabs = arrayListOf<MyTab>()

        tabs.add(MyTab("one",FragmentProduct.newInstance("One","Beef")))
        tabs.add(MyTab("Two",FragmentProduct.newInstance("Two","Egg")))
        tabs.add(MyTab("Three",FragmentProduct.newInstance("Three","Fruit")))
        tabs.add(MyTab("Four",FragmentProduct.newInstance("Four","Nutes & Seeds")))
        tabs.add(MyTab("Five",FragmentProduct.newInstance("Five","Condiments")))

        val adapter = ViewpagerAdapter(supportFragmentManager)

        adapter.set_tabs(tabs)

        viewpager!!.adapter = adapter
    }
}