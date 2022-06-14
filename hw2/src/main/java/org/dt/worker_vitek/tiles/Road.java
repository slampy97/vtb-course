package org.dt.worker_vitek.tiles;

public class Road implements Tile {
    private final Double length;

    public Road(Double length) {
        this.length = length;
    }

    @Override
    public Double getTileMeasure() {
        return length;
    }

    @Override
    public TileType getTileType() {
        return TileType.ROAD;
    }
}
