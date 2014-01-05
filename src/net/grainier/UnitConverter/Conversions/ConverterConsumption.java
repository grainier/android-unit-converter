package net.grainier.UnitConverter.Conversions;

// TODO :  Modify

public class ConverterConsumption implements ConverterInterface {
    public static final double[] poljeRazdaljaNaVolumen;
    public static final double[] poljeVolumenNaRazdaljo;
    int outputUnit;
    int inputUnit;
    double inputValue;

    static {
        double[] arrayOfDouble1 = new double[7];
        arrayOfDouble1[0] = 35.399999999999999D;
        arrayOfDouble1[1] = 42.509999999999998D;
        arrayOfDouble1[2] = 0.0D;
        arrayOfDouble1[3] = 100.0D;
        arrayOfDouble1[4] = 1.0D;
        arrayOfDouble1[5] = 0.0D;
        arrayOfDouble1[6] = 0.0D;
        poljeVolumenNaRazdaljo = arrayOfDouble1;
        double[] arrayOfDouble2 = new double[7];
        arrayOfDouble2[0] = 0.0D;
        arrayOfDouble2[1] = 0.0D;
        arrayOfDouble2[2] = 1.0D;
        arrayOfDouble2[3] = 0.0D;
        arrayOfDouble2[4] = 0.0D;
        arrayOfDouble2[5] = 2.825D;
        arrayOfDouble2[6] = 2.352D;
        poljeRazdaljaNaVolumen = arrayOfDouble2;
    }

    public double getOutputValue() {
        double d;
        if (this.inputUnit == this.outputUnit) {
            d = this.inputValue;
            return d;
        }
        if ((this.inputUnit == 0) || (this.inputUnit == 1) || (this.inputUnit == 3) || (this.inputUnit == 4)) {
            if ((this.outputUnit == 0) || (this.outputUnit == 1) || (this.outputUnit == 3) || (this.outputUnit == 4)) {
                d = this.inputValue / poljeVolumenNaRazdaljo[this.inputUnit] * poljeVolumenNaRazdaljo[this.outputUnit];
                return d;
            } else {
                d = 1.0D / (this.inputValue / poljeVolumenNaRazdaljo[this.inputUnit]) * poljeRazdaljaNaVolumen[this.outputUnit];
                return d;
            }
        }
        if ((this.outputUnit == 0) || (this.outputUnit == 1) || (this.outputUnit == 3) || (this.outputUnit == 4)) {
            d = 1.0D / (this.inputValue / poljeRazdaljaNaVolumen[this.inputUnit]) * poljeVolumenNaRazdaljo[this.outputUnit];
            return d;
        } else {
            d = this.inputValue / poljeRazdaljaNaVolumen[this.inputUnit] * poljeRazdaljaNaVolumen[this.outputUnit];
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