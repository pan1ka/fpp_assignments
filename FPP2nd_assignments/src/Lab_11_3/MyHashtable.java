package Lab_11_3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class MyHashtable implements Iterable {
	private static final int INITIAL_SIZE;
	private static final int DEFAULT_LOAD_FACTOR = 5;
	static {
		INITIAL_SIZE = 20;
	}
	private int tableSize;
	private int numEntries;
	private int maxLoadFactor = DEFAULT_LOAD_FACTOR;
	// to create a collections framework using sets rather
	// than lists, use open addressing implementation of
	// hashtable here
	private LinkedList[] table;

	public MyHashtable() {
		this(INITIAL_SIZE);
	}

	public MyHashtable(int tableSize) {
		this.tableSize = tableSize;
		table = new LinkedList[tableSize];
	}

	/**
	 * Checks whether the key is in use in this table. If key is null, return value
	 * is always false. Note that a key may be mapped to a null value.
	 * 
	 * @param key
	 * @return true if hash of key is found in keyList, false otherwise
	 */
	public boolean containsKey(Object key) {
		if (key == null)
			return false;
		int index = hash(key.hashCode());
		if (table[index] == null)
			return false;
		for (Iterator it = table[index].iterator(); it.hasNext();) {
			Entry e = (Entry) it.next();
			if (e.key.equals(key))
				return true;
		}
		return false;
	}

	public void put(Object key, Object value) {
		if (key == null)
			return;
		int hashcode = key.hashCode();
		int hash = hash(hashcode);
		// if key has already been used, update value in the Entry
		Entry e = getEntry(key);
		if (e != null) {
			e.value = value;
		}
		// if this key is new, create a new Entry and add to table
		else {
			// put the value and the key into an Entry object
			// which will be placed in the table in the
			// slot (namely, hash)
			Entry newEntry = new Entry(key, value);

			// now place it in the table
			if (table[hash] == null) {
				table[hash] = new LinkedList();
			}

			// our rehash method
			if (numEntries + 1 > maxLoadFactor * tableSize)
				rehash();

			table[hash].add(newEntry);
			++numEntries;
		}
	}

	/** returns iterator for the keys only */
	public Iterator<Entry> iterator() {
		final ArrayList allTogether = new ArrayList();
		for (int i = 0; i < tableSize; ++i) {
			if (table[i] != null) {
				allTogether.addAll(table[i]);
			}
		}
		final int len = allTogether.size();

		Iterator iterator = (new Iterator() {

			int currentPos = 0;

			public boolean hasNext() {
				return (currentPos < len);

			}

			public Object next() {
				Entry entry = (Entry) allTogether.get(currentPos++);
				return entry;

			}

			public void remove() {
				// not implemented
			}
		});
		return iterator;

	}

	public Object remove(Object key) {
		// get the "big" integer corresponding to the object
		int hashcode = key.hashCode();

		// compress down to a table slot
		int hash = hash(hashcode);

		if (!containsKey(key)) {
			return false;
		}

		// now look for the desired Entry
		Entry e = null;
		// table[hash] must be non-null since containsKey is true
		Iterator it = table[hash].iterator();
		int indexTable = -1;
		Object value = null;

		while (it.hasNext()) {
			e = (Entry) it.next();
			if (e.key.equals(key)) {
				indexTable = table[hash].indexOf(e);
				value = e.value;
			}
		}
		if (indexTable == -1)
			return null;
		else {
			table[hash].remove(indexTable);
			--numEntries;
			return value;
		}
	}

	private Entry getEntry(Object key) {
		if (key == null)
			return null;
		if (!containsKey(key))
			return null;
		// get the "big" integer corresponding to the object
		int hashcode = key.hashCode();

		// compress down to a table slot
		int hash = hash(hashcode);

		// now look for the desired Entry
		Entry e = null;
		if (table[hash] == null)
			return null;
		Iterator it = table[hash].iterator();
		while (it.hasNext()) {
			e = (Entry) it.next();
			if (e.key.equals(key)) {
				return e;
			}
		}
		return null;
	}

	public Object get(Object key) {
		if (key == null)
			return null;
		Entry e = getEntry(key);
		return e == null ? null : e.value;
	}

	public String toString() {
		String n = System.getProperty("line.separator");
		StringBuilder sb = new StringBuilder("[");
		for (int i = 0; i < table.length; ++i) {
			if (table[i] != null) {
				Iterator it = table[i].iterator();
				Entry next = null;
				while (it.hasNext()) {
					next = (Entry) it.next();
					sb.append(next + ", ");
				}
			}
		}
		String temp = sb.toString();
		temp = temp.substring(0, temp.length() - 2);
		temp += "]";
		return temp;
	}

	private int hash(int bigNum) {
		return (int) Math.abs(bigNum % tableSize);
	}

	private int loadFactor() {
		return numEntries / tableSize;
	}

	private class Entry {
		private Object key;
		private Object value;

		Entry(Object key, Object value) {
			this.key = key;
			this.value = value;
		}

		public String toString() {
			return key.toString() + "->" + value.toString();
		}

	}

	private void rehash() {
		System.out.println("reshashing... tablesize = " + tableSize);
		LinkedList[] tableTemp = new LinkedList[tableSize * 2];

		int newNum = 0;

		Iterator<Entry> it = this.iterator();
		tableSize *= 2; // we put it here because iterator above uses hash, and hash uses tableSize
		while (it.hasNext()) {

			Entry entry = it.next();

			int hashcode = entry.key.hashCode();
			int hash = hash(hashcode);

			// now place it in the table
			if (tableTemp[hash] == null) {
				tableTemp[hash] = new LinkedList();
			}
			tableTemp[hash].add(entry);
			 //System.out.println("Adding:" + entry.key);
			++newNum;
		}

		// finally replace table;
		numEntries = newNum;
		table = tableTemp;
		
		System.out.println("reshashing... tablesize = " + tableSize + "\n numEntries = " + numEntries);
	}

	public static void main(String[] args) {
		MyHashtable h = new MyHashtable(4);
		for (int i = 0; i < 100; ++i) {
			h.put(i, i);
		}
		System.out.println("tablesize = " + h.tableSize);
		System.out.println("numEntries = " + h.numEntries);
		System.out.println("loadFactor = " + h.loadFactor());
		
		for (int i = 0; i < 50; ++i) {
			h.remove(2 * i); 
		}
		for (int i = 0; i < 33; ++i) {
			h.remove(3 * i);
		}
		for (int i = 0; i < 20; ++i) {
			h.remove(5 * i);
		}

		System.out.println("after removing\ntablesize = " + h.tableSize);
		System.out.println("numEntries = " + h.numEntries);
		System.out.println("loadFactor = " + h.loadFactor());
		

		System.out.println(h);
	}

}
