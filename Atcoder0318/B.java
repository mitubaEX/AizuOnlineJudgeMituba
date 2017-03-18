import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
class B{
    public void run(){
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            br.lines()
                .forEach(n -> met(n));
        }catch(Exception e){
        }
    }

    public void met(String n){
        String[] tmp = n.split(" ");
        Integer w = Integer.parseInt(tmp[0]);
        Integer a = Integer.parseInt(tmp[1]);
        Integer b = Integer.parseInt(tmp[2]);

        if(a <= b){
            if(a + w >= b)
                System.out.println(0);
            else
                System.out.println(b - (a + w));
        }
        else{
            if(b + w >= a)
                System.out.println(0);
            else
                System.out.println(a - (b + w));
        }
    }


    public static void main(String[] args){
        new B().run();
    }
}
