package primeraentrega;

public class Partido {

		private Equipo equipo1;
		private Equipo equipo2;
		private Equipo equipo3;
		private Equipo equipo4;
		
		//Metodo int
	    //partido1
        private	int golesEquipo1 =  3;
		private int golesEquipo2 = 1;
			
		//partido2 
		private int golesEquipo3 = 2;
		private int golesEquipo4 = 2;
		
		//Getters and Setters
		public Equipo getEquipo1() {
			return equipo1;
		}
		public void setEquipo1(Equipo equipo1) {
			this.equipo1 = equipo1;
		}
		public Equipo getEquipo2() {
			return equipo2;
		}
		public void setEquipo2(Equipo equipo2) {
			this.equipo2 = equipo2;
		}
		public Equipo getEquipo3() {
			return equipo3;
		}
		public void setEquipo3(Equipo equipo3) {
			this.equipo3 = equipo3;
		}
		public Equipo getEquipo4() {
			return equipo4;
		}
		public void setEquipo4(Equipo equipo4) {
			this.equipo4 = equipo4;
		}
		public int getGolesEquipo1() {
			return golesEquipo1;
		}
		public void setGolesEquipo1(int golesEquipo1) {
			this.golesEquipo1 = golesEquipo1;
		}
		public int getGolesEquipo2() {
			return golesEquipo2;
		}
		public void setGolesEquipo2(int golesEquipo2) {
			this.golesEquipo2 = golesEquipo2;
		}
		public int getGolesEquipo3() {
			return golesEquipo3;
		}
		public void setGolesEquipo3(int golesEquipo3) {
			this.golesEquipo3 = golesEquipo3;
		}
		public int getGolesEquipo4() {
			return golesEquipo4;
		}
		public void setGolesEquipo4(int golesEquipo4) {
			this.golesEquipo4 = golesEquipo4;
		}
		
		
		//Metodo constructor usando fields: Equipo (no se uso goles)
		public Partido(Equipo equipo1, Equipo equipo2, Equipo equipo3, Equipo equipo4) {
			super();
			this.equipo1 = equipo1;
			this.equipo2 = equipo2;
			this.equipo3 = equipo3;
			this.equipo4 = equipo4;
		}
	
	   //Resultados
	   //Primera ronda
		public String resultado1(Equipo equipo1) 
		{if (equipo1.equals(equipo2));
			if (golesEquipo1 > golesEquipo2)
			return "ganador";
			return null;}
		
		public String resultado2(Equipo equipo2)
		{if (equipo2.equals(equipo1));
			if (golesEquipo2 > golesEquipo1)
			return "ganador";
			return null;}
		
		//Segunda ronda
		public String resultado3(Equipo equipo3) 
		{if (equipo3.equals(equipo4));
			if (golesEquipo3 > golesEquipo4)
			return "ganador";
			return null;}
		
		public String resultado4(Equipo equipo4) 
		{if (equipo4.equals(equipo3));
			if (golesEquipo4 > golesEquipo3)
			return "ganador";
			return null;}
	
}
