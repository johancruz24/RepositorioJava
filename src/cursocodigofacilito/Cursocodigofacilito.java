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
       
       System.out.println("Solución para el ejercicio 4");
       consola();
       
       System.out.println("Solución para el ejercicio 5");
       consola2();
       
       System.out.println("Solución para el ejercicio 6");
       fibonacci();

       System.out.println("Solución para el ejercicio 7");
       primo();
       
       System.out.println("Solución para el ejercicio 8");
       multiplo();
       
       System.out.println("Solución para el ejercicio 9");
       factorial();
       
       System.out.println("Solución para el ejercicio 10");
       constante();
       

    }
    
private static void calificacion(){
    //Mostrar en consola el mensaje de "Aprobado" en caso la calificación de un
    //alumno sea mayor igual a 70,en caso contrario mostrar el mensaje "Reprobado".
    
    int nota = 60;
    
    if(nota > 70){
    
        System.out.println("Aprobado");
        
    }else{
    
        System.out.println("Reprobado");
    }
    
}

private static void orden(){
    //Dado 3 números enteros, mostrar en consola los números de forma ascendente,
    //de menor a mayor. Ejemplo Números = 9, 50, 4 Salida = 4, 9, 50
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
    //Imprimir en consola la tabla de multiplicar del número 9.
    int i;
    int resultado;
    for(i = 1 ;i < 10; i ++){
    
    resultado = 9 * i;
    
    System.out.println("9 * " +i+ "="+resultado);    
    
    }
}

private static void consola(){
    //Replicar la siguiente salida en consola.
    //*
    //**
    //***
    //****
    //*****
    
    String  mensaje ="*";
    for(int i = 1; i < 10 ;i ++){
    
        for(int j = 1; j < i;j ++){
        
        System.out.print(mensaje);
        }
        
        System.out.println("");
    }
    

}

private static void consola2(){
    //Replicar la siguiente salida en consola.
    //    *
    //   ***
    //  *****
    // *******
    //*********
    
    
    String  mensaje ="*";
    
    for (int i = 1; i < 10; i += 2) {
            for (int k = 0; k < (4 - i / 2); k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(mensaje);
        
              
           }
        
        System.out.println("");
    }    
}

private static void fibonacci(){
    //Imprimir en consola los primero diez números de la serie Fibonacci.
    
    int suma=1, num1=0, num2=1;
    for(int i = 1; i < 10; i++){

    
        System.out.print(suma+",");
        
        suma = num1 + num2;
        num1 = num2;
        num2 = suma;

    }
     System.out.println("");
}

private static void primo(){
    //Dado un número saber si este es primo o no.
    int num = 7, aux = 0;
    
    for(int i = 1; i < (num +1); i++){
    
        if(num % i == 0){
            
            aux++;
            
        }
    
    }
    
    if(aux != 2){
        
        System.out.println("El " +num+ " no es primo.");
    
    }else{
    
        System.out.println("El " +num+ " es primo.");
    }


}

private static void multiplo(){
    //Imprimir en consola todos los números múltiplos de 2. El ciclo finalizará
    //cuando el último múltiplo sea menor a 4570

    int multiplo = 2;
    
    
    for(int i = 1; i <= 4570; i++){
        
        if(i % multiplo == 0){
            
            System.out.println(i);
        
        }

}
    
}
    
private static void factorial(){
    //Dado un número entero obtener su factorial.
    
    int num = 8;
    int fact = 1;
    
    for(int i = num; i > 0; i--){
    
    fact =fact * i;  
    
    
    }
    
    System.out.println("El factorial para el número " +num+ " es " +fact);
    
    
}

private static void constante(){
    //Crear un programa el cual nos permita conocer el valor de la constante e
    float fact = 1;
    float e = 1;
    int valor = 10;

    for(int i = 1; i <= valor; i++){
      
         fact = 1;
         for(int j = 1; j <= i; j++){      
    
            fact =fact * j; 
            
         }
         e = e + (1/fact);      

    }
    
    System.out.println("El valor de la constante de e cuando n es " +valor+ " es igual a " +e);
   
    
    

}    

}
