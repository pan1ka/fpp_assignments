package Lab_11_2;

import java.util.HashMap;
import java.util.List;

public class Schur {
	int cnt;
	int sum;
	private HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();

	public boolean checkForSum(List<Integer> a, int sum) {
		cnt = 0;
		this.sum = sum;
		a.forEach(e -> countMe(e));

		return cnt > 1 ? true : false;
	}

	public void countMe(int e) {

		if (h.containsKey(e)) {
			System.out.println("key: " + e + " value: " + h.get(e) + " = " + sum + "; cnt = " + cnt);
			cnt++;
			h.remove(e); // because we found it once and we don't need to count next element;
		} else
			h.put(sum - e, e); // we assume that 5-1 = 4, next time we find 4 we increment cnt;
	}

}
