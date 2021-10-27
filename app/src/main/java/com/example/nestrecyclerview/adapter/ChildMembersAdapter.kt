package com.example.nestrecyclerview.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.nestrecyclerview.GameOfThrones
import com.example.nestrecyclerview.R

class ChildMembersAdapter(var memberData : List<GameOfThrones.Member>) : RecyclerView.Adapter<ChildMembersAdapter.DataViewHolder>() {

    private var memberList : List<GameOfThrones.Member> = ArrayList()
    var onItemClick : ((String) -> Unit)? = null

    init {
        this.memberList = memberData
    }

    inner class DataViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        init {
            itemView.setOnClickListener {
                onItemClick?.invoke(memberList[adapterPosition].name)
            }
        }

        fun bind(result : GameOfThrones.Member){
            itemView.findViewById<TextView>(R.id.tv_name).text = result.name
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataViewHolder {
        return DataViewHolder(LayoutInflater.from(parent.context).inflate(
            R.layout.item_row_child,parent,false
        ))
    }

    override fun onBindViewHolder(holder: DataViewHolder, position: Int) {
        holder.bind(memberList[position])
    }

    override fun getItemCount(): Int = memberList.size
}