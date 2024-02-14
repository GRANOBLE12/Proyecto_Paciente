/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica_Negocio;

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

    public static int RetornarCE(String Nombre) {
        int ce = 0;
        for (int j = 0; j < Nombre.length(); j++) {
            boolean flag = Character.isLetter(Nombre.charAt(j));
            if (!flag) {
                //System.out.println("'"+ nombre.charAt(j)+"' is a number");
                if (Nombre.charAt(j) == '@') {
                    ce++;
                }
                if (Nombre.charAt(j) == '~') {
                    ce++;
                }
                if (Nombre.charAt(j) == '/') {
                    ce++;
                }
                if (Nombre.charAt(j) == ';') {
                    ce++;
                }
                if (Nombre.charAt(j) == ':') {
                    ce++;
                }
                if (Nombre.charAt(j) == '"') {
                    ce++;
                }
                if (Nombre.charAt(j) == '!') {
                    ce++;
                }
                if (Nombre.charAt(j) == ' ') {
                    ce++;
                }
                if (Nombre.charAt(j) == 'º') {
                    ce++;
                }
                if (Nombre.charAt(j) == '-') {
                    ce++;
                }
                if (Nombre.charAt(j) == '¬') {
                    ce++;
                }
                if (Nombre.charAt(j) == '|') {
                    ce++;
                }
                if (Nombre.charAt(j) == '?') {
                    ce++;
                }
                if (Nombre.charAt(j) == '¿') {
                    ce++;
                }
                if (Nombre.charAt(j) == '&') {
                    ce++;
                }
                if (Nombre.charAt(j) == '%') {
                    ce++;
                }
                if (Nombre.charAt(j) == '$') {
                    ce++;
                }
                if (Nombre.charAt(j) == '.') {
                    ce++;
                }
                if (Nombre.charAt(j) == '#') {
                    ce++;
                }
                if (Nombre.charAt(j) == '_') {
                    ce++;
                }
                if (Nombre.charAt(j) == '*') {
                    ce++;
                }
                if (Nombre.charAt(j) == '<') {
                    ce++;
                }
                if (Nombre.charAt(j) == '>') {
                    ce++;
                }
                if (Nombre.charAt(j) == '€') {
                    ce++;
                }
                if (Nombre.charAt(j) == 'Ç') {
                    ce++;
                }
                if (Nombre.charAt(j) == '+') {
                    ce++;
                }
                if (Nombre.charAt(j) == '(') {
                    ce++;
                }
                if (Nombre.charAt(j) == ')') {
                    ce++;
                }
                if (Nombre.charAt(j) == '»') {
                    ce++;
                }
                if (Nombre.charAt(j) == '¥') {
                    ce++;
                }
                if (Nombre.charAt(j) == '«') {
                    ce++;
                }
                if (Nombre.charAt(j) == '¶') {
                    ce++;
                }
                if (Nombre.charAt(j) == '[') {
                    ce++;
                }
                if (Nombre.charAt(j) == ']') {
                    ce++;
                }
                if (Nombre.charAt(j) == '{') {
                    ce++;
                }
                if (Nombre.charAt(j) == '}') {
                    ce++;
                }
                if (Nombre.charAt(j) == '÷') {
                    ce++;
                }
                if (Nombre.charAt(j) == '=') {
                    ce++;
                }
                if (Nombre.charAt(j) == ',') {
                    ce++;
                }
            }
        }
        return ce;
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
}
