/**
* Calculate Класс для вычисления арифметических операций + - * / ^
* @author vladikgadik
* @since 14.08.2016
* @versoin 1
*/

public class Calculate{
		public static void main(String[] arg){
			System.out.println("Calculate...");
			double first = Integer.valueOf(arg[0]);
			double second = Integer.valueOf(arg[1]);

			System.out.println(String.format("%s + %s = %s",first,second,add(first,second)));
			System.out.println(String.format("%s - %s = %s",first,second,substract(first,second)));
			System.out.println(String.format("%s * %s = %s",first,second,multiple(first,second)));
			System.out.println(String.format("%s / %s = %s",first,second,div(first,second)));  
			System.out.println(String.format("%s ^ %s = %s",first,second,expand((int)first,(int)second))); 			
		}
	
		public static double add(double first,double second){
			return first + second;	
		}
		
		public static double substract(double first,double second){
			return first - second;			
		}
		
		public static double multiple(double first,double second){
			return first * second;
		}
		
		public static double div(double first,double second){
			return first / second;			
		}		
		
		public static double expand(int first,int second){
			return first ^ second;			
		}		
		

}