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

    if(this.key == oElement.key){
      return 0;
    }else if(this.key < oElement.key){
      return -1;
    } else{
      return 1;
    }
	}

	public String toString(){
		return Integer.toString(this.key);
	}

}
