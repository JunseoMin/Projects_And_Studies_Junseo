public class A08_comp {
    public static void main(String[] args) {
        double m=3.4;
        double n = 2.5;

        System.out.println(m==n);

        char ap1='A';
        char ap2='a';
        System.out.println(ap1!=ap2);

        String str1="hello";
        String str2="Hello";
        System.out.println(str1==str2);

        //객체지향문법
        boolean result=str1.equals(str2);// ascII 코드 이용 ==> 대소문자 구분 필요
        boolean result2=str1.equalsIgnoreCase(str2);//대소문자 구분 없이 비교
        System.out.println(result);
        System.out.println(result2);
    }
    
}
