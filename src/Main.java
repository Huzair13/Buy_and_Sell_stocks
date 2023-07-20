import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the size of the array !!! ");
        int size= scanner.nextInt();

        int array[]=new int[size];
        for(int i=0;i<size;i++){
            array[i]=scanner.nextInt();
        }

        int maxProf=findMaxProfit(array,size);
        System.out.println(maxProf);

    }

    private static int findMaxProfit(int[] array, int size) {

        int minIndex=-1;
        int minNum=Integer.MAX_VALUE;
        for(int iterator=0;iterator<size;iterator++){
            if(array[iterator]<minNum){
                minNum=array[iterator];
                minIndex=iterator;
            }
        }

        int maxNum=Integer.MIN_VALUE;
        for(int iterator=minNum;iterator<size;iterator++){
            if(array[iterator]>maxNum){
                maxNum=array[iterator];
            }
        }
        return maxNum-minNum;
    }
}