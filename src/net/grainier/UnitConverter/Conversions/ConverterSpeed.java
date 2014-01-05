package net.grainier.UnitConverter.Conversions;

public class ConverterSpeed implements ConverterInterface {
    public static final double[] unitField;
    int outputUnit;
    int inputUnit;
    double inputValue;

    static {
        double[] arrayOfDouble = new double[22];
        arrayOfDouble[0] = 0.00016667D;
        arrayOfDouble[1] = 0.01D;
        arrayOfDouble[2] = 8.467E-005D;
        arrayOfDouble[3] = 0.00508D;
        arrayOfDouble[4] = 0.3048D;
        arrayOfDouble[5] = 0.00042333D;
        arrayOfDouble[6] = 0.0254D;
        arrayOfDouble[7] = 0.27777778D;
        arrayOfDouble[8] = 1000.0D;
        arrayOfDouble[9] = 0.51444444D;
        arrayOfDouble[10] = 340.29329999999999D;
        arrayOfDouble[11] = 0.00027778D;
        arrayOfDouble[12] = 0.01666667D;
        arrayOfDouble[13] = 1.0D;
        arrayOfDouble[14] = 0.44704D;
        arrayOfDouble[15] = 0.51444444D;
        arrayOfDouble[16] = 26.822399999999998D;
        arrayOfDouble[17] = 1609.3340000000001D;
        arrayOfDouble[18] = 299790000.0D;
        arrayOfDouble[19] = 0.000254D;
        arrayOfDouble[20] = 0.01524D;
        arrayOfDouble[21] = 0.9144D;
        unitField = arrayOfDouble;
    }

    public double getOutputValue() {
        double d;
        if (this.inputUnit == this.outputUnit) {
            d = this.inputValue;
            return d;
        }
        d = this.inputValue * unitField[this.inputUnit] / unitField[this.outputUnit];
        return d;
    }

    public void setOutputUnit(int paramInt) {
        this.outputUnit = paramInt;
    }

    public void setInputUnit(int paramInt) {
        this.inputUnit = paramInt;
    }

    public void setInputValue(double paramDouble) {
        this.inputValue = paramDouble;
    }
}