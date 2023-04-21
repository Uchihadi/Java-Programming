package javafundamentals;

public class FirstProgram {
    public static void main(String[] arg) {
        int a=2;
        char c='A';
        System.out.println(c+a);
        System.out.println(a+c);
        System.out.println((char)(c+a));
        
        System.out.println("Addition is= " + c + a);
        System.out.println("Addition is= " + (c + a));
        
        System.out.println("Addition is= " + (c + 'A'));
        System.out.println("Addition is= " + c + 'A');
        
    
    }
}

