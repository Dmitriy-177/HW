public class HW1_4 {
    public static void main(String[] args) {

        // Написать метод, принимающий на вход два целых числа и проверяющий,
        //что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true,
        //в противном случае – false.

        public static boolean isSumBetween10and20(int a, int b)
        {
            int sum = a + b;
            boolean res = sum > 10 && sum <= 20;
            return res;
        }
    }

}











