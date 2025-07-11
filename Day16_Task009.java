public class Day16_Task009 {
    public static void main(String[] args) {
        int a[] = {5, 2, 8, 3, 1, 6, 4};
        int n = a.length;

        System.out.println("Original array:");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }

        System.out.println();


       //void insertionSort(int a[], int n) {
        //for (int i = 1; i < n; i++) {
        //int next = a[i];
        //inserted int next = a[i];
        //int j;
        //
        //for (j = i-1; j >= 0 && a[j] > next; j--)
        //a[j+1] = a[j];
        //
        //a[j+1] = next;
        //}
        //
        //}

        //5, [2], 8, 3, 1, 6, 4
        for (int i = 1; i < n; i++) {
            int next = a[i];
            int j;

            //[{5}], [2], 8, 3, 1, 6, 4

            for (j = i - 1; j >= 0 && a[j] > next; j--) {

                a[j + 1] = a[j];

            }


            a[j + 1] = next;
        }

        System.out.println("Sorted array:");


        for (int i = 0; i < n; i++) {

            System.out.print(a[i] + " ");
        }
    }
}
