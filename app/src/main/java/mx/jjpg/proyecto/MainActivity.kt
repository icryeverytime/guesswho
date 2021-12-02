package mx.jjpg.proyecto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.Volley
import com.google.android.material.snackbar.Snackbar
import org.json.JSONObject

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val texto:TextView=findViewById(R.id.registro)

        val background: LinearLayout =findViewById(R.id.gradiente2)
        val but:Button=findViewById(R.id.login)
        val user:EditText=findViewById(R.id.usuario)
        val contra:EditText=findViewById(R.id.contra)

        val error1:TextView=findViewById(R.id.error1)
        val error2:TextView=findViewById(R.id.error2)

        user.setBackgroundResource(R.drawable.border)
        contra.setBackgroundResource(R.drawable.border)
        background.setBackgroundResource(R.drawable.gradiente)


        texto.setOnClickListener{
            val intent=Intent(this,Registro::class.java)
            startActivity(intent)
        }
        but.setOnClickListener{
            val queue = Volley.newRequestQueue(this)
            //val url="http://192.168.173.220:5000/login"
            //val url = "http://192.168.1.67:5000/login"

            //hamachi
            val url = "http://25.83.103.75:5000/login"

            val json= JSONObject()
            json.put("usuario",user.text.toString())
            json.put("password",contra.text.toString())

            var aux=0
            if(user.text.toString()=="")
            {
                aux=1
                error1.setText(" * Ingrese el usuario o correo")
                user.setBackgroundResource(R.drawable.border2)
            }
            else{
                error1.setText("")
                user.setBackgroundResource(R.drawable.border)
            }
            if(contra.text.toString()=="")
            {
                aux=1
                error2.setText(" * Ingrese la contrasena")
                contra.setBackgroundResource(R.drawable.border2)
            }
            else{
                error2.setText("")
                contra.setBackgroundResource(R.drawable.border)
            }
            if(aux==0)
            {
                val jsonObjectRequest = JsonObjectRequest(
                    Request.Method.POST, url, json,
                    Response.Listener { response ->
                        if(response.getString("number").contains("no existe el usuario"))
                        {
                            error1.setText("No existe una cuenta con las creedencailes")
                            user.setBackgroundResource(R.drawable.border2)
                            contra.setBackgroundResource(R.drawable.border2)
                        }
                        else{
                            val intent2=Intent(this,Menu::class.java)
                            intent2.putExtra("usuario",response.getString("number"))
                            intent2.putExtra("pnombre",response.getString("pnombre"))
                            intent2.putExtra("snombre",response.getString("snombre"))
                            intent2.putExtra("correo",response.getString("correo"))
                            startActivity(intent2)
                        }
                    },
                    Response.ErrorListener { error ->
                        user.setText(error.toString())
                    }
                )
                queue.add(jsonObjectRequest)
            }
        }
    }
}