package biz.konakov.p2;

public class ChainDrive {
    int bigSprocket, smallSprocket;

    public ChainDrive(int bigSprocket, int smallSprocket) {
        this.bigSprocket = bigSprocket;
        this.smallSprocket = smallSprocket;
    }

    public double ratio() {
        return (float) bigSprocket / smallSprocket;
    }
}
