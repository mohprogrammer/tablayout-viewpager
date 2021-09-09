package com.example.tablelayout_viewpager

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter

class ViewpagerAdapter:FragmentStatePagerAdapter {
    constructor(fm:FragmentManager):super(fm)


    var array_tabs = arrayListOf<MyTab>()

    override fun getCount(): Int {
        return array_tabs.size
    }

    override fun getItem(position: Int): Fragment {
        return array_tabs[position].fragment
    }

    override fun getPageTitle(position: Int): CharSequence {
        return array_tabs[position].name
    }

    fun set_tabs(arrayoftabs:ArrayList<MyTab>)
    {
        this.array_tabs = arrayoftabs
    }

}