package com.example.youtubeapi.ui.second

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.youtubeapi.core.extensions.loadImage
import com.example.youtubeapi.data.remote.models.Item
import com.example.youtubeapi.databinding.ItemSecondBinding

class SecondAdapter (
    private val list: ArrayList<Item>,
    private val onItemClick: (String, String, String) -> Unit?
) : RecyclerView.Adapter<SecondAdapter.SecondViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SecondViewHolder {
        val binding =
            ItemSecondBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return SecondViewHolder(binding)
    }

    override fun onBindViewHolder(holder: SecondViewHolder, position: Int) {
        holder.onBind(list[position])
    }

    override fun getItemCount(): Int = list.size

    inner class SecondViewHolder(private val binding: ItemSecondBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun onBind(items: Item?) {
            binding.imageEv.loadImage(items?.snippet!!.thumbnails.default.url)
            binding.playlistNameTv.text = items.snippet.title
            binding.timeTv.text = items.snippet.publishedAt.dropLast(10)
            itemView.setOnClickListener {
                onItemClick( items.contentDetails.videoId,items.snippet.title,items.snippet.description)
            }
        }
    }
}