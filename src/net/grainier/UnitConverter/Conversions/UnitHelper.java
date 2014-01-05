package net.grainier.UnitConverter.Conversions;

import android.app.Activity;
import android.content.res.Resources;
import net.grainier.UnitConverter.R;

public class UnitHelper {
    public static final int numberOfUnitTypes = 18;
    public static final int angle_unit = 101;
    public static final int area_unit = 102;
    public static final int bits_unit = 103;
    public static final int consumption_unit = 104;
    public static final int currency_unit = 105;
    public static final int density_unit = 106;
    public static final int force_unit = 107;
    public static final int frequency_unit = 108;
    public static final int illuminance_unit = 109;
    public static final int length_unit = 110;
    public static final int pressure_unit = 111;
    public static final int speed_unit = 112;
    public static final int temperature_unit = 113;
    public static final int time_unit = 114;
    public static final int volume_unit = 115;
    public static final int weight_unit = 116;
    public static final int flow_unit = 117;
    public static final int power_unit = 118;

    /**
     * Get Unit Type Name
     *
     * @param typeId
     * @param paramActivity
     * @return typeString
     */
    public static String getNameString(int typeId, Activity paramActivity) {
        Resources localResources = paramActivity.getResources();
        switch (typeId) {
            case angle_unit:
                return localResources.getString(R.string.Angle);
            case area_unit:
                return localResources.getString(R.string.Area);
            case bits_unit:
                return localResources.getString(R.string.BitsBytes);
            case consumption_unit:
                return localResources.getString(R.string.Consumption);
            case currency_unit:
                return localResources.getString(R.string.Currency);
            case density_unit:
                return localResources.getString(R.string.Density);
            case force_unit:
                return localResources.getString(R.string.Force);
            case frequency_unit:
                return localResources.getString(R.string.Frequency);
            case illuminance_unit:
                return localResources.getString(R.string.Illuminance);
            case length_unit:
                return localResources.getString(R.string.Length);
            case pressure_unit:
                return localResources.getString(R.string.Pressure);
            case speed_unit:
                return localResources.getString(R.string.Speed);
            case temperature_unit:
                return localResources.getString(R.string.Temperature);
            case time_unit:
                return localResources.getString(R.string.Time);
            case volume_unit:
                return localResources.getString(R.string.Volume);
            case weight_unit:
                return localResources.getString(R.string.Weight);
            case flow_unit:
                return localResources.getString(R.string.Flow);
            case power_unit:
                return localResources.getString(R.string.Power);
            default:
                return null;
        }
    }

    /**
     * Get list of all available Unit type names
     *
     * @param paramActivity
     * @return String[] Type Names
     */
    public static String[] getAllUnitTypes(Activity paramActivity) {
        String[] allUnitTypes = new String[numberOfUnitTypes];
        for (int i = 0; i < numberOfUnitTypes; i++) {
            allUnitTypes[i] = getNameString(i + 101, paramActivity);
        }
        return allUnitTypes;
    }

    /**
     * Get Type ID for Type name
     *
     * @param typeName
     * @param paramActivity
     * @return typeId
     */
    public static int getTypeId(String typeName, Activity paramActivity) {
        Resources localResources = paramActivity.getResources();
        if (typeName.equals(localResources.getString(R.string.Angle))) return angle_unit;
        else if (typeName.equals(localResources.getString(R.string.Area))) return area_unit;
        else if (typeName.equals(localResources.getString(R.string.BitsBytes))) return bits_unit;
        else if (typeName.equals(localResources.getString(R.string.Consumption))) return consumption_unit;
        else if (typeName.equals(localResources.getString(R.string.Currency))) return currency_unit;
        else if (typeName.equals(localResources.getString(R.string.Density))) return density_unit;
        else if (typeName.equals(localResources.getString(R.string.Force))) return force_unit;
        else if (typeName.equals(localResources.getString(R.string.Frequency))) return frequency_unit;
        else if (typeName.equals(localResources.getString(R.string.Illuminance))) return illuminance_unit;
        else if (typeName.equals(localResources.getString(R.string.Length))) return length_unit;
        else if (typeName.equals(localResources.getString(R.string.Pressure))) return pressure_unit;
        else if (typeName.equals(localResources.getString(R.string.Speed))) return speed_unit;
        else if (typeName.equals(localResources.getString(R.string.Temperature))) return temperature_unit;
        else if (typeName.equals(localResources.getString(R.string.Time))) return time_unit;
        else if (typeName.equals(localResources.getString(R.string.Volume))) return volume_unit;
        else if (typeName.equals(localResources.getString(R.string.Weight))) return weight_unit;
        else if (typeName.equals(localResources.getString(R.string.Flow))) return flow_unit;
        else if (typeName.equals(localResources.getString(R.string.Power))) return power_unit;
        else return 0;
    }
}