package satsun2;

import java.util.Scanner;
public class operators {
	
	public static void main(String []args) {
		
		
		//binary operators  => uses 2 operands
		
		//&& || operands 2
		
		//left && right
		//left and right should boolean operands
		
//		true && true => true
//	    false && false => false
//	    true && false => false
//	    false && true => false
		
//	    (false && true)&&(false && true)
//	    =>(false)&&(false) =>false
		
		
//		left || right
//		true || true => true
//		true || false =>true
//		false ||true => true
//		false ||false => false
		
		boolean rain =true;
		boolean umbrella =false;
		boolean raincoat =false ;
		
		
		
		
//		
//		//if rain pours then either i should have umbrella or raincoat
//		
		//System.out.println(!rain||(rain&&umbrella) ||(rain&&raincoat));
		
		//expressions are something that can be evaluated to give back a single result;
		int num= 2+4+4+34;
		boolean bool = false && true||false&&true&&true;
		
		//if wants a boolean expression
//		if(!rain||(rain&&umbrella) ||(rain&&raincoat)) {
//			System.out.println("you can go out");
//			
//		}
//		else {
//			System.out.println("you cannot go out");
//		}
		
		//nested if-else
		
//		if(rain==true) {
//			if(umbrella==true) {
//				System.out.println("you can go out with an umbrella");
//			}
//			else {
//				if(raincoat==true) {
//					System.out.println("you can go out with a raincoat");
//				}
//				else{
//					
//					System.out.println("you cannot go out");
//				}
//			}
//		}
//		else {
//			System.out.println("you can go out as it is not rainnig");
//		}
		
		//if -elseif -else
		
//		if(rain==false) {
//			System.out.println("you can go out");
//		}
//		else if(rain==true && umbrella==true) {
//			System.out.println("you can go out");
//		}
//		else if(rain ==true && raincoat==true) {
//			System.out.println("you can go out");
//		}
//		else {
//			System.out.println("you can not go out");
//		}
		
		Scanner sc= new Scanner(System.in);
		
		int week=sc.nextInt();		
		if(week==1) {
			System.out.println("Sunday");
		}
		else if(week==2) {
			System.out.println("Monday");
		}
		else if(week==3) {
			System.out.println("TuesDay");
		}
		else if(week==4) {
			System.out.println("Wednesday");
			
		}
		
		if(week==4)
			System.out.println("hey this is number 4");
		
		
//		int a=80;
//		int b=80;
//		// >, <,  ==, >=, <= ,!=
//		
//		boolean result1 = a<=b;
//		System.out.println(result1);
		
	}
}
