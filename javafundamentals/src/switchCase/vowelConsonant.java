package switchCase;

public class vowelConsonant {
	public static void main(String[] args) {
    char ch='o';
    switch(ch) {
    case 'a':     case 'A':    case 'e':     case 'E':    case 'i':    case 'I':    case 'o': 
        case 'O':    case 'u':    case 'U':    
        System.out.println("Vowel");
        break;
    default:
        System.out.println("consonant");
    }
    System.out.println("HI"); // Last Line 
}
}