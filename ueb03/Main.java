package ueb03;


/**
 *
 * @author werner, braun
 */
public class Main {
	public static void main(String[] args){
		
		MyIntOrderedList list = new MyIntOrderedList();
		
		int[] keys = {22, 42, 4, 15, 23, 8, 54, 16};
		
		/**
		 * test adding
		 */
		
		System.out.println("Inserting keys");
		
		for (int i = 0; i < keys.length; i++){
			System.out.println("insert " + keys[i]);
			list.insert(keys[i]);
			list.print();
		}
		
		/**
		 * test removing
		 */        
		int[] idx = {2, 5, 6, 2, 100, 0, 1, 0, -1, 0, 2};
		
		System.out.println("Removing keys");
		
		for (int i = 0; i < idx.length; i++){
			System.out.println("remove key at index " + idx[i]);
			list.removeKeyAtIndex(idx[i]);
			list.print();
		}
	}
}
