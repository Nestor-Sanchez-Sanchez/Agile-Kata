package romanNumerals;

import java.util.Comparator;
import java.util.Map.Entry;
import java.util.SortedMap;
import java.util.TreeMap;

public class RomanNumerals {

    private SortedMap<Integer, String> numberToNumerals;
    static int decimalNum;

    public RomanNumerals() {
        numberToNumerals = new TreeMap<>(Comparator.<Integer>reverseOrder());
        numberToNumerals.put(1000, "M");
        numberToNumerals.put(900, "CM");
        numberToNumerals.put(500, "D");
        numberToNumerals.put(400, "CD");
        numberToNumerals.put(100, "C");
        numberToNumerals.put(90, "XC");
        numberToNumerals.put(50, "L");
        numberToNumerals.put(40, "XL");
        numberToNumerals.put(10, "X");
        numberToNumerals.put(9, "IX");
        numberToNumerals.put(5, "V");
        numberToNumerals.put(4, "IV");
        numberToNumerals.put(1, "I");
    }

    public String toNumeral(int number) {
        String numeral = "";
        for (Entry<Integer, String> numberToNumeral : numberToNumerals.entrySet()) {
            while (number >= numberToNumeral.getKey()) {
                numeral += numberToNumeral.getValue();
                number -= numberToNumeral.getKey();
            }
        }
        return numeral;
    }
    
    public void convertToDecimal (String romanNumeral) {
    	decimalNum=0;
        
        romanNumeral = romanNumeral.toUpperCase();
        
        int l=  romanNumeral.length();
        int num=0;
        int previousnum = 0;
        for (int i=l-1;i>=0;i--)
        { 
                char x =  romanNumeral.charAt(i);
                x = Character.toUpperCase(x);
                switch(x)
                {  
                        case 'I':
                        previousnum = num;
                        num = 1;
                        break;
                     case 'V':
                             previousnum = num;
                        num = 5;
                        break;
                        case 'X':
                                previousnum = num;
                        num = 10;
                        break;
                        case 'L':
                                previousnum = num;
                        num = 50;
                        break;
                        case 'C':
                                previousnum = num;
                        num = 100;
                        break;
                        case 'D':
                                previousnum = num;
                        num = 500;
                        break;
                        case 'M':
                                previousnum = num;
                        num = 1000;
                        break;
                }           
                if (num<previousnum)
                {decimalNum= decimalNum-num;}
                 else
                decimalNum= decimalNum+num;
        }
}
    
    
    
    public static void main(String[] args) {
    	RomanNumerals rn=new RomanNumerals();
    	
    	
    	System.out.println("1");
    	System.out.println(rn.toNumeral(1));
    	System.out.println("");
    	
    	System.out.println("3");
    	System.out.println(rn.toNumeral(3));
    	System.out.println("");
    	
    	System.out.println("9");
    	System.out.println(rn.toNumeral(9));
    	System.out.println("");
    	
    	System.out.println("1066");
    	System.out.println(rn.toNumeral(1066));
    	System.out.println("");
    	
    	System.out.println("1989");
    	System.out.println(rn.toNumeral(1989));
    	System.out.println("");
    	
    	
    	System.out.println("I");
    	rn.convertToDecimal("I");
    	System.out.println(decimalNum);
    	System.out.println("");
    	
    	System.out.println("III");
    	rn.convertToDecimal("III");
    	System.out.println(decimalNum);
    	System.out.println("");
    	
    	System.out.println("IX");
    	rn.convertToDecimal("IX");
    	System.out.println(decimalNum);
    	System.out.println("");
    	
    	System.out.println("MLXVI");
    	rn.convertToDecimal("MLXVI");
    	System.out.println(decimalNum);
    	System.out.println("");
    	
    	System.out.println("MCMLXXXIX");
    	rn.convertToDecimal("MCMLXXXIX");
    	System.out.println(decimalNum);
    	System.out.println("");
    	
		
	}
}
