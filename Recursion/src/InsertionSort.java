public class InsertionSort {
    public static void main(String[] args) {
        int[] arr={6,8,9,14,13,15,5};
        sort(arr);

    }

    static void sort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int j=i;
            while(j >0 && arr[j-1]>arr[j]){
                //swap
                int temp=arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=temp;
                j--;
            }

        }
        System.out.println("After insertion sort: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
