package com.andrzc.dailyfa.kotlin

import java.util.*

annotation class JavaStatic

/**
 * Created by ZC on 2018/05/16.
 */

fun main(args: String) {

    //数组
    var names: Array<String> = arrayOf("a", "b", "c")

    var emptyStrings: Array<String?> = arrayOfNulls(10)


    /**
     * 定义变量
     */

    val name: String? = "小明"
    val age: Int = 10
    val sex: Boolean = false


    /**
     * 定义数组
     */

    val stuNames: Array<String> = arrayOf("小明", "小红", "小丽")
    val stuScores: Array<String?> = arrayOfNulls(3)//可为空

    //    基础类型数组(int short byte long float double char boolean)
    //int short byte char long flaot double boolean
    val intAges = intArrayOf(10, 10, 9)
    val shortHeight = shortArrayOf(110, 100, 98)
    val byteId = byteArrayOf(0xa, 0xb)
    val longCount = longArrayOf(1, 22)
    val floatYuWen = floatArrayOf(85.0f, 86.5f)
    val doubleShuxue = doubleArrayOf(88.0, 12.5, 45.562352)
    val charColumn = charArrayOf('a', 'f', '1')
    val booeanFirst = booleanArrayOf(true, false)


    /**
     * 变长参数
     */
    fun datas(vararg ages: String) {

    }

    /**
     * 三元运算符
     */
    var isLogin: Boolean = true
    var code: Int = if (isLogin) 200 else 400

    /**
     * main 函数
     */
    println("Hello Kotlin")

    //main
    @JavaStatic
    fun main() {
        println("hello world!")
    }

    /**
     * 实例化对象
     */
    val date = Date()
}

