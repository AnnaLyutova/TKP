package hardwareStore;
import java.util.Scanner;

public class index {
     public static void main(String[] args) { 
        Scanner in = new Scanner(System.in, "Cp866");

        /** Создание объекта класса Technique */
     	Technique tech = new Technique();	
     	tech.setAllInfo();
        System.out.println("Фирма введённой техники: " + tech.getFirm());
        System.out.println("Цена: " + tech.getPrice() + "\n");

        // Создание объектов класса Printer
        Printer printer1=new Printer("HP", 30000, "RT5690", 4, false); 
        Printer printer2=new Printer();
        printer2.setAllInfoPrinter();	

        // Создание объектов класса Scaner
        Scaner scaner1=new Scaner("Brother", 60000, "9000s", 5, "1600x2000"); 
        Scaner scaner2=new Scaner(); 

        // Создание объектами класса Office
        Office office=new Office();
        office.addTech(printer1);
        office.addTech(printer2);
        office.addTech(scaner1);
        office.addTech(scaner2);
        office.printOffice();
        
        // Удаление объектов класса Office
        office.removeTech(scaner2);
        office.printOffice();

        // Поиск объектов класса Office
        if (office.findTech(scaner2)){ System.out.println("Да"); }
        else { System.out.println("Нет"); }

        // Колличество объектов определённого типа класса Office
        char c;
        System.out.print("Введите тип техники (p - принтер, s - сканер): "); 
        c=in.next().charAt(0);
        System.out.print("Количество единиц техники данного типа: " + office.objCounter(c)); 

}
}

