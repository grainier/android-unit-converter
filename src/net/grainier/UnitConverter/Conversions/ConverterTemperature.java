package net.grainier.UnitConverter.Conversions;

public class ConverterTemperature implements ConverterInterface {
    private int outputUnit;
    private int inputUnit;
    private double inputValue;

    public double getOutputValue() {
        double kelvin = 0.0;
        double value = 0.0;

        if (this.inputUnit == this.outputUnit) {
            value = this.inputValue;
            return value;
        }

        switch (this.inputUnit) {
            case 0: {
                kelvin = this.inputValue + 273.14999999999998D;
                break;
            }
            case 1: {
                kelvin = (this.inputValue + 459.67000000000002D) * 0.5555555555555556D;
                break;
            }
            case 2: {
                kelvin = this.inputValue;
                break;
            }
            case 3: {
                kelvin = this.inputValue * 0.5555555555555556D;
                break;
            }
            default: {
                kelvin = this.inputValue;   // double check whether this works
                break;
            }
        }

        switch (this.outputUnit) {
            case 0: {
                value = kelvin - 273.14999999999998D;
                return value;
            }
            case 1: {
                value = (kelvin * 1.8D) - 459.67000000000002D;
                return value;
            }
            case 2: {
                value = kelvin;
                return value;
            }
            case 3: {
                value = kelvin * 1.8D;
                return value;
            }
            default: {
                value = kelvin;
                return value; // double check whether this works
            }
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