package lab_7_2;

public class MinSort {
	int level = 0;

	public String sort(String x) {
		if ((x == null) || (x == ""))
			return "";

		if (x.length() == 1)
			return x;

		Character leftMin = rmin(x);
		if (x.indexOf(leftMin) != x.length()) {
			x = x.substring(0, x.indexOf(leftMin)) + x.substring(x.indexOf(leftMin) + 1);
		} else {
			x = x.substring(0, x.indexOf(leftMin));
		}

		return leftMin.toString() + sort(x);
	}

	public Character rmin(String str) {
		this.level++;
		if (str == null || str.length() == 0) {
			return null;
		}
		System.out.println("level: "+ level + " "  + mx(level) + "string=" + str);
		char ch = str.charAt(0);
		if (str.length() == 1)
			return ch;
		char c = rmin(str.substring(1));
		level--;
		System.out.println("level: " + level + " " + mx(level) + "c = " + c + " compareTo ch = " + ch + "====" + ((ch < c) ? ch : c));
		return (ch < c ? ch : c);
	}

	public String mx(int x) {
		String m = "";
		for (int i = 0; i < x; i++) {
			m += "  | ";
		}

		return m;
	}

}
