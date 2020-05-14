public class Main {

public static void main(String[] args) {
	ListaDiInteri l;
	l = new ListaDiInteri();
	l.inserisciTesta(1);
	l.inserisciTesta(2);
	l.inserisciTesta(3);
	l.inserisciTesta(4);
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
