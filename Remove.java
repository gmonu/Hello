package hcl;

import java.util.Scanner;

public class Remove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		StringBuilder str = new StringBuilder(s);
		StringBuilder t = new StringBuilder();
		for(int i = 0; i<str.length(); i++)
		{
			for(int j = 0; j<str.length(); j++)
			{
			if(str.charAt(i) == str.charAt(j))
			{
				return;
			}
			else
			{
				t = t.append(str.charAt(i));
			}
		
			}
		}
		System.out.println(t);
	}

}
