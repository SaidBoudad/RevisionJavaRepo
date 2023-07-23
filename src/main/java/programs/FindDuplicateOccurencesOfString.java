package programs;

import java.util.HashMap;

public class FindDuplicateOccurencesOfString {
    static public String findDuplicateWords(String str){
        HashMap<String,Integer> map = new HashMap<>();
        String[] s = str.split(" ");
        for (String temp:s){
            if (map.get(temp) != null){
                map.put(temp,map.get(temp)+1);
            }else {
                map.put(temp,1);
            }
        }
        System.out.println(map);

        return null;
    }
    public static void main(String[] args) {
        findDuplicateWords("I said said from morocco and and I am am developer");
    }
}
