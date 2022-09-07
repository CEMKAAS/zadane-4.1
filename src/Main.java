public class Main {
    public static void main(String[] args){
        Box<Integer> box = new Box<>();
        Box<String> box1 = new Box<>();

        box1.add("Привет");
        box1.add("Привет1");
        box1.add("Привет2");
        box1.pick();

        box.add(6);
        box.add(5);
        box.add(8);
        box.pick();
    }
}
