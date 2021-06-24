package _14_thuat_toan_sap_xep.bai_tap;

public class InsertionSort {
    static int[] list = {2, 3, 2, 5, 6, 1, -2,  14, 12};

    public static void insertionSort(int[] list){
        for(int i = 1; i < list.length; i++){
            int temp = list[i];
            int j;
            for(j = i - 1; j >=0 && list[j] > temp; j--){
                list[j+1] = list[j];
            }
            list[j +1 ] = temp;
        }
    }

    public static void main(String[] args) {
        insertionSort(list);
        for (int i = 0 ; i< list.length; i++){
            System.out.println(list[i]+ " ");

        }
    }
}
