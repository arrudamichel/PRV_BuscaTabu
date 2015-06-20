package IO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import Entidade.Deposito;

public class EntraDados {

	private String nomeArquivo = "dado.txt";
	private String caractere = ";";
	public EntraDados() {
		// TODO Auto-generated constructor stub
	}
		
	public void lerArquivo(){
		
 		try { 
			FileReader arq = new FileReader(this.nomeArquivo); 
			BufferedReader lerArq = new BufferedReader(arq); 
			String linha = lerArq.readLine(); 
			int linhaC = 0;
			
			Deposito deposito = new Deposito();
			
			while (linha != null) { 
				//System.out.printf("%s\n", linha);
				
				String linhaArray[] = linha.split(this.caractere);
				
				if(linhaC == 0){
					deposito.criaVeiculo(linhaArray[0]);
				} else if (linhaC == 1){
					deposito.setCoordenadaX(Float.parseFloat(linhaArray[1]));
					deposito.setCoordenadaY(Float.parseFloat(linhaArray[2]));
				} else {
					deposito.criaCliente(linhaArray[0],linhaArray[1],linhaArray[2],linhaArray[3],linhaArray[4],linhaArray[5],linhaArray[6]);
				}
				
				linhaC++;
				linha = lerArq.readLine(); 
			} 
			
			arq.close();
			
			deposito.populaMatrizCusto();
			
		} catch (IOException e) { 
			System.err.printf("Erro na abertura do arquivo: %s.\n", e.getMessage()); 
		}		
	}
	
	public static void main(String[] args) {
		EntraDados entra = new EntraDados();
		entra.lerArquivo();
	}
}
