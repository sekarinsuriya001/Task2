package Task2;

class Person1 {
	   private String name;
	   private int age;
	   public Person1(String name, int age) {
	       this.name = name;
	       this.age = age;
	   }
	   public String getName() {
	       return name;
	   }
	   public int getAge() {
	       return age;
	   }
	}
	class Employee extends Person1 {
	   private String employeeID;
	   private double salary;
	   public Employee(String name, int age, String employeeID, double salary) {
	       super(name, age); // Calling the constructor of Person
	       this.employeeID = employeeID;
	       this.salary = salary;
	   }
	   public String getEmployeeID() {
	       return employeeID;
	   }
	   public double getSalary() {
	       return salary;
	   }
	  
	   public void display()
	   {
		   System.out.println(this.employeeID+" "+this.salary+" "+this.getAge()+" "+this.getName());
	   }
	}
	
	 class EmployeeMain
	{
		public static void main(String args[])
		{
			Employee employee=new Employee("Anil", 23, "E101", 40000);
			employee.display();
		}
	}

