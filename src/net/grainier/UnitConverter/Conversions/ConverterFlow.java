package net.grainier.UnitConverter.Conversions;

public class ConverterFlow implements ConverterInterface {
    public static final double[] unitField;
    int outputUnit;
    int inputUnit;
    double inputValue;

    static {
        double[] arrayOfDouble = new double[18];
        arrayOfDouble[0] = 1.0E-006D;
        arrayOfDouble[1] = 6.E-005D;
        arrayOfDouble[2] = 0.0036D;
        arrayOfDouble[3] = 0.028316846593D;
        arrayOfDouble[4] = 1.6990107956D;
        arrayOfDouble[5] = 101.94064774D;
        arrayOfDouble[6] = 0.00018942042841D;
        arrayOfDouble[7] = 0.0045460902819D;
        arrayOfDouble[8] = 0.27276541691D;
        arrayOfDouble[9] = 1.6387064001E-005D;
        arrayOfDouble[10] = 0.0009832238400499999D;
        arrayOfDouble[11] = 0.058993430403D;
        arrayOfDouble[12] = 0.001D;
        arrayOfDouble[13] = 0.06D;
        arrayOfDouble[14] = 3.6D;
        arrayOfDouble[15] = 1.0D;
        arrayOfDouble[16] = 60.0D;
        arrayOfDouble[17] = 3600.0D;
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