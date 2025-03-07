
package tareas1;

public class DatosCompañeros {
    public static void main(String[] args){
        String[][] compañeros = {
            {"Jose", "Carlos", "Mecatronica", "Promaco"},
            {"Lisbeth", "Cerrato", "Industrial", "Farmasem"},
            {"Karina", "Galo", "Electronica", "Alutech"},
            {"Ivan", "Maradiaga", "Computacion", "Banco Atlantida"},
            {"Ingrid", "Rendon", "Administracion", "banPais"}   
        };
        
        System.out.println("Datos de los compañeros de clase:");
        System.out.println("--------------------------------------");
        for (int i = 0; i < compañeros.length; i++) {
           System.out.println("Nombre: " + compañeros[i][0]);
           System.out.println("Apellido: " + compañeros[i][1]);
           System.out.println("Carrera: " + compañeros[i][2]);
           System.out.println("Lugar de Trabajo: " + compañeros[i][3]);
           System.out.println("-------------------------------------");
                                                      
        }
    }
    
}
