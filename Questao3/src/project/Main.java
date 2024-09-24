package project;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class Main {
	
	public static Double menor(ArrayList<Double> fat){
		if(fat.isEmpty()) {return 0.0;}
		Double menor = fat.get(0);
		for(Double x : fat) {
			if(x<menor) {
				menor = x;
			}
		}
		
		return menor;
		
	}
	public static Double maior(ArrayList<Double> fat){
		if(fat.isEmpty()) {return 0.0;}
		Double maior = fat.get(0);
		for(Double x : fat) {
			if(x>maior) {
				maior = x;
			}
		}
		
		return maior;
		
	}
	
	public static Integer calcDias(ArrayList<Double> fat, Double maior) {
		if(fat.isEmpty()) {return 0;}
		int diasfaturamento=0;
		Double soma=0.0;
		for(Double x : fat) {
			if( x!= 0) {
				soma += x;
				diasfaturamento++;
			}
		}
		Double media = soma / diasfaturamento;
		
		int diasmedia = 0;
		for(Double a : fat) {
			if(a > media) {
				diasmedia++;
			}
		}
		return diasmedia;
	}
	
	public static void main(String[] args) {
		 Gson gson = new Gson();

	        try {
	          
	            FileReader reader = new FileReader("dadosFaturamento.json");

	         
	            Type faturamentoListType = new TypeToken<ArrayList<Double>>(){}.getType();

	          
	            ArrayList<Double> faturamento = gson.fromJson(reader, faturamentoListType);

	          
	            reader.close();

	    
	            Double menorFaturamento = menor(faturamento);
	            Double maiorFaturamento = maior(faturamento);
	            int diasAcimaMedia = calcDias(faturamento, maiorFaturamento);

	            System.out.println("Menor faturamento: " + menorFaturamento);
	            System.out.println("Maior faturamento: " + maiorFaturamento);
	            System.out.println("Dias com faturamento acima da média: " + diasAcimaMedia);

	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	}

}
