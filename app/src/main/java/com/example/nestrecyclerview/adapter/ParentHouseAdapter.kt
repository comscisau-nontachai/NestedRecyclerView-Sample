package com.example.nestrecyclerview.adapter

import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.nestrecyclerview.GameOfThrones
import com.example.nestrecyclerview.R
import org.w3c.dom.Text

class ParentHouseAdapter : RecyclerView.Adapter<ParentHouseAdapter.DataViewHolder>() {

    var gameOfThroneList: List<GameOfThrones> = arrayListOf()
    var onItemClick: ((GameOfThrones) -> Unit)? = null

    inner class DataViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        init {
            itemView.setOnClickListener {
                onItemClick?.invoke(gameOfThroneList[adapterPosition])
            }
        }

        fun bind(result: GameOfThrones) {
            val tvContent = itemView.findViewById<TextView>(R.id.tv_content_title)
            val rv = itemView.findViewById<RecyclerView>(R.id.child_rv)

            //set child adapter
            tvContent.text = result.name
            val childAdapter = ChildMembersAdapter(result.member)
            rv.layoutManager = LinearLayoutManager(itemView.context,LinearLayoutManager.HORIZONTAL,false)
            childAdapter.onItemClick = {
                Toast.makeText(itemView.context, "child click : ${it}", Toast.LENGTH_SHORT).show()
            }
            rv.adapter = childAdapter
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataViewHolder {
        return DataViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_row_parent,
                parent, false
            )
        )
    }

    override fun onBindViewHolder(holder: DataViewHolder, position: Int) {
        holder.bind(gameOfThroneList[position])
    }

    fun addData(list : List<GameOfThrones>){
        this.gameOfThroneList = list
        notifyDataSetChanged()
    }

    override fun getItemCount(): Int = gameOfThroneList.size
}