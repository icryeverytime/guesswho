package mx.jjpg.proyecto

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView
import androidx.annotation.RequiresApi
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.google.android.material.snackbar.Snackbar
import org.json.JSONObject
import java.lang.ArithmeticException
import java.net.Socket
import kotlin.concurrent.thread

class Registro : AppCompatActivity()  {

    @RequiresApi(Build.VERSION_CODES.N)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro)
        val contextView = findViewById<View>(R.id.vista)

        val emailPattern="[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+"

        val registrar:Button=findViewById(R.id.mandar)
        val background:LinearLayout=findViewById(R.id.gradiente)

        background.setBackgroundResource(R.drawable.gradiente)

        val primernombre:EditText=findViewById(R.id.primernombre)
        val primerapellido:EditText=findViewById(R.id.primerapellido)
        val user:EditText=findViewById(R.id.user)
        val correo:EditText=findViewById(R.id.correo)
        val password:EditText=findViewById(R.id.password)
        val password2:EditText=findViewById(R.id.confirmarpassword)
        val click:TextView=findViewById(R.id.cuentaexistente)

        val error1:TextView=findViewById(R.id.prueba1)
        val error2:TextView=findViewById(R.id.prueba2)
        val error3:TextView=findViewById(R.id.prueba3)
        val error4:TextView=findViewById(R.id.prueba4)
        val error5:TextView=findViewById(R.id.prueba5)
        val error6:TextView=findViewById(R.id.prueba6)

        primernombre.setBackgroundResource(R.drawable.border)
        primerapellido.setBackgroundResource(R.drawable.border)
        user.setBackgroundResource(R.drawable.border)
        correo.setBackgroundResource(R.drawable.border)
        password.setBackgroundResource(R.drawable.border)
        password2.setBackgroundResource(R.drawable.border)



        click.setOnClickListener {
            val intent= Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
        registrar.setOnClickListener{
            val queue = Volley.newRequestQueue(this)
            //val url="http://192.168.110.220:5000/registro"
            val url = "http://192.168.1.67:5000/registro"
            val json=JSONObject()
            json.put("primernombre",primernombre.text.toString())
            json.put("primerapellido",primerapellido.text.toString())
            json.put("usuario",user.text.toString())
            json.put("correo",correo.text.toString())
            json.put("contra",password.text.toString())

            var aux=0

            if(primernombre.text.toString()=="")
            {
                primernombre.setBackgroundResource(R.drawable.border2)
                aux=1
                error1.setText(" * Introduzca su nombre")
            }
            else
            {
                primernombre.setBackgroundResource(R.drawable.border)
                error1.setText("")
            }
            if(primerapellido.text.toString()=="")
            {
                primerapellido.setBackgroundResource(R.drawable.border2)
                aux=1
                error2.setText(" * Introduzca su apellido")
            }
            else{
                primerapellido.setBackgroundResource(R.drawable.border)
                error2.setText("")
            }
            if(user.text.toString()=="")
            {
                user.setBackgroundResource(R.drawable.border2)
                aux=1
                error3.setText(" * Introduzca un nombre de usuario")
            }
            else{
                user.setBackgroundResource(R.drawable.border)
                error3.setText("")
            }
            if(correo.text.toString()=="" || !(correo.text.toString().matches(emailPattern.toRegex())))
            {
                aux=1
                correo.setBackgroundResource(R.drawable.border2)
                if(correo.text.toString()=="")
                {
                    error4.setText(" * Introudzca un correo")
                }
                else
                {
                    error4.setText(" * Introduzca un correo valido")
                }
            }
            else{
                correo.setBackgroundResource(R.drawable.border)
                error4.setText("")
            }
            if(password.text.toString()=="")
            {
                aux=1
                password.setBackgroundResource(R.drawable.border2)
                error5.setText(" * Introduzca una contrasena")
            }
            else{
                password.setBackgroundResource(R.drawable.border)
                error5.setText("")
            }
            if(password2.text.toString()=="" || password.text.toString()!=password2.text.toString())
            {
                password2.setBackgroundResource(R.drawable.border2)
                aux=1
                if(password2.text.toString()=="")
                {
                    error6.setText(" * Confirma la contrasena")
                }
                else
                {
                    error6.setText(" * No son iguales las contrasenas")
                }
            }
            else{
                password2.setBackgroundResource(R.drawable.border)
                error6.setText("")
            }
            if(aux==0)
            {
                val jsonObjectRequest = JsonObjectRequest(Request.Method.POST, url, json,
                    Response.Listener { response ->
                        if(response.getString("number").contains("User.correo"))
                        {
                            correo.setBackgroundResource(R.drawable.border2)
                            Snackbar.make(contextView,"Ya existe una cuenta con este correo",Snackbar.LENGTH_LONG)
                                .setTextColor(resources.getColor(R.color.red))
                                .show()
                            error4.setText(" * Ya existe una cuenta con este correo")
                        }
                        else if(response.getString("number").contains("User.PRIMARY"))
                        {
                            user.setBackgroundResource(R.drawable.border2)
                            Snackbar.make(contextView,"Ya existe una cuenta con este usuario",Snackbar.LENGTH_LONG)
                                .setTextColor(resources.getColor(R.color.red))
                                .show()
                            error3.setText(" * Ya existe un usuario con este nombre")
                        }
                        else{
                            primernombre.setText("")
                            primerapellido.setText("")
                            correo.setText("")
                            user.setText("")
                            password.setText("")
                            password2.setText("")
                            Snackbar.make(contextView,"Usuario fue agregado exitosamente",Snackbar.LENGTH_LONG)
                                .show()
                        }
                    },
                    Response.ErrorListener { error ->
                        primernombre.setText(error.toString())
                    }
                )
                queue.add(jsonObjectRequest)
            }
        }
    }
}