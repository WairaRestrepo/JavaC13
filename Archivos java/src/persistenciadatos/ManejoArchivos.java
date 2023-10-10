package persistenciadatos;

import java.io.*;

public class ManejoArchivos {

    // como crear el archivo
    public static void crearArchivos(String nombreArchivo) {

        File archivo = new File(nombreArchivo);
        try {
            PrintWriter salida = new PrintWriter(archivo);
            salida.close();
            System.out.println("Se creo el archivo ");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);

        }
    }

    // como escribir en el archivo


    public static void escribirArchivos(String nombreArchivo, String contenido) {

        File archivo = new File(nombreArchivo);  //
        try (PrintWriter salida = new PrintWriter(new FileWriter(archivo, true))) {
            salida.println(contenido);
            salida.close();
            System.out.println("Se escribio en  el archivo ");

        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);

        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }


    //Como leer los datos que se han escrito en el archivo


    public static void leerArchivos(String nombreArchivo) {
        // solo se pone el nombre del archivo que se desea leer

        File archivo = new File(nombreArchivo);
        try {
            //buffer es un espacio de memoria que se almacena de manera temporal
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
            String lectura = entrada.readLine();
            while (lectura != null){
                //El while es para que se actualice
                System.out.println(lectura);
                lectura = entrada.readLine();
            }
            entrada.close();

            System.out.println(lectura);

        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }

    }

    //Como eliminar en el archivo

    public static void eliminarArchivos(String nombreArchivo) {


        File archivo = new File(nombreArchivo);
        archivo.delete();
        if (archivo.exists() == false){
            System.out.println("El archivo ha sido eliminado de manera exitosa, no esta en el almacenamiento actual ");
        }else{
            System.out.println("El archivo esta en el almacenamiento actual ");
        }

    }

}


