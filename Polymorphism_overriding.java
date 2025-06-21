//super class

class Lion{
    void makesound(){
        System.out.println("Some Sound");
    }
}

class Tiger extends Lion{
    @Override
    void makesound(){
        System.out.println("Roars");
    }
}

class Horse extends Lion{
    @Override
    void makesound(){
        System.out.println("Neighs");
    }
}

public class Polymorphism_overriding {
    public static void main(String[] args) {
        //obj instance

        Lion obj = new Tiger();
        obj.makesound();

        Lion myobj = new Horse();
        myobj.makesound();
    }
}