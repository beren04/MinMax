package first;

import java.util.Arrays;
import java.util.Scanner;

public class MinMaxArrays {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int min,max=0;
        int[] arr = {15,12,788,1,-1,-778,2,0};
        Arrays.sort(arr);
        System.out.println("Enter a number");
        int number=input.nextInt();
        int[] newArr={15,12,788,1,-1,-778,2,0,number};
        Arrays.sort(newArr);
        min =newArr[Arrays.binarySearch(newArr,number)-1];
        max =newArr[Arrays.binarySearch(newArr,number)+1];

        System.out.println(Arrays.toString(arr));
        System.out.println("Min number:"+min);
        System.out.println("Max number:"+max);
    }
}
