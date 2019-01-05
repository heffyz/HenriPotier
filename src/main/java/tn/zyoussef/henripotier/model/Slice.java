package tn.zyoussef.henripotier.model;

public class Slice extends Offer {
    private int sliceValue;

    public Slice(){

    }

    public Slice(String type, int sliceValue, int value) {
        super(type, value);
        this.sliceValue = sliceValue;
    }

    public int getSliceValue() {
        return sliceValue;
    }

    public void setSliceValue(int sliceValue) {
        this.sliceValue = sliceValue;
    }
}
