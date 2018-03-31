package duplicates_2_6;

import java.util.Arrays;

public class Prog6 {
	
	public static void main(String[] args) {
		testRemoveDups();
	}
	public static void testRemoveDups() {
		String[] testData = { "horse", "dog", "cat", "horse", "dog", "dog", "horse"};
		String[] abc = removeDups(testData);
		 /*for(int i=0; i<abc.length; i++) {
	        	System.out.println(abc[i]);
	        }*/
	}
	
	public static String[] removeDups(String[] arrayWithDuplicates) {
		
		System.out.println("________________________"); 
        System.out.println("Array With Duplicates : ");
         
        for (int i = 0; i < arrayWithDuplicates.length; i++)
        {
            System.out.print(arrayWithDuplicates[i]+"\t");
        }
        System.out.println();
        //Assuming all elements in input array are unique
         
        int numOfUniqueElements = arrayWithDuplicates.length;
         
        //Comparing each element with all other elements
         
        for (int i = 0; i < numOfUniqueElements; i++) 
        {
            for (int j = i+1; j < numOfUniqueElements; j++)
            {
                if(arrayWithDuplicates[i] == arrayWithDuplicates[j])
                {
                    //Replace duplicate element with last unique element, so we can say that the start of our array is always unique
                    arrayWithDuplicates[j] = arrayWithDuplicates[numOfUniqueElements-1];
                     
                    //Decrementing numOfUniqueElements
                    numOfUniqueElements--;
                     
                    //Decrementing j in order to check i index and j index again.
                    j--;
                }
            }
        }
         
        String[] arrayWithoutDuplicates = new String[numOfUniqueElements];
        
        for(int i=0; i<numOfUniqueElements; i++) {
        	arrayWithoutDuplicates[i] = arrayWithDuplicates[i];
        }
         
        System.out.println("Array With Duplicates : ");
        for (int i = 0; i < arrayWithoutDuplicates.length; i++)
        {
            System.out.print(arrayWithoutDuplicates[i]+"\t");
        }
        
        System.out.println();
        
        return arrayWithoutDuplicates;

	}

	

}
