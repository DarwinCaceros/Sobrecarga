package Sobrecarga;

import java.util.ArrayList;
import java.util.List;

public class Bolsa {

    private List<Producto> lista = new ArrayList<Producto>();

    public void addProducto(Producto p) {
        lista.add(p);
    }
    public void addProducto(String nombre, double precio) {
        lista.add(new Producto(nombre, precio));
    }

}

