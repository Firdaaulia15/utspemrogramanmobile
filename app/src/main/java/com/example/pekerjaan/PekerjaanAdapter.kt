package com.example.pekerjaan

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class PekerjaanAdapter(private val listpekerjaan: ArrayList<Pekerjaan>) : RecyclerView.Adapter<PekerjaanAdapter.CardViewViewHolder>() {
    inner class CardViewViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var imgGambar: ImageView = itemView.findViewById(R.id.img_item_gambar)
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvDeskripsi: TextView = itemView.findViewById(R.id.tv_item_deskripsi)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_card_pekerjaan,parent, false)
        return CardViewViewHolder(view)
    }


    override fun getItemCount(): Int {
        return listpekerjaan.size
    }

    override fun onBindViewHolder(holder: CardViewViewHolder, position: Int) {
        val pekerjaan = listpekerjaan[position]

        Glide.with(holder.itemView.context)
            .load(pekerjaan.gambar)
            .apply(RequestOptions())
            .into(holder.imgGambar)
        holder.tvName.text = pekerjaan.name
        holder.tvDeskripsi.text = pekerjaan.deskripsi

        holder.itemView.setOnClickListener {
            Toast.makeText(holder.itemView.context, "" +listpekerjaan[holder.adapterPosition].name, Toast.LENGTH_SHORT).show()
        }
    }
}