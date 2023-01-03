package Day220919;

public class A04_if04 {
    public static void main(String[] args) {
        String str1="java";
        String str2="JAVA";

        if(str1.equals(str2)){//==사용하지 않고 equals/equalsignorecases 사용하기!
            System.out.println("두 변수 문자열이 같다.");
            System.out.println(str1+"=="+str2);
        }
        else{
            System.out.println("두 변수 문자열이 다르다.");
            System.out.println(str1+" != "+str2);
        }
        System.out.println("if-else 문장은 두 문장중 한 문장은 무조건 시행됨!");
        System.out.println("-----------------------------------------------------------------------------");
        
        if(str1.equalsIgnoreCase(str2)){
            System.out.println("두 변수 문자열이 같다.");
            System.out.println(str1+"=="+str2);
        }
        else{
            System.out.println("두 변수 문자열이 다르다.");
            System.out.println(str1+" != "+str2);
        }
        System.out.println("if-else 문장은 두 문장중 한 문장은 무조건 시행됨!");
        System.out.println("-----------------------------------------------------------------------------");
        
        if(str1.equals(str2)||str2.equals(str1)){
            System.out.println("두 변수 문자열이 같다.");
            System.out.println(str1+"=="+str2);
        }
        else{
            System.out.println("두 변수 문자열이 다르다.");
            System.out.println(str1+" != "+str2);
        }
        System.out.println("if-else 문장은 두 문장중 한 문장은 무조건 시행됨!");
    
    
    }
    
}
