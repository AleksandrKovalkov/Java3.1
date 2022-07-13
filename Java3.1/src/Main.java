public class Main {
    public static void main(String[] args) {

        int ticket = 3510; //стоимость билета
        int expenses = 20; //кол-во денег необходимое для начисления 1-й мили

        int mile = ticket / expenses; //вычисляем количество миль начисленных
                                     // за покупку билета и записываем в переменную mile

        System.out.println(mile); //выводим кол-во начисленных миль на экран

    }
}
