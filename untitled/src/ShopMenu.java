import java.util.Scanner;

public class ShopMenu {
    public static void menu(){
        Сommodity cocacola = new Сommodity("Coca Clasic", "CocaCola", "70", 691, "22", 80);
        Revision lastre = new Revision("11.09.2023", 0, +4200);
        Employees emp1 = new Employees("John", "Nolan", 30, 400, 54, 1);
        Employees emp2 = new Employees("Sky", "Walker", 20, 200, 15, 2);
        Employees emp3 = new Employees("Oskar", "Morrison", 22, 350, 20, 3);
        while (true) {
            System.out.println("Ви попали до меню. Оберіть що бажаєте дізнатись: ");
            System.out.println("1 - Інформацію про працівника.");
            System.out.println("2 - Інформацію про товар.");
            System.out.println("3 - Інфорацію про останню ревізію.");
            System.out.println("Введіть про що бажаєте дізнатись(лише цифру): ");
            Scanner sc = new Scanner(System.in);
            int menu = sc.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("Введіть номер працівника(emp№)");
                    int number = sc.nextInt();
                    if (emp1.code == number) {
                        emp1.recursivePrint("Загальна інформація про працівника:", 1);
                        emp1.info();
                        emp1.salarye(emp1.salary);
                    } else if (emp2.code == number) {
                        emp2.recursivePrint("Загальна інформація про працівника:", 1);
                        emp2.info();
                        emp2.salarye();
                    } else if(emp3.code==number){
                        emp3.recursivePrint("Загальна інформація про працівника:", 1);
                        emp3.info();
                        emp3.salarye();
                    }
                    else{
                        System.out.println("Такого працівника не існує");
                    }
                    break;
                case 2:
                    System.out.println("Оберіть що бажаєте: ");
                    System.out.println("1 - Інформація про товар");
                    System.out.println("2 - Замовлення товару");
                    int com = sc.nextInt();
                    switch (com) {
                        case 1:
                            System.out.println("Введіть код товару: ");
                            int com2 = sc.nextInt();
                            if (com2 == cocacola.code) {
                                cocacola.info();
                            }
                            break;
                        case 2:
                            System.out.println("Введіть код товару: ");
                            int com3 = sc.nextInt();
                            if (com3 == cocacola.code) {
                                System.out.println("Зараз товару на складі: ");
                                System.out.println(cocacola.amount);
                                cocacola.amount = cocacola.amount + cocacola.order();
                                System.out.println("Товару на складі після замовлення: ");
                                System.out.println(cocacola.amount);
                            }
                            else{
                                System.out.println("Товару з таким кодом немає в базі даних.");
                            }
                    }
                    break;
                case 3:
                    lastre.info();
                    System.out.println("Наступна ревізія:");
                    System.out.println(lastre.nextrev());
            }
        }
    }
}
