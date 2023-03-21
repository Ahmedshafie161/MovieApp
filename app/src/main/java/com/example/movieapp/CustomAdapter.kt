package com.example.movieapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class CustomAdapter(private var myList:ArrayList<MovieItem>):
    RecyclerView.Adapter<CustomAdapter.MyViewHolder>() {


    class MyViewHolder(val view: View):RecyclerView.ViewHolder(view){
        val imageView:ImageView=view.findViewById(R.id.imageView)
        val tvName:TextView=view.findViewById(R.id.tvName)
        fun addData(movie:MovieItem){
            tvName.text=movie.title
            Glide.with(view)
                .load(movie.poster)
                .override(300,200)
                .into(imageView)

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.movie_layout,parent,false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return myList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.addData(myList[position])
    }
    fun updateList(myList:ArrayList<MovieItem>){
        this.myList=myList
        notifyDataSetChanged()
    }
}