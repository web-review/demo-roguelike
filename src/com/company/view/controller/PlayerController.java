package com.company.view.controller;

import com.company.service.impl.MoveServiceImpl;
import com.company.service.impl.Player;
import com.company.view.Render;

import java.util.Scanner;

public class PlayerController {
    MoveServiceImpl moveService = new MoveServiceImpl();
    Render render = new Render();
    boolean repeat = true;
    Scanner in = new Scanner(System.in);

    public void run()  {
        moveService.getMapService().createMap(20, 30, '⋯');
        moveService.getMapService().createPlayer(5, 5, '♜');
        render.print(moveService.getMapService().getMap());
        while(repeat) {
            move(in.next(), moveService.getMapService().getPlayer());
            render.print(moveService.getMapService().getMap());
            if(repeat == false) {
                System.out.println("Rest and peace bro..");
            }
        }
    }



    public void move(String direction, Player player) {
            switch (direction) {
                case "w":
                    if(moveService.up(player) == false) {
                        repeat = false;
                    }
                    break;
                case "s":
                    if(moveService.down(player) == false) {
                        repeat = false;
                    }
                    break;
                case "a":
                    if(moveService.left(player) == false) {
                        repeat = false;
                    }
                    break;
                case "d":
                    if(moveService.right(player) == false) {
                        repeat = false;
                    }
                    break;
            }
    }
}
