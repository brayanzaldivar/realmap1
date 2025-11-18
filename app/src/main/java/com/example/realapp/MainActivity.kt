package com.example.realapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.mapbox.maps.CameraOptions
import com.mapbox.maps.MapView
import com.mapbox.maps.Style

class MainActivity : AppCompatActivity() {

    private lateinit var mapView: MapView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Vinculamos el MapView del layout
        mapView = findViewById(R.id.mapView)

        // Cargar tu estilo personalizado desde Mapbox Studio
        mapView.getMapboxMap().loadStyle(
            Style(uri = "mapbox://styles/artestudio/cmgfwub2f00km01qw9mqj1g9r")
        ) {

            // 🚀 VISTA 3D INMERSIVA
            mapView.getMapboxMap().setCamera(
                CameraOptions.Builder()
                    .center(com.mapbox.geojson.Point.fromLngLat(-77.0428, -12.0464)) // Lima
                    .zoom(16.0)   // Zoom recomendado para vista 3D
                    .pitch(60.0)  // Inclinación 3D inmersiva
                    .bearing(0.0) // Orientación inicial
                    .build()
            )
        }
    }

    // ----------------------------
    // CICLO DE VIDA DEL MAPVIEW
    // ----------------------------

    override fun onStart() {
        super.onStart()
        mapView.onStart()
    }

    override fun onStop() {
        super.onStop()
        mapView.onStop()
    }

    override fun onLowMemory() {
        super.onLowMemory()
        mapView.onLowMemory()
    }

    override fun onDestroy() {
        super.onDestroy()
        mapView.onDestroy()
    }
}
// prueba git
// cambio para commit
