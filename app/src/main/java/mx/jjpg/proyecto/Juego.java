package mx.jjpg.proyecto;


import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.*;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Juego extends Activity implements  AdapterView.OnItemSelectedListener {

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
        Integer num=init();
        TextView texto=findViewById(R.id.player1);
        ShapeableImageView dream=findViewById(R.id.player1foto);
        Intent i=getIntent();
        String user=i.getStringExtra("usuario");
        String fname=i.getStringExtra("pnombre");
        String sname=i.getStringExtra("snombre");
        String correo=i.getStringExtra("correo");
        String imagen=i.getStringExtra("imagen");
        texto.setText(user);

        RecyclerView recyclerview=findViewById(R.id.recyclerview);
        recyclerview.setLayoutManager(LinearLayout(this));
        ArrayList data=ArrayList<ItemsViewModel>();
        data.add(ItemsViewModel("Hola"));
        recyclerview.setAdapter(CustomAdapter(data));

        Button adiv=findViewById(R.id.adivinar);
        Spinner spinner=findViewById(R.id.cmbOpciones);
        ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(this,R.array.nombres, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);
        switch(imagen)
        {
            case "q":
                dream.setImageResource(R.drawable.q);
                break;
        }
        Intent intent=new Intent(getApplicationContext(),Menu.class);
        intent.putExtra("usuario",user);
        intent.putExtra("pnombre",fname);
        intent.putExtra("snombre",sname);
        intent.putExtra("correo",correo);
        intent.putExtra("imagen",imagen);
        adiv.setOnClickListener(new View.OnClickListener(){
            @Override
                    public void onClick(View v)
            {
                String seleccionado=spinner.getSelectedItem().toString();
                Boolean g=buscar(seleccionado,intent,num);
            }

        });
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
                init2();
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

    private Integer init(){
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
        return arrayDesordenado.get(10);

    }

        return null;
    }
    private void init2(){
        cargarTablero();
        cargarBotones();
        cargarTexto();
        cargarImagenes();
        arrayDeCartas=insertar(imagenes.length);
        for(int i=0;i< tablero.length;i++)
        {
            tablero[i].setScaleType(ImageView.ScaleType.CENTER_CROP);
            tablero[i].setImageResource(imagenes[arrayDeCartas.get(i)]);
        }
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

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        String text=adapterView.getItemAtPosition(i).toString();
        Toast.makeText(adapterView.getContext(),text,Toast.LENGTH_LONG);
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
    public boolean buscar(String en,Intent intent,Integer num)
    {
        switch (en)
        {
            case "Bowser":
                if(num==0)
                {
                    intent.putExtra("resultado","ganado");
                    startActivity(intent);
                }
                break;
            case "Captain Falcon":
                if(num==1)
                {
                    intent.putExtra("resultado","ganado");
                    startActivity(intent);
                }
                break;
            case "Cloud":
                if(num==2)
                {
                    intent.putExtra("resultado","ganado");
                    startActivity(intent);
                }
                break;
            case "Daisy":
                if(num==3)
                {
                    intent.putExtra("resultado","ganado");
                    startActivity(intent);
                }
                break;
            case "Donkey Kong":
                if(num==4)
                {
                    intent.putExtra("resultado","ganado");
                    startActivity(intent);
                }
                break;
            case "Falco":
                if(num==5)
                {
                    intent.putExtra("resultado","ganado");
                    startActivity(intent);
                }
                break;
            case "Fox":
                if(num==6)
                {
                    intent.putExtra("resultado","ganado");
                    startActivity(intent);
                }
                break;
            case "Ice Climbers":
                if(num==7)
                {
                    intent.putExtra("resultado","ganado");
                    startActivity(intent);
                }
                break;
            case "Jigglypuff":
                if(num==8)
                {
                    intent.putExtra("resultado","ganado");
                    startActivity(intent);
                }
                break;
            case "Kirby":
                if(num==9)
                {
                    intent.putExtra("resultado","ganado");
                    startActivity(intent);
                }
                break;
            case "Link":
                if(num==10)
                {
                    intent.putExtra("resultado","ganado");
                    startActivity(intent);
                }
                break;
            case "Luigi":
                if(num==11)
                {
                    intent.putExtra("resultado","ganado");
                    startActivity(intent);
                }
                break;
            case "Ness":
                if(num==12)
                {
                    intent.putExtra("resultado","ganado");
                    startActivity(intent);
                }
                break;
            case "Pacman":
                if(num==13)
                {
                    intent.putExtra("resultado","ganado");
                    startActivity(intent);
                }
                break;
            case "Peach":
                if(num==14)
                {
                    intent.putExtra("resultado","ganado");
                    startActivity(intent);
                }
                break;
            case "Pichu":
                if(num==15)
                {
                    intent.putExtra("resultado","ganado");
                    startActivity(intent);
                }
                break;
            case "Mario":
                if(num==16)
                {
                    intent.putExtra("resultado","ganado");
                    startActivity(intent);
                }
            case "Pikachu":
                if(num==17)
                {
                    intent.putExtra("resultado","ganado");
                }
                break;
            case "Samus":
                if(num==18)
                {
                    intent.putExtra("resultado","ganado");
                    startActivity(intent);
                }
                break;
            case "Sheik":
                if(num==19)
                {
                    intent.putExtra("resultado","ganado");
                    startActivity(intent);
                }
                break;
            case "Sonic":
                if(num==20)
                {
                    intent.putExtra("resultado","ganado");
                    startActivity(intent);
                }
                break;
            case "Sora":
                if(num==21)
                {
                    intent.putExtra("resultado","ganado");
                    startActivity(intent);
                }
                break;
            case "Yoshi":
                if(num==22)
                {
                    intent.putExtra("resultado","ganado");
                    startActivity(intent);
                }
                break;
            case "Zelda":
                if(num==23)
                {
                    intent.putExtra("resultado","ganado");
                    startActivity(intent);
                }
                break;
            }
            return true;
        }
}

