package hardwareStore;
import java.util.Scanner;

/**
 * A class containing information about office equipment. <br>
 * Parameters:  <b>{@link Technique#firm}</b> and <b>{@link Technique#price}</b>.
 * <hr>
 * @author Lyutova Anna
 * @version 1.0
 */

public class Technique { 
    private String firm; 
    private int price;

    /**
     * This function sets company name of the object.
     * @param firm_temp temporary parameter of the company name.
     */
    public void setFirm(String firm_temp){ 
        firm=firm_temp;
    }

    /**
     * This function sets price of the object.
     * @param price_temp temporary parameter of object's price.
     */
    public void setPrice(int price_temp){ 
        price=price_temp;
    }

    /**
     * This function returns the name of the manufacturer of the object.
     * @return the name of the manufacturer of the object
     */
    public String getFirm(){
        return firm;
    }

    /**
     * This function returns the price of the object.
     * @return the price of the object
     */
    public int getPrice(){
        return price;
    }

    /**
     * Default class object constructor.
     * @see Technique#Technique(String, int)
     */
    public Technique(){
    	firm="Без названия";
        price=0;
    }

    /**
     * Class object constructor with params.
     * @param firm_temp temporary parameter of the company name.
     * @param price_temp temporary parameter of object's price.
     * @see Technique#Technique()
     */
    public Technique(String firm_temp, int price_temp){
        firm=firm_temp;
        price=price_temp;
    }

    /**
     * This function sets all info about an object of class Technique. Uses console scanner.
     */
    public void setAllInfo(){
        Scanner in = new Scanner(System.in, "Cp866");
        System.out.print("Введите фирму: ");
        firm=in.next();
        System.out.print("Введите цену: ");
        price=in.nextInt();
    }
} 

