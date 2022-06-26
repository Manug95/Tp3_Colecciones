
package colegio.modelo;

import java.util.HashSet;
import javax.swing.JOptionPane;

/**
 * @author Grupo 6
 * Fernandez Valentina
 * Romero Jorge
 * Gutierrez Manuel
 */
public class Alumno {
    //                                              ATRIBUTOS
    //---------------------------------------------------------------------------------------------------------------
    private int legajo;
    private String nombre;
    private String apellido;
    private HashSet<Materia> materias;
    //                                  CONSTRUCTORES, GETTERS Y SETTERS
    //---------------------------------------------------------------------------------------------------------------
    public Alumno() {
        materias = new HashSet<>();
    }

    public Alumno(int legajo, String nombre, String apellido) {
        this.legajo = legajo;
        this.nombre = nombre;
        this.apellido = apellido;
        materias = new HashSet<>();
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public HashSet<Materia> getMaterias() {
        return materias;
    }
    //                                          METODOS PUBLICOS
    //---------------------------------------------------------------------------------------------------------------
    public void agregarMateria(Materia mat){
        if(materias.add(mat)){
            JOptionPane.showMessageDialog(null, "Materia Agregadoa  con Exito!");
        }else{
            JOptionPane.showMessageDialog(null, "El Alumno ya esta Inscripto en esa Materia!");
        }
    }
    
    public int cantidadMaterias(){
        return materias.size();
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + this.legajo;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Alumno other = (Alumno) obj;
        if (this.legajo != other.legajo) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return apellido + " " + nombre;
    }
    //                                          METODOS PRIVADOS
    //---------------------------------------------------------------------------------------------------------------
    
}
