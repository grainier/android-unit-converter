package net.grainier.UnitConverter.Conversions;

public class ConverterVolume implements ConverterInterface {
    public static final double[] unitField;
    int outputUnit;
    int inputUnit;
    double inputValue;

    static {
        double[] arrayOfDouble = new double[22];
        arrayOfDouble[0] = 6.28981D;
        arrayOfDouble[1] = 1000000.0D;
        arrayOfDouble[2] = 3521.1267605633798D;
        arrayOfDouble[3] = 4000.0D;
        arrayOfDouble[4] = 4166.666666666667D;
        arrayOfDouble[5] = 10000.0D;
        arrayOfDouble[6] = 35195.079727854041D;
        arrayOfDouble[7] = 33814.022701842994D;
        arrayOfDouble[8] = 35.314667D;
        arrayOfDouble[9] = 227.02073999999999D;
        arrayOfDouble[10] = 219.9692D;
        arrayOfDouble[11] = 264.17205000000001D;
        arrayOfDouble[12] = 10.0D;
        arrayOfDouble[13] = 61024.74409D;
        arrayOfDouble[14] = 1000.0D;
        arrayOfDouble[15] = 1.0D;
        arrayOfDouble[16] = 1000000.0D;
        arrayOfDouble[17] = 1000000000.0D;
        arrayOfDouble[18] = 1759.7539899999999D;
        arrayOfDouble[19] = 67628.045403685988D;
        arrayOfDouble[20] = 202884.13621105801D;
        arrayOfDouble[21] = 1.30795D;
        unitField = arrayOfDouble;
    }

    public double getOutputValue() {
        double d;
        if (this.inputUnit == this.outputUnit) {
            d = this.inputValue;
            return d;
        } else {
            d = this.inputValue / unitField[this.inputUnit] * unitField[this.outputUnit];
            return d;
        }
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