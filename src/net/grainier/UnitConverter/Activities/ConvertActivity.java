package net.grainier.UnitConverter.Activities;

import android.app.Activity;
import android.os.Bundle;
import net.grainier.UnitConverter.Conversions.UnitHelper;
import net.grainier.UnitConverter.R;

/**
 * Created by grainierp on 1/9/14.
 */
public class ConvertActivity extends Activity {
    private int typeId;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_convert_activity);
    }

    private CharSequence[] getUnitArray() {
        int i;
        switch (this.typeId) {
            case UnitHelper.angle_unit:
                i = R.array.angle_array;
                break;
            case UnitHelper.area_unit:
                i = R.array.area_array;
                break;
            case UnitHelper.bits_unit:
                i = R.array.bits_array;
                break;
            case UnitHelper.consumption_unit:
                i = R.array.consumption_array;
                break;
            case UnitHelper.currency_unit:
                i = R.array.currency_array;
                break;
            case UnitHelper.density_unit:
                i = R.array.density_array;
                break;
            case UnitHelper.force_unit:
                i = R.array.force_array;
                break;
            case UnitHelper.frequency_unit:
                i = R.array.frequency_array;
                break;
            case UnitHelper.illuminance_unit:
                i = R.array.illuminance_array;
                break;
            case UnitHelper.length_unit:
                i = R.array.lenght_array;
                break;
            case UnitHelper.pressure_unit:
                i = R.array.pressure_array;
                break;
            case UnitHelper.speed_unit:
                i = R.array.speed_array;
                break;
            case UnitHelper.temperature_unit:
                i = R.array.temperature_array;
                break;
            case UnitHelper.time_unit:
                i = R.array.time_array;
                break;
            case UnitHelper.volume_unit:
                i = R.array.volume_array;
                break;
            case UnitHelper.weight_unit:
                i = R.array.weight_array;
                break;
            case UnitHelper.flow_unit:
                i = R.array.flow_array;
                break;
            case UnitHelper.power_unit:
                i = R.array.power_array;
                break;
            default:
                i = -1;
                break;
        }

        CharSequence[] arrayOfCharSequence = new CharSequence[0];
        if (i != -1) {
            arrayOfCharSequence = getResources().getTextArray(i);
        }
        return arrayOfCharSequence;
    }
}