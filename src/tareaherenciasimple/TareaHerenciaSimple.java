/*
 *Implemente un algoritmo que le permita relacionar
*la herencia simple
 */
package tareaherenciasimple;

/**
 *
 * @author LENIN ALEXANDER CARRILLO IMBAQUINGO
 */
class Herramienta{
 int calidad_taladro;
 int calidad_moladora;
    
    void  MostrarCalidad(){
        System.out.println("La calidad del taladro y moladora es :"
        +calidad_taladro+" % de Eficiencia" +
                "\n La calidad de taladro tiene:"+calidad_moladora+"% de eficiencia");
    }
}
// Herencia simple: Una subclase de Animal es gato
class Moladora extends Herramienta{
    String tipo;
     double CalcularCalidad(){
         return calidad_taladro-calidad_moladora;
     }
     void mostrarTipo(){
         System.out.println("El tipo de Herramienta es: "+tipo);
     }
}
// Herencia simple: Una subclase de animal es perro
class Taladro extends Herramienta{
    String tipo;
    
    double CalcularCalidad(){
        return calidad_taladro-calidad_moladora;
    }
    void mostrarTipo(){
        System.out.println("El tipo de Herramienta es:"+ tipo);
     }
}
  public class TareaHerenciaSimple {
      
     public static void main(String[]args){
                 System.out.println("       UNIVERDIDAD DE LAS FUERZAS ARMADAS ");
        System.out.println("                ESPE-L            ");
        System.out.println("             PROGRAMACION");
        System.out.println("ALUMNO: LENIN ALEXANDER CARRILLO IMBAQUINGO ");
        System.out.println("DOCENTE: ING LUIS GUERRA");
 
         Moladora moladora1=new Moladora();
         Taladro taladro1=new Taladro();
         
         moladora1.calidad_taladro=86;
         moladora1.calidad_moladora=74;
         moladora1.tipo="Moladora BOCH";
         
         taladro1.calidad_taladro=48;
         taladro1.calidad_moladora=20;
         taladro1.tipo="Taladro Daewoo";
         System.out.println("\n Información para Moladora:");
     moladora1.mostrarTipo();
     moladora1.MostrarCalidad();
     System.out.println("La calidad de la moladora es : "+moladora1.CalcularCalidad()+"% de Eficiencia");
     System.out.println();
     
     System.out.println("Informacion para Taladro:");
     taladro1.mostrarTipo();
     taladro1.MostrarCalidad();
     System.out.println("La calidad del taladro es : "+ taladro1.CalcularCalidad()+"% de Eficiencia");
     }   
 }
