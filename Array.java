public class Array{
    public int[] resize(int arr[], int capacity){
        int[] temp  = new int[capacity];
        for(int i = 0; i < arr.length; i++){
            temp[i] = arr[i];
        }
        return temp; 
    }
    public void printArr(int[] arr){
        for (int i = 0; i < arr.length; i++) {
           System.out.println(arr[i]); 
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        Array demo = new Array();
        arr = demo.resize(arr, arr.length * 2);
        demo.printArr(arr);
    }
}