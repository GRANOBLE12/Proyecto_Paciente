/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Logica_Cliente;

import Logica_Negocio.Paciente;
import java.util.ArrayList;
import java.util.Scanner;
import static Logica_Negocio.Helper.RetornarCEv2;
import static Logica_Negocio.Helper.RetornarCEPD;
import static Logica_Negocio.Helper.validarCedula;
import static Logica_Negocio.Helper.RetornarValor;
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
        String Nombre = "";
        String Cedula = "";
        String Direccion = "";
        float Peso = 0;
        int cantidad = 0;
        int retorno = 0;
        int retornoce = 0;
        int retornocepd = 0;
        int retornov = 0;
        int opcion = 0;

        Paciente objpaciente = new Paciente();
        Scanner scan = new Scanner(System.in);

        ArrayList< Paciente> listapacientes = new ArrayList<>();
        do {
            System.out.println("1.Registrar pacientes");
            System.out.println("2.Listar pacientes");
            System.out.println("3. Calcular el promedio de peso");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scan.nextInt();

            switch (opcion) {
                case 1:
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
                        Nombre = "";
                        Cedula = "";
                        Direccion = "";

                        retornov = RetornarValor(Nombre);
                        retornoce = RetornarCEv2(Nombre);
                        while (retornov != 0 || retornoce != 0 || Nombre.equals("")) {
                            System.out.println("Digite el nombre del paciente");
                            Nombre = scan.nextLine().trim();
                            retornov = RetornarValor(Nombre);
                            retornoce = RetornarCEv2(Nombre);
                        }

                        while (Cedula.equals("") || !validarCedula(Cedula)) {
                            System.out.println("Digite el numero de cedula del paciente");
                            Cedula = scan.nextLine().trim();
                            validarCedula(Cedula);
                        }

                        retornocepd = RetornarCEPD(Direccion);
                        while (Direccion.equals("") || retornocepd != 0) {
                            System.out.println("Digite la direccion del paciente");
                            Direccion = scan.nextLine().trim();
                            retornocepd = RetornarCEPD(Direccion);
                        }

                        while (Peso < 0) {
                            System.out.println("Digite el peso del paciente");
                            Peso = scan.nextFloat();
                        }

                        objpaciente = new Paciente(Nombre, Cedula, Direccion, Peso);
                        listapacientes.add(objpaciente);
                    }
                    break;
                case 2:
                    for (int i = 0; i < listapacientes.size(); i++) {
                        System.out.println("El nombre del paciente es: " + "\t" + listapacientes.get(i).getNombre() + "\n"
                                + "La cedula del paciente es: " + "\t" + listapacientes.get(i).getCedula() + "\n"
                                + "La direccion del paciente es: " + "\t" + listapacientes.get(i).getDireccion());
                        System.out.println("");
                    }
                    break;
                case 3:
                    float promedio = Paciente.CalcularPromedio(listapacientes);
                    System.out.println("El promedio de los pacientes es " + promedio);
                    break;
                case 4:
                    System.out.println("Saliendo del programa");
                    break;

                default:
                    System.out.println("Opción no válida");
            }
        } while (opcion != 4);
    }
}
