package switchCase;

public class switchCaseExample {
public static void main(String[] args) {
    int l=12,b=10;
    double area=0,perimeter=0,diagonal=0;
    char choice='p';
    switch(choice) {
    case 'a': 
    case 'A':    
        area=l*b;
        System.out.println(area);
        break;        
    case 'p':
    case 'P':
        perimeter=2*(l+b);
        System.out.println(perimeter);
        break;
    case 'd':
    case 'D':
        diagonal= Math.sqrt(l*l+b*b);
        System.out.println(diagonal);
        break;
    default:
        System.out.println("PLZ enter correct choice");
    }
    System.out.println("HI"); // Last Line 
}
}
