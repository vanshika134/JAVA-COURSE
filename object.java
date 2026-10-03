// Object Oriented Programming
// An object has (Properties and Behaviour)

class Calculator
{
    int a;      // variable
    public int add(int n1, int n2)    // method 
    {
        // System.out.println("ADD ");
        // return 0;
        int r = n1 + n2;
        return r;
    }
}

public class object 
{
   public static void main(String[] args) 
   {
       int num1 = 3;
       int num2 = 3;    // primitive values
       Calculator calc = new Calculator();    //reference variable   (new - object)
     //    int result = calc.add(4,5); 
       int result = calc.add(num1,num2); 
       System.out.println(result);

     //    add();    object . java :18: error: cannot find symbol
     //    System.out.println("Sum " + (num1 + num2));
   } 
}
