/**
 * Created on 07/Jan/2021 to Find-Three-Largest-Numbers
 */
public class findThreeLargestNumbers {


    public static void findTheThreeLargest(int[] arrayForSearch){

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        //Check if the array contains at least 3 elements
        if(arrayForSearch.length < 3){
            System.out.println("The array contains less than 3 elements");
        }

        for(int i = 0; i < arrayForSearch.length; i++){
            if(arrayForSearch[i] > first){
                third = second;
                second = first;
                first = arrayForSearch[i];
                System.out.println("First: " + first);
            }
            else if(arrayForSearch[i] > second){
                third = second;
                second  = arrayForSearch[i];
                System.out.println("Second: "+second);
            }
            else if(arrayForSearch[i] > third){
                third = arrayForSearch[i];
                System.out.println("Third: "+third);
            }
        }
        System.out.println("The first element: " + first + " the second: " + second + " and the third: " + third);
    }

    public static void main(String args[]){
        int[] arrayForSearch = {1,67,4,20,6,9,25,34,100};
        findTheThreeLargest(arrayForSearch);
    }


}
