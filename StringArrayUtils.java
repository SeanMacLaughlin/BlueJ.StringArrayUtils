  

/**
 * Created by leon on 1/29/18.
 */
import java.util.Collections;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        String first = array[0];
        return first;
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        String second = array[1];
        return second;
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        String last = array[array.length - 1];
        return last;
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        String penult = array[array.length - 2];
        return penult;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        for(String word:array) {
            if (word.equals(value)) {
                return true;
        }
    }
    return false;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        List<String> list = Arrays.asList(array);
        Collections.reverse(list);
        array = (String[]) list.toArray();
        
        return array;
    }
  
    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
      // TODO
      */
    public static boolean isPalindromic(String[] array) {
        boolean racecar = false;
        String [] array2 = Arrays.copyOf(array, array.length);
        
        List<String> list = Arrays.asList(array);
        Collections.reverse(list);
        array = (String[]) list.toArray();
        
        if(Arrays.equals(array2, array)) {
            racecar = true;
        } else {
            racecar = false;
        }
        
        return racecar;
}
    
    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
      */

    public static boolean isPangramic(String[] array) {
        String str = Arrays.toString(array);
        char[] charArray = str.toCharArray();
        int len = str.length();
        boolean pan = false;
        
        if(len < 26) {
            pan = false;
        } else { 
            for (char c = 'A'; c <= 'Z'; c++) {
            if((str.indexOf(c) < 0) && (str.indexOf((char)(c+26)) < 0)) {
            pan = false;
                }
                pan = true;
            }
    }
    return pan;
}

    /**
     * @param array array of String objects
     * @param value value to check array for
      @return number of occurrences the specified `value` has occurred */
    public static int getNumberOfOccurrences(String[] array, String value) {
        int count = 0;    
        for(String word: array) {
                if(word.equals(value)) {
                    count++;
                }
        }
        return count;
    }
    
    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
             
            for(int i=0; i< array.length; i++){
                    if(array[i] == valueToRemove){
                        array[i] = null;
            }
            List<String> arrList = new ArrayList<String>();
            
            for(String s : array) {
                if(s != null) {
                    arrList.add(s);
        }
    }
    array = arrList.toArray(new String[arrList.size()]);
}
return array;
}
   


    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
      */// TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
           String temp = "";
           for(int i = 0; i < array.length; i++){
               temp = array[i];
               
               for(int j = i + 1; j < array.length; j++) {
                    if(array[j] == temp){
                        array[j] = null;
                    } else {
                        break;
                    }
        }
                temp = null;
    }
    
            List<String> arrList = new ArrayList<String>();
            
            for(String s : array) {
                if(s != null) {
                    arrList.add(s);
        }
            array = arrList.toArray(new String[arrList.size()]);
    }
return array;
}



    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
      */// TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
           String temp = "";
           ArrayList<String> ratPack = new ArrayList<String>();
           String packGo = "";
           
           for(int i = 0; i < array.length; i++){
               
               if(packGo != array[0]) {
                   packGo += array[0];
                }
                temp = array[i];
               for(int j = i+1; j < array.length; j++) {
                    if(array[j] == temp){
                        packGo += (temp + array[j]);
                        break;
                    } else {
                        ratPack.add(packGo);
                        packGo = null;
                        break;
                    }
                    
        }
        
    }
    
    String[] shredder = ratPack.toArray(new String[0]);
    return shredder;
}


}


