/*Problem Description:
Write a method to check if a given string is a palindrome (reads the same forwards and backwards).

Input: str = ""madam""
Output: true

Input: str = ""hello""
Output: false

Explanation:
For the input string ""madam"", it reads the same forwards and backwards, so the output is true. For ""hello"", it does not, so the output is false.
*/

import java.util.*;
public class assign13{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str=sc.next();
        String str1="";
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            str1=str1+c;
        }
        System.out.println(str+" "+str1);
        if(str.equals(str1))
        System.out.println("True");
        else
        System.out.println("False");
        sc.close();
    }
}