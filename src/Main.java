import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List list = new List();
        int num, ind, mode;
        Scanner in = new Scanner(System.in);


        boolean flag = true;
        while (flag) {
            System.out.println("1)удалить элемент\n2)добавить элемент\n3)редактировать элемент\n4)получить все значения\n5)получить значение элемента\n0)выход");
            mode = in.nextInt();
            switch (mode) {
                case 1:
                    System.out.println("Введите индекс");
                    ind = in.nextInt();
                    list.del_el(ind);
                    break;
                case 2:
                    System.out.println("Введите число");
                    num = in.nextInt();
                    list.add_el(num);
                    break;
                case 3:
                    System.out.println("Введите число и индекс");
                    num = in.nextInt();
                    ind = in.nextInt();
                    list.edit_el(num, ind);
                    break;
                case 4:
                    System.out.println(list.to_str());
                    break;
                case 5:
                    System.out.println("Введите индекс");
                    ind = in.nextInt();
                    System.out.println(list.get_num(ind));
                    break;
                case 0:
                    System.out.println("Выход из программы");
                    flag = false;
                    break;
                default:
                    System.out.println("Введено не то значение");
            }
        }
    }
}