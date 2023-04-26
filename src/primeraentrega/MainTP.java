package primeraentrega;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collection;
import java.util.List;

public class MainTP {

	public static void main(String[] args) {

		//RESULTADOS

	   //Path para resultados csv
		
		Path pathResultados = Paths.get("trabajopractico\\Primera Entrega\\archivos csv");
		
		//ReadFiles
		List<String> lineasResultados = null;
		try {
			lineasResultados = Files.readAllLines(pathResultados);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Lectura de la primer linea
		boolean primera = true;
		
		for (String lineasResultados1 : lineasResultados) 
		{if (primera) {primera = false;} 
		else {System.out.println(lineasResultados1);}
		
		//Lectura de la segunda linea
		
       boolean segunda = true;
		for (String lineasResultados2 : lineasResultados) 
		{if (segunda) {segunda = false;} 
		else {System.out.println(lineasResultados1);}
		 
		 
		 //Para la lectura de cada partido
		 
		 Collection<Partido> partidos = new ArrayList<Partido>();
		 
		 //Argentina,3,1,Costa Rica
		 boolean primeraLinea = true;
			
			for (String lineasResultados4 : lineasResultados) 
			{if (primeraLinea) {primeraLinea = false;} 
			else {String [] campos = lineasResultados4.split(",");
			Equipo equipo1 = new Equipo(campos[3]);
			Equipo equipo2 = new Equipo(campos[1]);
			Partido partido = new Equipo(equipo1; equipo2);
			partido.setGolesEquipo1(Integer.parseInt(campos)[3]);
			partido.setGolesEquipo2(Integer.parseInt(campos)[1]);
			partidos.add(partido);}}
		 
		 //Croacia,2,2,Alemania
			
		 boolean SegundaLinea = true;
				
				for (String lineasResultados4 : lineasResultados) 
				{if (SegundaLinea) {SegundaLinea = false;} 
				else {String [] campos = lineasResultados4.split(",");
				Equipo equipo3 = new Equipo(campos[2]);
				Equipo equipo4 = new Equipo(campos[2]);
				Partido partido = new Equipo(equipo1; equipo2);
				partido.setGolesEquipo3(Integer.parseInt(campos)[2]);
				partido.setGolesEquipo4(Integer.parseInt(campos)[2]);
				partidos.add(partido);}}
			
		//PRONOSTICO
		 
		//Path para pronostico csv
		 
		 
		
		
		//PUNTAJES
		 
	}

}
