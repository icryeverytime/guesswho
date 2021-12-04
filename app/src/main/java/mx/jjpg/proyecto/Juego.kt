package mx.jjpg.proyecto

import android.app.Activity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import mx.jjpg.proyecto.R
import com.google.android.material.imageview.ShapeableImageView
import android.content.Intent
import android.os.Handler
import android.view.View
import android.widget.*
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.GridLayoutManager
import mx.jjpg.proyecto.app.personaje
import java.util.*



class Juego : Activity(), AdapterView.OnItemSelectedListener {
    // variables para los componentes de la vista
    var imb00: ImageButton? = null
    var imb01: ImageButton? = null
    var imb02: ImageButton? = null
    var imb03: ImageButton? = null
    var imb04: ImageButton? = null
    var imb05: ImageButton? = null
    var imb06: ImageButton? = null
    var imb07: ImageButton? = null
    var imb08: ImageButton? = null
    var imb09: ImageButton? = null
    var imb10: ImageButton? = null
    var imb11: ImageButton? = null
    var imb12: ImageButton? = null
    var imb13: ImageButton? = null
    var imb14: ImageButton? = null
    var imb15: ImageButton? = null
    var imb16: ImageButton? = null
    var imb17: ImageButton? = null
    var imb18: ImageButton? = null
    var imb19: ImageButton? = null
    var imb20: ImageButton? = null
    var imb21: ImageButton? = null
    var imb22: ImageButton? = null
    var imb23: ImageButton? = null
    var imbMiPer: ImageButton? = null
    var tablero = arrayOfNulls<ImageButton>(24)
    //var botonReiniciar: Button? = null
    //var botonSalir: Button? = null
    var textoPuntuacion: TextView? = null
    var aciertos = 0

    //imagenes
    //var imagenes=null: IntArray
    var imagenes = arrayOf<Int>()
    var fondo = 0
    var miCarta = 0

    //variables del juego
    var arrayDesordenado: ArrayList<Int?>? = null
    var arrayDeCartas: ArrayList<Int>? = null
    var primero: ImageButton? = null
    var numeroDeLaCarta = 0
    var bloqueo = false
    val handler = Handler()

    private lateinit var recView:RecyclerView
    private lateinit var btnInsertar: Button



    override fun onCreate(savedInstanceState: Bundle?) {



super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_juego)
        val num = init()
        init2()
        val texto = findViewById<TextView>(R.id.player1)
        val dream: ShapeableImageView = findViewById(R.id.player1foto)
        val i = intent
        val user = i.getStringExtra("usuario")
        val fname = i.getStringExtra("pnombre")
        val sname = i.getStringExtra("snombre")
        val correo = i.getStringExtra("correo")
        val imagen = i.getStringExtra("imagen")
        val textoChat = findViewById<TextView>(R.id.EdTxtChat)
        texto.text = user

        btnInsertar=findViewById(R.id.btnInsertar)




        recView=findViewById(R.id.recView)
        val datos =
            MutableList(0){i->Titular("Titulo $i","Subtitulo Item $i")}

        //val adaptador= AdaptadorTitulares(datos)
        val adaptador= AdaptadorTitulares(datos){
            Toast.makeText(this,"pulsado el elemento: ${it.titulo}",Toast.LENGTH_SHORT).show()
        }




        recView.setHasFixedSize(true)
        //recView.layoutManager=
        //    LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recView.layoutManager= GridLayoutManager(this,1)

        recView.adapter=adaptador

        recView.addItemDecoration(DividerItemDecoration(this, DividerItemDecoration.VERTICAL))
        recView.addItemDecoration(DividerItemDecoration(this, DividerItemDecoration.HORIZONTAL))

        //el boton que inserta el texto en el chat
        btnInsertar.setOnClickListener{

            datos.add(datos.size, Titular(textoChat.text.toString(),""))
            adaptador.notifyItemInserted(datos.size)


            var pers=personaje("", "","","")
            val g2 = Responder(intent, num,pers)

            if(textoChat.text.toString()=="color?"){
                datos.add(datos.size, Titular("",pers.colorP))
            }
            if(textoChat.text.toString()=="genero?"){
                datos.add(datos.size, Titular("",pers.generoP))
            }
            if(textoChat.text.toString()=="usa armas?"){
                datos.add(datos.size, Titular("",pers.armasP))
            }
            if(textoChat.text.toString()=="es animal?"){
                datos.add(datos.size, Titular("",pers.animalP))
            }


            //adaptador.notifyItemInserted(datos.size)

            textoChat.setText("")

        }




        val adiv = findViewById<Button>(R.id.adivinar)
        val spinner = findViewById<Spinner>(R.id.cmbOpciones)
        val adapter = ArrayAdapter.createFromResource(
            this,
            R.array.nombres,
            android.R.layout.simple_spinner_item
        )
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner.adapter = adapter
        spinner.onItemSelectedListener = this
        when (imagen) {
            "q" -> dream.setImageResource(R.drawable.q)
        }
        val intent = Intent(applicationContext, Menu::class.java)
        intent.putExtra("usuario", user)
        intent.putExtra("pnombre", fname)
        intent.putExtra("snombre", sname)
        intent.putExtra("correo", correo)
        intent.putExtra("imagen", imagen)
        adiv.setOnClickListener {
            val seleccionado = spinner.selectedItem.toString()
            val g = buscar(seleccionado, intent, num)

        }
    }

    private fun cargarTablero() {
        imb00 = findViewById(R.id.boton00)
        imb01 = findViewById(R.id.boton01)
        imb02 = findViewById(R.id.boton02)
        imb03 = findViewById(R.id.boton03)
        imb04 = findViewById(R.id.boton04)
        imb05 = findViewById(R.id.boton05)
        imb06 = findViewById(R.id.boton06)
        imb07 = findViewById(R.id.boton07)
        imb08 = findViewById(R.id.boton08)
        imb09 = findViewById(R.id.boton09)
        imb10 = findViewById(R.id.boton10)
        imb11 = findViewById(R.id.boton11)
        imb12 = findViewById(R.id.boton12)
        imb13 = findViewById(R.id.boton13)
        imb14 = findViewById(R.id.boton14)
        imb15 = findViewById(R.id.boton15)
        imb16 = findViewById(R.id.boton16)
        imb17 = findViewById(R.id.boton17)
        imb18 = findViewById(R.id.boton18)
        imb19 = findViewById(R.id.boton19)
        imb20 = findViewById(R.id.boton20)
        imb21 = findViewById(R.id.boton21)
        imb22 = findViewById(R.id.boton22)
        imb23 = findViewById(R.id.boton23)
        imbMiPer = findViewById(R.id.botonMiPersonaje)

        tablero[0] = imb00
        tablero[1] = imb01
        tablero[2] = imb02
        tablero[3] = imb03
        tablero[4] = imb04
        tablero[5] = imb05
        tablero[6] = imb06
        tablero[7] = imb07
        tablero[8] = imb08
        tablero[9] = imb09
        tablero[10] = imb10
        tablero[11] = imb11
        tablero[12] = imb12
        tablero[13] = imb13
        tablero[14] = imb14
        tablero[15] = imb15
        tablero[16] = imb16
        tablero[17] = imb17
        tablero[18] = imb18
        tablero[19] = imb19
        tablero[20] = imb20
        tablero[21] = imb21
        tablero[22] = imb22
        tablero[23] = imb23
    }

    private fun cargarBotones() {
        val botonReiniciar:Button = findViewById(R.id.botonJuegoReiniciar)
        val botonSalir:Button = findViewById(R.id.botonJuegoSalir)
        botonReiniciar.setOnClickListener{ init2() }
        botonSalir.setOnClickListener{ finish() }
    }

    private fun cargarTexto() {
        aciertos = 10
    }

    private fun cargarImagenes() {
        imagenes = arrayOf<Int>(
            R.drawable.bowser,
            R.drawable.captainfalcon,
            R.drawable.cloud,
            R.drawable.daisy,
            R.drawable.donkeykong,
            R.drawable.falco,
            R.drawable.fox,
            R.drawable.iceclimbers,
            R.drawable.jigglypuff,
            R.drawable.kirby,
            R.drawable.link,
            R.drawable.luigi,
            R.drawable.ness,
            R.drawable.pacman,
            R.drawable.peach,
            R.drawable.pichu,
            R.drawable.pikachu,
            R.drawable.q,
            R.drawable.samus,
            R.drawable.sheik,
            R.drawable.sonic,
            R.drawable.sora,
            R.drawable.yoshi,
            R.drawable.zelda
        )
        fondo = R.drawable.fondo
        miCarta=R.drawable.fondo

    }

    private fun barajar(longitud: Int): ArrayList<Int?> {
        val result = ArrayList<Int?>()
        for (i in 0 until longitud * 2) {
            result.add(i % longitud)
        }
        Collections.shuffle(result)
        println(Arrays.toString(result.toTypedArray()))
        return result
    }

    private fun insertar(longitud: Int): ArrayList<Int> {
        val result = ArrayList<Int>()
        for (i in 0 until longitud * 2) {
            result.add(i % longitud)
        }
        return result
    }

    private fun comprobar(i: Int, imgb: ImageButton?) {
        if (primero == null) {
            imgb!!.setImageResource(fondo)
            primero = imgb
            primero!!.scaleType = ImageView.ScaleType.CENTER_CROP
            aciertos++
            numeroDeLaCarta = arrayDeCartas!![i]
            primero = null
        }
    }

    private fun init(): Int? {
        cargarTablero()
        cargarBotones()
        cargarTexto()
        cargarImagenes()
        arrayDeCartas = insertar(imagenes.size)
        arrayDesordenado = barajar(imagenes.size)
        //setear todas las imagenes del tablero
        for (i in tablero.indices) {
            tablero[i]!!.scaleType = ImageView.ScaleType.CENTER_CROP
            tablero[i]!!.setImageResource(imagenes[arrayDeCartas!![i]])
        }
        //setear la imagen de mi personaje
        imbMiPer!!.scaleType = ImageView.ScaleType.CENTER_CROP
        //imbMiPer!!.setImageResource(imagenes[arrayDesordenado!![10]!!])
        imbMiPer!!.setImageResource(fondo)
        for (i in tablero.indices) {
            tablero[i]!!.isEnabled = true
            tablero[i]!!.setOnClickListener { comprobar(i, tablero[i]) }
            return arrayDesordenado!![10]
        }
        return null
    }

    private fun init2() {
        cargarTablero()
        cargarBotones()
        cargarTexto()
        cargarImagenes()
        arrayDeCartas = insertar(imagenes.size)
        for (i in tablero.indices) {
            tablero[i]!!.scaleType = ImageView.ScaleType.CENTER_CROP
            tablero[i]!!.setImageResource(imagenes[arrayDeCartas!![i]])
        }
        for (i in tablero.indices) {
            tablero[i]!!.isEnabled = true
            tablero[i]!!.setOnClickListener { comprobar(i, tablero[i]) }
        }
    }

    override fun onItemSelected(adapterView: AdapterView<*>, view: View, i: Int, l: Long) {
        val text = adapterView.getItemAtPosition(i).toString()
        Toast.makeText(adapterView.context, text, Toast.LENGTH_LONG)
    }

    override fun onNothingSelected(adapterView: AdapterView<*>?) {}


    fun buscar(en: String?, intent: Intent, num: Int?): Boolean {
        var victoria=false
        var nombre= ""
        when (en) {
            "Bowser" -> if (num == 0) {
                intent.putExtra("resultado", "ganado")
                victoria=true

                Toast.makeText(this,"Felicidades!!! ganaste!!!!",Toast.LENGTH_LONG).show()
                startActivity(intent)
            }
            "Captain Falcon" -> if (num == 1) {
                intent.putExtra("resultado", "ganado")
                victoria=true
                Toast.makeText(this,"Felicidades!!! ganaste!!!!",Toast.LENGTH_LONG).show()
                startActivity(intent)
            }
            "Cloud" -> if (num == 2) {
                intent.putExtra("resultado", "ganado")
                victoria=true
                Toast.makeText(this,"Felicidades!!! ganaste!!!!",Toast.LENGTH_LONG).show()
                startActivity(intent)
            }
            "Daisy" -> if (num == 3) {
                intent.putExtra("resultado", "ganado")
                victoria=true
                Toast.makeText(this,"Felicidades!!! ganaste!!!!",Toast.LENGTH_LONG).show()
                startActivity(intent)
            }
            "Donkey Kong" -> if (num == 4) {
                intent.putExtra("resultado", "ganado")
                victoria=true
                Toast.makeText(this,"Felicidades!!! ganaste!!!!",Toast.LENGTH_LONG).show()
                startActivity(intent)
            }
            "Falco" -> if (num == 5) {
                intent.putExtra("resultado", "ganado")
                victoria=true
                Toast.makeText(this,"Felicidades!!! ganaste!!!!",Toast.LENGTH_LONG).show()
                startActivity(intent)
            }
            "Fox" -> if (num == 6) {
                intent.putExtra("resultado", "ganado")
                victoria=true
                Toast.makeText(this,"Felicidades!!! ganaste!!!!",Toast.LENGTH_LONG).show()
                startActivity(intent)
            }
            "Ice Climbers" -> if (num == 7) {
                intent.putExtra("resultado", "ganado")
                victoria=true
                Toast.makeText(this,"Felicidades!!! ganaste!!!!",Toast.LENGTH_LONG).show()
                startActivity(intent)
            }
            "Jigglypuff" -> if (num == 8) {
                intent.putExtra("resultado", "ganado")
                victoria=true
                Toast.makeText(this,"Felicidades!!! ganaste!!!!",Toast.LENGTH_LONG).show()
                startActivity(intent)
            }
            "Kirby" -> if (num == 9) {
                intent.putExtra("resultado", "ganado")
                victoria=true
                Toast.makeText(this,"Felicidades!!! ganaste!!!!",Toast.LENGTH_LONG).show()
                startActivity(intent)
            }
            "Link" -> if (num == 10) {
                intent.putExtra("resultado", "ganado")
                victoria=true
                Toast.makeText(this,"Felicidades!!! ganaste!!!!",Toast.LENGTH_LONG).show()
                startActivity(intent)
            }
            "Luigi" -> if (num == 11) {
                intent.putExtra("resultado", "ganado")
                victoria=true
                Toast.makeText(this,"Felicidades!!! ganaste!!!!",Toast.LENGTH_LONG).show()
                startActivity(intent)
            }
            "Ness" -> if (num == 12) {
                intent.putExtra("resultado", "ganado")
                victoria=true
                Toast.makeText(this,"Felicidades!!! ganaste!!!!",Toast.LENGTH_LONG).show()
                startActivity(intent)
            }
            "Pacman" -> if (num == 13) {
                intent.putExtra("resultado", "ganado")
                victoria=true
                Toast.makeText(this,"Felicidades!!! ganaste!!!!",Toast.LENGTH_LONG).show()
                startActivity(intent)
            }
            "Peach" -> if (num == 14) {
                intent.putExtra("resultado", "ganado")
                victoria=true
                Toast.makeText(this,"Felicidades!!! ganaste!!!!",Toast.LENGTH_LONG).show()
                startActivity(intent)
            }
            "Pichu" -> if (num == 15) {
                intent.putExtra("resultado", "ganado")
                victoria=true
                Toast.makeText(this,"Felicidades!!! ganaste!!!!",Toast.LENGTH_LONG).show()
                startActivity(intent)
            }
            "Mario" -> {
                if (num == 16) {
                    intent.putExtra("resultado", "ganado")
                    victoria=true
                    Toast.makeText(this,"Felicidades!!! ganaste!!!!",Toast.LENGTH_LONG).show()
                    startActivity(intent)
                }
                if (num == 17) {
                    intent.putExtra("resultado", "ganado")
                    victoria=true
                    Toast.makeText(this,"Felicidades!!! ganaste!!!!",Toast.LENGTH_LONG).show()
                }
            }
            "Pikachu" -> if (num == 17) {
                intent.putExtra("resultado", "ganado")
                victoria=true
                Toast.makeText(this,"Felicidades!!! ganaste!!!!",Toast.LENGTH_LONG).show()
            }
            "Samus" -> if (num == 18) {
                intent.putExtra("resultado", "ganado")
                victoria=true
                Toast.makeText(this,"Felicidades!!! ganaste!!!!",Toast.LENGTH_LONG).show()
                startActivity(intent)
            }
            "Sheik" -> if (num == 19) {
                intent.putExtra("resultado", "ganado")
                victoria=true
                Toast.makeText(this,"Felicidades!!! ganaste!!!!",Toast.LENGTH_LONG).show()

                startActivity(intent)
            }
            "Sonic" -> if (num == 20) {
                intent.putExtra("resultado", "ganado")
                victoria=true
                Toast.makeText(this,"Felicidades!!! ganaste!!!!",Toast.LENGTH_LONG).show()
                startActivity(intent)
            }
            "Sora" -> if (num == 21) {
                intent.putExtra("resultado", "ganado")
                victoria=true
                Toast.makeText(this,"Felicidades!!! ganaste!!!!",Toast.LENGTH_LONG).show()
                startActivity(intent)
            }
            "Yoshi" -> if (num == 22) {
                intent.putExtra("resultado", "ganado")
                victoria=true
                Toast.makeText(this,"Felicidades!!! ganaste!!!!",Toast.LENGTH_LONG).show()
                startActivity(intent)
            }
            "Zelda" -> if (num == 23) {
                intent.putExtra("resultado", "ganado")
                victoria=true
                Toast.makeText(this,"Felicidades!!! ganaste!!!!",Toast.LENGTH_LONG).show()
                startActivity(intent)
            }


        }
        if(victoria==false){
            Toast.makeText(this,"Uy Perdiste :c ",Toast.LENGTH_LONG).show()
            startActivity(intent)
        }else{
            //ContVictorias++
        }

        return true

    }



    fun Responder(intent: Intent, num: Int?,personaje: personaje): personaje {
        when (num) {
            0 -> {//bowser
                personaje.colorP="El personaje es amarillo"
                personaje.generoP="El personaje es masculino"
                personaje.armasP="No usa armas"
                personaje.animalP="Si es un animal"
            }
            1 -> {//cap falcon


                personaje.colorP="El personaje es purpura"
                personaje.generoP="El personaje es masculino"
                personaje.armasP="No usa armas"
                personaje.animalP="No es animal"

            }

            2-> {//cloud

                personaje.colorP="Tiene pelo amarillo"
                personaje.generoP="El personaje es masculino"
                personaje.armasP="Si usa armas"
                personaje.animalP="No es animal"

            }
            3-> {//daisy

                personaje.colorP="El personaje es amarillo"
                personaje.generoP="El personaje es femenino"
                personaje.armasP="No usa armas"
                personaje.animalP="No es un animal"
            }
            4->  { //Donkey kong

                personaje.colorP="El personaje es cafe"
                personaje.generoP="El personaje es masculino"
                personaje.armasP="No usa armas"
                personaje.animalP="Si es un animal"

            }
            5-> { //Falco

                personaje.colorP="El personaje es azul"
                personaje.generoP="El personaje es masculino"
                personaje.armasP="Si usa armas"
                personaje.animalP="Si es un animal"

            }
            6->  { //Fox

                personaje.colorP="El personaje es cafe"
                personaje.generoP="El personaje es masculino"
                personaje.armasP="Si usa armas"
                personaje.animalP="Si es un animal"

            }
            7-> { //Ice Climbers

                personaje.colorP="El personaje es azul/rosa"
                personaje.generoP="El personaje es masculino/femenino"
                personaje.armasP="Si usa armas"
                personaje.animalP="No es un animal"

            }
            8-> { //jigglypuff

                personaje.colorP="El personaje es rosa"
                personaje.generoP="El personaje es femenino"
                personaje.armasP="No usa armas"
                personaje.animalP="Si es un animal"

            }
            9->  { //kirby

                personaje.colorP="El personaje es rosa"
                personaje.generoP="El personaje es masculino"
                personaje.armasP="No usa armas"
                personaje.animalP="No es un animal"

            }
            10-> { //link

                personaje.colorP="El personaje es verde"
                personaje.generoP="El personaje es masculino"
                personaje.armasP="Si usa armas"
                personaje.animalP="No es un animal"

            }
            11->  { //Luigi

                personaje.colorP="El personaje es verde"
                personaje.generoP="El personaje es masculino"
                personaje.armasP="No usa armas"
                personaje.animalP="No es un animal"

            }
            12-> { //Ness

                personaje.colorP="El personaje tiene una gorra roja"
                personaje.generoP="El personaje es masculino"
                personaje.armasP="Si usa armas"
                personaje.animalP="No es un animal"

            }
            13 ->  { //pacman

                personaje.colorP="El personaje es amarillo"
                personaje.generoP="El personaje es masculino"
                personaje.armasP="No usa armas"
                personaje.animalP="No es un animal"

            }
           14 -> { //Peach

                personaje.colorP="El personaje es rosa"
                personaje.generoP="El personaje es femenino"
                personaje.armasP="No usa armas"
                personaje.animalP="No es un animal"

            }
            15 ->  { //pichu

                personaje.colorP="El personaje es amarillo"
                personaje.generoP="El personaje es masculino"
                personaje.armasP="No usa armas"
                personaje.animalP="Si es un animal"

            }
            16-> { //Mario

                    personaje.colorP="El personaje es rojo"
                    personaje.generoP="El personaje es masculino"
                    personaje.armasP="No usa armas"
                    personaje.animalP="No es un animal"

                }

            17 ->  { //pikachu

                personaje.colorP="El personaje es amarillo"
                personaje.generoP="El personaje es masculino"
                personaje.armasP="No usa armas"
                personaje.animalP="Si es un animal"

            }
            18 ->  { //samus

                personaje.colorP="El personaje es naranja"
                personaje.generoP="El personaje es femenino"
                personaje.armasP="Si usa armas"
                personaje.animalP="No es un animal"

            }
            19 ->  { //sheik


                personaje.colorP="El personaje usa vendas blancas"
                personaje.generoP="El personaje es femenino"
                personaje.armasP="Si usa armas"
                personaje.animalP="No es un animal"


            }
            20 ->  { //Sonic

                personaje.colorP="El personaje es azul"
                personaje.generoP="El personaje es masculino"
                personaje.armasP="No usa armas"
                personaje.animalP="Si es un animal"

            }
            21 ->  { //Sora

                personaje.colorP="El personaje lleva shorts rojos"
                personaje.generoP="El personaje es masculino"
                personaje.armasP="Si usa armas"
                personaje.animalP="No es un animal"

            }
           22->  { //Yoshi
                personaje.colorP="El personaje es verde"
                personaje.generoP="El personaje es masculino"
                personaje.armasP="No usa armas"
                personaje.animalP="Si es un animal"
            }
            23 ->  { //Zelda
                personaje.colorP="El personaje tiene pelo amarillo"
                personaje.generoP="El personaje es femenino"
                personaje.armasP="No usa armas"
                personaje.animalP="No es un animal"
            }
        }

        return personaje

    }

}

