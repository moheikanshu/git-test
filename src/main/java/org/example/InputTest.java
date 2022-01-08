package org.example;

import java.nio.file.Path;
import java.util.Arrays;
import java.util.Date;
import java.util.Objects;
import java.util.Scanner;

public class InputTest {
    public static void main(String[] args) {
//        int[] arr1 = {1,2,3,4,5,};
//        System.out.println(Arrays.toString(arr1));
//          for(int i : arr1){
//              System.out.println(i);
//          }
        System.out.println(new Date());
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        Objects.requireNonNull(name,"The name can not be null!");
        System.out.println("Name:"+name);
    }
}
