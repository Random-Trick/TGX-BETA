package v;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Range;
import t.z;
import y.w1;

public class a implements w1 {
    public final Range<Integer> f24661a;

    public a(z zVar) {
        this.f24661a = d((Range[]) zVar.a(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES));
    }

    public static boolean c(z zVar) {
        Integer num = (Integer) zVar.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        return num != null && num.intValue() == 2;
    }

    public final Range<Integer> a(Range<Integer> range) {
        int intValue = range.getUpper().intValue();
        int intValue2 = range.getLower().intValue();
        if (range.getUpper().intValue() >= 1000) {
            intValue = range.getUpper().intValue() / 1000;
        }
        if (range.getLower().intValue() >= 1000) {
            intValue2 = range.getLower().intValue() / 1000;
        }
        return new Range<>(Integer.valueOf(intValue2), Integer.valueOf(intValue));
    }

    public Range<Integer> b() {
        return this.f24661a;
    }

    public final Range<Integer> d(Range<Integer>[] rangeArr) {
        Range<Integer> range = null;
        if (!(rangeArr == null || rangeArr.length == 0)) {
            for (Range<Integer> range2 : rangeArr) {
                Range<Integer> a10 = a(range2);
                if (a10.getUpper().intValue() == 30 && (range == null || a10.getLower().intValue() < range.getLower().intValue())) {
                    range = a10;
                }
            }
        }
        return range;
    }
}
