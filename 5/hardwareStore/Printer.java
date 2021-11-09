package hardwareStore;
import java.util.Scanner;

/**
 * A class containing information about printers. <br>
 * Parameters: <b>{@link Printer#model}</b>, <b>{@link Printer#printSpeed}</b> and <b>{@link Printer#isColored}</b>.
 * <hr>
 * @author Lyutova Anna
 * @version 1.0
 */
public class Printer extends Technique{ 
    private String model; // модель
    private int printSpeed; // скорость печати
    private Boolean isColored; // цветной/нецветной

    /**
     * Default class printer constructor.
     * @see Printer#Printer(String, int, String, int, Boolean)
     */
    public Printer(){ 
        super();
        model="не указана";
        printSpeed=0;
        isColored=false;
    }

    /**
     * Class printer constructor with params.
     * @param firm_temp temporary parameter of the company name.
     * @param price_temp temporary parameter of printers's price.
     * @param model_temp temporary parameter of printers's model.
     * @param ps_temp temporary parameter of printing speed.
     * @param ic_temp temporary boolean parameter of printer's color of printing.
     */
    public Printer(String firm_temp, int price_temp, String model_temp, int ps_temp, Boolean ic_temp){
        super(firm_temp, price_temp);
        model=model_temp;
        printSpeed=ps_temp; 
        isColored=ic_temp;
    }

    /**
     * This function sets the model of the printer.
     * @param model_temp temporary parameter of the printer's model.
     */
    public void setModel(String model_temp){ model=model_temp; }

    /**
     * This function sets the speed of the printing.
     * @param ps_temp temporary parameter of the speed of printing.
     */
    public void setPrintSpeed(int ps_temp){ printSpeed=ps_temp; }

    /**
     * This boolean function sets the color of printing.
     * 'y' - colored / 'n' - black-and-white.
     * @param ic_temp temporary parameter of the color of printing.
     */
    public void setIsColored(char ic_temp){
        if (ic_temp == 'y'){ isColored=true; }
        else { isColored=false; }  
    }

    /**
     * This function gets model of the printer.
     * @return model of the printer
     */
    public String getModel(){ return model; }

    /**
     * This function gets speed of printing.
     * @return speed of printing
     */
    public int getPrintSpeed(){ return printSpeed; }

    /**
     * This boolean function gets the value of color of printing. 
     * 'y' - colored / 'n' - black-and-white.
     * @return the value of color of printing
     */
    public Boolean getIsColored(){ return isColored; }

    /**
     * This function converts the result of {@link getIsColored()} to String
     * @return converted string
     */
    public String getIsColoredString(){ 
        if (isColored){ return "цветная"; }
        else { return "чёрно-белая"; }    
    }

    /**
     * This function sets all info about an object of class Printer. Uses console scanner.
     */
    public void setAllInfoPrinter(){
        System.out.println("[ Принтер ]");
        Scanner in = new Scanner(System.in, "Cp866");
        setAllInfo();
        System.out.print("Введите модель: "); 
        model=in.next();
        System.out.print("Введите максимальную скорость печати: "); 
        printSpeed=in.nextInt();;
        System.out.print("Введите цвет печати принтера (y - цветная, n - чёрно-белая): ");  
        setIsColored(in.next().charAt(0));
        System.out.println();
    }

    /**
     * This function converts all info about an object of class Printer into String.
     */
    public String toString(){ 
        return "\n\t[ Принтер ]"+"\n\t"+"Фирма: "+getFirm()+"\n\t"+"Цена: "
        +getPrice()+ "\n\t"+"Модель: "+model+"\n\t"+"Скорость печати: "+printSpeed+"\n\t"+
        "Цвет печати: " +getIsColoredString()+"\n";
    }
}  

