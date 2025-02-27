package mx.edu.itson.practica5

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_menu)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        var btnAntojitos: Button = findViewById(R.id.btnAntojitos) as Button
        var btnTortas: Button = findViewById(R.id.btnTortas) as Button
        var btnEspecialidades: Button = findViewById(R.id.btnEspecialidades) as Button
        var btnCombos: Button = findViewById(R.id.btnCombinations) as Button
        var btnSopas: Button = findViewById(R.id.btnSopas) as Button
        var btnBebidas: Button = findViewById(R.id.btnDinks) as Button

        btnAntojitos.setOnClickListener{
            var intent : Intent = Intent(this, ProductosActivity::class.java)
            intent.putExtra("menuType", "ANTOJITOS")
            startActivity(intent)
        }

        btnTortas.setOnClickListener{
            var intent : Intent = Intent(this, ProductosActivity::class.java)
            intent.putExtra("menuType", "TORTAS")
            startActivity(intent)
        }

        btnEspecialidades.setOnClickListener{
            var intent : Intent = Intent(this, ProductosActivity::class.java)
            intent.putExtra("menuType", "ESPECIALIDADES")
            startActivity(intent)
        }

        btnCombos.setOnClickListener{
            var intent : Intent = Intent(this, ProductosActivity::class.java)
            intent.putExtra("menuType", "COMBOS")
            startActivity(intent)
        }

        btnSopas.setOnClickListener{
            var intent : Intent = Intent(this, ProductosActivity::class.java)
            intent.putExtra("menuType", "SOPAS")
            startActivity(intent)
        }

        btnBebidas.setOnClickListener{
            var intent : Intent = Intent(this, ProductosActivity::class.java)
            intent.putExtra("menuType", "BEBIDAS")
            startActivity(intent)
        }
    }
}