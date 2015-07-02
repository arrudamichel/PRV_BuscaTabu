import java.util.ArrayList;

import Entidade.Deposito;
import IO.ManipulaDados;


public class Main {

	public static void main(String[] args) {

			ManipulaDados entra = new ManipulaDados();
			ArrayList<String> registros = entra.lerArquivo();
			int linhaC = 0;
			Deposito deposito = new Deposito();
			
			for (String registro : registros) {
				String linhaArray[] = registro.split(";");
				
				if(linhaC == 0){
					deposito.criaVeiculo(linhaArray[0]);
				} else if (linhaC == 1){
					deposito.setCoordenadaX(Float.parseFloat(linhaArray[1]));
					deposito.setCoordenadaY(Float.parseFloat(linhaArray[2]));
					
					deposito.criaCliente(linhaArray[0],linhaArray[1],linhaArray[2],linhaArray[3],linhaArray[4],linhaArray[5],linhaArray[6]);
				} else {
					deposito.criaCliente(linhaArray[0],linhaArray[1],linhaArray[2],linhaArray[3],linhaArray[4],linhaArray[5],linhaArray[6]);
				}
				
				linhaC++;
			}
	
			deposito.populaMatrizCusto();
			deposito.populaListaDemanda();
			
			deposito.buscaTabu();
	}

}
