
package tareas1;

public class arreglo10 {
    public static void main(String[] args) {
        String[] compañeros = {
            "Lisbeth", "Diana", "Jose", "karina", "Norlin","Omar", "Melvin", "Sofia", "Styben", "Jonathan"
        };
        
        System.out.println("Lista de compañeros de clase:" );
        for (int i = 0; i < compañeros.length; i++){
         System.out.println((i + 1)+ "." + compañeros[i]);    
        }
    }
        
}
