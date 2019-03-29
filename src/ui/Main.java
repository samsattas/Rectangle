package ui;
import model.*;
import java.util.Scanner;

public class Main{
	
	public static void main(String []args){
		Scanner s=new Scanner(System.in);
		Rectangle calc = new Rectangle(0,0);
		int i = 0;
		int i2 = 0;
		int select = 0;

		System.out.println("########   ***BIENVENIDO***   ########");

		while(i<1){

			System.out.println("Ingrese altura:");
			int h = s.nextInt();

			System.out.println("Ingrese longitud:");
			int l = s.nextInt();
			i2 = 0;

			while(i2<1){
				System.out.println("\n------------------------------------");
				System.out.println("Tamanio del rectangulo: " + h + "x" + l);
				System.out.println("Que desea hacer?");
				System.out.println("1) Calcular area");
				System.out.println("2) Calcular perimetro");
				System.out.println("3) Calcular diagonal");
				System.out.println("4) Cambiar de rectangulo");
				System.out.println("0) Salir");
				System.out.println("------------------------------------\n");

				select = s.nextInt();

				if(select == 1){
					System.out.println("Area: " + calc.cArea(h, l));
				}else if(select == 2){
					System.out.println("Perimetro: " + calc.cPerimeter(h, l));
				}else if(select == 3){
					System.out.println("Diagonal: " + calc.cDiagonal(h, l));
				}else if(select == 4){
					i2++;
				}else if(select == 0){
					i2++;
					i++;
				}else{
					System.out.println("OPCION IVALIDA, INGRESE DE NUEVO");
				}

				
			}

        	
    	}


	}
}