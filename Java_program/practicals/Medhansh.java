// Java program to show multiple
// type parameters in Java Generics

// We use < > to specify Parameter type
class Sum<T, U>
{
	T obj1; // An object of type T
	U obj2; // An object of type U

	// constructor
	Sum(T obj1, U obj2)
	{
		this.obj1 = obj1;
		this.obj2 = obj2;
	}

	// To print objects of T and U
	public void print()
	{
		System.out.println(obj1);
		//System.out.println(obj2);
	}
}

// Driver class to test above
class Medhansh
{
	public static void main (String[] args)
	{
		Sum <Integer, Integer> obj =
			new Sum<Integer, Integer>(16, 15);

		obj.print();
	}
}
