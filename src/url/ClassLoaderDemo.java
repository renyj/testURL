package url;


import java.net.URL;

import org.junit.Test;


public class ClassLoaderDemo {

	@Test
   public void testurl(){
         
     // finds resource with the given name
     URL url = getClass().getClassLoader().getResource("file.txt");
     System.out.println("Value = " + url);

     // finds resource with the given name
     url = getClass().getClassLoader().getResource("newfolder/a.txt");
     System.out.println("Value = " + url);  
   }
}