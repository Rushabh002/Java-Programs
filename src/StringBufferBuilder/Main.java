package StringBufferBuilder;

public class Main {
    public static void main(String[] args){
        StringBuffer sb = new StringBuffer("Rushabh");
        sb.append(" Jaiswal");
        System.out.println(sb);
        StringBuilder sv = new StringBuilder("Rupal");
        sv.append(" Jaiswal");
        sv.setCharAt(0,'L');
        sv.insert(5," LalitKumar");
        sv.delete(5,16);
        System.out.println(sv);
        String name ="Rushabh";
        StringBuilder sr = new StringBuilder(name);
        sr.reverse();
    }
}
