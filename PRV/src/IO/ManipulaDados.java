package IO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class ManipulaDados {

	private String nomeArquivo = "dado.txt";

	public ManipulaDados() {
		// TODO Auto-generated constructor stub
	}
		
	public ArrayList<String> lerArquivo(){
		
 		try { 
			FileReader arq = new FileReader(this.nomeArquivo); 
			BufferedReader lerArq = new BufferedReader(arq); 
			String linha = lerArq.readLine(); 

			ArrayList<String> linhas = new ArrayList<>();
						
			while (linha != null) { 
				linhas.add(linha);
				
				linha = lerArq.readLine(); 
			} 
			
			arq.close();
			
			return linhas;
			
		} catch (IOException e) { 
			System.err.printf("Erro na abertura do arquivo: %s.\n", e.getMessage()); 
		}
		return null;		
	}
	
	public boolean escreveArquivo(float[][] matrizCustos, String arquivoString){
		
		try {
			File arquivo = new File(arquivoString);
			
			if(arquivo.exists()){
				arquivo.delete();
			}
			
			if (!arquivo.exists()) {			
				arquivo.createNewFile();
			} 
			
			
			FileWriter arq = new FileWriter(arquivo, true); 
			PrintWriter gravarArq = new PrintWriter(arq); 

			for(int i=0; i<matrizCustos.length; i++) { 
				for(int j=0; j<matrizCustos.length; j++) { 
					gravarArq.printf(String.valueOf(matrizCustos[i][j]) + " ");
				}			
				gravarArq.printf("\n");
			}
		
			arq.close();
		} catch (IOException e) { 
			e.printStackTrace();
			
			return false;
		}

		return true;		
	}
}
