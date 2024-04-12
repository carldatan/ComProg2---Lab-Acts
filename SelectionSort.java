public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int unsorted = 53468721;
        System.out.println("Unsorted: " + unsorted);
        int sorted = 0;
        String str = String.valueOf(unsorted);
        int arr[] = new int[str.length()];
        for(int i = 0; i < str.length(); i++){
            arr[i] = Character.getNumericValue(str.charAt(i));
        }
        for(int i = 0; i < arr.length; i++){
            int min_idx = i;
            for(int j = i + 1; j < arr.length; j++){
                if(arr[j] < arr[min_idx]){
                    min_idx = j;
                }
             
             int tmp = arr[min_idx];
             arr[min_idx] = arr[i];
             arr[i] = tmp;
            }
        }
        String temp = "";
        for(int i = 0; i < arr.length; i++){
            temp += String.valueOf(arr[i]);
        }
        sorted = Integer.valueOf(temp);
        System.out.println("Sorted: " + sorted);
    }
    
}
