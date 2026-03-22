public class HelloApp7 {

    public static void main(String[] args) {

        String result = (args.length == 0)
                ? "World"
                : String.join(", ", args);

        System.out.println("Hello, " + result + "!");
    }
}