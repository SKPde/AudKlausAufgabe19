
public class ListeL {

	private static class ElementL { // innere Klasse

		private Comparable inhalt; // Inhalt von ListenElement
		private ElementL next; // Referenz zum Nachfolger

		public ElementL(Comparable neu) {
			inhalt = neu;
		}

	}

	private ElementL head; // Beginn der Liste

	public void bubbleSort() { // Blasensortierung
		ElementL temp = head;
		boolean sort = false;

		do {
			temp = head;
			sort = false;
			while (temp.next != null) {
				if (temp.inhalt.compareTo(temp.next.inhalt) > 0) {
					Comparable temp1 = temp.inhalt;
					temp.inhalt = temp.next.inhalt;
					temp.next.inhalt = temp1;
					sort = true;
				}
				temp = temp.next;
			}
		} while (sort == true);
	}

	public void einfuegen(Comparable neu) {
		if (head == null) {
			head = new ElementL(neu);
		} else {
			ElementL temp = new ElementL(neu);
			temp.next = head;
			head = temp;
		}
	}

	public void ausgabe() {
		ElementL temp = head;

		while (temp != null) {
			System.out.println(temp.inhalt.toString());
			temp = temp.next;
		}
		System.out.println("");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListeL liste = new ListeL();
		liste.einfuegen("Halberstung");
		liste.einfuegen("Schiftung");
		liste.einfuegen("Leiberstung");
		liste.einfuegen("Ebenung");
		liste.einfuegen("Winden");
		liste.einfuegen("Kartung");
		liste.einfuegen("Sinzheim");
		liste.einfuegen("Litzlung");
		liste.einfuegen("Müllhofen");
		liste.einfuegen("Vormberg");

		liste.ausgabe();

		liste.bubbleSort();

		liste.ausgabe();
	}

}
