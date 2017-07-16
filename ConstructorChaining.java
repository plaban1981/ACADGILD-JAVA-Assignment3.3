
class ParentConstructorChaining {
	/* Constructor Chaining is nothing but calling one Constructor from another
	 * this- this keyword is used to call constructor within same class
	 * super can be used to call constructor of parent class
	 */
	String name;
	int roll;
	ParentConstructorChaining()
	{
		
		System.out.println("Student Information");
	}
	ParentConstructorChaining(String dept)
	{
		
		System.out.println("Dept: " + dept);
	}
	
}
class ConstructorChaining extends ParentConstructorChaining{
	ConstructorChaining(){
		super("Computer Science");
		System.out.println("Student Information");
	}
	
	ConstructorChaining(String a,int b){
		this();
		System.out.println("Name : " + a + ' ' + "Roll No : " + b);
		
	}
	public static void main(String[] args) {
		ConstructorChaining obj = new ConstructorChaining("Plaban",21);
	}

}