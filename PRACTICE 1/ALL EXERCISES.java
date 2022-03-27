import java.util.InputMismatchException;
import java.util.Scanner;

public class TrabajoPractico1 {

    public static void main(String[] args) {
        
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion1,opcion2;
        
        do{
            System.out.println("Que desea hacer?");
            System.out.println("1. Resolver un problema");
            System.out.println("2. Salir");       
            try{
                System.out.print("Escriba una de las opciones: ");
                opcion1 = sn.nextInt();
                
                switch (opcion1){
                      case 1:
                          
                       System.out.println("¿Que ejercicio desea abrir?");
                       System.out.println("1 - 2 - 3 - 4 - 5 - 6 - 7 - 8 - 9 - 10 - 11 - 12 - 13 - 14");
                try{
                    System.out.print("Por favor ingrese por teclado una de las opciones: ");
                    opcion2 = sn.nextInt();

                    switch (opcion2) {
                        case 1:
                            System.out.println("Ingrese 3 numeros para hacer la suma de ellos");
                            problema1();
                            break;
                        case 2:
                            System.out.println("Ingrese 2 numeros para sacar el promedio de ellos");
                            problema2();
                            break;
                        case 3:
                            System.out.println("Ingrese 2 numeros para hacer la media geometrica");
                            problema3();
                            break;
                        case 4:
                            System.out.println("Ingrese una medida en metros para devolver la misma medida en decimetros y centrimetros");
                            problema4();
                            break;
                        case 5:
                            System.out.println("Ingrese una temperatura en grados Farenheit para devolverla en Centígrados");
                            problema5();
                            break;
                        case 6:
                            System.out.println("Ingresar los lados de un rectangulo para sacar su perimetro y superficie");
                            problema6();
                            break;
                        case 7:
                            System.out.println("Ingresar el radio de un circulo para sacar el diametro, perimetro y el area");
                            problema7();
                            break;
                        case 8:
                            System.out.println("Ingresar el precio de un producto para sacar el impuesto que hay que parar por el IVA, Ingreso Brustos y Impuesto municipal");
                            problema8();
                            break;
                        case 9:
                            System.out.println("Ingresar dos puntos en el plano x e y que correspondan respectivamente, a los vértices inferior izquierdo y superior derecho de un rectángulo");
                            problema9();
                            break;
                        case 10:
                            System.out.println();
                            problema10();
                            break;
                        case 11:
                            System.out.println();
                            problema11();
                            break;
                        case 12:
                            System.out.println();
                            problema12();
                            break;
                        case 13:
                            System.out.println();
                            problema13();
                            break;
                        case 14:
                            System.out.println();
                            problema14();
                            break;
                        default:
                            System.out.println("Solo numeros del 1 al 14");
                        }
                    } 
                    catch (InputMismatchException e) {
                    System.out.println("Debes insertar un número");
                    sn.next();
                    }break;
            
                    case 2:
                        salir = true;
                        break;
                      default:
                        System.out.println("Solo el 1 o el 2");
                    }
                } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();
              }
              
            }while (!salir);
    }
public static void problema1(){
    Scanner entrada = new Scanner(System.in);
    int a,b,c,suma=0;
    
    System.out.print("Ingrese el primer valor: ");
    a = entrada.nextInt();
    System.out.print("Ingrese el segundo valor: ");
    b = entrada.nextInt();
    System.out.print("Ingrese el tercer valor: ");
    c = entrada.nextInt();
    
    suma = a + b + c;
    
    System.out.println("La suma de los numeros es: "+suma);
 }
public static void problema2(){
    Scanner entrada = new Scanner(System.in);
    int a, b, suma=0; 
    float promedio; 

    System.out.println("Ingrese dos números enteros para calcular su promedio");
    System.out.print("Ingrese el primer valor: ");
    a = entrada.nextInt();
    System.out.print("Ingrese el segundo valor: ");
    b = entrada.nextInt();

    suma = a + b;
    promedio = (float) suma / 2;

    System.out.println("El promedio de los dos numeros es: " + promedio);
 }
public static void problema3(){
    Scanner entrada = new Scanner(System.in);
    int a,b;
    double media;
    
    System.out.println("Ingrese dos números para calcular su media geométrica:");
    
    System.out.print("Ingrese el primer valor: ");
    a = entrada.nextInt();
    System.out.print("Ingrese el segundo valor: ");
    b = entrada.nextInt();

    media = Math.sqrt(a*b);

    System.out.println("La media geométrica de los dos numeros es: " + media);
 }
public static void problema4(){
    Scanner entrada = new Scanner(System.in);
    float m, dm, cm;
    
    System.out.print("Ingrese su medida en metros: ");
    m = entrada.nextFloat();
    dm = m*10;
    cm = m*100;
    
    System.out.println("Medidas: ");
    System.out.println(m + " m");
    System.out.println(dm + " dm");
    System.out.println(cm + " cm");
 }
public static void problema5(){
    Scanner entrada = new Scanner(System.in);
    float f, c;
    
    System.out.print("Ingrese una temperatura en Fahrenheit: ");
    f = entrada.nextFloat();
    c = (((float)5/9)*(f-32));
    
    System.out.println("Temperatura en Fahrenheit: " + f + " ºF");
    System.out.printf("Temperatura en Celsius: %.2f ºC", c);
 }
public static void problema6(){
    Scanner entrada = new Scanner(System.in);
    int a,b;
    float perimetro,superficie;
    
    System.out.print("Ingrese la base del rectángulo: ");
    b = entrada.nextInt();
    System.out.print("Ingrese la altura del rectángulo: ");
    a = entrada.nextInt();
    
    if(a>0 && b>0) {

      perimetro = (a*2)+(b*2);
      superficie = a*b;
      System.out.println("El perimetro del rectangulo es: "+ perimetro);
      System.out.println("La superfice del rectangulo es: "+ superficie);
    }
    else {
      System.out.println("Error. Ingrese medidas válidas");
    }
 }
public static void problema7(){
    Scanner entrada = new Scanner(System.in);
    final float PI = (float) 3.1416;
    float radio, diametro, perimetro, area;
    
    System.out.print("Ingrese el radio del círculo: ");
    radio = entrada.nextFloat();
    diametro = 2*radio;
    perimetro = PI * diametro;
    area = PI * radio * radio;

    System.out.println("El diametro del ciruclo es: " + diametro);
    System.out.println("El perimetro del circulo es: " + perimetro);
    System.out.println("El area del circulo es: " + area);
 }
public static void problema8(){
    Scanner entrada = new Scanner(System.in);
    float precio, iva, bru, muni, total;

    System.out.println("Ingrese el precio del producto por favor:");
    precio = entrada.nextFloat();

    iva=precio*(float)0.21;
    bru=precio*(float)0.025;
    muni=precio*(float)0.015;
    total=iva+bru+muni;

    System.out.println("Total de impuestos a pagar: $"+total);
    System.out.println("IVA: $"+iva);
    System.out.println("Ingresos Brutos: $"+bru);
    System.out.println("Impuesto Municipal: $"+muni);   
}
public static void problema9(){
   Scanner entrada = new Scanner(System.in);
    int x_1,y_1,x_2,y_2,lado_1,lado_2,perimetro,superficie;

    System.out.println("Ingrese las coordenadas del primer punto");
    System.out.print("X1 = ");
    x_1 = (int) entrada.nextFloat();
    System.out.print("Y1 = ");
    y_1 = (int) entrada.nextFloat();

    System.out.println("Ingrese las coordenadas del segundo punto");
    System.out.print("X2 = ");
    x_2 = (int) entrada.nextFloat();
    System.out.print("Y2 = ");
    y_2 = (int) entrada.nextFloat();

    lado_1=Math.abs(x_2-x_1);
    lado_2=Math.abs(y_2-y_1);
    perimetro = lado_1*2+lado_2*2;
    superficie = lado_1*lado_2;

    if (perimetro!=0 && superficie!=0)
    {
      System.out.println("La superficie del rectangulo es: " + superficie);
      System.out.println("El perimetro del rectangulo es: " + perimetro);    
    }
    else{
      System.out.println("Los valores ingresados no forman un rectángulo.");
    }
  }
public static void problema10(){
     Scanner entrada = new Scanner(System.in);
     float a, b, c, d, e, f, x, y, t;

     System.out.println("Ingrese los términos de la primera ecuación lineal: ");
     System.out.print("a = ");
     a = entrada.nextFloat();
     System.out.print("b = ");
     b = entrada.nextFloat();
     System.out.print("c = ");
     c = entrada.nextFloat();
     System.out.println("Ingrese los términos de la segunda ecuación lineal: ");
     System.out.print("d = ");
     d = entrada.nextFloat();
     System.out.print("e = ");
     e = entrada.nextFloat();
     System.out.print("f = ");
     f = entrada.nextFloat();

     if(a*e-b*d != 0)
     {
       x = (c*e-b*f)/(a*e-b*d);
       y = (f*a-c*d)/(a*e-b*d);
       System.out.println("La solución al sistema es x = "+x+" e y = "+y);
     }
     else
     {
       t=d/a;
       if(t*c == f)
       {
         System.out.println("El sistema tiene infinitas soluciones.");
       }
       else
       {
         System.out.println("El sistema no tiene soluciones.");
       }
     }
}
public static void problema11(){
    Scanner entrada = new Scanner(System.in);
    int a, b, c;
    System.out.println("Ingrese el valor del primer lado del triángulo: ");
    a = entrada.nextInt();
    System.out.println("Ingrese el valor del segundo lado del triángulo: ");
    b = entrada.nextInt();
    System.out.println("Ingrese el valor del tercer lado del triángulo: ");
    c = entrada.nextInt();

    if (a > 0 && b > 0 && c > 0) {
      if (a*a==b*b+c*c || b*b==a*a+c*c || c*c==a*a+b*b) {
        System.out.println("Los lados forman parte de un triángulo rectángulo.");
      } else {
          System.out.println("Los lados no forman parte de un triángulo rectángulo.");
      }
    }
}
public static void problema12(){
     Scanner entrada = new Scanner(System.in);

     int dia_Actual, mes_Actual, ano_Actual, dia_Nacimiento, mes_Nacimiento, ano_Nacimiento, dias, meses, anos;

     System.out.println("Ingrese el ano actual: ");
     ano_Actual = entrada.nextInt();
     System.out.println("Ingrese el mes actual: ");
     mes_Actual = entrada.nextInt(); 
     System.out.println("Ingrese el dia actual: ");
     dia_Actual = entrada.nextInt();

     System.out.println("Ingrese su ano de nacimiento: ");
     ano_Nacimiento = entrada.nextInt();
     System.out.println("Ingrese su mes de nacimiento: ");
     mes_Nacimiento = entrada.nextInt();
     System.out.println("Ingrese su dia de nacimiento: ");
     dia_Nacimiento = entrada.nextInt();

     anos = ano_Actual - ano_Nacimiento;

     if(mes_Nacimiento>mes_Actual) {
       anos--;
       meses = 12 - (mes_Nacimiento - mes_Actual);
     }
     else {
       meses = mes_Actual - mes_Nacimiento;
     }

     if (dia_Nacimiento > dia_Actual) {
       meses--;
       dias = 30 - (dia_Nacimiento - dia_Actual);
     }
     else {
       dias = dia_Actual - dia_Nacimiento;
     }

     System.out.println("Usted tiene " + anos + " anos, " + meses + " meses y " + dias + " días.");
}
public static void problema13(){
     Scanner entrada = new Scanner(System.in);

     int a, b, c;

     System.out.println("Ingrese un valor:");
     a = entrada.nextInt();
     System.out.println("Ingrese un segundo valor:");
     b = entrada.nextInt();
     System.out.println("Ingrese un tercer valor:");
     c = entrada.nextInt();

     if (a+1==b && b+1==c) {
       System.out.println("Los numeros son consecutivos");
     }

     else if (a>b && b>c && c<a) {
        System.out.println("Estan ordenados de forma descendente");
     }
     else if (a<b && b<c && c>a) {
        System.out.println("Estan ordenados de forma ascendente");
     }
     else if (a==b && b==c){
       System.out.println("Los numeros son iguales");
     }
     else{
       System.out.println("Los numeros no estan ordenados de ninguna manera");
     }
}
public static void problema14(){
    Scanner entrada = new Scanner(System.in);
    int a, b, c;
    System.out.println("Ingrese el primer número: ");
    a = entrada.nextInt();
    System.out.println("Ingrese el segundo número: ");
    b = entrada.nextInt();
    System.out.println("Ingrese el tercer número: ");
    c = entrada.nextInt();

    if (a==b && b==c) {
      System.out.println("Los números ingresados son iguales.");
    } else {
      if (a > b) {
        if (b > c) {
          System.out.println(c + ", " + b + ", " + a + ".");
        } else {
          if (a > c) {
            System.out.println(b + ", " + c + ", " + a + ".");
          } else {
            System.out.println(b + ", " + a + ", " + c + ".");
          }
        }
      } else {
        if (a > c) {
          System.out.println(c + ", " + a + ", " + b + ".");
        } else {
          if (b > c) {
            System.out.println(a + ", " + c + ", " + b + ".");
          } else {
            System.out.println(a + ", " + b + ", " + c + ".");
          }
        }
      }
    }
}
}
