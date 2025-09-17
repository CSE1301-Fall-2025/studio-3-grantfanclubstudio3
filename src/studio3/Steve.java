import java.lang.Math;
import java.util.Scanner;
public class Steve {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many numbers would you like to search?");
        int n= scan.nextInt();
        boolean numbers[] = new boolean[n+1];
        for (int i = 0; i<n; i++) {
            numbers[i]=true;
        }
        for (int i =2; i<=Math.sqrt(n); i++){
            if (numbers[i]){
            for (int j = i*i; j<=(n); j+=i){
                numbers[j] = false;
            }
        }
        }
        for (int i = 2; i<=n; i++){
            if (numbers[i]==true){
                System.out.print(i+ ", ");
            }
        }
        scan.close();
    }
}
