package mx.jjpg.proyecto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        val text:TextView=findViewById(R.id.login)
        val text2:TextView=findViewById(R.id.correo)
        val user=getIntent().getStringExtra("usuario")
        val fname=getIntent().getStringExtra("pnombre")
        val sname=getIntent().getStringExtra("snombre")
        val correo=getIntent().getStringExtra("correo")
        val local:Button=findViewById(R.id.btnJugarLocal)
        local.setOnClickListener {
            val intent= Intent(this,Juego::class.java)
            startActivity(intent)
        }
        text.setText(user)
        text2.setText(correo)
    }
}