import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class gohan here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class gohan extends Actor
{
    private int sTimer =0;
    /**
     * Act - do whatever the gohan wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public int speed=1;
    /**
     * Act - do whatever the ben10 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (canMove()) {
            movimento();
        }
        else {
            turnLeft();
        }
    }

    /**
     * Move one step forward.
     */
    public void move()
    {
        move(1);
    }
   
    /**
     * Turn left by 90 degrees.
     */
    public void turnLeft()
    {
        turn(-90);
    }
   
   
    /**
     * Set the direction we're facing. The 'direction' parameter must
     * be in the range [0..3].
     */
    public void setDirection(int direction)
    {
        if ((direction >= 0) && (direction <= 3)) {
            setRotation(direction * 90);
        }
    }
   
    public void movimento() {
       
        if (Greenfoot.isKeyDown("w")){
            this.setLocation(this.getX(), this.getY() - speed);
        }
        if (Greenfoot.isKeyDown("s")){
            this.setLocation(this.getX(), this.getY() + speed);
        }
        if (Greenfoot.isKeyDown("a")){
            this.setLocation(this.getX() - speed, this.getY());
        }
        if (Greenfoot.isKeyDown("d")){
            this.setLocation(this.getX() + speed, this.getY());
        }
        else if (Greenfoot.isKeyDown("r") && (sTimer==0)){
            sTimer++;
        getWorld().addObject(new kame(), getX() + 335, getY() +30);
    }
    else{
        if (!Greenfoot.isKeyDown("r")){
            sTimer = 0;
        }
    }
}
        
        
     
   
    /**
     * Test if we can move forward. Return true if we can, false otherwise.
     */
    public boolean canMove()
    {
        int rotation = getRotation();
        int x = getX();
        int y = getY();
        boolean facingEdge = false;
       
        switch (rotation) {
            case 0:
                facingEdge = (x == getWorld().getWidth() - 1);
                break;
            case 90:
                facingEdge = (y == getWorld().getHeight() - 1);
                break;
            case 180:
                facingEdge = (x == 0);
                break;
            case 270:
                facingEdge = (y == 0);
                break;
        }
       
        return !facingEdge;
    }

    /**
     * Tell how many leaves we have eaten.
     */
   
    }


