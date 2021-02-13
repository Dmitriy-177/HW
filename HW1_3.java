public class HW1_3 {
    public static void main(String[] args){
        // 3. Написать метод, вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
        //   где a, b, c, d – аргументы этого метода, имеющие тип float

        float a = 5;
        float b = 5;
        float c = 10;
        float d = 5;
        float f = a * (b + (c / d));
        System.out.println(f);

    }
}

