package pj.java5.anotations;

/**
 * Describes the Request-For-Enhancement(RFE) that led to the presence of the
 * annotated API element.
 * 
 * PJ Notes : Anotation methods should must not have any parameters or a throws
 * clause.
 */
public @interface RequestForEnhancement {

	int id();

	String synopsis();

	String engineer() default "[unassigned]";

	String date() default "[unimplemented]";
}
