package com.company.view;

import com.company.service.Map;

public class Render {
    public void print(Map map) {
        for(int h = 0; h < map.getHeight(); h++) {
            for(int w = 0; w < map.getWeight(); w++) {
                System.out.print(map.getArray()[h][w]);
            }
            System.out.println();
        }
    }
}
