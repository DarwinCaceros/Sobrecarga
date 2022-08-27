package Sobrecarga;


public class Main {

    public static void main(String[] args) {



            Producto p1= new Producto ("galletas",3);

            Bolsa b= new Bolsa();
            b.addProducto(p1);
            b.addProducto("chocolate",4);
        }
    }




