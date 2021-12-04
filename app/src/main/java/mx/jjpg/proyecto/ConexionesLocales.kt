package mx.jjpg.proyecto

import android.util.Log
import java.io.DataInputStream
import java.io.DataOutputStream
import java.net.ServerSocket
import java.net.Socket
import kotlin.concurrent.thread

class ConexionesLocales{
    fun conexion(user:String,imagen:String)
    {
        thread{
            val client=Socket("25.83.103.75",8080)
            //val client=Socket("187.232.84.170",7896)
            val dIn = DataInputStream(client.getInputStream())
            val clientOutputStream=DataOutputStream(client.getOutputStream())
            Log.e("SIIII",client.isConnected.toString())
        }

/*
        dOut.writeByte(1)
        dOut.writeUTF(user)
        dOut.flush()

        dOut.writeByte(2)
        dOut.writeUTF(imagen)
        dOut.flush()
        while (true)
        {
            thread {

            }
            thread {

            }
            val byte=dIn.readByte()
            when(byte)
            {
                "1".toByte()->{
                    if(random==dIn.readUTF().toInt())
                    {
                        dOut.writeByte(4);
                        dOut.writeUTF("Gandando");
                        dOut.flush();
                    }
                    else{
                        dOut.writeByte(4);
                        dOut.writeUTF("Perdido");
                        dOut.flush();
                    }
                }
            }
            print(byte)
        }*/
    }
}