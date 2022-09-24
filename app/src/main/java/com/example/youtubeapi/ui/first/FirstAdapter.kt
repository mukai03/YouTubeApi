package com.example.youtubeapi.ui.first

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.youtubeapi.R
import com.example.youtubeapi.core.extensions.loadImage
import com.example.youtubeapi.data.remote.models.Item
import com.example.youtubeapi.databinding.ItemFirstBinding

class FirstAdapter(
    private var data: ArrayList<Item>,
    private val onItemClick: (item: String, String, String) -> Unit?
) : RecyclerView.Adapter<FirstAdapter.FirstViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FirstViewHolder {
        val binding =
            ItemFirstBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return FirstViewHolder(binding)
    }

    override fun onBindViewHolder(holder: FirstViewHolder, position: Int) {
        holder.bind(data[position])
    }

    override fun getItemCount(): Int {
        return data.size
    }
    inner class FirstViewHolder(private var binding: ItemFirstBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(item: Item) {
            binding.ivVideos.loadImage(item.snippet.thumbnails.default.url)
            binding.tvName.text = item.snippet.title
            binding.tvDesc.text =String.format("${item.contentDetails.itemCount} ${itemView.context.getString(
                R.string.Playlist_video_series)}")
            binding.root.setOnClickListener{
                onItemClick(item.id,item.snippet.title, item.snippet.description)
            }
        }
    }
}