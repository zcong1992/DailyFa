package com.andrzc.dailyfa.kotlin

import com.andrzc.dailyfa.KotlinActivity
import com.andrzc.dailyfa.MainActivity

/**
 * Created by ZC on 2018/06/19.
 */
class KotlinGetterAndSetter {

    private var name: String? = null
    private lateinit var firstName: String

    val classz = MainActivity::class.java
    val classz2 = KotlinActivity()
    val classz3 = classz.javaClass

    /**
     * getter and setter
     */
    var x: Int = 0
        set(value) {
            field = value
        }
        get() = field
}