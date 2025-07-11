public class Day16_Task014 {

    //initallizing the arreay a
    public static void main(String[] args) {
        int[] a = {5, 2, 8, 3, 1, 6, 4};

        System.out.println("Original array:");
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();


        mergeSort(a, 0, a.length - 1);

        System.out.println("Sorted array:");


        for (int i : a) {


            System.out.print(i + " ");
        }
    }

    //void mergeSort(int a[], int low, int high) {
    //if (low < high) {
    //int mid = (low+high) / 2;
    //
    //mergeSort(a, low , mid );
    //
    //mergeSort(a, low , mid );
    //mergeSort(a, mid+1, high);
    //
    //merge(a, low, mid, high);
    //}
    //}

    // [5,2][8,3]//[1,6][4]
    //[2,5][3,8]//[1,6][4]

    //taking array a and 2 parameters low n high

    //here a, 0, length-1
    public static void mergeSort(int[] a, int low, int high) {
        //5, 2, 8, 3,// 1, 6, 4


        //0<6
        //0+6/2=3

        if (low < high) {

            //calc mid pnt of array
            int mid = low + (high - low) / 2;

            //a,0,3
            mergeSort(a, low, mid);

            //a,3+1,6
            mergeSort(a, mid + 1, high);


            merge(a, low, mid, high);

        }
    }

    //Merge Implementation
    //int n = high-low+1;
    //int* b = new int[n];
    //int left=low, right=mid+1, bIdx=0;
    //
    //while (left <= mid && right <= high) {
    //if (a[left] <= a[right])
    //b[bIdx++] = a[left++];
    //else
    //b[bIdx++] = a[right++];
    //}
    //
    //while (left <= mid) b[bIdx++] = a[left++];
    //while (right <= high) b[bIdx++] = a[right++];
    //
    //for (int k = 0; k < n; k++)
    //a[low+k] = b[k];
    //
    //delete[]b;
    //}

    public static void merge(int[] a, int low, int mid, int high) {

        int n = high - low + 1;
        int[] b = new int[n];


        int left = low, right = mid + 1, bIdx = 0;

        while (left <= mid && right <= high) {


            if (a[left] <= a[right]) {

                b[bIdx++] = a[left++];

            } else {
        b[bIdx++] = a[right++];
            }
        }

        while (left <= mid) {
            b[bIdx++] = a[left++];
        }

        while (right <= high) {
            b[bIdx++] = a[right++];
        }

        for (int k = 0; k < n; k++) {
            a[low + k] = b[k];
        }
    }
}
