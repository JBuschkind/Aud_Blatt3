package ueb03;


/**
 *
 * @author werner, braun (IFIS)
 */
public class MyIntListElement {    
    
	private int key;
	protected MyIntListElement next;
	
	public MyIntListElement(int key, MyIntListElement next){
		this.key = key;
		this.next = next;
	}
	
	public MyIntListElement getNext(){
		return this.next;
	}
	
	public void setNext(MyIntListElement next){
		this.next = next;
	}
	
	/**
	 * 
	 * @param oElement
	 * @return 0 if both Element equal, -1 if this < oElement, else 1
	 */
	public int compare(MyIntListElement oElement){
		//  _____   _____   _____   _____  
		// |_   _| /  _  \ |  _  \ /  _  \ 
		//   | |   | | | | | | | | | | | | 
		//   | |   | | | | | | | | | | | | 
		//   | |   | |_| | | |_| | | |_| | 
		//   |_|   \_____/ |_____/ \_____/ 
	}
	
	public String toString(){
		//  _____   _____   _____   _____  
		// |_   _| /  _  \ |  _  \ /  _  \ 
		//   | |   | | | | | | | | | | | | 
		//   | |   | | | | | | | | | | | | 
		//   | |   | |_| | | |_| | | |_| | 
		//   |_|   \_____/ |_____/ \_____/ 
	}
	
}
