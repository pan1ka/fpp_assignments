package Lab_9_2;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

public class SymbolBalancer {
	String ODD_DELIMITER = ""+(char)0;
	String filename;
	String text;
	char[] left;
	char[] right;
	String usedDelimiters;
	Stack<Character> st = new Stack<Character>();
	public SymbolBalancer(String filename) {
		this.filename = filename;
		readFile();
	}
	public void setText(String text) {
		this.text = text;
	}
	
	boolean symbolsBalanced(String delimiters){
		usedDelimiters = delimiters;
		
		
		Character tchar;
		for(int i=0; i<text.length();i++) {
			tchar = text.charAt(i);
			if(checkOpen(tchar))
			{
				st.push(tchar);
			}
			
			if(checkClosed(tchar)){
				if (st.empty())
					return false;
				
				int is = usedDelimiters.indexOf(tchar);
				Character openingSymbol = usedDelimiters.charAt(is-1) ;
				
				if(!st.pop().equals(openingSymbol)){
					return false;
				};
			}
		    
			// other symbols are ignored
		}
		
		if (st.empty())
			return true;
		
		return false;
		
	}
	
	/*
	 * Check first element of brackets
	 * */
	public boolean checkOpen(Character c) {
		for(int i=0; i<usedDelimiters.length();i=i+2) {
			if(usedDelimiters.charAt(i) == c)
				return true;
		}
		
		return false;
	}
	
	
	/*
	 * Check second-closing element
	 * */
	public boolean checkClosed(Character c) {
		for(int i=1; i<usedDelimiters.length();i=i+2) {
			if(usedDelimiters.charAt(i) == c)
				return true;
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		SymbolBalancer sb = new SymbolBalancer("Employee.java");
		System.out.println(sb.symbolsBalanced("[]{}<>()||"));
		System.out.println(sb.st.toString());
	}
	void readFile() {
		try {
			Scanner sc = new Scanner(new File(filename));
			sc.useDelimiter(ODD_DELIMITER);
			text = sc.next();
			System.out.println(text);
			sc.close();
		}
		catch(FileNotFoundException ex) {
			System.err.println("File Not Found Exception "+ex.getMessage());
		}
	}
	
}