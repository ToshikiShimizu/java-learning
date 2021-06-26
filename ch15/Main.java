public class Main {
    public static void main(String[] args){
        String s1 = "スッキリJava";
        String s2 = "Java";
        String s3 = "Java";
        if (s2.equals(s3)){
            System.out.println("s2 equals s3");
        }
        if (s2.equalsIgnoreCase(s3)){
            System.out.println("s2 equalsIgnoreCase s3");
        }
        System.out.println("s1 length :" + s1.length());
        if (s1.isEmpty()){
            System.out.println("s1 is empty.");
        }

    }
}