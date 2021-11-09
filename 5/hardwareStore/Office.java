package hardwareStore;
import java.util.ArrayList;

/**
 * A class for manipulating Printer, Scaner, Technique subclasses.
 * Contains information about ofices. <br>
 * Parameter <b>{@link Office#arrTech}</b> is an array for manipulating the data of the Technique class.
 * <hr>
 * @author Lyutova Anna
 * @version 1.0
 */
public class Office {
    private ArrayList<Technique> arrTech =new ArrayList<Technique>();

    /**
     * Default class office constructor.
     * @see Office#Office(ArrayList<Technique>)
     */
    public Office (){}

    /**
     * Class printer constructor with array param.
     * @param temp_arr temporary parameter of array of Technique class objects
     */
    public Office(ArrayList<Technique> temp_arr){
        arrTech=temp_arr;
    } 

    /**
     * This function adds Technique class objects to the Office array.
     * @param temp temporary Technique parameter
     */
    public void addTech(Technique temp){
    	arrTech.add(temp);
    }

    /**
     * This function removes Technique class objects from the Office array.
     * @param temp temporary Technique parameter
     */
    public void removeTech(Technique temp){
    	arrTech.remove(temp);
    }

    /**
     * This boolean function finds Technique class object in the Office array.
     * @param temp temporary Technique parameter
     * @return boolean value: True - object was found, False - object wasn't founded
     */
    public Boolean findTech(Technique temp){ 
    	return arrTech.contains(temp);
    }

    /**
     * This function counts the amount of particular class objects (Scaner/Printer).
     * @param c char contains 'p' for printer or 's' for scanner objects
     * @return the amount of objects of given class
     */
    public int objCounter(char c){ 
        int result = 0;
        for (Technique a:arrTech){
            if (c == 'p' && a instanceof Printer) result++; 
            if (c == 's' && a instanceof Scaner) result++;
        } 
        return result;
    }

    /**
     * This function prints the array of office equipment.
     */
    public void printOffice() {
    	System.out.println("Оффисная техника: "); 
    	for (Technique a:arrTech){
    		System.out.println("\t"+a.toString());
    	}
    }
} 