package employeeinfo_4_3;

import java.util.StringJoiner;

public class AccountList {
	private int size;
	private Account[] strArray;

	public AccountList(int size) {
		this.size = 0;
		strArray = new Account[size]; 
	}
	
	private void resize() {
		System.out.println("Resizing..." + this.strArray.length + " to " + this.strArray.length*2);
		Account[] strArrayEnlarged = new Account[this.strArray.length*2]; 
		System.arraycopy(strArray, 0, strArrayEnlarged, 0, strArray.length);
		
		strArray = strArrayEnlarged;
	}
	/**
	 * adds s to the end of the underlying array
	 * 
	 * @param s
	 */
	public void add(Account s) {
		
		// if it's full need to resize
		if(size==strArray.length) {
			resize();
		}
		
		// search for next null occurrence to put the string s
		for(int i=0; i<strArray.length;i++) {
			
			/*System.out.println(strArray[i]);
			System.out.println(i);*/
			if(strArray[i]==null) {
				strArray[i] = s;
				this.size++;
				break;
			}
		}
		
		//System.out.println("add end");
	}
	
	/**
	 * 
	 * retrieves the String at the ith position in the underlying array
	 * @param i
	 * @return
	 */
	public Account get(int i) {
		
		return strArray[i];
	}
	
	/**
	 * 
	 * 	returns true if String s is found in the array, false otherwise
	 * @param s
	 * @return
	 */
	public boolean find(String s) {
		// search for next null occurrence to put the string s
		for(int i=0; i<strArray.length;i++) {
			if(strArray[i].equals(s)) {
				return true;
			}
		}
		
		return false;
	}
	
	/**
	 * removes first occurrence of  String s if it is found in the underlying array 
	 * if found, returns true; if not found returns false
	 * 
	 * @param s
	 * @return
	 */
	public boolean remove(String s) {
		
		for(int i=0; i<this.size;i++) {
			// copy part of the array after s string to s'th index
			if(strArray[i].equals(s)) {
				
				System.arraycopy(strArray, i+1, strArray, i, size-1);
				this.size--;
				
				// need to change to null next element after last
				if(size!=strArray.length)
					strArray[size] = null;
				
				System.out.println("Removing: "+ s);
				
				return true;
			}
		}
		
		System.out.println("Couldn't find: "+ s);
		return false;
	}
	
	/**
	 * returns a String representation of the underlying array 
	 * here is a typical output: 
	 * [Bob, Steve, Susan, Mark, Dave]
	 * 
	 */
	public String toString() {
		
		StringJoiner sj = new StringJoiner(", ", "[", "]"); 
		
		for(int i=0; i<strArray.length;i++) {
			if(strArray[i]==null)
				break;
			
		//	sj.add(strArray[i]);
		}
		
		return  sj.toString();
	}
	
	/**
	 * 
	 * returns the next open position in the underlying array 
	 * 
	this is precisely the 
	number of Strings that have been added minus the number of String that have 
	been removed.
	 * @return
	 */
	public int size() {
		return this.size;
	}
	
	
	
}
