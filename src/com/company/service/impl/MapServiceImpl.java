package com.company.service.impl;

import com.company.service.Map;

import java.util.Random;

public class MapServiceImpl {
    Map map = new Map();
    Bomb[][] bombs;
    Player player = new Player();
    Random random = new Random();

    public char[][] fill(Map map) {
        for(int h = 0; h < map.getHeight(); h++ ){
            for(int w = 0; w < map.getWeight(); w++) {
                map.getArray()[h][w] = map.getSymbol();
            }
        }
        return map.getArray();
    }

    public char[][] fillByBomb(char[][] array) {
        int height, weight;
        bombs = new Bomb[map.getHeight()][map.getWeight()];
        for(int h = 0; h < random.nextInt(map.getHeight()); h++ ){
            for(int w = 0; w < random.nextInt(map.getWeight()); w++) {
                height = random.nextInt(map.getHeight());
                weight = random.nextInt(map.getWeight());
                map.getArray()[height][weight] = '⚑';
                bombs[height][weight] = new Bomb(height,weight, "bomb(" + height + "," + weight + ")");
                bombs[height][weight].setStatus(true);
            }
        }
        return map.getArray();
    }

    public boolean put(Player player){
        map.getArray()[player.getX()][player.getY()] = player.getSymbol();
        return explosion(map, player);
    }

    public char[][] put(char symbol) {
        map.getArray()[player.getX()][player.getY()] = symbol;
        return map.getArray();
    }

    public boolean explosion(Map map, Player player) {
        if(bombs[player.getX()][player.getY()] == null) {
        } else if (bombs[player.getX()][player.getY()].isStatus() == true){
            map.getArray()[player.getX()][player.getY() + 1] = '✶';
            map.getArray()[player.getX() + 1][player.getY()] = '✶';
            map.getArray()[player.getX()][player.getY()] = '✶';
            map.getArray()[player.getX() - 1][player.getY()] = '✶';
            map.getArray()[player.getX()][player.getY() - 1] = '✶';
            return false;
        }
        return true;
    }

    public Player getPlayer() {
        return player;
    }

    public void createPlayer(int x, int y, char playerSymbol) {
        player.setX(x);
        player.setY(y);
        player.setSymbol(playerSymbol);
        put(player);
    }

    public Map createMap(int height, int weight, char symbol) {
        map.init(height, weight, symbol);
        map.setArray(fillByBomb(fill(map)));
        return map;
    }

    public Map getMap() {
        return map;
    }
}
