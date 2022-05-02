package p293v;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Range;
import p266t.C8927z;
import p336y.AbstractC10311w1;

public class C9806a implements AbstractC10311w1 {
    public final Range<Integer> f32076a;

    public C9806a(C8927z zVar) {
        this.f32076a = m6826d((Range[]) zVar.m10952a(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES));
    }

    public static boolean m6827c(C8927z zVar) {
        Integer num = (Integer) zVar.m10952a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        return num != null && num.intValue() == 2;
    }

    public final Range<Integer> m6829a(Range<Integer> range) {
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

    public Range<Integer> m6828b() {
        return this.f32076a;
    }

    public final Range<Integer> m6826d(Range<Integer>[] rangeArr) {
        Range<Integer> range = null;
        if (!(rangeArr == null || rangeArr.length == 0)) {
            for (Range<Integer> range2 : rangeArr) {
                Range<Integer> a = m6829a(range2);
                if (a.getUpper().intValue() == 30 && (range == null || a.getLower().intValue() < range.getLower().intValue())) {
                    range = a;
                }
            }
        }
        return range;
    }
}
