
package tareas1;


public class EvaluarEstudiante {
    public static void main (String[] args) {
        
        String nombre = "Lisbeth";
        int nota = 100;
        
        if (nota >=70){
            System.out.println(nombre);
            System.out.println(nota);
            System.out.println("Aprobado");            
        } else {
            System.out.println(nombre);
            System.out.println(nota);
            System.out.println("Reprobado");
        }
    }
    
}
