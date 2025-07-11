public class Day16_Task006 {
        public static void main(String[] args) {
            int[] a = {5, 2, 8, 3, 1, 6, 4};
            int n = a.length;
            System.out.println("A array:");
            for (int i : a) {
                System.out.print(i + " ");
            }
            System.out.println();

            //5, 2, 8, 3, 1, 6, [4]

            for (int i = n - 1; i >= 1; i--) {

                //5, {[2]}, 8, 3, 1, 6, 4

                for (int j = 1; j <= i; j++) {

                    if (a[j - 1] > a[j]) {

                        //if 5>2
                        //temp= 2
                        //[j]=[[1]-1]=1
                        //taking next element

                        //void bubbleSort(int a[], int n) {
                        //for (int i = n-1; i >= 1; i--) {
                        //for (int j = 1; j <= i; j++) {
                        //
                        //Step 1:
                        //for (int j = 1; j <= i; j++) { Compare
                        //if (a[j-1] > a[j])
                        //swap(a[j], a[j-1]);
                        //
                        //}
                        //}
                        //}


                        int temp = a[j];
                        a[j] = a[j - 1];
                        a[j - 1] = temp;
                    }
                }
            }

            System.out.println("after sorting:");
            for (int i : a) {
                System.out.print(i + " ");
            }
        }
}
