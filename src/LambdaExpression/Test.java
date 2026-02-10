package LambdaExpression;

public class Test {
    public static void main(String[] args) {
        Greeting g = new Greeting() {
            @Override
            public void greet() {
                System.out.println("Hello from greet() but anonymous class implementing greet() in Greeting interface");
            }

//            @Override
//            public void namaste() {
//
//            }
        };
        g.greet();
//        g.namaste();
        Greeting g1 = () -> {
            System.out.println("Hello from greet() but anonymous method implementing greet() in Greeting interface");
        };
        g1.greet();
        Notable n = (x) -> {
            System.out.println("Hello from note()");
        };
        n.note("Physics");
        Washable w = (b) -> {
            return "washing " + b;
        };
        w.wash("Shirt");
    }
}