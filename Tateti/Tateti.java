package Tateti;

public class Tateti {
	public String Tablero[][] = new String [3] [3];
	public String fichaGanadora;

	public boolean ExisteTateti()
	{
	
		
		/*1   (FILAS)*/
		if((Tablero[0][0]!="*") && (Tablero[0][0]==Tablero[0][1]) && (Tablero[0][1]==Tablero[0][2]))
		{
			fichaGanadora=Tablero [0][0];
			return(true);
		}
		/*2*/
		if((Tablero[1][0]!="*") && (Tablero[1][0]==Tablero[1][1]) && (Tablero[1][1]==Tablero[1][2]))
		{ 
			fichaGanadora=Tablero [1][0];
			return(true);
		}
		/*3*/
		if((Tablero[2][0]!="*") && (Tablero[2][0]==Tablero[2][1]) && (Tablero[2][1]==Tablero[2][2]))
		{
			fichaGanadora=Tablero [2][0];
			return(true);
		}
		
		/*4    (COLUMNAS)*/
		if((Tablero[0][0]!="*") && (Tablero[0][0]==Tablero[1][0]) && (Tablero[1][0]==Tablero[2][0]))
		{
			fichaGanadora=Tablero [0][0];
			return(true);
		}
		/*5*/
		if((Tablero[0][1]!="*") && (Tablero[0][1]==Tablero[1][1]) && (Tablero[1][1]==Tablero[2][1]))
		{
			fichaGanadora=Tablero [0][1];
			return(true);
		}
		/*6*/
		if((Tablero[0][2]!="*") && (Tablero[0][2]==Tablero[1][2]) && (Tablero[1][2]==Tablero[2][2]))
		{
			fichaGanadora=Tablero [0][2];
			return(true);
		}
		/*7 (diagonal)*/
		
		if((Tablero[0][0]!="*") && (Tablero[0][0]==Tablero[1][1]) && (Tablero[1][1]==Tablero[2][2]))
		{
			fichaGanadora=Tablero [0][0]; 
			return(true);
		}
		/*8*/
		if((Tablero[2][0]!="*") && (Tablero[2][0]==Tablero[1][1]) && (Tablero[1][1]==Tablero[0][2]))
		{
			fichaGanadora=Tablero [2][0];
			return(true);
		}
		
		return (false);
	}
	
	public boolean ponerFicha(int posF,int posC,String ficha) {
		
		if(Tablero[posF][posC]!=null)
			{
			if(Tablero[posF][posC]=="*") 
			{
				Tablero[posF][posC]=ficha;	
				return (true);
			}
			else
			{
				return(false);
			}
		}
			else
			{
				return(false);
			}
	}
	
	public void mostrarTablero() {
		System.out.println(" ");
		for(int i=0; i<Tablero.length; i++) {
			for(int j=0; j<Tablero[0].length; j++) {
				System.out.print(Tablero[i][j]+"");
			}
			System.out.println(" ");
		}
	}
	
	public void generarTablero() {
		for(int i=0; i<Tablero.length; i++) {
			for(int j=0; j<Tablero[0].length; j++) {
				Tablero[i][j]="*";
			}
			System.out.println(" ");
		}

	}
}
