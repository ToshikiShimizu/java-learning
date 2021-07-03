public final class SingletonFlower {
    private static SingletonFlower theInstance;
    private SingletonFlower() {
        System.out.println("created");
    }
    public static SingletonFlower getInstance(){
        if (theInstance == null){
            theInstance = new SingletonFlower();
        }
        return theInstance;
    }
}