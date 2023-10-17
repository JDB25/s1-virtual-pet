/* Virtual Pet, version 1
 * 
 * @author Cam
 * @author ?
 */

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class VirtualPet {
    
    VirtualPetFace face;
    int hunger = 0;   // how hungry the pet is.
    
    // constructor
    public VirtualPet() {
        face = new VirtualPetFace();
        face.setImage("idle");
        face.setMessage("Hello and welcome to MiniHockey!");
    }
    public void sad(){
        face.setImage("sad");
    }
    public void Knockout(){
        face.setImage("Knockout");
    }
    public void Knocked(){
        face.setImage("Knocked");
    }
    public void goal(){
        face.setImage("goal");
    }
    public void fake(){
        face.setImage("fake");
    }
    public void win()
    {
        face.setImage("win");
    }
    public void feed() {
        if (hunger > 10) {
            hunger = hunger - 10;
        } else {
            hunger = 0;
        }
        face.setMessage("Yum, thanks");
        face.setImage("normal");
    }
    
    public void alter1() {
        hunger = hunger + 3;
        face.setMessage("");
        face.setImage("alter1");
    }
    public void message(String message, String title){
        JOptionPane.showMessageDialog(new JFrame(),
    message, title,
    JOptionPane.PLAIN_MESSAGE);
    }
    public void slam(){
        face.setImage("slam");
    }
    
    public void sleep() {
        hunger = hunger + 1;
        face.setImage("asleep");
    }
    public int dialog(String answer1, String answer2, String question, String title){
        Object[] options = {answer1, answer2};
        int n = JOptionPane.showOptionDialog(new JFrame(),
        question,
        title,
        JOptionPane.YES_NO_OPTION,
        JOptionPane.QUESTION_MESSAGE,
        null,
        options,
        options[1]);
        return n;
    }

} // end Virtual Pet
