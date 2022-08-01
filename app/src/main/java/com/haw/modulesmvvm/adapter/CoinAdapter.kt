package com.haw.modulesmvvm.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.haw.domain.model.Coin
import com.haw.modulesmvvm.databinding.ItemListCoinBinding

class CoinAdapter(val coinList: List<Coin>) : RecyclerView.Adapter<CoinAdapter.CoinViewHolder>() {

    class CoinViewHolder(val binding: ItemListCoinBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CoinViewHolder {
        val binding = ItemListCoinBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        )

        return CoinViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CoinViewHolder, position: Int) {
        holder.binding.coinName.text = coinList[position].name
    }

    override fun getItemCount(): Int = coinList.size
}