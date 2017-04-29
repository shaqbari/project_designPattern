package dp11_decoratorPattern_abst;

import java.util.Scanner;

import com.sun.java.swing.plaf.windows.resources.windows;

import dp11_decoratorPattern_conc.Base;
import dp11_decoratorPattern_conc.Espresso;
import dp11_decoratorPattern_conc.Milk;

public class Main {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		IBeverage beverage=new Base();
		boolean done=false;
		while (!done) {
			System.out.println("�������簡�� :"+beverage.getTotalPrice());
			System.out.println("���� : 1:�� �߰� / 2:���� �߰�");
			switch (sc.nextInt()) {
			case 0: done=true;				
				break;
			case 1: beverage=new Espresso(beverage);
				break;
			case 2: beverage=new Milk(beverage);
				break;
			}
			
		}
		
		System.out.println("�� ���� ����: "+beverage.getTotalPrice());
		sc.close();
		
	}
}
