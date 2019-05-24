import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Start {


    static class M1{
        private Integer a;

        public void setA(Integer a){
            this.a = a;
        }
    }


    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException, IOException {
        Long l1 = null;
        long a1 = l1 != null ? l1 : 0;
        System.out.println("a1="+a1);
        System.out.println("a1="+a1);
        System.out.println("a1="+a1);
        M1 curM1 = new M1();
        curM1.setA(5);
        List<M1> list = new ArrayList<M1>();
        list.add(curM1);
        curM1 = new M1();
        curM1.setA(6);
        list.toArray();

    }
    
    //hello

}
