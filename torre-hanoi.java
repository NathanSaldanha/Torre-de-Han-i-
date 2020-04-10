import java.util.Scanner;
import java.lang.Math;

public class Main {
    
    public static void metodo(int num){
        int base = 2;
        double result = Math.pow(base, num)-1;
        System.out.println("towerHanoi("+num+") => "+(int)result);
    }

    public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Defina o número de discos: ");
		int x = sc.nextInt();
        metodo(x);
    }
}