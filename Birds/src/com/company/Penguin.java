package com.company;

import java.awt.*;

public class Penguin extends Bird {
    public Penguin()
    {
        System.out.println("Я пингвин");
        vid = "Пингвин";
        num++;
        this.time();
        this.color = Color.BLACK; //черный цвет
        //this.x = 150;
        //this.y = 80;
        this.size = 60;
    }
    @Override
    public void Fly()
    {
        System.out.println("Я не могу летать");
    }
    public void draw (Graphics g)
    {
       // g.setColor(new Color(0,30,60));
        //this.x = (int) Math.random()*1000;
        //this.y = (int) Math.random()*1000;
        //this.size = 70;
        g.setColor(color);
        g.fillOval(this.x,this.y,this.size,this.size);
        g.setColor(new Color(255,255,255));
        g.fillOval(this.x+5, this.y+6,this.size/2,this.size/2);

        //специфика пингвина: из за дополнительного круга внутри, нужно отдельно выводить рамку
        g.setColor(color);
        g.drawRect(this.x,this.y,this.size,this.size);

    }

}
