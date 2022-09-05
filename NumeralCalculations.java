import java.util.Scanner;

public class NumeralCalculations {
    public static int NumeralCalculations(int arr[]){
        int n = arr.length;
        int ThisSum=0,MaxSum=0,i,j,k;

        for(i=0;i<n;i++){
            for(j=i;j<n;j++){
                ThisSum=0;      //重新累加子数组
                for(k=i;k<j;k++){
                    ThisSum+=arr[k];
                }
                if(ThisSum>MaxSum){
                    MaxSum=ThisSum;
                }
            }
        }

        return MaxSum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=Integer.parseInt(sc.next());

        //number表示数组的长度
        int[] num=new int[number];

        //对数组元素循环赋值
        for(int i=0;i<number;i++){
            num[i]=(int)sc.nextInt();
        }

        System.out.println(NumeralCalculations(num));

    }
}
