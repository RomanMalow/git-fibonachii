public class Main{
    public static void main(String[] args) {

        //Объявляем переменные при известных первых двух:
        int num0 = 0;
        int num1 = 1;
        int num2;

        //Первые две переменные выводим вне цикла:
        System.out.print(num0 + " " + num1 + " ");
        for(int i = 3; i <= 10; i++){
            num2 = num0 + num1;

            //Каждый следующий элемент выводим в цикле:
            System.out.print(num2 + " ");

            //Предыдущим двум переменным присваиваем новые значения:
            num0 = num1;
            num1 = num2;
        }
    }
}