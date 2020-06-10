package pj.java5.anotations;

import java.lang.reflect.Method;

public class RunTests {
	public static void main(String[] args) throws Exception {
		int passed = 0, failed = 0;
		for (Method m : Class.forName(args[0]).getMethods()) {
//			System.out.println(m.getAnnotations());
//			System.out.println(args[0]);
//			System.out.println(m.getName());
			if (m.isAnnotationPresent(Test.class)) {
				// pj.java5.anotations.Test.class

				try {
					m.invoke(null);
					passed++;
				} catch (Throwable ex) {
					System.out.printf("Test %s failed: %s %n", m, ex.getCause());
					failed++;
				}
			}
		}
		System.out.printf("Passed: %d, Failed %d%n", passed, failed);
		System.out.println("Philip please make sure that you ran the class by passing the file name under test. "
				+ "i.e in elipse run as Programe arguments pj.java5.anotations.AnotationTesterTwo");
	}
}
