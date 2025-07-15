class App {
    public static void main(String[] args) {
        String name = Console.instance().readString("¿Cómo te llamas?");
        Console.instance().writeln("Hola, " +  name + "!");
        Console.instance().writeln("Adios, " +  name + "!");
    }
}
