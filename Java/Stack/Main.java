import java.util.Scanner;

public class Main extends Stack
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);	// For taking Input
		
		int Element = 0, size_ofStack = 0, operation;

		Stack stack = new Stack();

		while (true)
		{
			System.out.println("\nStack Operations\n");
			System.out.println("1. push()");
			System.out.println("2. pop()");
			System.out.println("3. display()");
			System.out.println("4. exit()");

			System.out.print(":: ");
			operation = sc.nextInt();

			switch(operation)
			{
				case 1:
					System.out.print("\nElement to push: ");
					Element = sc.nextInt();

					stack.push(Element);

					break;

				case 2:
					stack.pop();

					break;

				case 3:
					stack.printStack();

					break;

				case 4:
					System.exit(0);
					break;

				default:
					System.out.println("\nWrong Operation");
					break;
			}
		}
	}
}



