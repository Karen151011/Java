import java.util.Scanner;
class Promedio{
    public static void main (String args[]){
	String nombre;
  	double cal1,cal2,cal3,cal4,promedio;
    	char grupo;
    	int edad;
    	boolean aprobo;
      //crear variable de clase en eset caso lo haremos con scaner }
      Scanner entrada;
      entrada = new Scanner(System.in);



  	//ASIGNO VALOR A LA VARIBLE nota cuando pones un numero debes matar el espacio con un netx line 
    System.out.println("Ingresa el nombre del alumno");
  	nombre= entrada.nextLine();
    nombre= nombre.toUpperCase();
    System.out.println("Igresa la calificacion 1 de " +nombre);
  	cal1= entrada.nextDouble();
    entrada.nextLine();
    System.out.println("Igresa la calificacion 2 de " +nombre);
  	cal2= entrada.nextDouble();
    System.out.println("Igresa la calificacion 3 de " +nombre);
    entrada.nextLine();
  	cal3= entrada.nextDouble();
    System.out.println("Igresa la calificacion 4 de " +nombre);
    entrada.nextLine();
  	cal4= entrada.nextDouble();
    entrada.nextLine();
    	promedio=(cal1+cal2+cal3+cal4)/ 4;
      System.out.println("Ingresa el grupo de " +nombre);
        grupo= entrada.next().charAt(0);
        System.out.println("Ingresa la edad de" +nombre);
        edad=entrada.nextInt();
    	aprobo=promedio>6;

  	System.out.println("Datos del alumno: \n--------------------------------------------\nNombre    Edad     grupo    Promedio    Aprobado\n -----------------------------------------\n" + nombre + "        " + edad + "        "+ grupo+ "        " +promedio+ "        "+aprobo);
    
	

       //si el alunmno tiene una edad menos de 10 y su promedio mayor a 9 tiene beca al 100

        boolean beca100 =edad<= 10 && promedio >=9;
        System.out.println("Beca al 100%: "+beca100);


     // si tiene una edad menor a 10 o su promedio es mayor a 9 tiene beca al 50
        boolean beca50= edad <10|| promedio <9;
        System.out.println(beca50);

        System.out.println("Datos sobre la beca del alunmo:  \n-----------------------------------\nBeca al 100%    Beca al 50%\n-----------------------------------\n" +beca100 +"          "+beca50);

    //con 20 horas de asistencia 1 punto 15 horas son .5 y si es 10 es .3
    int asistencia;
    System.out.println("Ingresa las horas de asistencia de " + nombre);
    asistencia = entrada.nextInt();
    entrada.nextLine();
    if(asistencia == 20){
      promedio +=1;
    } else if(promedio < 20 && promedio >=15){
      promedio +=.5;
    }else if(promedio == 10 && promedio < 15){
      promedio += .3;
    }
    
    System.out.println("Promedio con puntos extra por asistencia: " +promedio);
    

    //si tiene un resporte le quitaremos un punto al promedio



    boolean reporte =true;
    System.out.println(nombre+ "Tiene reporte de conducta \n1. SI\n2. NO");
    int reportado;
    reportado = entrada.nextInt();
    entrada.nextLine();

    if(reportado == 1){
      reporte=true;
      --promedio;
    }

    
    System.out.println("Promedio con reporte incluido: "+promedio);
    
    
   //clase Math redondear 

     //usaremos el metodo round
    System.out.println("Promedio con round: "+Math.round(promedio));

   //usareos el metodo floor System.out.println("Promedio con floor:" +Math.floor(promedio));
    //usaremos el metodo ceil  System.out.println("Promedio con ceil: " +Math.ceil(promedio));

    System.out.println("Ingresa el nombre del profesor");
    String profesor = entrada.nextLine();
    System.out.println(profesor);









  


}

}