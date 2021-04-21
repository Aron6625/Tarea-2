import java.util.Scanner;
public class Ecuacion2dogrado {
    public static void main (String arg[]){
    
    Scanner scanner = new Scanner (System.in);
    
    System.out.print ("Ingrese el valor de a: ");
    int a = scanner.nextInt();
    System.out.print ("Ingrese el valor de b: ");
    int b = scanner.nextInt();
    System.out.print ("Ingrese el valor de c: ");
    int c = scanner.nextInt();
    
    double x1, x2, d;
    
    d = b*b -4*a*c;
    
    if (d < 0)
        System.out.println ("ERROR");
    
    else if (d > 0){
        x1 = (-b + Math.sqrt(d)) / (2*a);
        x2 = (-b - Math.sqrt(d)) / (2*a);
        
        System.out.println ("Las raices son: " + x1 + "," + x2);
    
    }
    else {
        x1 = b / (2*a);
        System.out.println ("Las raices son iguales: " + x1); }
    
    }    
    }
