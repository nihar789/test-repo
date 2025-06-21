interface sports{
    void play();
}

class cricket implements sports {
    @Override
    public void play() {
        System.out.println("Playing Cricket");
    }
}

class football implements sports{
    @Override
    public void play(){
        System.out.println("Playing football");
    }
}

public class Polymorphism_interfaces {
    public static void main(String[] args) {
        cricket obj = new cricket();
        obj.play();

        football myobj = new football();
        myobj.play();
    }
}
