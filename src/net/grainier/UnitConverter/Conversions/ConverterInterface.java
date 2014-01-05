package net.grainier.UnitConverter.Conversions;

public abstract interface ConverterInterface
{
  public abstract double getOutputValue();

  public abstract void setOutputUnit(int paramInt);

  public abstract void setInputUnit(int paramInt);

  public abstract void setInputValue(double paramDouble);
}