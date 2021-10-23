package mx.tecnm.tepic.ladm_u2_canvas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import mx.tecnm.tepic.ladm_u2_canvas.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var b : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = ActivityMainBinding.inflate(layoutInflater)
        setContentView(Lienzo(this))
    }
}