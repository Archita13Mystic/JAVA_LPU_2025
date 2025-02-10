// Problem Description:

// Write a program to swap two integer variables without using a temporary variable.

// Input: a = 5, b = 10
// Output: a = 10, b = 5

// Explanation:
// The program swaps the values of a and b using arithmetic or bitwise operations, resulting in a being 10 and b being 5.


class Assign12{
    public static void main(String args[]){
        int a=5,b=10;
        System.out.println("Before swapping\na="+a+"\nb="+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("Now\na="+a+"\nb="+b);
    }
}