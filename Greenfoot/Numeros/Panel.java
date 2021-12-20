import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Panel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Panel extends World
{
    /**
     * Constructor for objects of class Panel.
     * 
     */
    private Ordenacion serieDatos1;
    private Ordenacion serieDatos2;

    public Panel()
    {   
       super(600, 400, 1); 
       int i;
       Ficha[] datosDesordenados;
       datosDesordenados = new Ficha[OrdenacionIntercambioDirecto.TAM];
       for(i=0;i<datosDesordenados.length;i++){
           datosDesordenados[i]=new Ficha();
           datosDesordenados[i].setValue((int)(Math.random()*20));
       }  
       serieDatos1 = new OrdenacionSeleccionDirecta(this,50,30, datosDesordenados);
       serieDatos2 = new OrdenacionIntercambioDirecto(this,250,30, datosDesordenados);
    }    
    
    public void act(){
       // serieDatos1.ordenacionIntercambioDirecto();
       // serieDatos2.ordenacionIntercambioDirecto();
    }

}
