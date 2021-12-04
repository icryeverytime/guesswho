package mx.jjpg.proyecto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.LinearLayout
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.imageview.ShapeableImageView
import mx.jjpg.proyecto.R

class Menu : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val text:TextView=findViewById(R.id.login)
        val text2:TextView=findViewById(R.id.correo)
        val profile:LinearLayout=findViewById(R.id.profile)
        val perfil:ShapeableImageView=findViewById(R.id.perfil)


        val user=getIntent().getStringExtra("usuario")
        val fname=getIntent().getStringExtra("pnombre")
        val sname=getIntent().getStringExtra("snombre")
        val correo=getIntent().getStringExtra("correo")
        val imagen=getIntent().getStringExtra("imagen")
        val local:Button=findViewById(R.id.btnJugarLocal)
        val multijugador:Button=findViewById(R.id.btnJugarMulti)
        local.setOnClickListener {
            val intent= Intent(this,Juego::class.java)
            intent.putExtra("usuario",user)
            intent.putExtra("pnombre",fname)
            intent.putExtra("snombre",sname)
            intent.putExtra("correo",correo)
            intent.putExtra("imagen",imagen)
            startActivity(intent)
        }
        multijugador.setOnClickListener {
            val intent= Intent(this,JuegoMulti::class.java)
            intent.putExtra("usuario",user)
            intent.putExtra("pnombre",fname)
            intent.putExtra("snombre",sname)
            intent.putExtra("correo",correo)
            intent.putExtra("imagen",imagen)
            startActivity(intent)
        }
        text.setText(user)
        text2.setText(correo)

        val boton:Button=findViewById(R.id.botonInfo)
            boton.setOnClickListener(){
            Toast.makeText(applicationContext,"Las instrucciones son sencillas. Para ser el ganador del juego usted debe de adivinar el personaje de su rival, mediante una serie de preguntas.",Toast.LENGTH_LONG).show()

        }







            when(imagen)
            {
                "q"->perfil.setImageResource(R.drawable.q)
            }
            profile.setOnClickListener{
                val intent=Intent(this,Usuario::class.java)
                intent.putExtra("usuario",user)
                intent.putExtra("pnombre",fname)
                intent.putExtra("snombre",sname)
                intent.putExtra("correo",correo)
                intent.putExtra("imagen",imagen)
                startActivity(intent)
            }
        }

    }

