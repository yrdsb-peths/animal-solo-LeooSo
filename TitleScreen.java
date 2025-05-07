import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Title Screen.
 * 
 * @author Leo  
 * @version May 2025
 */
public class TitleScreen extends World
{
    Label titleLabel = new Label("The Elephant", 60);
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 

        addObject(titleLabel, 230, 100);
        prepare();
    }

    /**
     * The main world act loop
     */
    public void act()
    {
        // Start the game if user presses the space bar
        if(Greenfoot.isKeyDown("space"))
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
    }
        
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Elephant elephant = new Elephant();
        addObject(elephant,460,86);
        elephant.setLocation(465,117);
        elephant.setLocation(482,79);
        elephant.setLocation(486,92);
        elephant.setLocation(484,87);
        elephant.setLocation(464,86);
        elephant.setLocation(461,89);
        elephant.setLocation(474,77);
        elephant.setLocation(478,100);
        elephant.setLocation(504,92);
        elephant.setLocation(486,89);
        Label label = new Label("Press <space> to Start", 40);
        addObject(label,296,325);
        label.setLocation(293,306);
        Label label2 = new Label("Use \u2190 and \u2192 to Move", 40);
        addObject(label2,259,264);
        label2.setLocation(302,253);
        label2.setLocation(290,244);
        label2.setLocation(290,223);
        label.setLocation(292,300);
        label.setLocation(302,282);
        label.setLocation(284,284);
        elephant.setLocation(492,92);
        elephant.setLocation(475,95);
    }
}
