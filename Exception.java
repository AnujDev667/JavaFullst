/*
Exception: An event that disrupts the normal flow of the program's execution.

Try Block: The block of code that is monitored for exceptions. If an exception occurs, it is thrown.

Catch Block: A block of code that handles the exception. It is executed if an exception occurs in the try block.

Finally Block: A block that is always executed, whether or not an exception occurs, typically used for cleanup activities.

Throw: Used to explicitly throw an exception.

Throws Clause: Used to declare the exceptions that a method can throw, enabling them to be handled by the calling method.
*/
// public class Exception {
// 	public static void main(String args[]) {
// 		int i = 4;
// 		int j = 0;
// 		int result=0;
// 		int nums[] = {2,3,5,6};
// 		System.out.println(nums[4]);   // Array index out of bounds
// 		try {
// 			result = i/j;
// 		}
// 		catch(Exception e) {
// 			System.out.println("Something went Wrong");
// 		}
// 		System.out.println(result);           
// 		System.out.println("Bye");          // Exception
// 		// output Sonething went wrong   and 0   and Bye
// 	}
// }


//	public static void main(String[] args) {
//		try {
//			int[] arr = new int[3];
//			System.out.println(arr[4]);   //this will throw arrayindexoutofbound exception
//		
//		}catch(ArrayIndexOutOfBoundsException e) {
//		System.out.println("Array index is out of bounds");
//	
//		}finally {
//			System.out.println("Finally block always executes");
//		}
//		}
class AgeInvalidException extends Exception {
    public AgeInvalidException(String message) {
        super(message);
    }
}

 public class Exception {
    static void validateAge(int age) throws AgeInvalidException {
        if (age < 18) {
            throw new AgeInvalidException("Age is invalid for voting!");
        } else {
            System.out.println("Welcome to voting!");
        }
    }

    public static void main(String[] args) {
        try {
            validateAge(15);
        } catch (AgeInvalidException e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }
    }
}


