/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hadik9595
 */
public class Controller {
    private GUI gui;
    private Map map;
    private int row;
    private int col;
    
    public Controller(GUI gui, Map m, int r, int c){
        this.gui = gui;
        this.map = map;
        this.row = row;
        this.col = col;
        
        //make sure the GUI can talk to you
        gui.setController(this);
        
        //set starting image 
        Screen start = map.getScreen(row, col);
        gui.setImage(start.getImage());
    }
    
    public void goNorth(){
        //get the screen we are on right now 
        Screen current = map.getScreen(row, col);
        
        //ask if we can move north
        if(current.canGoNorth()){
            // move up a row
            row--;
            //Get new screen 
            Screen newScreen = map.getScreen(row, col);
            // set the image
            gui.setImage(newScreen.getImage());
        }
    }
    
    
    
}
