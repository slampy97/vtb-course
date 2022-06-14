package org.dt.worker_vitek.competition;

import org.dt.worker_vitek.Cat;
import org.dt.worker_vitek.Human;
import org.dt.worker_vitek.Robot;
import org.dt.worker_vitek.tiles.Road;
import org.dt.worker_vitek.tiles.Tile;
import org.dt.worker_vitek.tiles.TileType;
import org.dt.worker_vitek.tiles.Wall;

public class Competition {
    public static void main(String[] argv) {
        Tile[] tiles = new Tile[5];
        tiles[0] = new Road(10.0);
        tiles[1] = new Wall(15.0);
        tiles[2] = new Road(20.0);
        tiles[3] = new Wall(20.0);
        tiles[4] = new Road(50.0);
        Robot robot = new Robot("роботВасилий", 51.0, 21.0);
        for (Tile tile : tiles) {
            if (tile.getTileType() == TileType.ROAD) {
                if (!robot.run(tile.getTileMeasure())) break;
            }
            if (tile.getTileType() == TileType.WALL) {
                if (!robot.jump(tile.getTileMeasure())) break;
            }
        }

        Cat cat = new Cat("кисуля", 30.0, 21.0);

        for (Tile tile : tiles) {
            if (tile.getTileType() == TileType.ROAD) {
                if (!cat.run(tile.getTileMeasure())) break;
            }
            if (tile.getTileType() == TileType.WALL) {
                if (!cat.jump(tile.getTileMeasure())) break;
            }
        }

        Human human = new Human("Василий", 60.0, 11.0);

        for (Tile tile : tiles) {
            if (tile.getTileType() == TileType.ROAD) {
                if (!human.run(tile.getTileMeasure())) break;
            }
            if (tile.getTileType() == TileType.WALL) {
                if (!human.jump(tile.getTileMeasure())) break;
            }
        }
    }
}
