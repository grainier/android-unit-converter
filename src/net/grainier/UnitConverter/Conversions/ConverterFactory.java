package net.grainier.UnitConverter.Conversions;

public class ConverterFactory {
    public static ConverterInterface getConverter(int typeId) {
        switch (typeId) {
            case UnitHelper.angle_unit:
                return new ConverterAngle();
            case UnitHelper.area_unit:
                return new ConverterArea();
            case UnitHelper.bits_unit:
                return new ConverterBits();
            case UnitHelper.consumption_unit:
                return new ConverterConsumption();
            case UnitHelper.currency_unit:
                return new ConverterCurrency();
            case UnitHelper.density_unit:
                return new ConverterDensity();
            case UnitHelper.force_unit:
                return new ConverterForce();
            case UnitHelper.frequency_unit:
                return new ConverterFrequency();
            case UnitHelper.illuminance_unit:
                return new ConverterIluminance();
            case UnitHelper.length_unit:
                return new ConverterLength();
            case UnitHelper.pressure_unit:
                return new ConverterPressure();
            case UnitHelper.speed_unit:
                return new ConverterSpeed();
            case UnitHelper.temperature_unit:
                return new ConverterTemperature();
            case UnitHelper.time_unit:
                return new ConverterTime();
            case UnitHelper.volume_unit:
                return new ConverterVolume();
            case UnitHelper.weight_unit:
                return new ConverterWeight();
            case UnitHelper.flow_unit:
                return new ConverterFlow();
            case UnitHelper.power_unit:
                return new ConverterPower();
            default:
                return null;
        }
    }
}