import java.util.Scanner;

class six_two
{
	public static void main(String[] args)
    {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a string:");
		String s1=sc.nextLine();

		StringBuffer sb=new StringBuffer();

		//i) change  the case of the string
		for(char c:s1.toCharArray())
		{
			if(Character.isLowerCase(c))
			{
				sb.append(Character.toUpperCase(c));
			}
			else
			{
				sb.append(Character.toLowerCase(c));
			}
		}
		System.out.println("The string after changing the case is "+sb);
		sb.setLength(0);

		//ii) Reverse the string
		for(int i=s1.length()-1;i>=0;i--)
		{
			sb.append(s1.charAt(i));
		}
		System.out.println("The string after reversing is "+sb);
		sb.setLength(0);

		//iii) compare two strings
		System.out.println("Please enter the second string:");
		String s2=sc.next();
		System.out.println("The strings after comparing "+s1.compareTo(s2));

		//iv) Insert one string into another
		sb.append(s1);
		System.out.println("Enter the string to be inserted:");
		String insert=sc.next();
		System.out.println(sb.append(insert));
		sb.setLength(0);

		//v) Convert the string to uppercase and lowercase
		System.out.println("Uppercase: "+s1.toUpperCase());
		System.out.println("Lowercase: "+s1.toLowerCase());

		//vi) Check whether the character is present in the string and at which position
		int flag=0;
		int index=0;
		System.out.println("Enter a character:");
		char ch=sc.next().charAt(0);
		for(char c:s1.toCharArray())
		{
			if(c==ch)
			{
				index= s1.indexOf(c);
				flag=1;
				break;
			}
		}
		if(flag==0)
		{
			System.out.println("Character not found");
		}
		else
		{
			System.out.println("Position of entered character:"+(index+1));
		}

		//vii) Check whether the string is palindrome or not
		sb.append(s1);
		if(s1.equals(sb.reverse().toString()))
		{
			System.out.println("Entered string is a palindrome");
		}
		else
		{
			System.out.println("Entered string is not a palindrome");
		}
		sb.setLength(0);

		//viii) Check the number of words,vowel and consonants in the string
		int words=0,cons=0,vowels=0;
		s1=s1.toUpperCase();
		for(char c:s1.toCharArray())
		{
			if(c==' ')
			{
				words++;
			}
			else if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
			{
				vowels++;
			}
			else if(c>=65 && c<=97)
			{
				cons++;
			}
		}
		System.out.println("No. of words:"+(words+1));
		System.out.println("No. of vowels:"+vowels);
		System.out.println("No. of consonants:"+cons);
        sc.close();
	}
}