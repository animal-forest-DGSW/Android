package com.example.hackathon.view.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListView
import androidx.recyclerview.widget.RecyclerView
import com.example.hackathon.databinding.ItemMenuBinding
import com.example.hackathon.model.Info.PetInfo

class MenuAdapter(item: List<PetInfo>) : RecyclerView.Adapter<MenuAdapter.MenuViewHolder>() {
    val data = item
    inner class MenuViewHolder(val binding: ItemMenuBinding) : RecyclerView.ViewHolder(binding.root){
        fun bind(item: PetInfo){
            binding.tvTitle.text = item.name
            binding.tvContent.text = item.comment
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MenuViewHolder =
        MenuViewHolder(ItemMenuBinding.inflate(LayoutInflater.from(parent.context), parent, false))

    override fun onBindViewHolder(holder: MenuViewHolder, position: Int)  {
        (holder as MenuViewHolder).apply {
            // 뷰홀더에서 구현한 bindItem메서드를 호출해 뷰홀더에 아이템을 바인딩
            bind(data.get(position))
            //adapter에 넣어준 ArrayList 값들을 MyViewHolder에 값으로 넣어준다.
        }
    }

    override fun getItemCount(): Int = data.size
}