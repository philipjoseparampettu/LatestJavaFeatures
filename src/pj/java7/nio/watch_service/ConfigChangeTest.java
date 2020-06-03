package pj.java7.nio.watch_service;

public class ConfigChangeTest {
	private static final String FILE_PATH = System.getProperty("user.dir")+"/src/pj/java7/nio/watch_service/test.properties";

	public static void main(String[] args) {
		ConfigurationChangeListner listner = new ConfigurationChangeListner(FILE_PATH);
		try {
			new Thread(listner).start();
			while (true) {
				Thread.sleep(2000l);
				System.out.println(ApplicationConfiguration.getInstance().getConfiguration("TEST_KEY"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}