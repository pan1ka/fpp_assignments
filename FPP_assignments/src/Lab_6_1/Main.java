package Lab_6_1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyTable t = new MyTable();
		t.add('a', "Andrew");
		t.add('b',"Billy");
		t.add('w',"Willie");
		
		System.out.println(t);
		System.out.println("\n");
		System.out.println(t.toStringWithNull());
	}

}
