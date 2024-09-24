package project;

import java.util.ArrayList;

public class Main {

	
	public static  String fibonacci(int num) {
		int num1=0,num2=1;
		ArrayList<Integer> sequencia = new ArrayList<Integer>();
		sequencia.add(num1);
		sequencia.add(num2);
		while(num1<num) {
			int save;
			save = num2;
			num2 = num1+num2;
			num1 = save;
			sequencia.add(num2);
		}
		if(sequencia.contains(num)) {
			 return "O número " + num + " pertence à sequência de Fibonacci.";
		}else {
			 return "O número " + num + " NÃO pertence à sequência de Fibonacci.";
		}
	}
	
	
	
	public static void main(String[] args) {      
        System.out.println(fibonacci(21));
	}
	


}
