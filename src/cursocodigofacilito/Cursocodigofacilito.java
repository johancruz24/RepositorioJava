/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursocodigofacilito;

/**
 *
 * @author CruzArdila
 */
public class Cursocodigofacilito {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Solución para el ejercicio 1");
        calificacion();
        // TODO code application logic here
       System.out.println("Solución para el ejercicio 2");
       orden();
       
       System.out.println("Solución para el ejercicio 3");
       tabla();
    }
    
public static void calificacion(){
    
    int nota = 60;
    
    if(nota > 70){
    
        System.out.println("Aprobado");
        
    }else{
    
        System.out.println("Reprobado");
    }
    
}

public static void orden(){

    int num1 = 9, num2 = 50, num3 = 4;
    int mayor=0, menor=0, medio=0;
    
    if(num1 > num2 && num1 > num3){
    
        mayor=num1;
       
    }else if(num2>num1 && num2>num3){
    
        mayor=num2;
    
    }else{
    
        mayor=num3;
    }

    if(num1 < num2 && num1<num3){
    
        menor=num1;
        
    }else if(num2 < num1 && num2 < num3){
    
        menor=num2;
    }else{
    
        menor=num3;
    }
    
    medio = (num1+num2+num3)-(mayor+menor);
    System.out.println(menor+"," +medio+ ","+mayor);
    
}

private static void tabla(){

    int i;
    int resultado;
    for(i = 1 ;i < 10; i ++){
    
    resultado = 9 * i;
    
    System.out.println("9 * " +i+ "="+resultado);    
    
    }
}
}
