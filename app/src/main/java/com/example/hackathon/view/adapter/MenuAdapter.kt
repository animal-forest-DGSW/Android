package com.example.hackathon.view.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListView
import androidx.recyclerview.widget.RecyclerView
import com.example.hackathon.R
import com.example.hackathon.databinding.ItemMenuBinding
import com.example.hackathon.model.Info.PetInfo

class MenuAdapter() : RecyclerView.Adapter<MenuAdapter.MenuViewHolder>() {
    val data : List<PetInfo> = listOf(
        PetInfo("향분이","어제 사라졌습니다..","type1","type_detail1","1"),
        PetInfo("말랑이","강아지를 찾습니다","type2","type_detail2","2"),
        PetInfo("백구","귀엽습니다.","type3","type_detail3","3"),
        PetInfo("크림","건물에서 잃어버렸습니다","type4","type_detail4","4"),
    )
    inner class MenuViewHolder(val binding: ItemMenuBinding) : RecyclerView.ViewHolder(binding.root){
        fun bind(item: PetInfo){
            binding.tvTitle.text = item.name
            binding.tvContent.text = item.comment
            when(item.image){
                "1" ->binding.image.setImageResource(R.drawable.dog1)
                "2" ->binding.image.setImageResource(R.drawable.dog2)
                "3" ->binding.image.setImageResource(R.drawable.dog3)
                "4" ->binding.image.setImageResource(R.drawable.dog4)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MenuViewHolder =
        MenuViewHolder(ItemMenuBinding.inflate(LayoutInflater.from(parent.context), parent, false))

    override fun onBindViewHolder(holder: MenuViewHolder, position: Int)  {
        (holder as MenuViewHolder).apply {
            bind(data.get(position))
        }
    }

    override fun getItemCount(): Int = data.size
}