// Given an integer n, the number of teams participating in a knockout tournament.

// The rules for the tournament are -

// -> If the number of teams is even in a particular round, then each team gets paired with another team. A total of n/2 matches are played in that round and the n/2 winners advance to the next round.

// -> Else, one random team gets a bye for the next round and n-1 teams get paired and n-1/2 matches are played. Here n-1/2 winners advance to the next round.

// There will a winner of this knockout tournament. Find the total number of matches played in the tournament until the winner is decided.


// Input
// The first line of the input contains one integer t (1 ≤ t ≤ 10) — the number of test cases. Then t test cases follow.

// The first line of each test case contains a single integer n (1 ≤ n ≤ 1000).


// Output
// For each test case, print the answer: The number of matches.


// Sample Input 1 

// 2
// 2
// 3
// Sample Output 1

// 1
// 2
import java.util.*;
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            int n = sc.nextInt();
            int count = 0;
            while(n>1){
                if(n%2==0){
                    n = n/2;
                    count++;
                }
                else{
                    n = n-1;
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}