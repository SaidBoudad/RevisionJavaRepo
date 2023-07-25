package programs;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        //1-create an array with n elements given by user
        //Integer array
//        Scanner sacn = new Scanner(System.in);
//        System.out.println("give me the length of the array");
//        int n = sacn.nextInt();
//        int[] arr = new int[n];
//        System.out.println("enter " + n +" integers");
//        for (int i=0;i<arr.length;i++){
//            arr[i] = sacn.nextInt();
//        }
//        System.out.println(Arrays.toString(arr));
//        //Points array
//        Point[] arr1 = new Point[n];
//        for (int i=0;i<arr1.length;i++){
//            System.out.println("enter integers of point " + (i+1) + " : ");
//            arr1[i] = new Point(sacn.nextInt(),sacn.nextInt());
//        }
//        for(Point p:arr1)
//            System.out.println(" ("+ p.x + ", " + p.y +")");

        //2-program display the sum , product and average of an array
        int[] arr2 = {1, 2, 3, 6, 12, 24};
        System.out.println(sum(arr2));
        System.out.println(product(arr2));
        System.out.println(average(arr2));

        //3-display the number of occurrences of an element of the array
        int[] arr3 = {1, 2, 0, 2, 1, 12, 24, 3, 6, 12, 0, 1, 2, 24};
        int[] elementToFind = {0, 1, 2, 12, 24, 7};
        findOcurrencesOfElements(elementToFind, arr3);

        //4-display the max and the min elemnt of an array
        System.out.println(Arrays.toString(findMaxMin(arr3)));

        //5-put the odd elemnts of an arraybefore the even elements
        System.out.println(Arrays.toString(reorganizeOddEven(arr3)));
        System.out.println(Arrays.toString(reorganizeOddEven2(arr3)));
        
        //6-print the sum of each row in a two dimensional array
        int[][] twoDArray = {{1,2,3,4},{1,2,3,8},{10,10,10,10}};
        printTheSumOfEachRow(twoDArray);
        printTheSumOfEachColumn(twoDArray);

        //7-print the max of each row of an array
        printTheMaxOfEachRow(twoDArray);
        printTheMaxOfEachColumn(twoDArray);



    }


    //2
    private static double average(int[] arr2) {
        double aver = 0;
        aver = sum(arr2) / arr2.length;
        return aver;
    }

    //2
    private static int product(int[] arr2) {
        int prod = 1;
        for (int i : arr2)
            prod *= i;
        return prod;
    }

    //2
    private static int sum(int[] arr2) {
        int sum = 0;
        for (int i : arr2)
            sum += i;
        return sum;
    }

    //3
    private static void findOcurrencesOfElements(int[] arr, int[] array) {

        for (int i = 0; i < arr.length; i++) {
            int ocuurences = 0;
            for (int j = 0; j < array.length; j++)
                if (arr[i] == array[j])
                    ocuurences++;
            System.out.println("the " + arr[i] + " occurres " + ocuurences + " time");
        }
    }
    //4
    private static int[] findMaxMin(int[] arr3) {
        int  max = arr3[0];
        int  min = arr3[0];
        for(int i=1;i<arr3.length;i++) {
            max = (max<arr3[i]) ? arr3[i] : max;
            min = (min>arr3[i]) ? arr3[i] : min;
        }
        return new int[] {min,max};
    }
    //5
    //first way
    private static int[] reorganizeOddEven(int[] arr3) {
        int[] oddArr = new int[arr3.length];
        int[] evenArr = new int[arr3.length];
        int j = 0;
        int k = 0;
        for (int i=0;i<arr3.length;i++){
            if(arr3[i]%2!=0){
                oddArr[j++] = arr3[i];
            }
            else {
                evenArr[k++] = arr3[i];
            }
        }
        int[] organizedArr = new int[j + k];
        System.arraycopy(oddArr, 0, organizedArr, 0, j);
        System.arraycopy(evenArr, 0, organizedArr, j, k);
        return organizedArr;
    }
    //second way adding even numbers to the end
    private static int[] reorganizeOddEven2(int[] arr3) {
        int[] organizedArr = new int[arr3.length];
        int j = 0;
        int k = arr3.length-1;
        for (int i=0;i<arr3.length;i++){
            if(arr3[i]%2==0){
                organizedArr[k--] = arr3[i];
            }
            else {
                organizedArr[j++] = arr3[i];
            }
        }copyArray(organizedArr,arr3);

        return organizedArr;
    }
    private static void copyArray(int[] organizedArr, int[] arr3) {
        for (int i=0;i<organizedArr.length;i++)
            arr3[i]=organizedArr[i];
        System.out.println(Arrays.toString(arr3));
    }

    //6
    private static void printTheSumOfEachRow(int[][] twoDArray) {
        for(int i=0;i<twoDArray.length;i++) {
            int sum = 0;
            for (int j=0; j<twoDArray[i].length; j++)
                sum += twoDArray[i][j];
            System.out.println("the sum of the row "+(i+1)+" is : "+sum);

        }
    }
    private static void printTheSumOfEachColumn(int[][] twoDArray) {
        for(int i=0;i<twoDArray[0].length;i++) {
            int sum = 0;
            for (int j=0; j<twoDArray.length; j++)
                sum += twoDArray[j][i];
            System.out.println("the sum of the column "+(i+1)+" is : "+sum);

        }
    }

    //7
    private static void printTheMaxOfEachRow(int[][] twoDArray) {
        for(int i=0;i<twoDArray.length;i++) {
            int max = twoDArray[i][0];
            for (int j=0; j<twoDArray[i].length; j++)
                max = max< twoDArray[i][j] ? twoDArray[i][j]: max;
            System.out.println("the max of the row "+(i+1)+" is : "+max);

        }
    }
    private static void printTheMaxOfEachColumn(int[][] twoDArray) {
        for(int i=0;i<twoDArray[0].length;i++) {
            int max = twoDArray[0][i];
            for (int j=0; j<twoDArray.length; j++)
                max = max< twoDArray[j][i] ? twoDArray[j][i]: max;
            System.out.println("the max of the column "+(i+1)+" is : "+max);

        }
    }

}





