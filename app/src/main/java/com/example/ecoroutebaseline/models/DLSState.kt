package com.example.ecoroutebaseline.models

import com.mapbox.geojson.Feature
import com.mapbox.geojson.Point

data class DLSState(
    val centerPoint: Point?,
    val featureList: List<Feature>?
) {
}