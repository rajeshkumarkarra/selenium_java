package javaNotes;
//DATA TYPES IN JAVA:
	/*
	 * Java has two categories of data:
	 * Primitive data (e.g., number, character)
	 * Object data (programmer created types)
	 */

public class DataTypes {

	public static void main(String[] args) {
// 1.BOOLEAN:
	/*boolean data type represents only one bit of information either true or false . 
	 * Values of type boolean are not converted implicitly or explicitly (with casts) to any other type. 
	 * But the programmer can easily write conversion code.
	 */
		
// A Java program to demonstrate boolean data type 
		boolean b = true;        
        if (b == true) 
            System.out.println("Hello world");
        
// 2. BYTE:
     /*
      * byte: The byte data type is an 8-bit signed two’s complement integer. 
      * The byte data type is useful for saving memory in large arrays.
      * Size: 8-bit
      * Value: -128 to 127
      */
        
// Java program to demonstrate byte data type in Java 
        byte a = 126; 
        
        // byte is 8 bit value 
        System.out.println(a); 
         
        a++; 
        System.out.println(a); 
          
        // It overflows here because 
        // byte can hold values from -128 to 127 
        a++; 
        System.out.println(a); 
          
        // Looping back within the range 
        a++; 
        System.out.println(a);
        
// 3. SHORT:
        /*
         * short: The short data type is a 16-bit signed two’s complement integer. 
         * Similar to byte, use a short to save memory in large arrays, in situations 
         * where the memory savings actually matters.
         * Size: 16 bit
         * Value: -32,768 to 32,767 (inclusive)
         */
        
 // 4. INT:
        /*
         * It is a 32-bit signed two’s complement integer.
         * Size: 32 bit
         * Value: -231 to 231-1
         */
        
 // 5. LONG:
        /*
         * The long data type is a 64-bit two’s complement integer.
         * Size: 64 bit
         * Value: -263 to 263-1.
         */
        
 // 6.FLOAT:
        /*
         * Floating point Numbers : float and double
         * float: The float data type is a single-precision 32-bit IEEE 754 floating point. 
         * Use a float (instead of double) if you need to save memory in large arrays of floating point numbers.
         * Size: 32 bits
         * Suffix : F/f Example: 9.8f
         * double: The double data type is a double-precision 64-bit IEEE 754 floating point. For decimal values, 
         * this data type is generally the default choice.
         * Note: Both float and double data types were designed especially for scientific calculations, 
         * where approximation errors are acceptable. If accuracy is the most prior concern then, 
         * it is recommended not to use these data types and use 
         * 
         */
        
 // 7. CHAR:
        /*
         * The char data type is a single 16-bit Unicode character. A char is a single character.
         * Value: ‘\u0000’ (or 0) to ‘\uffff’ 65535
         */
        
     // Java program to demonstrate primitive data types in Java 
        
     // declaring character 
        char a1 = 'G'; 
          
       // Integer data type is generally  
       // used for numeric values 
       int i=89; 
         
       // use byte and short if memory is a constraint  
       byte b1 = 4; 
         
       // this will give error as number is  
       // larger than byte range 
       // byte b1 = 7888888955; 
         
       short s = 56; 
         
       // this will give error as number is  
       // larger than short range 
       // short s1 = 87878787878; 
         
         
       // by default fraction value is double in java 
       double d = 4.355453532; 
         
       // for float use 'f' as suffix 
       float f = 4.7333434f; 
        
       System.out.println("char: " + a1);  
       System.out.println("integer: " + i);  
       System.out.println("byte: " + b1);  
       System.out.println("short: " + s);  
       System.out.println("float: " + f);  
       System.out.println("double: " + d);
	}

}

