package com.kim.viewpagerpractice3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentManager
import androidx.transition.FragmentTransitionSupport
import com.kim.viewpagerpractice3.adapters.MainViewPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var mMainViewPagerAdapter : MainViewPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mMainViewPagerAdapter = MainViewPagerAdapter(supportFragmentManager)
        firstViewPager.adapter = mMainViewPagerAdapter

        firstViewPager.offscreenPageLimit = 5

    }
}