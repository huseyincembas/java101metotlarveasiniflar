public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("Muhammed Ali", 10, 120, 100, 60);
        Fighter f2 = new Fighter("Mike Tyson", 15, 85, 85, 50);

        Match match = new Match(f1, f2, 85, 100);
        match.run();
    }
}