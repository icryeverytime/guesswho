package mx.jjpg.proyecto

import android.annotation.SuppressLint
import android.content.ContentValues
import android.content.Context
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.util.Log


val DATABASE_NAME="MyDB"
val TABLE_NAME="Usuarios"
val COL_NAME="nombre"
val COL_APELLIDO="apellido"
val COL_CORREO="correo"
val COL_PASSWORD="contra"
val COL_USERNAME="usuario"

class DataBaseHandler(var context: Context): SQLiteOpenHelper(context, DATABASE_NAME,null,1) {
    override fun onCreate(p0: SQLiteDatabase?) {
        val createtable=("CREATE TABLE "+ TABLE_NAME+"("+ COL_NAME+" TEXT,"+ COL_APELLIDO+" TEXT,"+ COL_PASSWORD+" TEXT,"+ COL_USERNAME+" TEXT,"+ COL_CORREO+" TEXT PRIMARY KEY"+");")


        p0?.execSQL(createtable)
    }

    override fun onUpgrade(p0: SQLiteDatabase?, p1: Int, p2: Int) {

    }
    fun insertData(user:User):Long{

        val db=this.writableDatabase
        var cv= ContentValues()
        cv.put(COL_NAME,user.nombre)
        cv.put(COL_APELLIDO,user.apellido)
        cv.put(COL_PASSWORD,user.password)
        cv.put(COL_USERNAME,user.username)
        cv.put(COL_CORREO,user.correo)
        val result=db.insert(TABLE_NAME,null,cv)
        return result
    }




}
