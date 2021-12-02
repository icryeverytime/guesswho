package mx.jjpg.proyecto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import mx.jjpg.proyecto.R
import android.widget.TextView
import com.google.android.material.imageview.ShapeableImageView

class Usuario : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_usuario)

        val texto1:TextView=findViewById(R.id.cor)
        val texto2:TextView=findViewById(R.id.us)
        val texto3:TextView=findViewById(R.id.nom)
        val imagen:ShapeableImageView=findViewById(R.id.imagen)

        val q:ShapeableImageView=findViewById(R.id.q)
        val browser:ShapeableImageView=findViewById(R.id.bowser)
        val captainfalcon:ShapeableImageView=findViewById(R.id.captainfalcon)
        val cloud:ShapeableImageView=findViewById(R.id.cloud)
        val daisy:ShapeableImageView=findViewById(R.id.daisy)
        val donkeykong:ShapeableImageView=findViewById(R.id.donkeykong)
        val falco:ShapeableImageView=findViewById(R.id.falco)
        val fox:ShapeableImageView=findViewById(R.id.fox)
        val iceclimber:ShapeableImageView=findViewById(R.id.iceclimbers)
        val jigglypuff:ShapeableImageView=findViewById(R.id.jigglypuff)
        val kirby:ShapeableImageView=findViewById(R.id.kirby)
        val link:ShapeableImageView=findViewById(R.id.link)
        val luigi:ShapeableImageView=findViewById(R.id.luigi)
        val ness:ShapeableImageView=findViewById(R.id.ness)
        val pacman:ShapeableImageView=findViewById(R.id.pacman)
        val peach:ShapeableImageView=findViewById(R.id.peach)
        val pichu:ShapeableImageView=findViewById(R.id.pichu)
        val pikachu:ShapeableImageView=findViewById(R.id.pikachu)
        val samus:ShapeableImageView=findViewById(R.id.samus)
        val sheik:ShapeableImageView=findViewById(R.id.sheik)
        val sonic:ShapeableImageView=findViewById(R.id.sonic)
        val sora:ShapeableImageView=findViewById(R.id.sora)
        val yoshi:ShapeableImageView=findViewById(R.id.yoshi)
        val zelda:ShapeableImageView=findViewById(R.id.zelda)


        val user=getIntent().getStringExtra("usuario")
        val fname=getIntent().getStringExtra("pnombre")
        val sname=getIntent().getStringExtra("snombre")
        val correo=getIntent().getStringExtra("correo")
        val image=getIntent().getStringExtra("imagen")

        texto1.setText(correo)
        texto2.setText(user)
        texto3.setText(fname+sname)
        when(image)
        {
            "q"->{
                imagen.setImageResource(R.drawable.q)
                q.setStrokeColorResource(R.color.red)
            }
        }
        q.setOnClickListener {
            q.setStrokeColorResource(R.color.red)
        }
        browser.setOnClickListener {
            browser.setStrokeColorResource(R.color.red)
        }
        captainfalcon.setOnClickListener {
            captainfalcon.setStrokeColorResource(R.color.red)
        }
        cloud.setOnClickListener {
            cloud.setStrokeColorResource(R.color.red)
        }
        daisy.setOnClickListener {
            daisy.setStrokeColorResource(R.color.red)
        }
        donkeykong.setOnClickListener {
            donkeykong.setStrokeColorResource(R.color.red)
        }
        falco.setOnClickListener {
            falco.setStrokeColorResource(R.color.red)
        }
        fox.setOnClickListener {
            fox.setStrokeColorResource(R.color.red)
        }
        iceclimber.setOnClickListener {
            iceclimber.setStrokeColorResource(R.color.red)
        }
        jigglypuff.setOnClickListener {
            jigglypuff.setStrokeColorResource(R.color.red)
        }
        kirby.setOnClickListener {
            kirby.setStrokeColorResource(R.color.red)
        }
        link.setOnClickListener {
            link.setStrokeColorResource(R.color.red)
        }
    }
}