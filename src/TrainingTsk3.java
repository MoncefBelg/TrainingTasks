import java.util.Scanner;

public class TrainingTsk3 {
    public static void main(String[] args) {
/*Write a program that reads two people's first names and if they expecting boy or girl? Based on the input suggests a name for a baby:
Example Output:
Mom’s first name? Mary
Dad’s first name? Daniel
Boy or Girl? boy
Suggested baby name: DANRY*/

        Scanner sc=new Scanner(System.in);
        System.out.println("Mom's first name?");
        String name1=sc.nextLine();
        System.out.println("Dad's first name?");
        String name2=sc.nextLine();
        System.out.println("Boy or Girl");
        String Gender=sc.nextLine();
if (Gender.equalsIgnoreCase("boy")){
    System.out.println(name1.substring(0,4)+name2.substring(name2.length()-2));
} else if (Gender.equalsIgnoreCase("girl")) {
    System.out.println(name1.substring(0,3)+name2.substring(name1.length()-2));

}else {
    System.out.println("Please Enter a Valid names");
}
    }
}
