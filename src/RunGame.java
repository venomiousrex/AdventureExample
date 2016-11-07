/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hadik9595
 */
public class RunGame {
    
    
    public static void main(String[] args) {
        // creat the interface
        GUI gui = new GUI();
        // show the interface
        gui.setVisible(true);
        
        //create the map
        Map map = new Map("zelda/tiles.txt");
        
        Controller c = new Controller(gui,map,8,8);
    }
}
