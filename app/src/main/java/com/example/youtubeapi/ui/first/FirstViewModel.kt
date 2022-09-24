package com.example.youtubeapi.ui.first

import androidx.lifecycle.LiveData
import com.example.youtubeapi.core.network.result.Resource
import com.example.youtubeapi.core.ui.BaseViewModel
import com.example.youtubeapi.data.remote.models.Playlists
import com.example.youtubeapi.repository.Repository

class FirstViewModel(private val repository: Repository): BaseViewModel() {

    fun getPlaylists(): LiveData<Resource<Playlists>> {
        return repository.getPlaylists()
    }
}