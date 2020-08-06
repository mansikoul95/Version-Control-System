import java.util.Scanner;

/*
 * class name: InputParser
 */

public class InputParser {
    
    private static InputParser singleInstance = null;
    private static Scanner sc = new Scanner(System.in); // takes user input    
    
    /*
     * GetToken: returns the next token in input
     */
    public String GetToken() {        
        String token = sc.next();        
        return token;
    }
    
    /*
     * GetLine: returns the entire line until return carriage
     */
    public String GetLine() {
        String line = sc.nextLine();
        return line;
    }
    
    /*
     * CloseInput: close the input
     */
    public void CloseInput() {
        sc.close();
    }
    
    /*
     * getParser: return the singleton parser, don't want more than one instance of the input parser
     */
    public static InputParser getParser() {
        if( singleInstance == null ) {
            singleInstance = new InputParser();
        }
        return singleInstance;
    }
    
}
