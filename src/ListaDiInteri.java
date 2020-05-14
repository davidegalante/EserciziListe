/**
 * @author Alberto Ferrari - https://albertoferrari.github.io/
 * @license This software is free - http://www.gnu.org/licenses/gpl.html
 * Lista di stringhe
 */
public class ListaDiInteri {

	/** Riferimento alla testa della lista */
	private Nodo testa;
	
	/** 
	 * Lista vuota
	 */
	public ListaDiInteri(){
		testa = null;
	}
	
	/**
	 * Controllo lista vuota
	 * @return true se la lista e' vuota
	 */
	public boolean vuota(){
		return testa==null;
	}
	
	/**
	 * Inserisce un nuovo nodo in testa alla lista
	 * @param info Informazione da inserire nel nodo
	 */
	public void inserisciTesta(int info){
		Nodo nuovo = new Nodo(info,testa);
		testa = nuovo;
	} 

	/**
	 * Inserisce un nuovo nodo in coda alla lista
	 * @param info Informazione da inserire nel nodo
	 */
	@SuppressWarnings("unused")
	public void inserisciCoda(int info){
		if (vuota()) {
			inserisciTesta(info);
		}
		Nodo nuovo = new Nodo(info);
		Nodo p = testa;
		Nodo u = testa.getSucc();
		
		while (p.getSucc()!=null) {
			p = p.getSucc();
			u = p.getSucc();
		}
		p.setSucc(nuovo);
	} 
	
	/**
	 * Elimina l'elemento in testa alla lista
	 * @return Informazione dell'elemento eliminato (null se lista vuota)
	 */
	public int eliminaInTesta() {
		if (vuota()) {
			return 0;
		}
		
		if (testa.getSucc()==null) {
			int elementoUltimo = testa.getInfo();
			testa.setInfo(0);
			return elementoUltimo;
		}
		
		Nodo p = testa;
		Nodo u = testa.getSucc();
		p.setSucc(null);
		testa = u;
		return p.getInfo();
	}
	
	/**
	 * Elimina l'elemento in coda alla lista
	 * @return Informazione dell'elemento eliminato (null se lista vuota)
	 */	
	public int eliminaInCoda() {
		if (vuota()) {
			return 0;
		}
		
		if (testa.getSucc()==null) {
			int elementoUltimo = testa.getInfo();
			testa.setInfo(0);
			return elementoUltimo;
		}
		
		Nodo p = testa;
		Nodo u = testa.getSucc();
		while (u.getSucc()!=null) {
			p = p.getSucc();
			u = p.getSucc();
		}
		p.setSucc(null);
		return u.getInfo();
	}
	
	
	/**
	 * Visualizzazione di tutti le informazioni
	 */
	public void stampa(){
		Nodo n = testa;
		while(n!=null){
			System.out.println(n.getInfo());
			n = n.getSucc();
		}
	}
}

