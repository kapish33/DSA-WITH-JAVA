package com.company;

public class Number_of_Students_Unable_to_Eat_Lunch {
    public static void main(String[] args) {
        int[] students = {1,1,0,0}, sandwiches = {0,1,0,1};
        System.out.println(countStudents(students,sandwiches));
    }
    public static int countStudents(int[] students, int[] sandwiches) {
        int[] database= {0,0};

        for (int i = 0;i<students.length;i++){
            database[students[i]]+=1;
        }
        int let_eaten_sand = 0;
        while (let_eaten_sand<sandwiches.length){
            if (database[sandwiches[let_eaten_sand]]>0){
                database[sandwiches[let_eaten_sand]]-=1;
            }else {
                break;
            }let_eaten_sand+=1;
        }
        return sandwiches.length-let_eaten_sand;
    }
}
