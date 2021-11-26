package com.rikkei.tranning.rikkeitraning3

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class Adapter(
    var context: Context,
    var listModel: ArrayList<Model>
) : RecyclerView.Adapter<Adapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater: LayoutInflater = LayoutInflater.from(context)
        val view: View = layoutInflater.inflate(R.layout.list_model, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val mModel = listModel[position]
        context.let { Glide.with(it).load(mModel.image).into(holder.image) }
        holder.name.text = mModel.name
    }

    override fun getItemCount(): Int {
        return listModel.size
    }


    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val name: TextView = itemView.findViewById(R.id.tv_name)
        val image: ImageView = itemView.findViewById(R.id.iv_image)
    }
}