package com.example.examen1jesscalvorodriguez

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity

class Titulos_Activity : AppCompatActivity(), AdapterView.OnItemSelectedListener {

    lateinit var spinnerNoticias : Spinner
    lateinit var noticiaSeleccionada: String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.titulos_noticias)

        spinnerNoticias = findViewById<Spinner>(R.id.spinnerTitulos)
        android.widget.ArrayAdapter.createFromResource(
        this,
        R.array.titulos_array,
        android.R.layout.simple_spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spinnerNoticias.adapter = adapter
        }


        spinnerNoticias.onItemSelectedListener = this

    }

    override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
        noticiaSeleccionada = spinnerNoticias.selectedItem.toString()
    }

    override fun onNothingSelected(p0: AdapterView<*>?) {
        noticiaSeleccionada = "No hay niguna seleccionada"
    }
}