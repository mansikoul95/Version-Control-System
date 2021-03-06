import java.io.IOException;
import org.json.simple.parser.ParseException;

/*
 * class name: Check_In
 * Implements the RunOperation to run the check-in command
 * 
 *  sc: uses the singleton for input parsing
 * 
 */

public class Check_In implements Component_Input {

    private InputParser sc = InputParser.getParser();
    
    /*
     * RunOperation: implented so that the check in command will be carried out
     *      syntax: cin 'source' 'destination'
     */
    @Override
    public void RunOperation() {
        String src;
        String dest;
        String[] arr;
        
        src = sc.GetToken();
        dest = sc.GetToken();
        System.out.println( "Merge from: " + src );
        System.out.println( "Merge changes to: " + dest );
        arr = new String[ 3 ];
        arr[0] = "cin";
        arr[1] = dest;
        arr[2] = dest;
        try {
            CreateMain.Checkin( arr );
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
