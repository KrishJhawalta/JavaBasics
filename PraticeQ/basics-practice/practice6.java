package PraticeQ;

public class practice6 {
    public static void main(String[]args) {

        // Question1: 5float and calculate the sum
        double[] n = {33.2, 3.2, 66.2, 7.2};
        int sum = 0;
        for (double no : n) {
            sum += no;
        }
        System.out.println(sum);

        // Question2: Check whether an given integer is in array or not
        int[] num = {1, 4, 55, 2};
        int numb = 6;
        boolean found = false;
        for (int nu : num) {
            if (numb == nu) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("got it");
        } else {
            System.out.println("not found");
        }

        // Question3: find average marks in array from physics students
        int[] marks = {44, 90, 98};
        int sum1 = 0;
        for (int markss : marks) {
            sum1 += markss;
        }
        System.out.println(sum1 / 3);


        // Question4: wap to add matrices of 2x3
        int[][] firstmatrix = {
                {1, 2, 3},
                {4, 5, 6}
        };

        int[][] secondmatrix = {};
//               {3,4,-1},
//               {4,5,6}
//       };
//
//       int[][] result = new int[2][3];
//       int i =0;
//       for(int)
//

    //  Question 5: program to reverse an array
        int [] reverse = {1,2,3,4,5};
        for(int r= reverse.length-1; r>=0; r--)
        {
            System.out.println(reverse[r]);}


    // Question 6: write a program to find maxiumum number in array

        int [] mnum = {1,2,3,4,55};
        int sum2 = 0;
        for(int s: mnum){
            if(s>sum2){
                sum2 = s;
            }
        }
        System.out.println(sum2);

    // Quesiton 7: Write a program to find minimum number in array
    int [] snum = {1,-2,3,4,5};
    int mini1 = snum[0];
    for(int ms: snum){
        if(ms<mini1){
            mini1 = ms;
        }
    }
        System.out.println(mini1);

// Question 8: check whether an array is sorted or not

        int [] unsorted = {33,2,4,2,52,1};
        Boolean sor = true;
        for(int s=0; s<unsorted.length; s++){
            if(unsorted[s]> unsorted[s+1]){
                sor = false;
                break;
            }
        }if(sor
        ){
            System.out.println("It is sorted");
        }else{
            System.out.println("not sorted");
        }




        }
    }