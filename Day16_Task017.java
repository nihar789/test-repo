public class Day16_Task017 {
    public static void quickSort(int[] a, int low, int high) {

        //low=0, high = 6
        if (low < high) {
            //initnally low <high

            //so finding the partition index
            int pivotIdx = partition(a, low, high);

            quickSort(a, low, pivotIdx - 1);
            System.out.println("Left index sorted");

            quickSort(a, pivotIdx + 1, high);
            System.out.println("Right index sorted");
        }
    }

    public static int partition(int[] a, int i, int j) {
        //i==0, j==6

        int p = a[i]; //[5], 2, 8, 3, 1, 6, 4

        int m = i;


        for (int k = i + 1; k <= j; k++) { //i=0 so i+1

            //a[k]=2<5

            if (a[k] < p) {
                m++;
                // Swap a[k] and a[m]
                int temp = a[k];

                a[k] = a[m];
                a[m] = temp;
            }
        }
        // Swap a[i] and a[m]
        int temp = a[i];
        a[i] = a[m];
        a[m] = temp;
        return m;
    }

    public static void printArray(int[] a) {
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] a = {5, 2, 8, 3, 1, 6, 4};
        System.out.println("Original array:");

        printArray(a);

        quickSort(a, 0, a.length - 1);

        System.out.println("Sorted array:");

        printArray(a);
    }
}
