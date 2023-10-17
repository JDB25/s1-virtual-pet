import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Running{
    public Running(){
        VirtualPet p = new VirtualPet();
       int answer0=p.dialog("Yes","Yes", "Welcome to MiniHockey! Click Yes to Start", null);
        
        p.alter1();
       int answer1 = p.dialog("Left", "Right", "2 defenders stand in your way! Who will you try to pass?", null);
        if(answer1 == 0){
            p.slam();
            p.message("You attempt to pass the left defender but he bodyslams you!", null);
        
        int answer2=p.dialog("Go to the bench to recover for the rest of the game", "Drop gloves and fight!", "What will you do?", "question");
                if (answer2 == 1){
                    int answer3 = p.dialog("Uppercut", "Cross", "You fight! After dropping gloves he lands some good hits, but nothing you cant take. How do you hit back?", null);
                        if (answer3 == 0){
                           p.message("You go in for the uppercut!", null); 
                           p.Knockout();
                           p.message("And you knock him out!", null);
                           p.message("Sadly this does eject you from the game, but you go home a hero. The End",null);
                           p.win();
                        }
                        else {
                            p.Knocked();
                            p.message("You cross to his face but miss!! He catches your chin on the return swing and knocks you out! You get carried to the hospital and your team loses. The End",null);
                        }

            }
                else{
                p.sad();
                p.message("You elect to sit out the rest of the game, your team loses without you :( The End", "The End"); }
        }
        else {
            p.goal();
            p.message("You easily pass the right defender, making your way to the goal! Now all that stands between you and the goal is the goalie", null);
            int answer4 = p.dialog("attempt to fake the goalie", "atempt to shoot the puck right through his guard","What is your stratagy?", null);
            if (answer4 == 0){
                p.fake();
                int answer5 = p.dialog("follow through and shoot right", "double fake and shoot left", "You sucessfuly fake the goalie into thinking you are shooting left, but this goalie has quick refexes and might still block it. What do you do? ", null);
                if(answer5 == 0){
                    p.win();
                    p.message("You score!!! Winning the game and returning home a hero. The End", null);
                }
                else{
                    p.sad();
                    p.message("Did you really think that would work? You shoot the puck right into the goalies lap, losing the game :( The End", null);
                }         
            }
            else {
                p.sad();
                p.message("You attempt to snipe the goal, avoiding the goalie, but the goalie blocks your shot, losing you the game :( The End", null);
            }
        }

            
    
    
    
    
    
    
    }


        
   

    
    

    public String getResponse(String q){
        String s = (String)JOptionPane.showInputDialog(
                    new JFrame(),
                    q,
                    "Choice!",
                    JOptionPane.PLAIN_MESSAGE
        );
        return s;
    }
    public void takeABeat(int milliseconds){
        try {
            Thread.sleep(milliseconds); //milliseconds
        } catch(Exception e){
        
        }
    }

    public static void main(String[] args){
        Running r = new Running();
    }
}