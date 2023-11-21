import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class kame here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class kame extends Actor
{
     GifImage kame = new GifImage("kame.gif");
    
 public int speed = 3;

    
    public void act()
    {
        moveAtaque();
        acertarAlvo();
        setImage(kame.getCurrentImage());
    }
    public void moveAtaque()

    {
    double angle = Math.toRadians( getRotation());
    int x =(int) Math.round(getX() + Math.cos(angle));
    int y =(int) Math.round(getY() - Math.sin(angle));
    setLocation(x,y);
    }
    public void acertarAlvo(){
        Actor b = getOneIntersectingObject(vegeta.class);
        
        if (b != null){
            Counter counter = (Counter) getWorld().getObjects(Counter.class).get(0);
            counter.add(1);
            getWorld().removeObject(b);
            getWorld().removeObject(this);
            
        }
    }

    }

