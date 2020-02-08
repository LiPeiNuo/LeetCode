public class Demo1 {
    public static void main(String[] args) {
        Computer com = new Computer();
        Pad ipad = new Pad();
        System.out.println(com.screen);
        com.starUp();
        System.out.println(ipad.screen);
        ipad.starUp();
    }
}
