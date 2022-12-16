package com.example.ecoroutebaseline.ui

import android.app.Application
import com.example.ecoroutebaseline.R
import com.mapbox.vision.VisionManager

class VisionApp : Application() {
    override fun onCreate() {
        super.onCreate()
        VisionManager.init(this, resources.getString(R.string.mapbox_access_token))
    }
}