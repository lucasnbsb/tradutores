import java.io.*;
import node.*;

public class Main {

  public static void main(String argv[]) 
    throws java.io.IOException, java.lang.Exception
 {
    Lexer scanner = null;
    try {
      scanner = new Lexer( new java.io.FileReader(argv[0]) );
    }
    catch (java.io.FileNotFoundException e) {
      System.out.println("File not found : \""+argv[0]+"\"");
      System.exit(1);
    }
    catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Usage : java Main <inputfile>");
      System.exit(1);
    }

    try {
      Parser p = new Parser(scanner);
      Object result = p.parse().value;
      System.out.println(result.toString());
     
    }
    catch (java.io.IOException e) {
      System.out.println("An I/O error occured while parsing : \n"+e);
      System.exit(1);
    }
  }
}




