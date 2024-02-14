/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica_Negocio;

/**
 *
 * @author ANDRES
 */
public class Paciente {
    String Nombre;
    String Cedula;
    String Direccion;
    
    public Paciente(){
        
    }

    public Paciente(String Nombre, String Cedula, String Direccion) {
        this.Nombre = Nombre;
        this.Cedula = Cedula;
        this.Direccion = Direccion;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getCedula() {
        return Cedula;
    }

    public String getDireccion() {
        return Direccion;
    }
  public static boolean validarCedula(String cedula) {
        return cedula.matches("[0-9]+");
    }
}
