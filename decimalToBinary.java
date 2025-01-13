
import java.util.*;
public class decimalToBinary {
    public static void main(String[] args) {
        int number;
        int i=0;
        int binary[]=new int[100];
        Scanner sc=new Scanner(System.in);
        number=sc.nextInt();
        while(number!=0){
            binary[i]=number%2;
            number=number/2;
            i++;
        }
        for(int j=i-1;j>=0;j--){
            System.out.print(binary[j]);
        }
    }
}
