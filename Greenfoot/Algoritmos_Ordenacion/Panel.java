import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Panel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Panel extends World
{
    final static int DESP_Y = 30;
    final static int ARRIMA_A_UN_LADO = 80;
    final static int MOVIMIENTO = 3;

    Ordenacion o1,o2,o3;

    public Panel()
    {   
       super(900, 400, 1); 
       int i;
       Ficha[] datosDesordenados;
       datosDesordenados = new Ficha[Casillero.TAM];
       for(i=0;i<datosDesordenados.length;i++){
           datosDesordenados[i]=new Ficha();
           datosDesordenados[i].setValue((int)(Math.random()*20));
       }  

       
        addObject(new OrdenacionIntercambioDirecto(new Casillero(this,50,30, datosDesordenados,"Burbuja")),0,0);
        addObject(new OrdenacionIntercambioDirectoMejorado(new Casillero(this,350,30, datosDesordenados,"Sacudida")),0,0);
        addObject(new OrdenacionSeleccionDirecta(new Casillero(this,650,30, datosDesordenados,"Selecc. Directa")),0,0);
    }    
}
