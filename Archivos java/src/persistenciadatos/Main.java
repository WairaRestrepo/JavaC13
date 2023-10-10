package persistenciadatos;
import static persistenciadatos.ManejoArchivos.*;

public class Main {
    public static void main(String[] args) {
        crearArchivos("archivo\\Hola.txt");
        escribirArchivos("archivo\\Hola.txt", "Hola mundo");
        //escribirArchivos("archivo\\Hola.txt", "Hola nuevo text ");

        leerArchivos("archivo\\hola.txt");
       eliminarArchivos("archivo\\hola.txt");

    }
}