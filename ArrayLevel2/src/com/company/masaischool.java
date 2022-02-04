package com.company;
/*
import java.util.Objects;
import java.util.Scanner;

public class masaischool {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col =  sc.nextInt();
        char[][] matrix = new char[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = sc.next().charAt(0);
            }
        }
        boolean underChecking = false;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if(matrix[i][j] == 'm') {
                    boolean[][] visited = new boolean[row][col];
                    underChecking=true;
                    String asn = masaiSchoolChenckerInMatrix(matrix,visited,i,j,row,col,"m");
                }
            }
        }
        if (!underChecking) System.out.println("NO");
    }
    static String SreachString = "masaischool";
    public  static String masaiSchoolChenckerInMatrix(char[][] matrix,boolean[][] visited,int row,int col,int max_i,int max_j,String ssf){
        if (Objects.equals(ssf, "masaischool")) return "YES";
        if (row > 0 || col >0 || row<max_i || col <max_j) return "NO";

    }

}

 */
import java.util.*;
class masaischool{
    static int found=0;
    static String ans="masaischool";

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        char[][] arr=new char[row][col];
        for(int i=0;i<row;i++)
            for(int j=0;j<col;j++)
                arr[i][j]=sc.next().charAt(0);
        boolean[][] check =new boolean[row][col];
        for(int i=0;i<row;i++)
            for(int j=0;j<col;j++)
            {
                if(arr[i][j]=='m')
                    funct(arr,check,i,j,"m",1);

            }
        if(found==0)System.out.println("NO");
        else System.out.println("YES");
    }
    static void funct(char[][] arr,boolean[][] check,int row,int col,String str,int z)
    {   if(z==11) return;
        if(row<0||row==arr.length||col<0||col==arr[0].length)return;

        if(str.equals("masaischool"))
        {
            found=1;return;
        }
        if(check[row][col])return;
        check[row][col]=true;
        if(found == 0 && row <= arr.length - 1 && col <= arr[0].length - 1 && arr[row + 1][col] == ans.charAt(z)) funct(arr,check,row+1,col,str+arr[row+1][col],z+1);
        if(found == 0 && row <= arr.length - 1 && col <= arr[0].length - 1 && arr[row - 1][col] == ans.charAt(z)) funct(arr,check,row-1,col,str+ans.charAt(z),z+1);
        if(found == 0 && row <= arr.length - 1 && col <= arr[0].length - 1 && arr[row][col + 1] == ans.charAt(z)) funct(arr,check,row,col+1,str+ans.charAt(z),z+1);
        if(found == 0 && row <= arr.length - 1 && col <= arr[0].length - 1 && arr[row + 1][col - 1] == ans.charAt(z)) funct(arr,check,row,col-1,str+ans.charAt(z),z+1);
        if(found == 0 && row <= arr.length - 1 && col <= arr[0].length - 1 && arr[row + 1][col + 1] == ans.charAt(z)) funct(arr,check,row+1,col+1,str+ans.charAt(z),z+1);
        if(found == 0 && row <= arr.length - 1 && col <= arr[0].length - 1 && arr[row - 1][col - 1] == ans.charAt(z)) funct(arr,check,row-1,col-1,str+ans.charAt(z),z+1);
        if(found == 0 && row <= arr.length - 1 && col <= arr[0].length - 1 && arr[row + 1][col - 1] == ans.charAt(z)) funct(arr,check,row+1,col-1,str+ans.charAt(z),z+1);
        if(found == 0 && row <= arr.length - 1 && col <= arr[0].length - 1 && arr[row - 1][col + 1] == ans.charAt(z)) funct(arr,check,row-1,col+1,str+ans.charAt(z),z+1);
        check[row][col]=false;
    }
}
