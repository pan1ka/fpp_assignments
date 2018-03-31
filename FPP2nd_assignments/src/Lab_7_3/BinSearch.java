package Lab_7_3;

public class BinSearch {

	public BinSearch() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		//System.out.println(BinSearch.search("abcdefgjklmnoprstuxyz", 'i'));

	}

	public static boolean search(String s, char c) {
		int m = s.length() / 2;
		if (m  == 0)
			return false;

		char ch = s.charAt(m);
		//System.out.println(m + " " + s);
		if (ch == c) {
			return true;
		} else if (c < ch) {
			if (search(s.substring(0, m), c))
				return true;
			else
				return false;
		} else if (c > ch) {
			if (search(s.substring(m), c))
				return true;
			else
				return false;
		}

		return false;
	}

}
