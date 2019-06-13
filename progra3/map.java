package progra3;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

public class map extends Canvas {
public map (){
        setBackground(Color.white);
    }
    
    @Override
    public void paint(Graphics g){
        //primeras dos son cordenadas, las otras tamaños
        
        //hospital
        g.setColor(Color.red);
        g.fillOval(500, 10, 40, 40);
        
        //restaurante
        g.setColor(Color.green);
        g.fillOval(550, 175, 40, 40);
        
        //gym
        g.setColor(Color.yellow);
        g.fillOval(150, 10, 40, 40);
        
        //tienda
        g.setColor(Color.CYAN);
        g.fillOval(400, 300, 40, 40);
        
        //puntos de captura
        g.setColor(Color.ORANGE);
        g.fillOval(300, 50, 25, 25);
        
        g.setColor(Color.ORANGE);
        g.fillOval(200, 150, 25, 25);
        
        g.setColor(Color.ORANGE);
        g.fillOval(300, 300, 25, 25);
        
        g.setColor(Color.ORANGE);
        g.fillOval(575, 50, 25, 25);
    }
}