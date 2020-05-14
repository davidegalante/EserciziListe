public class Main {

public static void main(String[] args) {
	ListaDiInteri l;
	l = new ListaDiInteri();
	l.inserisciTesta(1);
	l.inserisciTesta(2);
	l.inserisciTesta(0);
	l.inserisciTesta(4);
	l.eliminaDispari();
	l.stampa();
	System.out.println("lunghezza: "+l.size());
	
	int s = l.eliminaInTesta();
	System.out.println("\nho eliminato: "+s); 	//D
	l.stampa();									//C B A
	System.out.println("lunghezza: "+l.size());
	s = l.eliminaInTesta();
	System.out.println("\nho eliminato: "+s);		//C
	l.stampa();									//B A
	System.out.println("lunghezza: "+l.size());
	s = l.eliminaInTesta();
	System.out.println("\nho eliminato: "+s);		//B
	l.stampa();									//A
	System.out.println("lunghezza: "+l.size());
	s = l.eliminaInTesta();
	System.out.println("\nho eliminato: "+s);		//A
	l.stampa();									//null
	System.out.println("lunghezza: "+l.size());
	
	
	}

}
