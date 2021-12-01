package mx.jjpg.proyecto

class User {
    var nombre:String=""
    var apellido:String=""
    var correo:String=""
    var password:String=""
    var username:String=""

    constructor(nombre:String,apellido:String,correo:String,password:String,username:String)
    {
        this.nombre=nombre
        this.apellido=apellido
        this.correo=correo
        this.password=password
        this.username=username
    }
}