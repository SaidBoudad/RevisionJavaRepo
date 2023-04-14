package BasicsJava;

public class BasicExercises2 {
    public static void main(String[] args) {
        //1 sum of all numbers b/n two numbers
        int result = sum(10, 20);
        System.out.printf("the sum is %d ",result);
    }
    public static int sum(int start, int end) {
        if (end > start) {
            return end + sum(start, end - 1);
        } else {
            return end;//base case
        }
    }

}
