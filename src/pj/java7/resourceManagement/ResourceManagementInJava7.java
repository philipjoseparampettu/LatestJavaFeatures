package pj.java7.resourceManagement;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * There are two things to closely watch:
 *
 * File resource (BufferedReader) is opened in try block in special manner
 * (inside small brackets). Finally block is completely gone.
 * 
 * See the old approach
 * {@link pj.java7.resourceManagement.ResourceManagementBeforeJava7#main(String[] args)}
 * ResourceManagementBeforeJava7
 * 
 * @author philip
 *
 */
public class ResourceManagementInJava7 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new FileReader("C:/temp/test.txt"))) {
			// For multiple resources
			// try (
			// java.util.zip.ZipFile zf =
			// new java.util.zip.ZipFile(zipFileName);
			// java.io.BufferedWriter writer =
			// java.nio.file.Files.newBufferedWriter(outputFilePath, charset)
			// ) {
			//
			String sCurrentLine;
			while ((sCurrentLine = br.readLine()) != null) {
				System.out.println(sCurrentLine);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}