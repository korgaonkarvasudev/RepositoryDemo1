class Variable{

	int rollNo ; // Global Varible
	String name ; // Global Varibles
	String address ; // Global Varibles

	//method calling
	public void m1(){
			System.out.println("....inside m1 method...");
			int id =200; //Local Varible
			String lastname = "Vighnesh"; //Local Variable
			System.out.println(id);//200
			System.out.println(lastname);//Vighnesh

			
			}		
	
	public static void main(String[] args)  /// main method
		{
			System.out.println(".....Variable Program...");
			Variable test = new Variable();  /// object creation
			System.out.println(test.rollNo); /// Global variable calling
			System.out.println(test.name);
			System.out.println(test.address);
			test.m1(); /// method calling
		}

}