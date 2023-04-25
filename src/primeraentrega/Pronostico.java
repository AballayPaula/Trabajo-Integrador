package primeraentrega;

public class Pronostico {

	//PRONOSTICOS
	
	private Partido partido;
	private Equipo equipo;
	private String resultado;
	
	//Para Argentina
	private Partido partido1;
	private Equipo equipo1;
	private String resultado1;
	
	//Para Costa Rica
	private Partido partido2;
	private Equipo equipo2;
	private String resultado2;
	
    //Para Croacia
	private Partido partido3;
	private Equipo equipo3;
	private String resultado3;
	
	//Para Alemania
	private Partido partido4;
	private Equipo equipo4;
	private String resultado4;
	
	//Constructores para Argentina, Costa Rica, Croacia y Alemania
	
    public Pronostico(
    		Partido partido1, Equipo equipo1, String resultado1, 
    		Partido partido2, Equipo equipo2, String resultado2, 
    		Partido partido3, Equipo equipo3, String resultado3, 
    		Partido partido4, Equipo equipo4, String resultado4) 
    {super();
		this.partido1 = partido1;
		this.equipo1 = equipo1;
		this.resultado1 = resultado1;
		this.partido2 = partido2;
		this.equipo2 = equipo2;
		this.resultado2 = resultado2;
		this.partido3 = partido3;
		this.equipo3 = equipo3;
		this.resultado3 = resultado3;
		this.partido4 = partido4;
		this.equipo4 = equipo4;
		this.resultado4 = resultado4;
	}
			
	//Getters para Argentina, Costa Rica, Croacia y Alemania
  
	public Partido getPartido1() {
				return partido1;
			}
	public Equipo getEquipo1() {
				return equipo1;
			}
	public String getResultado1() {
				return resultado1;
			}
	public Partido getPartido2() {
				return partido2;
			}
	public Equipo getEquipo2() {
				return equipo2;
			}
	public String getResultado2() {
				return resultado2;
			}
	public Partido getPartido3() {
				return partido3;
			}
	public Equipo getEquipo3() {
				return equipo3;
			}
	public String getResultado3() {
				return resultado3;
			}
	public Partido getPartido4() {
				return partido4;
			}
	public Equipo getEquipo4() {
				return equipo4;
			}
	public String getResultado4() {
				return resultado4;
			}
	public int getPronostico1() {
				return pronostico1;
			}
	public int getPronostico2() {
				return pronostico2;
			}
	public int getPronostico3() {
				return pronostico3;
			}
	public int getPronostico4() {
				return pronostico4;
			}

			//Puntos
	//Puntos para el partido 1
	public int puntos1 () 
	{String resultadoReal = partido.resultado1(equipo1);
	if (resultado1.equals(resultadoReal)) {return 1;} 
	else {return 0;}}
	
	//Puntos para el partido 2
	public int puntos2 () 
	{String resultadoReal = partido.resultado2(equipo2);
	if (resultado2.equals(resultadoReal)) {return 1;} 
	else {return 0;}}
	
	//Puntos para el partido 3
	public int puntos3 () 
	{String resultadoReal = partido.resultado3(equipo3);
	if (resultado3.equals(resultadoReal)) {return 1;} 
	else {return 0;}}
	
	//Puntos para el partido 4
	public int puntos4 () 
	{String resultadoReal = partido.resultado4(equipo4);
	if (resultado4.equals(resultadoReal)) {return 1;} 
	else {return 0;}}
	
	
	 
	
	
	
	
			//PRONOSTICO 1 GOLESEQUIPO1 
			
			
			
			//PRONOSTICO 2 GOLESEQUIPO2
			//PRONOSTICO 3 GOLESEQUIPO3
			//PRNOSTICO 4 GOLESEQUIPO4
			
			
			
					int pronostico1 = 1;
			
			
			
			int pronostico2 = 0;
			int pronostico3 = 1;
			int pronostico4 = 1;
					
			//RESULTADO ESPERADO
			
			if (pronostico1 != golesEquipo1) {System.out.println("Puntaje = 1");}
			else {System.out.println("Puntaje = 0");}
			
		
			
			if (pronostico2 >= golesEquipo2) {System.out.println("Puntaje = 1");}
			else {System.out.println("Puntaje = 0");}
			
			if (pronostico3 >= golesEquipo3) {System.out.println("Puntaje = 1");}
			else {System.out.println("Puntaje = 0");}
			
			if (pronostico4 >= golesEquipo4) {System.out.println("Puntaje = 1");}
			else {System.out.println("Puntaje = 0");}
	
	
	
}
