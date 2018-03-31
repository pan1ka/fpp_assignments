package Lab_6_1;

import java.lang.String;
import java.util.StringJoiner;

public class MyTable {
	private Entry[] entries;
	private Character[] charTable = new Character[26];

	public MyTable() {
		this.entries = new Entry[26];
		int x = 0;
		for (int i = (int) ('a'); i <= (int) ('z'); i++) {
			charTable[x++] = (char) i;
		}
	}

	// returns the String that is matched with char c in the table
	public String get(char c) {
		return entries[java.util.Arrays.asList(charTable).indexOf(c)].toString();
	}

	// adds to the table a pair (c, s) so that s can be looked up using c
	public void add(char c, String s) {
		entries[java.util.Arrays.asList(charTable).indexOf(c)] = new Entry(c, s);
	}

	// returns a String consisting of nicely formatted display
	// of the contents of the table
	public String toString() {
		StringJoiner sj = new StringJoiner("\n", "[", "]");
		for (Entry entry : entries) {
			if (entry != null) {
				sj.add(entry.toString());
			}
		}
		return sj.toString();
	}

	// returns a String consisting of nicely formatted display
	// of the contents of the table
	public String toStringWithNull() {
		StringJoiner sj = new StringJoiner(", ", "[", "]");
		for (Entry entry : entries) {
			if (entry == null) {
				sj.add("null".toString());
			} else {
				sj.add(entry.toString());
			}
		}
		return sj.toString();
	}

	private class Entry {
		public char ch;
		public String str;

		Entry(char ch, String str) {
			this.ch = ch;
			this.str = str;
		}

		public String toString() {
			// implement
			return this.ch + "->" + this.str;
		}
	}

}