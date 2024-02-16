/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica_Negocio;

import java.util.ArrayList;

/**
 *
 * @author ANDRES
 */
public class Paciente {
    String Nombre;
    String Cedula;
    String Direccion;
    float Peso;
    
    public Paciente(){
        
    }

    public Paciente(String Nombre, String Cedula, String Direccion, float Peso) {
        this.Nombre = Nombre;
        this.Cedula = Cedula;
        this.Direccion = Direccion;
        this.Peso = Peso;
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

    public void setPeso(float Peso) {
        this.Peso = Peso;
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

    public float getPeso() {
        return Peso;
    }
    public static float CalcularPromedio(ArrayList<Paciente>listapacientes){
    float acomulador=0;
    float promedio=0;

    for (int i = 0; i < listapacientes.size(); i++) {
        acomulador+=listapacientes.get(i).getPeso();
    }
    promedio=acomulador/listapacientes.size();
    return promedio;
}

}  