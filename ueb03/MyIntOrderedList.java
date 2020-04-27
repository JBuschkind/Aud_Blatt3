package ueb03;


/**
 *
 * @author werner, braun (IFIS)
 */
public class MyIntOrderedList {

	private MyIntListElement head = null;

	public MyIntOrderedList() {
	}

	public void insert(int key){
		MyIntListElement body = new MyIntListElement(key,null);
		//Überprüft ob ein head vorhanden ist
		if(this.head == null){
			this.head = body;
		}else{
			int i = 0;
			MyIntListElement check = this.head;
			//Geht die Elemente durch bis ein Element gefunden wurde das größer als dein neue ist
			while(check.compare(body) == -1){
				i++;
				check = check.getNext();
				//Falls das neue Element das größte der Liste ist
				if(check == null){
					break;
				}

			}
			//setzt für den Fall das das neue Element einen Nachfolger hat, den Nachfolger
			if(check != null){
				body.setNext(check);
			}
			//Setzt das neue Element als Head, falls dieses das kleinste ist
			if(i == 0){
				this.head = body;
			}else{
				//Sucht das Element vor dem neuen, und setzt den Nachfolger auf das neue
				MyIntListElement edit = this.head;
				for(int n = 0; n < i-1;n++){
					edit = edit.getNext();
				}
				edit.setNext(body);
			}
		}
	}

	public void removeKeyAtIndex(int idx){
		//Überprüft ob der Index über -1 liegt
		if(idx >= 0){
			MyIntListElement rmv = this.head;
			//Entfernt den HEad falls der Index 0 ist
			if(idx == 0){
				this.head = this.head.getNext();
			}else{
				//Sucht das Element vor dem zu entfernenden
				for(int i = 0; i < idx-1; i++){
					rmv = rmv.getNext();
					//Bricht ab falls die Schleife bei einem nicht existierenden Element liegt, und somit der Index ungültig ist
					if(rmv == null){
						break;
					}
				}
				//Überprüft ob das Element auch existiert und Nachfolger hat
				if(rmv != null && rmv.getNext() != null){
					//Überprüft ob der Nachfolger einen Nachfolger hat
					if(rmv.getNext().getNext() == null){
						//Falls nicht, ist der Nachfolger des Elemente das vor dem zu entfernenden Element steht null
						rmv.setNext(null);
					}else{
						//Falls doch, wird das zu entfernende Element übersprungen, und der Garbage Collector löscht es
						rmv.setNext(rmv.getNext().getNext());
					}
				}
			}
		}
	}

	public void print(){
		MyIntListElement elmt = this.head;
		//GEht jedes Element durch, und druckt es, bis ein nicht zulässiges Element erreicht wird
		while(elmt != null){
			System.out.print(elmt.toString() + " ");
			elmt = elmt.getNext();
		}
		//Fügt einen Zeilenumbruch hinzu
		System.out.println("");
	}

}
