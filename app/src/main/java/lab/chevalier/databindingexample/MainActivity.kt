package lab.chevalier.databindingexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import lab.chevalier.databindingexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var num = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.btnIncrease.setOnClickListener { increase() }
        binding.btnDecrease.setOnClickListener { decrease() }
    }

    private fun increase(){
        num++
        binding.tvScore.text = num.toString()
    }

    private fun decrease(){
        num--
        binding.tvScore.text = num.toString()
    }
}
