public class TASK020 {
    public static void main(String[] args) {
        char[] Name={'N','i','h','a','r'};

        System.out.println(Name);

        int n = Name.length;
        System.out.println("There are "+n+" letter in my name.");
        System.out.println("Letter are: ");
        for (int i=0;i<n;i++){
            System.out.println(Name[i]+" ");
        }
    }
}
