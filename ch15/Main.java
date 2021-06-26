public class Main {
    public static void main(String[] args){
        String s1 = "Java and JavaScript";
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

        if (s1.contains("Java")){
            System.out.println("s1 contains Java");
        }

        if (s1.endsWith("Java")){
            System.out.println("s1 endsWith Java");
        }

        System.out.println("s1 indexof Java :" + s1.indexOf("Java"));
        System.out.println("s1 lastIndexOf Java :" + s1.lastIndexOf("Java"));

        System.out.println(s1.substring(3));
        System.out.println(s1.substring(3,8));
        System.out.println(s1.replace("Ja","En"));

        String s = "Java";
        System.out.println(s.matches("Java"));
        System.out.println(s.matches("JavaJava"));
        System.out.println(s.matches("java"));

        // 15-4
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<10000; i++){
            sb.append("Java");
        }
        s = sb.toString();

        // 15-7
        s = "abc,def:ghi";
        String[] words = s.split("[,:]");
        for (String w : words){
            System.out.print(w + "->");
        }
        System.out.println();

        // 15-8
        s = "abc,def:ghi";
        String w = s.replaceAll("[beh]","X");
        System.out.println(w);

        // 15-9
        System.out.println(String.format("製品番号%s-%02d", "SJV", 3));
        System.out.printf("製品番号%s-%02d", "SJV", 3);
        System.out.println();
    }
}