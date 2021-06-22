package Tateti;

public class Tateti_Base {
	public static void main(String[]args) {
		
		Tateti t1=new Tateti();
		t1.generarTablero();
		t1.mostrarTablero();
		Jugador j1=new Jugador (" X ", "Jugador1",t1);
		Jugador j2=new Jugador (" O ", "Jugador2",t1);
		
        boolean gan=false;
        
        while(gan==false) {
		
		j1.jugar();
		t1.mostrarTablero();
		if(!(gan=t1.ExisteTateti()))
		{
		j2.jugar();
		t1.mostrarTablero();
		gan=t1.ExisteTateti();
		
	    }
	
  }
        if(gan==true) 
        {
        	System.out.print("El ganador es " +t1.fichaGanadora);
  }
 }
}
