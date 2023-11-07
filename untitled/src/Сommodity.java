import java.util.Scanner;

public class Сommodity {
 String name;
 String producer;
 String expiration_date;
 String cost;
 int code;
 int amount;
 String newField;

 public Сommodity(String name, String producer, String cost, int code, String expiration_date, int amount) {
  this.name = name;
  this.producer = producer;
  this.cost = cost;
  this.code = code;
  this.expiration_date = expiration_date;
  this.amount = amount;
 }

 public Сommodity(String name, String producer, String cost, int code, String expiration_date, int amount, String newField) {
  this(name, producer, cost, code, expiration_date, amount);
  this.newField = newField;
 }

 public void info() {
  System.out.print("Код товару: ");
  System.out.println(code);
  System.out.print("Назва товару: ");
  System.out.println(name);
  System.out.print("Виробник товару: ");
  System.out.println(producer);
  System.out.print("Ціна за товар: ");
  System.out.println(cost);
  System.out.print("Кількість товару на складі: ");
  System.out.println(amount);
 }

 int order() {
  System.out.println("Введіть кількість товару для замовлення: ");
  Scanner sc = new Scanner(System.in);
  int order = sc.nextInt();
  return order;
 }
}
