package pj.java12.teeing_collector;

public class Employee 
{
    private long id;
    private String name;
    private double salary;
 
    public Employee(long id, String name, double salary) {
        super();
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
 
    //Getters and setters
 
    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
    }

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
}
