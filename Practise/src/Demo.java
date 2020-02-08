public class Demo {
    static{
        System.out.println("这是静态代码块");
    }
    {
        System.out.println("这是非静态代码块");
    }
    public Demo(){
        System.out.println("这是构造方法");
    }
    public void show(){
        System.out.println("这是成员方法");
    }
    public static void main(String[] args){
        Demo d = new Demo();
        d.show();
    }

}
