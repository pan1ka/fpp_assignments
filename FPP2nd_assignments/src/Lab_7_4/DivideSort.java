package Lab_7_4;

public class DivideSort {
	int level = 0;
	public DivideSort() {
		// TODO Auto-generated constructor stub
	}
	
	public String divideSort(String s) {
		System.out.println(mx(level) + "Enter:" + s);
		System.out.println(mx(level) + "level:" + level++);
		if ((s.length() == 0) || (s.length() == 1)) {
			System.out.println(mx(level) + "OUT:" + s);
			level--;
			;
			return s;
		}

		int len = s.length();
		int mid = len / 2;

		System.out.println(mx(level) + "len = " + len + " mid = " + (mid));
		String sleft = divideSort(s.substring(0, mid));
		System.out.println(mx(level) + "left: " + sleft);

		String sright = divideSort(s.substring(mid));
		System.out.println(mx(level) + "right: " + sright);

		System.out.println(mx(level) + "level:" + level);
		System.out.println(mx(level) + sleft + " + " + sright);
		String res = (new Merge()).merge(sleft, sright);
		System.out.println(mx(level) +"last: " + res);
		level--;
		return res;
	}
	
	public String mx(int x) {
		String m = "";
		for (int i = 0; i < x; i++) {
			m += "  | ";
		}

		return m;
	}
}
