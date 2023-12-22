package com.cleber.geradordesenha

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.cleber.geradordesenha.databinding.ActivityMainBinding
import kotlin.random.Random
import kotlin.random.nextInt

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private  val Alfabetor = arrayOf(
              "A","B","C","D","F","G",
               "H","I","J","K","L","M",
        "N","O","P","Q","R","S","T","U",
        "V","W","X","Y","Z",
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btGeradorSenha.setOnClickListener{

            val letrasAlinhatortia1 = Alfabetor.random()
            val letrasAlinhatortia2 = Alfabetor.random()
            val numero = Random.nextInt(1000..9999)

            binding.txtSenha.text = "$letrasAlinhatortia1$letrasAlinhatortia2$numero"

        }
    }
}