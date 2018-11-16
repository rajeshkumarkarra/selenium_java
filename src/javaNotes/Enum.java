

// Enum in Java
	/*
	 * Enumerations serve the purpose of representing a group of named constants in a programming language. 
	 * For example the 4 suits in a deck of playing cards may be 4 enumerators named Club, Diamond, Heart, 
	 * and Spade, belonging to an enumerated type named Suit. Other examples include natural enumerated types 
	 * (like the planets, days of the week, colors, directions, etc.).
	 * Enums are used when we know all possible values at compile time, such as choices on a menu, rounding modes, 
	 * command line flags, etc. It is not necessary that the set of constants in an enum type stay fixed for all time.
	 * In Java (from 1.5), enums are represented using enum data type. Java enums are more powerful than C/C++ enums . 
	 * In Java, we can also add variables, methods and constructors to it. The main objective of enum is to define our 
	 * own data types(Enumerated Data Types).
	 */

// DECLARATION OF ENUM IN JAVA :
// EXAMPLE 1: Enum declaration can be done outside a Class or inside a Class but not inside a Method.

	/*
	 * A simple enum example where enum is declared 
	 * outside any class (Note enum keyword instead of C
	 * lass keyword) 
	 */

// IMPORTANT POINTS OF ENUM :

	/*
	 * Every enum internally implemented by using Class.
	/* internally above enum Color is converted to
	class Color
	{
     public static final Color RED = new Color();
     public static final Color BLUE = new Color();
     public static final Color GREEN = new Color();
	}*/
	/*Every enum constant represents an object of type enum.
	 * enum type can be passed as an argument to switch statement.
	 */
package javaNotes;
import java.util.Scanner; 
// EXAMPLE 1:
enum Color 
{ 
    RED, GREEN, BLUE; 
} 

// EXAMPLE 3
//An Enum class 
enum Day 
{ 
 SUNDAY, MONDAY, TUESDAY, WEDNESDAY, 
 THURSDAY, FRIDAY, SATURDAY; 
} 

public class Enum {

// EXAMPLE 2: enum declaration inside a class. 
enum Direction 
{ 
	EAST, WEST, NORTH, SOUTH; 
} 

// EXAMPLE 3:

Day day; 

// Constructor 
public Enum(Day day) 
{ 
    this.day = day; 
} 

// Prints a line about Day using switch 
public void dayIsLike() 
{ 
    switch (day) 
    { 
    case MONDAY: 
        System.out.println("Mondays are bad."); 
        break; 
    case FRIDAY: 
        System.out.println("Fridays are better."); 
        break; 
    case SATURDAY: 
    case SUNDAY: 
        System.out.println("Weekends are best."); 
        break; 
    default: 
        System.out.println("Midweek days are so-so."); 
        break; 
    }
}	
	//DRIVER METHOD
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// EXAMPLE 1:
		Color c1 = Color.RED; 
        System.out.println(c1); 
        
        // EXAMPLE 2:
        Direction d1 = Direction.EAST; 
        System.out.println(d1); 
        
        // EXAMPLE 3:
        String str = "MONDAY"; 
        Enum t1 = new Enum(Day.valueOf(str)); 
        t1.dayIsLike();

	}

}
