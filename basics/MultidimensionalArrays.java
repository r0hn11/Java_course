package com.complete.basics;
import java.util.Scanner;

public class MultidimensionalArrays {

    public static void createMatrix(int[][] mat){
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                System.out.printf("Enter number for %d%d: ",i+1,j+1);
                mat[i][j] = sc.nextInt();
            }
        }
    }

    public static void printMatrix(int[][] mat){
        System.out.println();
        for(int[] e: mat){
            for(int f: e){
                System.out.print(f+"\t");
            }
            System.out.println();
        }
    }

    public static int[][] add2Matrices(int[][] mat1, int[][] mat2){
        int l1 = mat1.length;
        int l2 = mat1[mat1.length-1].length;
        int l3 = mat2.length;
        int l4 = mat2[mat2.length-1].length;
        int[][] resultMat = new int[l1][l2];
        if(l1==l3 && l2==l4){
            for(int i=0; i<l1;i++){
                for(int j=0; j<l2;j++){
                    resultMat[i][j] = mat1[i][j] + mat2[i][j];
                }
            }
        }
        else
            System.out.println("Error: matrices with different size.");
        return resultMat;
    }

    public static int isSorted(int[] arr){
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]>arr[i]){
                return 0;
            }
            else continue;
        }
        return 1;
    }

    public static void main(String[] args){

        // Multidimensional arrays are the arrays of arrays. An array inside an array index.

        // 1D array
        int[] marks;
        marks = new int[] {2,5,7,8,10};
        // 2D array
        int[][] flats;
        // 3D array
        int[][][] matrix;

        flats = new int[3][2];
        flats[0][0] = 101;
        flats[0][1] = 102;
        flats[1][0] = 201;
        flats[1][1] = 202;
        flats[2][0] = 301;
        flats[2][1] = 302;

        int[][] flats2 = {
                {1,2},
                {4,5},
                {7,8}
        };

        for(int[] e: flats){
            for(int f: e){
                System.out.print(f+"\t");
            }
            System.out.println();
        }

        for(int[] e: flats2){
            for(int f: e){
                System.out.print(f+"\t");
            }
            System.out.println();
        }

        for(int i=0;i<flats.length;i++){
            for(int j=0;j<flats[i].length;j++){
                if(flats[i][j]==301 || flats[i][j]==102){
                    System.out.print("_\t");
                    continue;
                }
                System.out.print(flats[i][j]+"\t");
            }
            System.out.println();
        }

        int[][] mat = new int[3][3];
//        createMatrix(mat);
//        printMatrix(mat);

        printMatrix(add2Matrices(flats, flats2));
        System.out.println("\nSorted result: "+isSorted(marks));

    }
}
