package com.company;

import java.awt.*;

public class Sparrow extends Bird
{
    public Sparrow()
    {
        System.out.println("Я воробей");
        vid = "Воробей";
        num++;
        this.time();
        this.color = new Color(250,125,65);
        //this.x = 100;
        //this.y = 150;
        this.size = 70;
    }

}
