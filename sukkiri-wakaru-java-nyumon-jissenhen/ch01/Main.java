public class Main{
    public static void main(String[] args){
        // 1-1
        Hero h = new Hero();
        h.setName("ミナト");
        h.setHp(100);
        h.setMp(50);
        System.out.println(h);

        // 1-2
        Account a1 = new Account();
        a1.accountNo = "001";
        Account a2 = new Account();
        a2.accountNo = "002";
        System.out.println(a1.equals(a2));
        a2.accountNo = " 001 ";
        System.out.println(a1.equals(a2));
    }
}