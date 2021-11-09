package hardwareStore;
import java.util.Scanner;

/**
 * A class containing information about scanners. <br>
 * Parameters: <b>{@link Scaner#model}</b>, <b>{@link Scaner#scanSpeed}</b> and <b>{@link Scaner#maxResolution}</b>.
 * <hr>
 * @author Lyutova Anna
 * @version 1.0
 */

public class Scaner extends Technique{ 
    private String model; // модель
    private int scanSpeed; // скорость сканирования
    private String maxResolution; // максимальное разрешене

    /**
     * Default class scanner constructor.
     * @see Scaner#Scaner(String, int, String, int, String)
     */
    public Scaner(){ 
        super();
        model="не указана";
        scanSpeed=0;
        maxResolution="0x0";
    }

    /**
     * Class scanner constructor with params.
     * @param firm_temp temporary parameter of the company name.
     * @param price_temp temporary parameter of scanners's price.
     * @param model_temp temporary parameter of scanners's model.
     * @param ss_temp temporary parameter of scanners's scanning speed.
     * @param mr_temp temporary parameter of scanners's max resolution.
     * @see Scaner#Scaner()
     */
    public Scaner(String firm_temp, int price_temp, String model_temp, int ss_temp, String mr_temp){
        super(firm_temp, price_temp);
        model=model_temp;
        scanSpeed=ss_temp; 
        maxResolution=mr_temp;
    }

    /**
     * This function sets the model of the scanner.
     * @param model_temp temporary parameter of the scanner's model.
     */
    public void setModel(String model_temp){ model=model_temp; }

    /**
     * This function sets the scanning speed.
     * @param ss_temp temporary parameter of scanning speed.
     */
    public void setScanSpeed(int ss_temp){ scanSpeed=ss_temp; }

    /**
     * This function sets the max resolution of a document made by the scanner.
     * @param mr_temp temporary parameter of the scanner's max resolution.
     */
    public void setMaxResolution(String mr_temp){ maxResolution=mr_temp; }

    /**
     * This function gets model of the scanner.
     * @return name of the model
     */
    public String getModel(){ return model; }

    /**
     * This function gets scanning speed.
     * @return scanning speed
     */
    public int getScanSpeed(){ return scanSpeed; }

    /**
     * This function gets max resolution of a document made by the scanner.
     * @return max resolution of scanner
     */
    public String getMaxResolution(){ return maxResolution; }

    /**
     * This function sets all info about an object of class Scaner. Uses console scanner.
     */
    public void setAllInfoScaner(){
        System.out.println("[ Сканер ]");
        Scanner in = new Scanner(System.in, "Cp866");
        setAllInfo();
        System.out.print("Введите модель: "); 
        model=in.next();
        System.out.print("Введите максимальную скорость сканирования: "); 
        scanSpeed=in.nextInt();
        System.out.print("Введите максимальное разрешение сканера: ");  
        maxResolution=in.next();
        System.out.println();
}

    /**
     * This function converts all info about an object of class Scaner into String.
     */
    public String toString(){ 
        return "\n\t[ Сканер ]"+"\n\t"+"Фирма: "+getFirm()+"\n\t"+"Цена: "
        +getPrice()+ "\n\t"+"Модель: "+model+"\n\t"+"Скорость сканирования: "+scanSpeed+"\n\t"+
        "Максимальное разрешение сканера: " +maxResolution+"\n";
    }
}  

