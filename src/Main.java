public class Main {

// SCEMO CHI LEGGE
//COMMENTO MIO 
public static void main(String[] args) {
	Lista l;
	l = new Lista();
	l.inserisciTesta("A");
	l.inserisciTesta("B");
	l.inserisciTesta("C");
	l.inserisciTesta("D");
	l.stampa();
	
	int s = l.eliminaInTesta();
	System.out.println("ho eliminato: "+s); 	//D
	l.stampa();									//C B A
	s = l.eliminaInTesta();
	System.out.println("ho eliminato: "+s);		//C
	l.stampa();									//B A
	s = l.eliminaInTesta();
	System.out.println("ho eliminato: "+s);		//B
	l.stampa();									//A
	s = l.eliminaInTesta();
	System.out.println("ho eliminato: "+s);		//A
	l.stampa();									//null
	
	
	}

}
