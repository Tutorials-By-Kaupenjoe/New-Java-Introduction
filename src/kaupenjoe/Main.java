package kaupenjoe;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        /* Lambda & Streams */

        helloWorld();

        Runnable runnable = () -> System.out.println("Hello World");
        somethingCool(runnable);
        somethingCool(Main::helloWorld);

        Supplier<Float> pi = () -> 3.14159265f;

        Consumer<Runnable> test = runnable1 -> {
            runnable1.run();

        };

        test.accept(runnable);

        Runnable method = Main::helloWorld;

        /* STREAMS */

        List<String> fruits = List.of("Apple", "Banana", "Orange", "Mango", "Pineapple", "Mandarin");

        fruits.stream()
                .filter(fruit -> fruit.startsWith("M"))
                .forEach(System.out::println);

    }

    public static void helloWorld() {
        System.out.println("Hello World");
    }

    public static void somethingCool(Runnable runnable) {
        runnable.run();
    }

    public static float getPI() {
        return 3.14159265f;
    }
}