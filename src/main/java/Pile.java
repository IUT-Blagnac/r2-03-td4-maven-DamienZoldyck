package main;

public class Pile {

	private int[] elements;
	private int sommet;

	public Pile(int pfI) {
		elements = new int[pfI];
		sommet = 0;
	}
/**
* Rôle : retourne si la pile est vide
*
*@return true si vide false si pas vide
 */
	public boolean est_vide() {
		if (sommet == 0) {
			return true;
		}
		else {
			return false;
		}
	}
/**
* Rôle : empile pfI dans la pile
*
*@param pfI entier à empiler
 */
	public void empiler(int pfI)throws Exception {
		if (sommet < elements.length) {
			elements[sommet] = pfI;
			sommet = sommet + 1; 
		}
		else {
			throw new Exception();
		}
	}
/**
* Rôle : depile la pile
*
*@return l'entier qui à été dépilé
 */
	public int depiler ()throws Exception {
		int save;
		if (est_vide()) {
			throw new Exception("la pile est vide");
		}
		else {
			save = sommet - 1;
			sommet = sommet - 1;
			return elements[save];
		}
	/**
* Rôle : vide la pile
*
 */	
	}
	public void vider () {
		sommet = 0;
	}
}
