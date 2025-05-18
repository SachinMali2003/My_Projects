public class ReverseString {
public static void main(String[] args) {

    String name = "Sachin";
    String reverse = "";

    for(int i= name.length()-1;i>=0;i--)
    {
        System.out.println(i);
        reverse+=name.charAt(i);
    }
    System.out.println("Original String: "+ name);
    System.out.println("Reverse String: "+reverse);

}
        }


