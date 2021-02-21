package com.example.tugas008.adepter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.tugas008.databinding.Halaman1Binding
import com.example.tugas008.model.halaman

class adapter (var negara :List<halaman>):RecyclerView.Adapter<adapter.TodoViewHolder>(){
    inner class TodoViewHolder(val binding: Halaman1Binding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodoViewHolder {
        return TodoViewHolder(Halaman1Binding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun getItemCount(): Int {
        return negara.size
    }

    override fun onBindViewHolder(holder: TodoViewHolder, position: Int) {
        holder.binding.apply {
            teks2.text = negara [position].tk1
            teks3.text = negara [position].tk2
            imgView.setImageResource(negara[position].gambar)
        }
    }

}