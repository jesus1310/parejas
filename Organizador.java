import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
/**
 * Write a description of class Organizador here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Organizador
{
    // Atributo que da formato a los identificadores de los alumnos
    private DecimalFormat formateador;
    // ArrayList para almacenar los alumnos
    private ArrayList<String> listaAlumnos;
    // ArrayList para almacenar las parejas
    private ArrayList<String> parejas;
    // Atributo para almacenar el indice de los alumnos
    private int indiceAlumno;
    // Atributo para almacenar el indice de las parejas
    private int indicePareja;
    
    /**
     * Constructor for objects of class Organizador
     */
    public Organizador()
    {
        formateador = new DecimalFormat("0000");
        listaAlumnos = new ArrayList<>();
        parejas = new ArrayList<>();
        indiceAlumno = 0;
        indicePareja = 0;
        listaAlumnos.add("Adeva Tranche, Adrián");
        listaAlumnos.add("Aller González, Francisco Javier");
        listaAlumnos.add("Álvarez Prieto, Noelia");
        listaAlumnos.add("Barrionuevo Pérez, Manuel");
        listaAlumnos.add("Bóveda del Río, José Antonio");
        listaAlumnos.add("de la Viuda Crespo, Ignacio");
        listaAlumnos.add("Encina Maestro, David");
        listaAlumnos.add("Felix Nañez, Kevin");
        listaAlumnos.add("Fernández Diez, Daniel");
        listaAlumnos.add("Fernández González, Javier");
        listaAlumnos.add("Fernández Rincón, Jesús");
        listaAlumnos.add("Fuentes Álvarez, Francisco José");
        listaAlumnos.add("García Juárez, David");
        listaAlumnos.add("García Serrano, Rubén");
        listaAlumnos.add("González Álvarez, David");
        listaAlumnos.add("López Beltrán, Víctor");
        listaAlumnos.add("Lora García, Sandra");
        listaAlumnos.add("Melcón Diez, Víctor");
        listaAlumnos.add("Menéndez Pouso, Francisco José");
        listaAlumnos.add("Pérez Bayón, Álvaro");
        listaAlumnos.add("Pradera San José, Daniel");
        listaAlumnos.add("Prieto Mediavilla, Gabriel");
        listaAlumnos.add("Robles González, Miguel Ángel");
        listaAlumnos.add("Sánchez Manzano, Adán");
        listaAlumnos.add("Serrano García, Verónica");
        listaAlumnos.add("Tascón González, Anibal");
        //listaAlumnos.add("lopez perez,Pepito");
    }

    /**
     * Método para crear parejas cada dos alumnos, si hay alumnos impares, una pareja tendrá 3
     */
    public void empareja(){
        Collections.shuffle(listaAlumnos);
        parejas.clear();
        if (listaAlumnos.size() % 2 != 0){
            listaAlumnos.get(indiceAlumno);
            parejas.add(listaAlumnos.get(indiceAlumno) + "---" + listaAlumnos.get(indiceAlumno + 1) + "---" + listaAlumnos.get(indiceAlumno + 2) + 
            "(" + formateador.format(indicePareja) + ")");
            indiceAlumno = indiceAlumno + 3;
            System.out.println(parejas.get(indicePareja));
            indicePareja = indicePareja + 1;
        }
        
        while (indiceAlumno < listaAlumnos.size() - 1){
            listaAlumnos.get(indiceAlumno);
            parejas.add(listaAlumnos.get(indiceAlumno) + "---" + listaAlumnos.get(indiceAlumno + 1) +
            "(" + formateador.format(indicePareja) + ")");
            indiceAlumno = indiceAlumno + 2;
            System.out.println(parejas.get(indicePareja));
            indicePareja = indicePareja + 1;
        }
    }
    
    /**
     * Método que muestra los integrantes de cada pareja
     */
    public void muestraIntegrantes(int codigo){
        indicePareja = 0;
        for (String cadena : parejas){
            String formatoCodigo = formateador.format(codigo);
            String formatoIndicePareja = formateador.format(indicePareja);
            if (formatoIndicePareja.equals(formatoCodigo)){
                System.out.println(cadena);
            }
            indicePareja = indicePareja + 1;
        }
    }
}
