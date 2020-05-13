package lab.chevalier.databindingexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
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
        if (num > -1) binding.tvScore.setTextColor(ContextCompat.getColor(this, R.color.colorGreen))
        else binding.tvScore.setTextColor(ContextCompat.getColor(this, R.color.colorRed))
    }

    private fun decrease(){
        num--
        binding.tvScore.text = num.toString()
        if (num <= -1) binding.tvScore.setTextColor(ContextCompat.getColor(this, R.color.colorRed))
        else binding.tvScore.setTextColor(ContextCompat.getColor(this, R.color.colorGreen))
    }
}
