package pj.java11.StringChanges;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class ReadWriteString {
	private static final String FILE_PATH = System.getProperty("user.dir")
			+ "/src/pj/java7/nio/watch_service/test.properties";

	// URI txtFileUri =
	// getClass().getClassLoader().getResource("helloworld.txt").toURI();
	public static void main(String[] args) throws IOException {
		// Read file as string
		String content = Files.readString(Path.of(FILE_PATH), Charset.defaultCharset());
		System.out.println("content" + content);
		
		// Write string to file
		Path tmpFilePath = Path.of(File.createTempFile("tempFile", ".tmp").toURI());

		Path returnedFilePath = Files.writeString(tmpFilePath, "Hello World!", Charset.defaultCharset(),
				StandardOpenOption.WRITE);
	}
}
