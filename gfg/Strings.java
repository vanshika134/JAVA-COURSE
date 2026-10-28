import java.util.Scanner;
public class Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[]  arr = {'v','a','n','s','h','i','k','a'};
        // for(int ele : arr)  // ASCII Values will come
        for(char ele : arr)
        {
            System.out.print(ele + " "); 
        }

        // Sting Data Type
        String str = "Vanshika is a girl";
        System.out.println(str);
        String s1 = sc.next();    // agr hmne string me space diya to bs starting ki string print hogi
        System.out.println(s1);  
        String s2 = sc.nextLine();
        System.out.println(s2);

        // charAT()  and length()
        System.out.println(s1.charAt(4));
        System.out.println(s1.length());

        String s3 = sc.nextLine();
        int count = 0;
        for(int i = 0 ; i < s3.length() ; i++)
        {
            char ch = s3.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            {
                count++;
            }
            System.out.println(count);
        }

        // PALINDROME STRING
        

    }
}
