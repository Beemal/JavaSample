package com.forte.grp;

import java.util.Scanner;
import java.util.Stack;

public class Braces {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String str = sc.next();
	sc.close();
	if(CheckParentesis(str))
		System.out.println("balanced");
	else
		System.out.println("not balanced");
}
public static boolean CheckParentesis(String str)
{
    if (str.isEmpty())
        return true;

    Stack<Character> stack = new Stack<Character>();
    for (int i = 0; i < str.length(); i++)
    {
        char current = str.charAt(i);
        if (current == '{' || current == '(' || current == '[')
        {
            stack.push(current);
        }


        if (current == '}' || current == ')' || current == ']')
        {
            if (stack.isEmpty())
                return false;

            char last = stack.peek();
            if (current == '}' && last == '{' || current == ')' && last == '(' || current == ']' && last == '[')
                stack.pop();
            else 
                return false;
        }

    }

    return stack.isEmpty();
}

}
