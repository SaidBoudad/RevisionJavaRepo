package BasicsJava;

public class BasicExercises3 {
    public static void main(String[] args) {
        //1 capitalize 1st letter in a String
        String text = "said is learning java programming now";
        if (text!= null){
            String r = text.substring(1,text.length());
            String f = text.substring(0,1).toUpperCase().concat(r);
            System.out.println(text.substring(0,1).toUpperCase() + text.substring(1,text.length()));
        }
        String[] arrayOfString = text.split(" ");
        for (String each:arrayOfString){
           String h = each.substring(1,each.length());
           String g = each.substring(0,1).toUpperCase().concat(h);
           System.out.print(g + " ");
       }System.out.println("\n");

        //2 Encryption and decryption
        int key = 10;
        char[] stingToCharArray = text.toCharArray();
        for (char c:stingToCharArray){
            c += key;  //to decrypt c-= key
            System.out.print(c);
        }

        //3



    }
}
