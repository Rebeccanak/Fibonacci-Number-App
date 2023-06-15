package com.rebecca.lastfibonacciapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import java.math.BigInteger

class fibonacci_Recycler_View_Adaptor(var fiblist: List<BigInteger>): RecyclerView.Adapter<fibonacciViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): fibonacciViewHolder {
        var itemView = LayoutInflater.from(parent.context).inflate(R.layout.fib_list_item,parent,false)
        return fibonacciViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: fibonacciViewHolder, position: Int) {
        val currentNumber = fiblist.get(position).toString()
        holder.tvnumbers.text =currentNumber
    }
    override fun getItemCount(): Int {
       return fiblist.size
    }

}
class fibonacciViewHolder(var itemView:View):ViewHolder(itemView){
    var tvnumbers =itemView.findViewById<TextView>(R.id.tvNumber)
}