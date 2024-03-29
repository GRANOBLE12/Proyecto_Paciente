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
public class Helper {

    public static int RetornarValor(String Nombre) {
        int letra = 0;
        int numero = 0;

        for (int i = 0; i < Nombre.length(); i++) {
            boolean bandera = Character.isDigit(Nombre.charAt(i));
            if (bandera) {
                numero++;
            } else {
                letra++;
            }
        }
        return numero;
    }
    public static int RetornarCEPD(String Direccion) {
        int ce = 0;
        for (int j = 0; j < Direccion.length(); j++) {
            boolean flag = Character.isLetter(Direccion.charAt(j));
            if (!flag) {
                //System.out.println("'"+ nombre.charAt(j)+"' is a number");
                if (Direccion.charAt(j) == '@') {
                    ce++;
                }
                if (Direccion.charAt(j) == '~') {
                    ce++;
                }
                if (Direccion.charAt(j) == '/') {
                    ce++;
                }
                if (Direccion.charAt(j) == ';') {
                    ce++;
                }
                if (Direccion.charAt(j) == ':') {
                    ce++;
                }
                if (Direccion.charAt(j) == '"') {
                    ce++;
                }
                if (Direccion.charAt(j) == '!') {
                    ce++;
                }
                if (Direccion.charAt(j) == 'º') {
                    ce++;
                }
                if (Direccion.charAt(j) == '¬') {
                    ce++;
                }
                if (Direccion.charAt(j) == '|') {
                    ce++;
                }
                if (Direccion.charAt(j) == '?') {
                    ce++;
                }
                if (Direccion.charAt(j) == '¿') {
                    ce++;
                }
                if (Direccion.charAt(j) == '&') {
                    ce++;
                }
                if (Direccion.charAt(j) == '%') {
                    ce++;
                }
                if (Direccion.charAt(j) == '$') {
                    ce++;
                }
                if (Direccion.charAt(j) == '.') {
                    ce++;
                }
                if (Direccion.charAt(j) == '_') {
                    ce++;
                }
                if (Direccion.charAt(j) == '*') {
                    ce++;
                }
                if (Direccion.charAt(j) == '<') {
                    ce++;
                }
                if (Direccion.charAt(j) == '>') {
                    ce++;
                }
                if (Direccion.charAt(j) == '€') {
                    ce++;
                }
                if (Direccion.charAt(j) == 'Ç') {
                    ce++;
                }
                if (Direccion.charAt(j) == '+') {
                    ce++;
                }
                if (Direccion.charAt(j) == '(') {
                    ce++;
                }
                if (Direccion.charAt(j) == ')') {
                    ce++;
                }
                if (Direccion.charAt(j) == '»') {
                    ce++;
                }
                if (Direccion.charAt(j) == '¥') {
                    ce++;
                }
                if (Direccion.charAt(j) == '«') {
                    ce++;
                }
                if (Direccion.charAt(j) == '¶') {
                    ce++;
                }
                if (Direccion.charAt(j) == '[') {
                    ce++;
                }
                if (Direccion.charAt(j) == ']') {
                    ce++;
                }
                if (Direccion.charAt(j) == '{') {
                    ce++;
                }
                if (Direccion.charAt(j) == '}') {
                    ce++;
                }
                if (Direccion.charAt(j) == '÷') {
                    ce++;
                }
                if (Direccion.charAt(j) == '=') {
                    ce++;
                }
                if (Direccion.charAt(j) == ',') {
                    ce++;
                }
            }
        }
        return ce;
    }

    public static int RetornarCEv2(String Nombre) {
        int ce = 0;
        ArrayList<Character> iscaracter = new ArrayList<>();
        iscaracter.add('@');
        iscaracter.add('[');
        iscaracter.add('}');
        iscaracter.add('{');
        iscaracter.add(';');
        iscaracter.add('*');
        iscaracter.add('?');
        iscaracter.add('¡');
        iscaracter.add('¿');
        iscaracter.add('/');
        for (int j = 0; j < Nombre.length(); j++) {
            boolean flag = Character.isLetter(Nombre.charAt(j));
            if (!flag) {
                for (int i = 0; i < iscaracter.size(); i++) {
                    if (iscaracter.get(i).compareTo(Nombre.charAt(j)) == 0) {
                        ce++;
                    }
                }
            }
        }
        return ce;
    }
public static boolean validarCedula(String cedula) {
        return cedula.matches("[0-9]+");
    }

}     
