public class TrainingTsk1 {
    public static void main(String[] args) {
        /*Create a String and if the String is not empty perform the following: if the String has an odd number
          of characters and has 3 or more characters, print the character in the middle of the String.
          For Example String str=hello =>l*/

        String name="Ikram";
        if(!name.isEmpty()){
            if(name.length()%2!=0 && name.length()>=3){
                int len=name.length();        // Finding string length
                int middle = len/2 ;           // Finding middle index of string
                char c = name. charAt(middle);
                System.out.println(c);            //printing the middle Char of a name String

            }
    }
}}
