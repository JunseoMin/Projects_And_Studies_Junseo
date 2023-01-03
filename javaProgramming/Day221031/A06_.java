class duck33{
    private int ducsize;

    duck33(){
        this.ducsize=100;
    }
    
    duck33(int ducsize){
        this.ducsize=ducsize;
        
    }

    public void setducsize(int ducsize){
        this.ducsize=ducsize;
    }
}
//copy constructor, =operator???


public class A06_ {
    public static void main(String[] args) {
        duck33 d3=duck33(5000);
        
        duck33 d4=duck33();
        d4.setducsize(10000);
        duck33 d5=d3;
    }
}
