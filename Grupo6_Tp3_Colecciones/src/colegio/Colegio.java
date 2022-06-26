
package colegio;

import colegio.modelo.Alumno;
import colegio.modelo.Materia;

/**
 * @author Grupo 6
 * Fernandez Valentina
 * Romero Jorge
 * Gutierrez Manuel
 */
public class Colegio {

    public static void main(String[] args) {
        Materia ingles = new Materia(1, "Ingles I", 1);
        Materia matematica = new Materia(2, "Matemáticas", 1);
        Materia laboratorio1 = new Materia(3, "Laboratorio I", 1);
        
        Alumno martin = new Alumno(1001, "Martín", "López");
        Alumno brenda = new Alumno(1002, "Brenda", "Martínez");
        
        martin.agregarMateria(ingles);
        martin.agregarMateria(matematica);
        martin.agregarMateria(laboratorio1);
        
        brenda.agregarMateria(ingles);
        brenda.agregarMateria(laboratorio1);
        brenda.agregarMateria(matematica);
        brenda.agregarMateria(laboratorio1);
        
        System.out.println("Martín Está Inscripto en " + martin.cantidadMaterias() + " Materias");
        System.out.println("Brenda Está Inscripta en " + brenda.cantidadMaterias() + " Materias");
    }

}
