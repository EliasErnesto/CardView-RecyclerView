package emaros.com.bienvenido;

import android.graphics.Bitmap;

/**
 * Created by Elías Barrera on 25/09/2016 0:01.
 */
public class Materia {

    String codigo;
    String nombre;
    Bitmap imagen;
    public Materia() {
    }

    public Materia(String codigo, String nombre, Bitmap imagen) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.imagen = imagen;
    }

    public Bitmap getImagen() {
        return imagen;
    }

    public void setImagen(Bitmap imagen) {
        this.imagen = imagen;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
