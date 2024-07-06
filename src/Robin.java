import Classes.Cookie;
import Classes.LinkedList;
import Classes.Solution;

import java.util.HashMap;
import java.util.Map;

public class Robin {
    public static void main(String[] args) {
        //printItems(10);
        Cookie cookieOne=new Cookie("Green");
        Cookie cookieTwo=new Cookie("Blue");
       // cookieOne.setCookie("yellow");
        System.out.println(cookieOne.getCookie());
        System.out.println(cookieTwo.getCookie());
        LinkedList linkedList=new LinkedList((4));
        //linkedList.append(3);
        //linkedList.append(5);
        //linkedList.printList();
        //linkedList.append(7);

        //linkedList.removeLast();

        //linkedList.prepend(11);
        linkedList.printAll();
        linkedList.removeFirst();
        linkedList.printAll();
        //two sum leetcode
        int[] result = Solution.twoSum(new int[]{2, 7, 11, 15}, 9);
        System.out.println("Indices: " + result[0] + ", " + result[1]);
        //Palindrome sum leetcode
        boolean palindrome=Solution.isPalindrome(121);
        if(palindrome == true){
            System.out.println("it is a palindrome");
        }
        else {
            System.out.println("not a palindrome");
        }
        int roman_to_integer=Solution.romanToInteger("IVII");
        System.out.println(roman_to_integer+": Roman to Integer");

    }




}

