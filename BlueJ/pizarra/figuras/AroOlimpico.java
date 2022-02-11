package figuras;

import java.awt.*;

public class AroOlimpico extends Circulo {
    Color color;
    public AroOlimpico(int a, int b, int d, Color c) {
      super(a,b,d);
      color=c;
    }
    public void dibujar(Graphics g) {
      Color cActual=g.getColor();
      g.setColor(color);
      g.drawOval(posicion.x,posicion.y,dMenor,dMayor);
      g.drawOval(posicion.x+1,posicion.y+1,dMenor-2,dMayor-2);
      g.drawOval(posicion.x+2,posicion.y+2,dMenor-4,dMayor-4);
      g.setColor(cActual);
    }
};

