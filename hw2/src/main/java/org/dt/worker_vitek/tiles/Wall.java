package org.dt.worker_vitek.tiles;

public class Wall implements Tile {
    private final Double height;

    public Wall(Double height) {
        this.height = height;
    }

    @Override
    public Double getTileMeasure() {
        return height;
    }

    @Override
    public TileType getTileType() {
        return TileType.WALL;
    }
}
