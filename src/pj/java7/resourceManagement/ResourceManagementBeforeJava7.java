package pj.java7.resourceManagement;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * If closing the IO is the only purpose of finally we need not necessarily
 * write it in the finally block with the new Java7 code
 * 
 * 
 * See the new approach
 * {@link pj.java7.resourceManagement.ResourceManagementInJava7#main(String[] args)}
 * 
 * 
 * @author philip
 *
 */
public class ResourceManagementBeforeJava7 {
	public static void main(String[] args) {
		BufferedReader br = null;
		try {
			String sCurrentLine;
			br = new BufferedReader(new FileReader("C:/temp/test.txt"));
			while ((sCurrentLine = br.readLine()) != null) {
				System.out.println(sCurrentLine);
			}
		} catch (IOException e) {
			System.out.println("in catch");
			e.printStackTrace();
		} finally {
			System.out.println("in finally");
			try {
				if (br != null)
					br.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}
}