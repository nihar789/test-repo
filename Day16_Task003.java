public class Day16_Task003 {
    public static void main(String[] args) {
        int[] a = {87,23,90,45,56,23,45,67};

        System.out.println("Original array:");


        for (int i : a) {
            System.out.print(i + " ");
        }

        System.out.println();

        //starting to sort
        //87,23,90,45,56,23,45,(n[7]-1->1=)67
        for (int i = a.length - 1; i >= 1; i--) {
            int max = i;

            //87,23,90,45,56,23,45,67 == i==6, j==5
            for (int j = 0; j < i; j++) {
                //if45>76
                //if 23.................90>67
                if (a[j] > a[max]) {
                    //2
                    max = j;
                }

            }
            int temp = a[max];
            //

            a[max] = a[i];
            a[i] = temp;
        }

        System.out.println("Sorted array:");
        for (int i : a) {
            System.out.print(i + " ");
        }
    }
}
