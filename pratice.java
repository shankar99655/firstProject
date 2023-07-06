package pack2;

import java.util.Scanner;

public class FindFirstNonRepetingChar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			System.out.println("enter the value");
			String value = sc.next();
			boolean val;
			for(int i = 0; i < value.length(); i++)
			{
				val = true;
				for(int j = 0; j < value.length(); j++)
				{
					if(i != j &&value.charAt(i) == value.charAt(j))
					{	
						val = false;
						break;
					}
				}
				if(val)
				{
					
					System.out.println(value.charAt(i) + " is the non repeating charactor");
					System.out.Println("The given input is String type only");
					break;
				}
			}
	}
}
