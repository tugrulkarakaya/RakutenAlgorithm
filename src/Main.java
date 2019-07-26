import java.util.Arrays;

public class Main {
private static int deneme;
    public int solution(int[] A) {
        int deneme = 4;

        double sum=0;
        for (int a :A) {
            sum += Math.pow(2,a);
        }
        double residual =sum;
        int count = 0;

        while(residual>1){
            count++;
            int biggestNumber = getLogXofBase2(residual);
            residual = residual-Math.pow(2,biggestNumber);
        }
        count += residual;
        return count;
    }

    private int getLogXofBase2(double x)
    {
        return (int)Math.floor(Math.log(x)/Math.log(2));
    }
    public static void main(String[] args) {
        int[] A = {3,2,4,6,0,0,1};
        System.out.println(new Main().solution(A));
    }
}
