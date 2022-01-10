import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ordenaciones here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ordenaciones extends ThreadActor
{
    private Ordenacion s1, s2, s3;

    public Ordenaciones(Panel p)
    {
       int i;
       Ficha[] datosDesordenados;
       datosDesordenados = new Ficha[Casillero.TAM];
       for(i=0;i<datosDesordenados.length;i++){
           datosDesordenados[i]=new Ficha();
           datosDesordenados[i].setValue((int)(Math.random()*20));
       }  
       
       s1 = new OrdenacionIntercambioDirecto(new Casillero(p,50,30, datosDesordenados));
       //s2 = new OrdenacionIntercambioDirectoMejorado(new Casillero(p,350,30, datosDesordenados));
       //s3 = new OrdenacionSeleccionDirecta(new Casillero(p,650,30, datosDesordenados));

       setSequences(new Sequence[] { new ParCasilleroOrdenacion(s1)});   //,new ParCasilleroOrdenacion(s2),new ParCasilleroOrdenacion(s3)});
    }

 
    public class ParCasilleroOrdenacion  extends Sequence
    {
    
        Ordenacion ordenacion;
    
        public ParCasilleroOrdenacion(Ordenacion o){
            ordenacion = o;
        }
        
        public void doRun() throws InterruptedException
            {
                // This corresponds roughly to a Scratch
                //   "when running, do forever: move(..)"
                
                while (true) {
                    ordenacion.mueveCasillas();
                    waitForNextSequence();
                }
            }
    
    
    }

}
