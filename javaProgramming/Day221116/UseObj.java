package Day221116;

class SingletonOne{
    private static SingletonOne instance = new SingletonOne();
    private SingletonOne(){
        System.out.println("객체생성");
    }
    public static SingletonOne getsingleton_one(){
        return instance;
    }
}

public class UseObj {
    public static void main(String[] args) {
        SingletonOne s1=SingletonOne.getsingleton_one();
        SingletonOne s2=SingletonOne.getsingleton_one();
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
    }
}
