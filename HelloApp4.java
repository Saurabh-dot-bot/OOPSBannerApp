public class HelloApp4 {

    public static void main(String[] args) {

        String result;

        if (args.length > 0) {
            result = String.join(", ", args);
        } else {
            result = "World";
        }

        System.out.println("Hello, " + result + "!");
    }
}