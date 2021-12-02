package mx.jjpg.proyecto;


import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Juego extends Activity {

    // variables para los componentes de la vista
    ImageButton imb00, imb01, imb02, imb03, imb04, imb05, imb06, imb07, imb08, imb09, imb10, imb11, imb12, imb13, imb14, imb15,imb16,imb17,imb18,imb19,imb20,imb21,imb22,imb23,imbMiPer;
    ImageButton[] tablero = new ImageButton[24];
    Button botonReiniciar, botonSalir;
    TextView textoPuntuacion;

    int aciertos;

    //imagenes
    int[] imagenes;
    int fondo;
    int miCarta;

    //variables del juego
    ArrayList<Integer> arrayDesordenado;
    ArrayList<Integer> arrayDeCartas;
    ImageButton primero;
    int numeroDeLaCarta;
    boolean bloqueo = false;
    final Handler handler = new Handler();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juego);
        init();
    }

    private void cargarTablero(){
        imb00 = findViewById(R.id.boton00);
        imb01 = findViewById(R.id.boton01);
        imb02 = findViewById(R.id.boton02);
        imb03 = findViewById(R.id.boton03);
        imb04 = findViewById(R.id.boton04);
        imb05 = findViewById(R.id.boton05);
        imb06 = findViewById(R.id.boton06);
        imb07 = findViewById(R.id.boton07);
        imb08 = findViewById(R.id.boton08);
        imb09 = findViewById(R.id.boton09);
        imb10 = findViewById(R.id.boton10);
        imb11 = findViewById(R.id.boton11);
        imb12 = findViewById(R.id.boton12);
        imb13 = findViewById(R.id.boton13);
        imb14 = findViewById(R.id.boton14);
        imb15 = findViewById(R.id.boton15);

        imb16 = findViewById(R.id.boton16);
        imb17 = findViewById(R.id.boton17);
        imb18 = findViewById(R.id.boton18);
        imb19 = findViewById(R.id.boton19);
        imb20 = findViewById(R.id.boton20);
        imb21 = findViewById(R.id.boton21);
        imb22 = findViewById(R.id.boton22);
        imb23 = findViewById(R.id.boton23);

        imbMiPer = findViewById(R.id.botonMiPersonaje);

        tablero[0] = imb00;
        tablero[1] = imb01;
        tablero[2] = imb02;
        tablero[3] = imb03;
        tablero[4] = imb04;
        tablero[5] = imb05;
        tablero[6] = imb06;
        tablero[7] = imb07;
        tablero[8] = imb08;
        tablero[9] = imb09;
        tablero[10] = imb10;
        tablero[11] = imb11;
        tablero[12] = imb12;
        tablero[13] = imb13;
        tablero[14] = imb14;
        tablero[15] = imb15;

        tablero[16] = imb16;
        tablero[17] = imb17;
        tablero[18] = imb18;
        tablero[19] = imb19;
        tablero[20] = imb20;
        tablero[21] = imb21;
        tablero[22] = imb22;
        tablero[23] = imb23;
    }

    private void cargarBotones(){
        botonReiniciar = findViewById(R.id.botonJuegoReiniciar);
        botonSalir = findViewById(R.id.botonJuegoSalir);
        botonReiniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                init();
            }
        });

        botonSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    private void cargarTexto(){

        aciertos = 10;

    }

    private void cargarImagenes(){
        imagenes = new int[]{
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
            R.drawable.zelda,

        };
        fondo = R.drawable.fondo;

    }

    private ArrayList<Integer> barajar(int longitud){
        ArrayList<Integer> result = new ArrayList<Integer>();

        for(int i=0; i<longitud*2; i++){
        result.add(i % longitud);
    }

        Collections.shuffle(result);
        System.out.println(Arrays.toString(result.toArray()));
        return result;
    }


    private ArrayList<Integer> insertar(int longitud){
        ArrayList<Integer> result = new ArrayList<Integer>();

        for(int i=0; i<longitud*2; i++){
        result.add(i % longitud);
    }

        return result;
    }

    private void comprobar(int i, final ImageButton imgb){
        if(primero == null){

            imgb.setImageResource(fondo);
            primero = imgb;
            primero.setScaleType(ImageView.ScaleType.CENTER_CROP);
            aciertos++;
            numeroDeLaCarta = arrayDeCartas.get(i);





            primero = null;

        }

    }

    private void init(){
        cargarTablero();
        cargarBotones();
        cargarTexto();
        cargarImagenes();
        arrayDeCartas = insertar(imagenes.length);
        arrayDesordenado = barajar(imagenes.length);
        //setear todas las imagenes del tablero
        for(int i=0; i<tablero.length; i++){
        tablero[i].setScaleType(ImageView.ScaleType.CENTER_CROP);
        tablero[i].setImageResource(imagenes[arrayDeCartas.get(i)]);
    }
        //setear la imagen de mi personaje
        imbMiPer.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imbMiPer.setImageResource(imagenes[arrayDesordenado.get(10)]);

        for(int i=0; i<tablero.length; i++) {
        final int j = i;
        tablero[i].setEnabled(true);


        tablero[i].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                comprobar(j, tablero[j]);
            }
        });


    }

    }

}
