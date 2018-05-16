package com.andrzc.dailyfa

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class KotlinActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin)

        sales()
        for (x in 1..6) {
//            println("值 为: $x")
        }

        val x = 9
        val y = 10
        if (x in 1..y - 1) {
            println("x在范围内 ，值为$x")
        }

        cases("hello")
        cases(1)
    }

    fun sales() {
        var quantity = 5;
        val price = 20.3
        val name: String = "大米"

        println("单价：$price")
        println("数量：$quantity")
        println("产品 $name 总计：${quantity * price}")
    }

    fun cases(obj: Any) {
        when (obj) {
            1 -> println("这是第一项")
            "hello" -> println("这是一个hello字符串")
            is Long -> println("这是一个Long类型数据")
        }
    }

}
