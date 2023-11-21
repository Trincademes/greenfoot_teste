import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mundo here.
 * 
 * @author Trincademes 
 * @version 0.1 Alpha
 */
public class Mundo extends World
{
private GreenfootSound bgMusic = new GreenfootSound("gta.mp3");

public void started()
{
    bgMusic.playLoop();
}

public void stopped()
{
    bgMusic.pause();
}
    
    public Mundo()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
    }
    
    /**
     * Prepara o mundo para o início do programa.
     * Ou seja: criar os objetos iniciais e adicioná-los ao mundo.
     */
    private void prepare()
    {
        /*gohan gohan = new gohan();
        addObject(gohan,124,380);
        gohan.setLocation(136,417);
        vegeta vegeta = new vegeta();
        addObject(vegeta,623,406);
        vegeta.setLocation(617,416);
        vegeta.setLocation(622,438);
        gohan.setLocation(189,419);*/
        gohan gohan = new gohan();
        addObject(gohan,136,392);
        vegeta vegeta = new vegeta();
        addObject(vegeta,652,384);
        majin majin = new majin();
        addObject(majin,422,191);
        majin.setLocation(426,332);
        majin.setLocation(436,314);
        majin.setLocation(376,277);
        majin.setLocation(412,314);
        majin.setLocation(650,79);
        Counter counter = new Counter();
        addObject(counter,650,79);
        CopyOfCounter copyOfCounter = new CopyOfCounter();
        addObject(copyOfCounter,119,73);
        copyOfCounter.setLocation(119,79);
        majin.setLocation(655,87);
        copyOfCounter.setLocation(130,70);
        majin.setLocation(540,216);
        vegeta.setLocation(423,279);
        vegeta.setLocation(388,214);
        vegeta.setLocation(377,239);
        vegeta.setLocation(379,224);
        vegeta.setLocation(381,219);
        vegeta.setLocation(278,161);
        vegeta.setLocation(629,440);
        majin.setLocation(404,257);
        majin.setLocation(403,274);
        majin.setLocation(430,312);
        vegeta.setLocation(632,392);
        majin.setLocation(422,266);
        majin.setLocation(417,301);
        majin.setLocation(420,295);
        majin.setLocation(432,297);
        majin.setLocation(400,224);
        majin.setLocation(400,161);
        majin.setLocation(426,212);
        majin.setLocation(655,87);
        majin.setLocation(647,86);
        vegeta.setLocation(630,371);
        majin.setLocation(433,352);
        majin.setLocation(410,293);
        majin.setLocation(421,167);
        majin.setLocation(401,246);
    }
}
