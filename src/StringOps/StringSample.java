package StringOps;

public class StringSample {
    public static void main(String[] args) {

        String name = "Neo";

        StringBuilder str = new StringBuilder();
        str.append("neoo");
        str.reverse();

        System.out.println(name);
        System.out.println(str);

        StringBuffer sb=new StringBuffer();
        sb.append("Hello");
        System.out.println(sb);
    }


}
