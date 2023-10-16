import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Running{
    public Running(){
        VirtualPet p = new VirtualPet();
        p.exercise();
        takeABeat(1000);
        p.feed();
        takeABeat(4000);
        p.exercise();
        getResponse("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }
    public String getResponse(String q){
        String s = (String)JOptionPane.showInputDialog(
                    new JFrame(),
                    q,
                    "Get a Response",
                    JOptionPane.PLAIN_MESSAGE
        );
        return s;
    }
    public void takeABeat(int milliseconds){
        try {
            Thread.sleep(1000); //milliseconds
        } catch(Exception e){
        
        }
    }

    public static void main(String[] args){
        Running r = new Running();
    }
}