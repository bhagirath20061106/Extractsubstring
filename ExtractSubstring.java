package bhagirath;

import java.util.Scanner;

public class ExtractSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter string: ");
        String o = sc.nextLine();
        
        System.out.print("Enter the starting and ending index: ");
        int si = sc.nextInt();
        int ei = sc.nextInt();
        
        String subs = o.substring(si, ei);
        System.out.println("Extracted Substring: " + subs);
    }
}
