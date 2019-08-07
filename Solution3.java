import java.util.Scanner;

public class Solution3 {
	  static public void main(String[] args) { 
	    	
	    	Scanner sc=new Scanner(System.in);
	      
	        String str = sc.nextLine(); 
	  
	        int len = sub(str); 
	        System.out.println(len); 
	        sc.close();
	    } 

	
	
    final static int NO_OF_CHARS = 256; 
  

    static int distinctchar(String abc, int n) { 
  
   
        int c[] = new int[NO_OF_CHARS]; 
  
        
        for (int j = 0; j < n; j++) { 
            c[abc.charAt(j)]++; 
        } 
  
        int max = 0; 
        for (int i = 0; i < NO_OF_CHARS; i++) { 
            if (c[i] != 0) { 
                max++; 
            } 
        } 
  
        return max; 
    } 
  
    static int sub(String str) { 
  
        int n = str.length();     
  
       
        int max = distinctchar(str, n); 
        int minimum = n;  
  
        
        for (int i = 0; i < n; i++) { 
            for (int j = 0; j < n; j++) { 
                  
                String s = null; 
                if(i<j) 
                    s = str.substring(i, j); 
                else
                    s = str.substring(j, i); 
                int sub = s.length(); 
                int distinct = distinctchar(s, sub); 
  
           
                if (sub < minimum && max == distinct) { 
                    minimum = sub; 
                } 
            } 
        } 
        return minimum; 
    } 
  
   
  

}