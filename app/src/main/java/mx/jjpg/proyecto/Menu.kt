package mx.jjpg.proyecto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.Button
import android.widget.TextView
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
        local.setOnClickListener {
            val intent= Intent(this,Juego::class.java)
            startActivity(intent)
        }
        text.setText(user)
        text2.setText(correo)

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