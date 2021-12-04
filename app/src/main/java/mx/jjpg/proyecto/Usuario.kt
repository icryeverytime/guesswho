package mx.jjpg.proyecto

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import mx.jjpg.proyecto.R
import android.widget.TextView
import com.google.android.material.imageview.ShapeableImageView
import org.w3c.dom.Text

class Usuario : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_usuario)

        val texto1:TextView=findViewById(R.id.cor)
        val texto2:TextView=findViewById(R.id.us)
        val texto3:TextView=findViewById(R.id.nom)
        val texto4:TextView=findViewById(R.id.victorias)
        val texto5:TextView=findViewById(R.id.derrotas)

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



        //variable pa saber cual esta
        val ico = false

        texto1.setText(correo)
        texto2.setText(user)
        texto3.setText(fname+sname)
        when(image)
        {
            "q"->{
                imagen.setImageResource(R.drawable.q)
            }
        }
        var ImagenGuardada=q
        q.setOnClickListener {
            ImagenGuardada = q
            q.setStrokeColorResource(R.color.red)
            browser.setStrokeColorResource(R.color.white)
            captainfalcon.setStrokeColorResource(R.color.white)
            cloud.setStrokeColorResource(R.color.white)
            daisy.setStrokeColorResource(R.color.white)
            donkeykong.setStrokeColorResource(R.color.white)
            falco.setStrokeColorResource(R.color.white)
            fox.setStrokeColorResource(R.color.white)
            iceclimber.setStrokeColorResource(R.color.white)
            jigglypuff.setStrokeColorResource(R.color.white)
            kirby.setStrokeColorResource(R.color.white)
            link.setStrokeColorResource(R.color.white)
            luigi.setStrokeColorResource(R.color.white)
            ness.setStrokeColorResource(R.color.white)
            pacman.setStrokeColorResource(R.color.white)
            peach.setStrokeColorResource(R.color.white)
            pichu.setStrokeColorResource(R.color.white)
            pikachu.setStrokeColorResource(R.color.white)
            samus.setStrokeColorResource(R.color.white)
            sheik.setStrokeColorResource(R.color.white)
            sonic.setStrokeColorResource(R.color.white)
            sora.setStrokeColorResource(R.color.white)
            yoshi.setStrokeColorResource(R.color.white)
            zelda.setStrokeColorResource(R.color.white)

        }

        browser.setOnClickListener {
            ImagenGuardada = browser
            browser.setStrokeColorResource(R.color.red)
            q.setStrokeColorResource(R.color.white)
            captainfalcon.setStrokeColorResource(R.color.white)
            cloud.setStrokeColorResource(R.color.white)
            daisy.setStrokeColorResource(R.color.white)
            donkeykong.setStrokeColorResource(R.color.white)
            falco.setStrokeColorResource(R.color.white)
            fox.setStrokeColorResource(R.color.white)
            iceclimber.setStrokeColorResource(R.color.white)
            jigglypuff.setStrokeColorResource(R.color.white)
            kirby.setStrokeColorResource(R.color.white)
            link.setStrokeColorResource(R.color.white)
            luigi.setStrokeColorResource(R.color.white)
            ness.setStrokeColorResource(R.color.white)
            pacman.setStrokeColorResource(R.color.white)
            peach.setStrokeColorResource(R.color.white)
            pichu.setStrokeColorResource(R.color.white)
            pikachu.setStrokeColorResource(R.color.white)
            samus.setStrokeColorResource(R.color.white)
            sheik.setStrokeColorResource(R.color.white)
            sonic.setStrokeColorResource(R.color.white)
            sora.setStrokeColorResource(R.color.white)
            yoshi.setStrokeColorResource(R.color.white)
            zelda.setStrokeColorResource(R.color.white)
        }

        captainfalcon.setOnClickListener {
            ImagenGuardada=captainfalcon
            captainfalcon.setStrokeColorResource(R.color.red)
            q.setStrokeColorResource(R.color.white)
            browser.setStrokeColorResource(R.color.white)
            cloud.setStrokeColorResource(R.color.white)
            daisy.setStrokeColorResource(R.color.white)
            donkeykong.setStrokeColorResource(R.color.white)
            falco.setStrokeColorResource(R.color.white)
            fox.setStrokeColorResource(R.color.white)
            iceclimber.setStrokeColorResource(R.color.white)
            jigglypuff.setStrokeColorResource(R.color.white)
            kirby.setStrokeColorResource(R.color.white)
            link.setStrokeColorResource(R.color.white)
            luigi.setStrokeColorResource(R.color.white)
            ness.setStrokeColorResource(R.color.white)
            pacman.setStrokeColorResource(R.color.white)
            peach.setStrokeColorResource(R.color.white)
            pichu.setStrokeColorResource(R.color.white)
            pikachu.setStrokeColorResource(R.color.white)
            samus.setStrokeColorResource(R.color.white)
            sheik.setStrokeColorResource(R.color.white)
            sonic.setStrokeColorResource(R.color.white)
            sora.setStrokeColorResource(R.color.white)
            yoshi.setStrokeColorResource(R.color.white)
            zelda.setStrokeColorResource(R.color.white)
        }

        cloud.setOnClickListener {
            ImagenGuardada= cloud
            cloud.setStrokeColorResource(R.color.red)
            q.setStrokeColorResource(R.color.white)
            browser.setStrokeColorResource(R.color.white)
            captainfalcon.setStrokeColorResource(R.color.white)
            daisy.setStrokeColorResource(R.color.white)
            donkeykong.setStrokeColorResource(R.color.white)
            falco.setStrokeColorResource(R.color.white)
            fox.setStrokeColorResource(R.color.white)
            iceclimber.setStrokeColorResource(R.color.white)
            jigglypuff.setStrokeColorResource(R.color.white)
            kirby.setStrokeColorResource(R.color.white)
            link.setStrokeColorResource(R.color.white)
            luigi.setStrokeColorResource(R.color.white)
            ness.setStrokeColorResource(R.color.white)
            pacman.setStrokeColorResource(R.color.white)
            peach.setStrokeColorResource(R.color.white)
            pichu.setStrokeColorResource(R.color.white)
            pikachu.setStrokeColorResource(R.color.white)
            samus.setStrokeColorResource(R.color.white)
            sheik.setStrokeColorResource(R.color.white)
            sonic.setStrokeColorResource(R.color.white)
            sora.setStrokeColorResource(R.color.white)
            yoshi.setStrokeColorResource(R.color.white)
            zelda.setStrokeColorResource(R.color.white)
        }
        daisy.setOnClickListener {
            ImagenGuardada=daisy
            daisy.setStrokeColorResource(R.color.red)
            q.setStrokeColorResource(R.color.white)
            browser.setStrokeColorResource(R.color.white)
            captainfalcon.setStrokeColorResource(R.color.white)
            cloud.setStrokeColorResource(R.color.white)
            donkeykong.setStrokeColorResource(R.color.white)
            falco.setStrokeColorResource(R.color.white)
            fox.setStrokeColorResource(R.color.white)
            iceclimber.setStrokeColorResource(R.color.white)
            jigglypuff.setStrokeColorResource(R.color.white)
            kirby.setStrokeColorResource(R.color.white)
            link.setStrokeColorResource(R.color.white)
            luigi.setStrokeColorResource(R.color.white)
            ness.setStrokeColorResource(R.color.white)
            pacman.setStrokeColorResource(R.color.white)
            peach.setStrokeColorResource(R.color.white)
            pichu.setStrokeColorResource(R.color.white)
            pikachu.setStrokeColorResource(R.color.white)
            samus.setStrokeColorResource(R.color.white)
            sheik.setStrokeColorResource(R.color.white)
            sonic.setStrokeColorResource(R.color.white)
            sora.setStrokeColorResource(R.color.white)
            yoshi.setStrokeColorResource(R.color.white)
            zelda.setStrokeColorResource(R.color.white)
        }

        donkeykong.setOnClickListener {
            ImagenGuardada=donkeykong
            donkeykong.setStrokeColorResource(R.color.red)
            q.setStrokeColorResource(R.color.white)
            browser.setStrokeColorResource(R.color.white)
            captainfalcon.setStrokeColorResource(R.color.white)
            cloud.setStrokeColorResource(R.color.white)
            daisy.setStrokeColorResource(R.color.white)
            falco.setStrokeColorResource(R.color.white)
            fox.setStrokeColorResource(R.color.white)
            iceclimber.setStrokeColorResource(R.color.white)
            jigglypuff.setStrokeColorResource(R.color.white)
            kirby.setStrokeColorResource(R.color.white)
            link.setStrokeColorResource(R.color.white)
            luigi.setStrokeColorResource(R.color.white)
            ness.setStrokeColorResource(R.color.white)
            pacman.setStrokeColorResource(R.color.white)
            peach.setStrokeColorResource(R.color.white)
            pichu.setStrokeColorResource(R.color.white)
            pikachu.setStrokeColorResource(R.color.white)
            samus.setStrokeColorResource(R.color.white)
            sheik.setStrokeColorResource(R.color.white)
            sonic.setStrokeColorResource(R.color.white)
            sora.setStrokeColorResource(R.color.white)
            yoshi.setStrokeColorResource(R.color.white)
            zelda.setStrokeColorResource(R.color.white)
        }
        falco.setOnClickListener {
            ImagenGuardada=falco
            falco.setStrokeColorResource(R.color.red)
            q.setStrokeColorResource(R.color.white)
            browser.setStrokeColorResource(R.color.white)
            captainfalcon.setStrokeColorResource(R.color.white)
            cloud.setStrokeColorResource(R.color.white)
            daisy.setStrokeColorResource(R.color.white)
            donkeykong.setStrokeColorResource(R.color.white)
            fox.setStrokeColorResource(R.color.white)
            iceclimber.setStrokeColorResource(R.color.white)
            jigglypuff.setStrokeColorResource(R.color.white)
            kirby.setStrokeColorResource(R.color.white)
            link.setStrokeColorResource(R.color.white)
            luigi.setStrokeColorResource(R.color.white)
            ness.setStrokeColorResource(R.color.white)
            pacman.setStrokeColorResource(R.color.white)
            peach.setStrokeColorResource(R.color.white)
            pichu.setStrokeColorResource(R.color.white)
            pikachu.setStrokeColorResource(R.color.white)
            samus.setStrokeColorResource(R.color.white)
            sheik.setStrokeColorResource(R.color.white)
            sonic.setStrokeColorResource(R.color.white)
            sora.setStrokeColorResource(R.color.white)
            yoshi.setStrokeColorResource(R.color.white)
            zelda.setStrokeColorResource(R.color.white)
        }
        fox.setOnClickListener {
            ImagenGuardada=fox
            fox.setStrokeColorResource(R.color.red)
            q.setStrokeColorResource(R.color.white)
            browser.setStrokeColorResource(R.color.white)
            captainfalcon.setStrokeColorResource(R.color.white)
            cloud.setStrokeColorResource(R.color.white)
            daisy.setStrokeColorResource(R.color.white)
            donkeykong.setStrokeColorResource(R.color.white)
            falco.setStrokeColorResource(R.color.white)
            iceclimber.setStrokeColorResource(R.color.white)
            jigglypuff.setStrokeColorResource(R.color.white)
            kirby.setStrokeColorResource(R.color.white)
            link.setStrokeColorResource(R.color.white)
            luigi.setStrokeColorResource(R.color.white)
            ness.setStrokeColorResource(R.color.white)
            pacman.setStrokeColorResource(R.color.white)
            peach.setStrokeColorResource(R.color.white)
            pichu.setStrokeColorResource(R.color.white)
            pikachu.setStrokeColorResource(R.color.white)
            samus.setStrokeColorResource(R.color.white)
            sheik.setStrokeColorResource(R.color.white)
            sonic.setStrokeColorResource(R.color.white)
            sora.setStrokeColorResource(R.color.white)
            yoshi.setStrokeColorResource(R.color.white)
            zelda.setStrokeColorResource(R.color.white)
        }
        iceclimber.setOnClickListener {
            ImagenGuardada=iceclimber
            iceclimber.setStrokeColorResource(R.color.red)
            q.setStrokeColorResource(R.color.white)
            browser.setStrokeColorResource(R.color.white)
            captainfalcon.setStrokeColorResource(R.color.white)
            cloud.setStrokeColorResource(R.color.white)
            daisy.setStrokeColorResource(R.color.white)
            donkeykong.setStrokeColorResource(R.color.white)
            falco.setStrokeColorResource(R.color.white)
            fox.setStrokeColorResource(R.color.white)
            jigglypuff.setStrokeColorResource(R.color.white)
            kirby.setStrokeColorResource(R.color.white)
            link.setStrokeColorResource(R.color.white)
            luigi.setStrokeColorResource(R.color.white)
            ness.setStrokeColorResource(R.color.white)
            pacman.setStrokeColorResource(R.color.white)
            peach.setStrokeColorResource(R.color.white)
            pichu.setStrokeColorResource(R.color.white)
            pikachu.setStrokeColorResource(R.color.white)
            samus.setStrokeColorResource(R.color.white)
            sheik.setStrokeColorResource(R.color.white)
            sonic.setStrokeColorResource(R.color.white)
            sora.setStrokeColorResource(R.color.white)
            yoshi.setStrokeColorResource(R.color.white)
            zelda.setStrokeColorResource(R.color.white)
        }
        jigglypuff.setOnClickListener {
            ImagenGuardada=jigglypuff
            jigglypuff.setStrokeColorResource(R.color.red)
            q.setStrokeColorResource(R.color.white)
            browser.setStrokeColorResource(R.color.white)
            captainfalcon.setStrokeColorResource(R.color.white)
            cloud.setStrokeColorResource(R.color.white)
            daisy.setStrokeColorResource(R.color.white)
            donkeykong.setStrokeColorResource(R.color.white)
            falco.setStrokeColorResource(R.color.white)
            fox.setStrokeColorResource(R.color.white)
            iceclimber.setStrokeColorResource(R.color.white)
            kirby.setStrokeColorResource(R.color.white)
            link.setStrokeColorResource(R.color.white)
            luigi.setStrokeColorResource(R.color.white)
            ness.setStrokeColorResource(R.color.white)
            pacman.setStrokeColorResource(R.color.white)
            peach.setStrokeColorResource(R.color.white)
            pichu.setStrokeColorResource(R.color.white)
            pikachu.setStrokeColorResource(R.color.white)
            samus.setStrokeColorResource(R.color.white)
            sheik.setStrokeColorResource(R.color.white)
            sonic.setStrokeColorResource(R.color.white)
            sora.setStrokeColorResource(R.color.white)
            yoshi.setStrokeColorResource(R.color.white)
            zelda.setStrokeColorResource(R.color.white)
        }
        kirby.setOnClickListener {
            ImagenGuardada=kirby
            kirby.setStrokeColorResource(R.color.red)
            q.setStrokeColorResource(R.color.white)
            browser.setStrokeColorResource(R.color.white)
            captainfalcon.setStrokeColorResource(R.color.white)
            cloud.setStrokeColorResource(R.color.white)
            daisy.setStrokeColorResource(R.color.white)
            donkeykong.setStrokeColorResource(R.color.white)
            falco.setStrokeColorResource(R.color.white)
            fox.setStrokeColorResource(R.color.white)
            iceclimber.setStrokeColorResource(R.color.white)
            jigglypuff.setStrokeColorResource(R.color.white)
            link.setStrokeColorResource(R.color.white)
            luigi.setStrokeColorResource(R.color.white)
            ness.setStrokeColorResource(R.color.white)
            pacman.setStrokeColorResource(R.color.white)
            peach.setStrokeColorResource(R.color.white)
            pichu.setStrokeColorResource(R.color.white)
            pikachu.setStrokeColorResource(R.color.white)
            samus.setStrokeColorResource(R.color.white)
            sheik.setStrokeColorResource(R.color.white)
            sonic.setStrokeColorResource(R.color.white)
            sora.setStrokeColorResource(R.color.white)
            yoshi.setStrokeColorResource(R.color.white)
            zelda.setStrokeColorResource(R.color.white)
        }
        link.setOnClickListener {
            ImagenGuardada=link
            link.setStrokeColorResource(R.color.red)
            q.setStrokeColorResource(R.color.white)
            browser.setStrokeColorResource(R.color.white)
            captainfalcon.setStrokeColorResource(R.color.white)
            cloud.setStrokeColorResource(R.color.white)
            daisy.setStrokeColorResource(R.color.white)
            donkeykong.setStrokeColorResource(R.color.white)
            falco.setStrokeColorResource(R.color.white)
            fox.setStrokeColorResource(R.color.white)
            iceclimber.setStrokeColorResource(R.color.white)
            jigglypuff.setStrokeColorResource(R.color.white)
            kirby.setStrokeColorResource(R.color.white)
            luigi.setStrokeColorResource(R.color.white)
            ness.setStrokeColorResource(R.color.white)
            pacman.setStrokeColorResource(R.color.white)
            peach.setStrokeColorResource(R.color.white)
            pichu.setStrokeColorResource(R.color.white)
            pikachu.setStrokeColorResource(R.color.white)
            samus.setStrokeColorResource(R.color.white)
            sheik.setStrokeColorResource(R.color.white)
            sonic.setStrokeColorResource(R.color.white)
            sora.setStrokeColorResource(R.color.white)
            yoshi.setStrokeColorResource(R.color.white)
            zelda.setStrokeColorResource(R.color.white)
        }

        luigi.setOnClickListener{
            ImagenGuardada=luigi
            luigi.setStrokeColorResource(R.color.red)
            q.setStrokeColorResource(R.color.white)
            browser.setStrokeColorResource(R.color.white)
            captainfalcon.setStrokeColorResource(R.color.white)
            cloud.setStrokeColorResource(R.color.white)
            daisy.setStrokeColorResource(R.color.white)
            donkeykong.setStrokeColorResource(R.color.white)
            falco.setStrokeColorResource(R.color.white)
            fox.setStrokeColorResource(R.color.white)
            iceclimber.setStrokeColorResource(R.color.white)
            jigglypuff.setStrokeColorResource(R.color.white)
            kirby.setStrokeColorResource(R.color.white)
            link.setStrokeColorResource(R.color.white)
            ness.setStrokeColorResource(R.color.white)
            pacman.setStrokeColorResource(R.color.white)
            peach.setStrokeColorResource(R.color.white)
            pichu.setStrokeColorResource(R.color.white)
            pikachu.setStrokeColorResource(R.color.white)
            samus.setStrokeColorResource(R.color.white)
            sheik.setStrokeColorResource(R.color.white)
            sonic.setStrokeColorResource(R.color.white)
            sora.setStrokeColorResource(R.color.white)
            yoshi.setStrokeColorResource(R.color.white)
            zelda.setStrokeColorResource(R.color.white)
        }
        ness.setOnClickListener{
            ImagenGuardada=ness
            ness.setStrokeColorResource(R.color.red)
            q.setStrokeColorResource(R.color.white)
            browser.setStrokeColorResource(R.color.white)
            captainfalcon.setStrokeColorResource(R.color.white)
            cloud.setStrokeColorResource(R.color.white)
            daisy.setStrokeColorResource(R.color.white)
            donkeykong.setStrokeColorResource(R.color.white)
            falco.setStrokeColorResource(R.color.white)
            fox.setStrokeColorResource(R.color.white)
            iceclimber.setStrokeColorResource(R.color.white)
            jigglypuff.setStrokeColorResource(R.color.white)
            kirby.setStrokeColorResource(R.color.white)
            link.setStrokeColorResource(R.color.white)
            luigi.setStrokeColorResource(R.color.white)
            pacman.setStrokeColorResource(R.color.white)
            peach.setStrokeColorResource(R.color.white)
            pichu.setStrokeColorResource(R.color.white)
            pikachu.setStrokeColorResource(R.color.white)
            samus.setStrokeColorResource(R.color.white)
            sheik.setStrokeColorResource(R.color.white)
            sonic.setStrokeColorResource(R.color.white)
            sora.setStrokeColorResource(R.color.white)
            yoshi.setStrokeColorResource(R.color.white)
            zelda.setStrokeColorResource(R.color.white)
        }
        pacman.setOnClickListener{
            ImagenGuardada=pacman
            pacman.setStrokeColorResource(R.color.red)
            q.setStrokeColorResource(R.color.white)
            browser.setStrokeColorResource(R.color.white)
            captainfalcon.setStrokeColorResource(R.color.white)
            cloud.setStrokeColorResource(R.color.white)
            daisy.setStrokeColorResource(R.color.white)
            donkeykong.setStrokeColorResource(R.color.white)
            falco.setStrokeColorResource(R.color.white)
            fox.setStrokeColorResource(R.color.white)
            iceclimber.setStrokeColorResource(R.color.white)
            jigglypuff.setStrokeColorResource(R.color.white)
            kirby.setStrokeColorResource(R.color.white)
            link.setStrokeColorResource(R.color.white)
            luigi.setStrokeColorResource(R.color.white)
            ness.setStrokeColorResource(R.color.white)
            peach.setStrokeColorResource(R.color.white)
            pichu.setStrokeColorResource(R.color.white)
            pikachu.setStrokeColorResource(R.color.white)
            samus.setStrokeColorResource(R.color.white)
            sheik.setStrokeColorResource(R.color.white)
            sonic.setStrokeColorResource(R.color.white)
            sora.setStrokeColorResource(R.color.white)
            yoshi.setStrokeColorResource(R.color.white)
            zelda.setStrokeColorResource(R.color.white)
        }
        peach.setOnClickListener{
            ImagenGuardada=peach
            peach.setStrokeColorResource(R.color.red)
            q.setStrokeColorResource(R.color.white)
            browser.setStrokeColorResource(R.color.white)
            captainfalcon.setStrokeColorResource(R.color.white)
            cloud.setStrokeColorResource(R.color.white)
            daisy.setStrokeColorResource(R.color.white)
            donkeykong.setStrokeColorResource(R.color.white)
            falco.setStrokeColorResource(R.color.white)
            fox.setStrokeColorResource(R.color.white)
            iceclimber.setStrokeColorResource(R.color.white)
            jigglypuff.setStrokeColorResource(R.color.white)
            kirby.setStrokeColorResource(R.color.white)
            link.setStrokeColorResource(R.color.white)
            luigi.setStrokeColorResource(R.color.white)
            ness.setStrokeColorResource(R.color.white)
            pacman.setStrokeColorResource(R.color.white)
            pichu.setStrokeColorResource(R.color.white)
            pikachu.setStrokeColorResource(R.color.white)
            samus.setStrokeColorResource(R.color.white)
            sheik.setStrokeColorResource(R.color.white)
            sonic.setStrokeColorResource(R.color.white)
            sora.setStrokeColorResource(R.color.white)
            yoshi.setStrokeColorResource(R.color.white)
            zelda.setStrokeColorResource(R.color.white)
        }
        pichu.setOnClickListener{
            ImagenGuardada=pichu
            pichu.setStrokeColorResource(R.color.red)
            q.setStrokeColorResource(R.color.white)
            browser.setStrokeColorResource(R.color.white)
            captainfalcon.setStrokeColorResource(R.color.white)
            cloud.setStrokeColorResource(R.color.white)
            daisy.setStrokeColorResource(R.color.white)
            donkeykong.setStrokeColorResource(R.color.white)
            falco.setStrokeColorResource(R.color.white)
            fox.setStrokeColorResource(R.color.white)
            iceclimber.setStrokeColorResource(R.color.white)
            jigglypuff.setStrokeColorResource(R.color.white)
            kirby.setStrokeColorResource(R.color.white)
            link.setStrokeColorResource(R.color.white)
            luigi.setStrokeColorResource(R.color.white)
            ness.setStrokeColorResource(R.color.white)
            pacman.setStrokeColorResource(R.color.white)
            peach.setStrokeColorResource(R.color.white)
            pikachu.setStrokeColorResource(R.color.white)
            samus.setStrokeColorResource(R.color.white)
            sheik.setStrokeColorResource(R.color.white)
            sonic.setStrokeColorResource(R.color.white)
            sora.setStrokeColorResource(R.color.white)
            yoshi.setStrokeColorResource(R.color.white)
            zelda.setStrokeColorResource(R.color.white)
        }
        pikachu.setOnClickListener{
            ImagenGuardada=pikachu
            pikachu.setStrokeColorResource(R.color.red)
            q.setStrokeColorResource(R.color.white)
            browser.setStrokeColorResource(R.color.white)
            captainfalcon.setStrokeColorResource(R.color.white)
            cloud.setStrokeColorResource(R.color.white)
            daisy.setStrokeColorResource(R.color.white)
            donkeykong.setStrokeColorResource(R.color.white)
            falco.setStrokeColorResource(R.color.white)
            fox.setStrokeColorResource(R.color.white)
            iceclimber.setStrokeColorResource(R.color.white)
            jigglypuff.setStrokeColorResource(R.color.white)
            kirby.setStrokeColorResource(R.color.white)
            link.setStrokeColorResource(R.color.white)
            luigi.setStrokeColorResource(R.color.white)
            ness.setStrokeColorResource(R.color.white)
            pacman.setStrokeColorResource(R.color.white)
            peach.setStrokeColorResource(R.color.white)
            pichu.setStrokeColorResource(R.color.white)
            samus.setStrokeColorResource(R.color.white)
            sheik.setStrokeColorResource(R.color.white)
            sonic.setStrokeColorResource(R.color.white)
            sora.setStrokeColorResource(R.color.white)
            yoshi.setStrokeColorResource(R.color.white)
            zelda.setStrokeColorResource(R.color.white)
        }
        samus.setOnClickListener{
            ImagenGuardada=samus
            samus.setStrokeColorResource(R.color.red)
            q.setStrokeColorResource(R.color.white)
            browser.setStrokeColorResource(R.color.white)
            captainfalcon.setStrokeColorResource(R.color.white)
            cloud.setStrokeColorResource(R.color.white)
            daisy.setStrokeColorResource(R.color.white)
            donkeykong.setStrokeColorResource(R.color.white)
            falco.setStrokeColorResource(R.color.white)
            fox.setStrokeColorResource(R.color.white)
            iceclimber.setStrokeColorResource(R.color.white)
            jigglypuff.setStrokeColorResource(R.color.white)
            kirby.setStrokeColorResource(R.color.white)
            link.setStrokeColorResource(R.color.white)
            luigi.setStrokeColorResource(R.color.white)
            ness.setStrokeColorResource(R.color.white)
            pacman.setStrokeColorResource(R.color.white)
            peach.setStrokeColorResource(R.color.white)
            pichu.setStrokeColorResource(R.color.white)
            pikachu.setStrokeColorResource(R.color.white)
            sheik.setStrokeColorResource(R.color.white)
            sonic.setStrokeColorResource(R.color.white)
            sora.setStrokeColorResource(R.color.white)
            yoshi.setStrokeColorResource(R.color.white)
            zelda.setStrokeColorResource(R.color.white)
        }
        sheik.setOnClickListener{
            ImagenGuardada=sheik
            sheik.setStrokeColorResource(R.color.red)
            q.setStrokeColorResource(R.color.white)
            browser.setStrokeColorResource(R.color.white)
            captainfalcon.setStrokeColorResource(R.color.white)
            cloud.setStrokeColorResource(R.color.white)
            daisy.setStrokeColorResource(R.color.white)
            donkeykong.setStrokeColorResource(R.color.white)
            falco.setStrokeColorResource(R.color.white)
            fox.setStrokeColorResource(R.color.white)
            iceclimber.setStrokeColorResource(R.color.white)
            jigglypuff.setStrokeColorResource(R.color.white)
            kirby.setStrokeColorResource(R.color.white)
            link.setStrokeColorResource(R.color.white)
            luigi.setStrokeColorResource(R.color.white)
            ness.setStrokeColorResource(R.color.white)
            pacman.setStrokeColorResource(R.color.white)
            peach.setStrokeColorResource(R.color.white)
            pichu.setStrokeColorResource(R.color.white)
            pikachu.setStrokeColorResource(R.color.white)
            samus.setStrokeColorResource(R.color.white)
            sonic.setStrokeColorResource(R.color.white)
            sora.setStrokeColorResource(R.color.white)
            yoshi.setStrokeColorResource(R.color.white)
            zelda.setStrokeColorResource(R.color.white)
        }
        sonic.setOnClickListener{
            ImagenGuardada=sonic
            sonic.setStrokeColorResource(R.color.red)
            q.setStrokeColorResource(R.color.white)
            browser.setStrokeColorResource(R.color.white)
            captainfalcon.setStrokeColorResource(R.color.white)
            cloud.setStrokeColorResource(R.color.white)
            daisy.setStrokeColorResource(R.color.white)
            donkeykong.setStrokeColorResource(R.color.white)
            falco.setStrokeColorResource(R.color.white)
            fox.setStrokeColorResource(R.color.white)
            iceclimber.setStrokeColorResource(R.color.white)
            jigglypuff.setStrokeColorResource(R.color.white)
            kirby.setStrokeColorResource(R.color.white)
            link.setStrokeColorResource(R.color.white)
            luigi.setStrokeColorResource(R.color.white)
            ness.setStrokeColorResource(R.color.white)
            pacman.setStrokeColorResource(R.color.white)
            peach.setStrokeColorResource(R.color.white)
            pichu.setStrokeColorResource(R.color.white)
            pikachu.setStrokeColorResource(R.color.white)
            samus.setStrokeColorResource(R.color.white)
            sheik.setStrokeColorResource(R.color.white)
            sora.setStrokeColorResource(R.color.white)
            yoshi.setStrokeColorResource(R.color.white)
            zelda.setStrokeColorResource(R.color.white)
        }
        sora.setOnClickListener{
            ImagenGuardada=sora
            sora.setStrokeColorResource(R.color.red)
            q.setStrokeColorResource(R.color.white)
            browser.setStrokeColorResource(R.color.white)
            captainfalcon.setStrokeColorResource(R.color.white)
            cloud.setStrokeColorResource(R.color.white)
            daisy.setStrokeColorResource(R.color.white)
            donkeykong.setStrokeColorResource(R.color.white)
            falco.setStrokeColorResource(R.color.white)
            fox.setStrokeColorResource(R.color.white)
            iceclimber.setStrokeColorResource(R.color.white)
            jigglypuff.setStrokeColorResource(R.color.white)
            kirby.setStrokeColorResource(R.color.white)
            link.setStrokeColorResource(R.color.white)
            luigi.setStrokeColorResource(R.color.white)
            ness.setStrokeColorResource(R.color.white)
            pacman.setStrokeColorResource(R.color.white)
            peach.setStrokeColorResource(R.color.white)
            pichu.setStrokeColorResource(R.color.white)
            pikachu.setStrokeColorResource(R.color.white)
            samus.setStrokeColorResource(R.color.white)
            sheik.setStrokeColorResource(R.color.white)
            sonic.setStrokeColorResource(R.color.white)
            yoshi.setStrokeColorResource(R.color.white)
            zelda.setStrokeColorResource(R.color.white)
        }
        yoshi.setOnClickListener{
            ImagenGuardada=yoshi
            yoshi.setStrokeColorResource(R.color.red)
            q.setStrokeColorResource(R.color.white)
            browser.setStrokeColorResource(R.color.white)
            captainfalcon.setStrokeColorResource(R.color.white)
            cloud.setStrokeColorResource(R.color.white)
            daisy.setStrokeColorResource(R.color.white)
            donkeykong.setStrokeColorResource(R.color.white)
            falco.setStrokeColorResource(R.color.white)
            fox.setStrokeColorResource(R.color.white)
            iceclimber.setStrokeColorResource(R.color.white)
            jigglypuff.setStrokeColorResource(R.color.white)
            kirby.setStrokeColorResource(R.color.white)
            link.setStrokeColorResource(R.color.white)
            luigi.setStrokeColorResource(R.color.white)
            ness.setStrokeColorResource(R.color.white)
            pacman.setStrokeColorResource(R.color.white)
            peach.setStrokeColorResource(R.color.white)
            pichu.setStrokeColorResource(R.color.white)
            pikachu.setStrokeColorResource(R.color.white)
            samus.setStrokeColorResource(R.color.white)
            sheik.setStrokeColorResource(R.color.white)
            sonic.setStrokeColorResource(R.color.white)
            sora.setStrokeColorResource(R.color.white)
            zelda.setStrokeColorResource(R.color.white)
        }
        zelda.setOnClickListener{
            ImagenGuardada=zelda
            zelda.setStrokeColorResource(R.color.red)
            q.setStrokeColorResource(R.color.white)
            browser.setStrokeColorResource(R.color.white)
            captainfalcon.setStrokeColorResource(R.color.white)
            cloud.setStrokeColorResource(R.color.white)
            daisy.setStrokeColorResource(R.color.white)
            donkeykong.setStrokeColorResource(R.color.white)
            falco.setStrokeColorResource(R.color.white)
            fox.setStrokeColorResource(R.color.white)
            iceclimber.setStrokeColorResource(R.color.white)
            jigglypuff.setStrokeColorResource(R.color.white)
            kirby.setStrokeColorResource(R.color.white)
            link.setStrokeColorResource(R.color.white)
            luigi.setStrokeColorResource(R.color.white)
            ness.setStrokeColorResource(R.color.white)
            pacman.setStrokeColorResource(R.color.white)
            peach.setStrokeColorResource(R.color.white)
            pichu.setStrokeColorResource(R.color.white)
            pikachu.setStrokeColorResource(R.color.white)
            samus.setStrokeColorResource(R.color.white)
            sheik.setStrokeColorResource(R.color.white)
            sonic.setStrokeColorResource(R.color.white)
            sora.setStrokeColorResource(R.color.white)
            yoshi.setStrokeColorResource(R.color.white)
        }
    }
}