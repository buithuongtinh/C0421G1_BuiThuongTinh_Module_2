package _14_thuat_toan_sap_xep.bai_tap;

public class InsertionSortByStep {
    public void insertionSort(int list[]){
        int valueToInsert;
        int holePosition;
        int i;

        //lặp qua tất cả  các số
        for(i = 1 ;i< list.length; i ++){
            // chọn một giá trị để chèn
            valueToInsert = list[i] ;
            // lựa chọn vị trí để chèn
            holePosition = i ;

            //kiểm tra số liền trước có lớn hơn giá trị để chèn ko
            while (holePosition > 0 && list[holePosition - 1] > valueToInsert) {
                list[holePosition] = list[holePosition - 1];
                holePosition--;
                System.out.println("Di chuyển phần tủ: " + list[holePosition]);
            }

            if (holePosition != i) {
                System.out.println(" Chèn phần tử: " + valueToInsert
                        + ", tại vị trí: " + holePosition);
                // chèn phần tử tại vị trí chèn
                list[holePosition] = valueToInsert;
            }
            System.out.println("Vòng lặp thứ "+ i );
            display(list);

        }
    }
    public void display(int list[]){
        int i;
        System.out.print("[");

        // Duyệt qua tất cả các phần tử
        for( i = 0 ; i < list.length; i ++ ){
            System.out.println(list[i]+ " ");
        }
        System.out.print("]\n");
    }

    public static void main(String[] args) {
        // khởi tạo mảng
        int list[] = {14,33,27,10,35,19,42,44};

        InsertionSortByStep insertionSortByStep = new InsertionSortByStep();
        System.out.println("Mảng dữ liệu đầu vào: ");
        insertionSortByStep.display(list);
        System.out.println("-----------------------------");
        insertionSortByStep.insertionSort(list);
        System.out.println("-----------------------------");
        System.out.println("\nMảng sau khi đã sắp xếp: ");
        insertionSortByStep.display(list);
    }

}
