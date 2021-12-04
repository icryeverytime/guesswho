package mx.jjpg.proyecto

import java.io.DataInputStream
import java.io.DataOutputStream
import java.net.Socket
import kotlin.concurrent.thread

class ConexionesLocales {
    fun conexion()
    {
        val client=Socket("25.83.103.75",8080)
        val dIn = DataInputStream(client.getInputStream())
        val dOut=DataOutputStream(client.getOutputStream())
        thread {
            while (true)
            {
                val byte=dIn.readByte()
                when(byte)
                {
                    "4".toByte()->{
                        if(dIn.readUTF().toString()=="ganado")
                        {
                            println("ganando")
                        }
                        else
                        {
                            println("perdido")
                        }
                    }
                }
            }
        }
    }
}