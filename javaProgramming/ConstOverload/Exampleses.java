class superclass{
    int Snum=4;
    int Anum;
    int Bnum;
    int Cnum;
    superclass(){
        System.out.println("인자가 없는 상위 class");
    }
    superclass(int Snum){
        System.out.println("인자가 있는 상위 class constructor Snum= "+Snum);
    }
    superclass(int Anum,int Cnum){
        this(Anum,0,Cnum);
        System.out.println("인자2개받은 constructor"+Anum+Bnum+Cnum);
    }
    superclass(int Anum, int Bnum,int Cnum){
       this.Anum=Anum;
       this.Bnum=Bnum;
       this.Cnum=Cnum;
       System.out.println("인자 3개받은 constructor"+Anum+Bnum+Cnum);
    }
 
}

public class Exampleses {
    public static void main(String[] args) {
        superclass s1 = new superclass(1,3);
        superclass s2 = new superclass(3, 5, 7);
    }   
}
