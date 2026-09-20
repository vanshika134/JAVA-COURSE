public class Datatype 
{
    public static void main(String[] args)
    {
        int num = 10;
        System.out.println(num);

        short age = 25;
        System.out.println(age);
        
        byte b = 127;
        //byte b = 129; Error:incompatible types: possible lossy conversion from int to byte
        System.out.println(b);
        
        long population = 1000000000L;
        System.out.println(population);

        float marks = 8.3f;
        // float marks = 8.3;  error
        System.out.println(marks);
        
        double price = 3.5;
        System.out.println(price);

        char grade = 'A';
        // char grade = "A";  Error: incompatible types: String cannot be converted to char
        // char grade = '7';  Allowed
        System.out.println(grade);

        boolean bool = true;
        System.out.println(bool);
    }
}
               
