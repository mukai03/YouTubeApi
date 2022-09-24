package com.example.youtubeapi.ui.third

import android.annotation.SuppressLint
import android.app.Dialog
import android.os.Build
import android.os.Bundle
import android.util.Log
import android.util.SparseArray
import android.view.LayoutInflater
import android.view.View
import android.view.Window
import android.widget.Button
import androidx.activity.viewModels
import com.example.youtubeapi.BuildConfig
import com.example.youtubeapi.R
import com.example.youtubeapi.core.ui.BaseActivity
import com.example.youtubeapi.core.ui.BaseViewModel
import com.example.youtubeapi.data.local.Prefs
import com.example.youtubeapi.databinding.ActivityThirdBinding
import com.example.youtubeapi.utils.CheckConnectNetwork
import com.google.android.exoplayer2.ExoPlayer
import com.google.android.exoplayer2.MediaItem
import com.google.android.exoplayer2.Player
import com.google.android.exoplayer2.source.MediaSource
import com.google.android.exoplayer2.source.MergingMediaSource
import com.google.android.exoplayer2.source.ProgressiveMediaSource
import com.google.android.exoplayer2.upstream.DefaultHttpDataSource
import org.koin.android.ext.android.inject

class ThirdViewModel : BaseViewModel() {}