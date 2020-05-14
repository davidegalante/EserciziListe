/**
 * @author Alberto Ferrari - https://albertoferrari.github.io/
 * @license This software is free - http://www.gnu.org/licenses/gpl.html
 * Nodo di una lista di stringhe
 */
public class Nodo {
	
	/** informazione */
	private Integer info;
	/** riferimento al nodo successivo */
	private Nodo succ;
	
	/**
	 * Nodo vuoto
	 */
	public Nodo(){
		info = 0;
		succ = null;
	}
	
	/**
	 * Nodo senza riferimento al successivo
	 * @param info Informazione da inserire nel nodo
	 */
	public Nodo(Integer info) {
		this.info = info;
		this.succ = null;
	}

	/**
	 * Nodo con informazione e riferimento al successivo
	 * @param info Informazione da inserire nel nodo
	 * @param succ Riferimento al nodo successivo
	 */
	public Nodo(Integer info, Nodo succ) {
		this.info = info;
		this.succ = succ;
	}

	public Integer getInfo() {
		return info;
	}

	public void setInfo(Integer info) {
		this.info = info;
	}

	public Nodo getSucc() {
		return succ;
	}

	public void setSucc(Nodo succ) {
		this.succ = succ;
	}

}
