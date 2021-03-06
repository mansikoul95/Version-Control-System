import java.io.FileNotFoundException;
import java.io.IOException;
import org.json.simple.parser.ParseException;

/*
 * class name: Check_Out 
 * Implements the RunOperation to run the check-out command
 * 
 *  sc: uses the singleton for input parsing
 * 
 */
public class Check_Out implements Component_Input {

    private InputParser sc = InputParser.getParser();
    private static Label newLabel = new Label();
    
    /*
     * RunOperation: implented so that the check out command will be carried out
     *      syntax: cout 'source' 'manifest/label' 'destination'
     */
    @Override
    public void RunOperation() {
        String src;
        String dest;
        String mani;
        String[] arr;
        
        src = sc.GetToken();
        mani = sc.GetToken();
        

        dest = sc.GetToken();
        System.out.println( "Copy repo from: " + src );
        System.out.println( "Manifest version: " + mani );
        System.out.println( "Copy repo into: " + dest );
        arr = new String[ 4 ];
        arr[0] = "cout";
        arr[1] = src;
        arr[2] = mani;
        arr[3] = dest;        
        try {
            Run_Checkout.checkout( arr );
        } catch (IOException | ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
