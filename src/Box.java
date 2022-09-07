import java.util.Random;

public class Box <T> {

    private T[] items;

    public Box() {
        this.items = (T[]) new Object[3];
    }

    boolean add(T item) {
        for (int i = 0; i < items.length; i++) {
            if (null != items[i]) {
                continue;
            } else {
                items[i] = item;
                return true;
            }
        }
        return false;
    }

    public T pick() {
        int remains = 0;
        T randomСhoice = null;
            for (int i = 0; i < items.length; i++) {
                if (null == items[i]) {
                    remains = items.length - i;
                    throw new RuntimeException("Коробка не полная, осталось ячеек " + remains);
                }
            }
            Random random = new Random();
            int randomInt = random.nextInt(items.length);
            randomСhoice = items[randomInt];
            System.out.println(randomСhoice);
        return randomСhoice;
    }
}