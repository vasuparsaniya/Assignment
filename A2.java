import java.util.Scanner;

class A2
{
    // Function to check if the
    // number is palindrome
    static boolean isPalindrome(int n)
    {
        // if divisible by 11 then true
        if (n % 11 == 0)
        {
            return true;
        }
     
        // if not divisible by 11
        return false;
    }
     
    // Driver code
    public static void main(String[] args)
    {
		int num;
		//Scanner s = new Scanner(System.in);
        //System.out.print("Enter number:");
        //n = s.nextInt();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number:");
		num = s.nextInt();
        System.out.println(isPalindrome(num) ?
                                   "Palindrome" :
                               "Not Palindrome");
    }
}