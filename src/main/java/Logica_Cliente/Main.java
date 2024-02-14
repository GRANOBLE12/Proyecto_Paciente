/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Logica_Cliente;

import Logica_Negocio.Paciente;
import java.util.ArrayList;
import java.util.Scanner;
import static Logica_Negocio.Helper.RetornarCE;
import static Logica_Negocio.Helper.RetornarValor;
import static Logica_Negocio.Helper.RetornarCEPD;
import static Logica_Negocio.Paciente.validarCedula;
import java.util.InputMismatchException;
/**
 *
 * @author ANDRES
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String Nombre="";
        String Cedula="";
        String Direccion="";
        int cantidad=0;
        int retorno=0;
        int retornoce=0;
        int retornocepd=0;
        
        Paciente objpaciente=new Paciente();
        Scanner scan = new Scanner (System.in);
                
        ArrayList < Paciente> listapacientes= new ArrayList<>();
        do {
    try {
        System.out.println("Cuantos pacientes desea ingresar");
        cantidad = scan.nextInt();
        if (cantidad <= 0) {
            System.out.println("La cantidad debe ser un número entero positivo.");
        }
    } catch (InputMismatchException e) {
        System.out.println("Por favor, ingrese un número entero.");
        scan.nextLine();
    }
} while (cantidad <= 0);
        scan.nextLine(); 
        for (int i = 0; i < cantidad; i++) {
            retorno = RetornarValor(Nombre);
            retornoce=RetornarCE(Nombre);
            while(retorno!=0||retornoce!=0||Nombre.equals("")) {
                System.out.println("Digite el nombre del paciente");
                Nombre=scan.nextLine().trim();
                retorno = RetornarValor(Nombre);
                retornoce=RetornarCE(Nombre);
            }
            
            while(Cedula.equals("")||!validarCedula(Cedula)){   
                System.out.println("Digite el numero de cedula del paciente");
                Cedula=scan.nextLine().trim();
                validarCedula(Cedula);
            }
            
            retornocepd=RetornarCEPD(Direccion);
            while(Direccion.equals("")||retornocepd!=0){
                System.out.println("Digite la direccion del paciente");
                Direccion=scan.nextLine().trim();
                retornocepd=RetornarCEPD(Direccion);
            }  
                        
                objpaciente=new Paciente(Nombre, Cedula, Direccion);
                listapacientes.add(objpaciente);
        }
        for(int i = 0; i < listapacientes.size(); i++){
            System.out.println("El nombre del paciente es: "+"\t"+listapacientes.get(i).getNombre()+"\n"
            +"La cedula del paciente es: "+"\t"+listapacientes.get(i).getCedula()+"\n"
            +"La direccion del paciente es: "+"\t"+listapacientes.get(i).getDireccion());
            System.out.println("");
        }       
    }
}
