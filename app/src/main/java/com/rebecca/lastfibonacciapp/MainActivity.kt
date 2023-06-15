package com.rebecca.lastfibonacciapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.rebecca.lastfibonacciapp.databinding.ActivityMainBinding
import java.math.BigInteger

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()
        display()

}
    fun generateFibonaci(n:Int) :List<BigInteger>{
        var fiblist = mutableListOf<BigInteger>(BigInteger.ZERO, BigInteger.ONE)
        while (fiblist.size < n) {
            var next = fiblist[fiblist.lastIndex] + fiblist[fiblist.lastIndex-1]
            fiblist.add(next)
        }
        return fiblist
    }
    fun display(){
        binding.rvFibonacciNumbers.layoutManager = LinearLayoutManager(this)
        val fibAdapter = fibonacci_Recycler_View_Adaptor(generateFibonaci(100))
        binding.rvFibonacciNumbers.adapter =fibAdapter
    }
}