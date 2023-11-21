import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class hadu2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class hadu2 extends Actor
{
     GifImage hadu2 = new GifImage("haduken.gif");
    
 public int speed = 3;

    
    public void act()
    {
        moveAtaque();
        setImage(hadu2.getCurrentImage());
    }
    public void moveAtaque()

    {
    double angle = Math.toRadians( getRotation());
    int x =(int) Math.round(getX()  - Math.cos(angle));
    int y =(int) Math.round(getY()  + Math.sin(angle));
    
    setLocation(x,y);
    }
    public void acertarAlvo(){
        Actor a = getOneIntersectingObject(gohan.class);
        
        if (a != null){
            Counter counter = (Counter) getWorld().getObjects(Counter.class).get(0);
            counter.add(1);
            getWorld().removeObject(a);
            getWorld().removeObject(this);
            
        }
    }
    
}

