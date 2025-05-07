import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Food for our elephant.
 * 
 * @author Leo 
 * @version April 2025
 */
public class Apple extends Actor
{
    int speed = 1;
    
    public void act()
    {
        // Apple falls downwards.
        int x = getX();
        int y = getY() + speed;
        setLocation(x, y);
        
        // Remove apple and draw game over when apple gets to the bottom
        MyWorld world = (MyWorld) getWorld();
        if(getY() >= world.getHeight())
        {
            world.gameOver();
            world.removeObject(this);
        }
    }
    
    public void setSpeed(int spd)
    {
        speed = spd;
    }
}
