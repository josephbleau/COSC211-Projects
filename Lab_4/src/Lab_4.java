/* COSC 211
   LAB 4 
   File IO
    Joseph Bleau
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Lab_4 {

	public static void main(String[] args) {
		try {
			File infile = new File("test.txt");
			FileInputStream in = new FileInputStream(infile);
			FileOutputStream out = new FileOutputStream("out.txt");
			
			int c;
			int lastspace = 0; // will set value to 1 if the last byte encountered was a space
			int bytes = 0;
			
			while((c = in.read()) != -1)
			{
				// If we encounter a space and it's the first non-contiguous one we've encountered
				// we will set last space to 1, write the space, and move on. If we encounter a space and
				// it's the second or more contiguous one, we will ignore it, as not to write multiple spaces.
				// If we encounter a non space, we will reset our lastspace flag.
				
				if(c == (char) ' ' && lastspace == 0)
					lastspace = 1;
				else if(c == (char) ' ' && lastspace == 1)
					continue;
				else
					lastspace = 0;
				
				out.write((char)c);
				bytes++;
			}
			
			System.out.println(bytes + " bytes moved.");
			in.close();
			in = null;
			out.flush();
			out.close();
			System.gc();  // Force a collection so that we're positive our old input stream isn't lingering around locking our file.
			
			// Adios!
			infile.delete();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}
}