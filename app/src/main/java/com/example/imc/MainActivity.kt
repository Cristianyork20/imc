package com.example.imc

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.imc.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.botonCalcular.setOnClickListener {
            val pesoString = binding.Peso.text.toString()
            val alturaString = binding.Altura.text.toString()

            if (pesoString.isNotEmpty() && alturaString.isNotEmpty()) {
                val peso = pesoString.toFloatOrNull()
                val altura = alturaString.toFloatOrNull()

                if (peso != null && altura != null && altura > 0) {
                    val imc = peso / (altura * altura)
                    binding.Resultado.text = String.format("Tu IMC es: %.2f", imc)

                }
            }
        }
    }
}






