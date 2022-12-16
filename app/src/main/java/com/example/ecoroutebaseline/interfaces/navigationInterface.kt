package com.example.ecoroutebaseline.interfaces

import androidx.annotation.Keep
import com.example.ecoroutebaseline.models.responses.DirectionRouteResponse
import com.example.ecoroutebaseline.models.responses.ElevationAPIResponse
import com.example.ecoroutebaseline.models.responses.GeoCodedQueryResponse
import com.example.ecoroutebaseline.models.responses.IsochronePolygonResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Url

@Keep
interface navigationInterface {

    @Headers("Content-Type:application/json")
    @GET()
    fun getDirectionsRoutes(
        @Url mapbox_url: String
    ): Call<DirectionRouteResponse>


    @Headers("Content-Type:application/json")
    @GET()
    fun getIsochronePolygon(
        @Url mapbox_url: String
    ): Call<IsochronePolygonResponse>

    @Headers("Content-Type:application/json")
    @GET()
    fun getGeocodedQuery(
        @Url mapbox_url: String
    ): Call<GeoCodedQueryResponse>




}