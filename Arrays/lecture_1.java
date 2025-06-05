package Arrays;

//lecture-1 ----[ Introduction of arrays ]

import java.util.Scanner;

public class lecture_1 {
    public static void main(String[] args) {
        int marks[] = new int[100];

        Scanner sc = new Scanner(System.in);

        // int phy;
        // phy = sc.nextInt();

        marks[0] = sc.nextInt();  // phy
        marks[1] = sc.nextInt();   //chem
        marks[2] = sc.nextInt();  // math

        System.out.println("phy : " + marks[0]);
        System.out.println("chem : " + marks[1]);
        System.out.println("math : " + marks[2]);

        // update value

        //marks[2] = 100;
        marks[2] = marks[2] + 1;
        System.out.println("math : " + marks[2]);
    }

}
