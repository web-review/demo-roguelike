package com.company.service.impl;

public class MoveServiceImpl {
    MapServiceImpl mapService = new MapServiceImpl();

    public boolean up(Player player) {
        mapService.put('⋯');
        player.setX(player.getX() - 1);
        return mapService.put(player);
    }

    public boolean down(Player player) {
        mapService.put('⋯');
        player.setX(player.getX() + 1);
        return mapService.put(player);
    }

    public boolean left(Player player) {
        mapService.put('⋯');
        player.setY(player.getY() - 1);
        return mapService.put(player);
    }

    public boolean right(Player player) {
        mapService.put('⋯');
        player.setY(player.getY() + 1);
        return mapService.put(player);
    }

    public MapServiceImpl getMapService() {
        return mapService;
    }
}
