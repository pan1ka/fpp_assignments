package Lab_13_1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * //PSEUDO-CODE boolean searchForFile(Object file, Object startDir) { Object[]
 * fileSystemObjects = startDir.getContents(); for(Object o: fileSystemObjects)
 * { //base case if(isFile(o) && isSameFile(o,f)) { return true; }
 * 
 * if(isDirectory(o)) { searchForFile(file, o); } } //file not found in startDir
 * return false; }
 */
public class FileSearch {
	static boolean found = false;
	// Store the text that is found in the
	// file that is found in this String variable
	static String discoveredText = null;

	public static boolean searchForFile(String filename, String startDir) {
		File f = new File(startDir);

		File[] fileSystemObjects = f.listFiles(); // startDir.getContents();
		// System.out.print(Arrays.toString(fileSystemObjects));

		for (File o : fileSystemObjects) {
			// base case
			if (o.isFile() && o.getName().equalsIgnoreCase(filename)) {
				try {
					FileReader reader = new FileReader(o);
					BufferedReader bufreader = new BufferedReader(reader);
					String line = null;
					while ((line = bufreader.readLine()) != null) {
						System.out.println(line);
					}
					bufreader.close();
					reader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}

				return true;
			}

			if (o.isDirectory()) {
				searchForFile(filename, o.toString());
			}
		}
		// file not found in startDir
		return false;
	}

}
