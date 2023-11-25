/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validadordeclaracionvariable;

import java.util.regex.*;

public class ValidadorDeclaracionVariable {

    public static void main(String[] args) {
        // Ejemplos
        validarDeclaracionVariable("int variable = 10;");
        validarDeclaracionVariable("char contenido = \"a\";");
        validarDeclaracionVariable("double valor = 10.5;");
        validarDeclaracionVariable("int variable = \"Carlos\";");
        validarDeclaracionVariable("variable int = 10;");
        validarDeclaracionVariable("char contenido = \"nuevo elemento\";");
        validarDeclaracionVariable("double valor = \"nuevo\";");
    }

    public static void validarDeclaracionVariable(String cadena) {
        // Patrón para validar declaraciones de variables
        String patron = "\\s*(int|char|double)\\s+[a-zA-Z_]\\w*\\s*=\\s*(\\d+|\"[^\"]*\"|\\d+\\.\\d+)\\s*;\\s*";

        // Compilar el patrón
        Pattern pattern = Pattern.compile(patron);

        // Crear un objeto Matcher
        Matcher matcher = pattern.matcher(cadena);

        // Comprobación de coincidencia con el patrón
        if (matcher.matches()) {
            System.out.println("Valido");
        } else {
            System.out.println("No Valido");
        }
    }
}
