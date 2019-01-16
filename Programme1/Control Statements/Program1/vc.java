import java.util.Scanner;
public class vc{
    public static void main(String[]args){
        Scanner Input=new Scanner(System.in);
        System.out.println("Enter the alphabet");
        char ch = Input.next().charAt(0);
        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(ch + " is vowel");
                break;
            default:
                System.out.println(ch + " is consonant");
        }
    }
}