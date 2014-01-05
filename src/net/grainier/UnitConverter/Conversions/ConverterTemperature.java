package net.grainier.UnitConverter.Conversions;

public class ConverterTemperature  implements ConverterInterface
{
  private int outputUnit;
  private int inputUnit;
  private double inputValue;

  public double getOutputValue()
  {
    double d1 = 0.0D;
    double d2 = 0.0D;
    double d3;
    if (this.inputUnit == this.outputUnit)
    {
      d3 = this.inputValue;
      return d3;
    }
    switch (this.inputUnit)
    {
    default:
      label60: switch (this.outputUnit)
      {
      default:
      case 0:
      case 1:
      case 2:
      case 3:
      }
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      d3 = d2;
      break;
      d1 = 273.14999999999998D + this.inputValue;
      break label60;
      d1 = 0.5555555555555556D * (459.67000000000002D + this.inputValue);
      break label60;
      d1 = this.inputValue;
      break label60;
      d1 = 0.5555555555555556D * this.inputValue;
      break label60;
      d2 = d1 - 273.14999999999998D;
      continue;
      d2 = d1 * 1.8D - 459.67000000000002D;
      continue;
      d2 = d1;
      continue;
      d2 = d1 * 1.8D;
    }
  }

  public void setOutputUnit(int paramInt)
  {
    this.outputUnit = paramInt;
  }

  public void setInputUnit(int paramInt)
  {
    this.inputUnit = paramInt;
  }

  public void setInputValue(double paramDouble)
  {
    this.inputValue = paramDouble;
  }
}