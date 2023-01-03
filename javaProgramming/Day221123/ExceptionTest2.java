package Day221123;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Tempclass{
    public Tempclass(){

    }

    public void filecontroll() throws NumberFormatException, IOException {
        
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));    //Systm.in -> input buffer

        String str = br.readLine();
        int i=Integer.parseInt(br.readLine());
        // try {
        // BufferedReader br =new BufferedReader(new InputStreamReader(System.in));    //Systm.in -> input buffer

        // String str = br.readLine();
        // int i=Integer.parseInt(br.readLine());   
        // } catch (Exception e) {
        //     // TODO: handle exception
        //     e.printStackTrace();
        // }
    }
}

public class ExceptionTest2 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        Tempclass tc=new Tempclass();
        tc.filecontroll();
    }
}
