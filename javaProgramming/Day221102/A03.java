package Day221102;

class Animal{
    final public void eat() {
        System.out.println("모든 동물은 고기 묵어");
    }
}

class Lion extends Animal{  //

    

}

//final -> @override 안됨

public class A03 {
    public static void main(String[] args) {
        Lion lion = new Lion();
        lion.eat();

    }
}
