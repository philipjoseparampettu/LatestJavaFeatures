package pj.java5.anotations;

/**
 * Associates a copyright notice with the annotated API element.
 */
public @interface Copyright {
	// since its only single attribute, it needs to have the name value; This allows
	// it to be used in the code without having to specify the key value pair in
	// source code
	String value();
}
