import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class majin extends Actor
{
    GifImage majin = new GifImage("12291.gif");
    
 public int speed = 3;
    public void act()
    {
        setImage(majin.getCurrentImage());
    }
}
