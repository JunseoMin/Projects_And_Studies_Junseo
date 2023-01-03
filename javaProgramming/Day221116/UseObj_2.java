package Day221116;

class Singletontwo{
    private static Singletontwo instance;
    private Singletontwo(){
        System.out.println("single생성");
    }
    static{ //객체 생성중 에러 발생하면 출력하기위해 이 방법 추천 (in singleton)
        try {
            instance = new Singletontwo();
        } catch (Exception e) {
            throw new RuntimeException("생성중 이슈발생");
            
            // TODO: handle exception
        }
        
    }    

    public static Singletontwo getinstance(){
        return instance;
    }
        // if(instance==null){
        //     instance= new Singletontwo();
        // }else{
        //     return instance;
        // }
}

public class UseObj_2 {

    public static void main(String[] args) {
        Singletontwo s1= Singletontwo.getinstance();
        Singletontwo s2= Singletontwo.getinstance();
        Singletontwo s3= Singletontwo.getinstance();

    }
    
}
