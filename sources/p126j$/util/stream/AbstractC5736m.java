package p126j$.util.stream;

import java.util.Collections;
import java.util.EnumSet;

public abstract class AbstractC5736m {
    static {
        EnumC5716i iVar = EnumC5716i.CONCURRENT;
        EnumC5716i iVar2 = EnumC5716i.UNORDERED;
        EnumC5716i iVar3 = EnumC5716i.IDENTITY_FINISH;
        Collections.unmodifiableSet(EnumSet.of(iVar, iVar2, iVar3));
        Collections.unmodifiableSet(EnumSet.of(iVar, iVar2));
        Collections.unmodifiableSet(EnumSet.of(iVar3));
        Collections.unmodifiableSet(EnumSet.of(iVar2, iVar3));
        Collections.emptySet();
    }

    public static double m22217a(double[] dArr) {
        double d = dArr[0] + dArr[1];
        double d2 = dArr[dArr.length - 1];
        return (!Double.isNaN(d) || !Double.isInfinite(d2)) ? d : d2;
    }

    public static double[] m22216b(double[] dArr, double d) {
        double d2 = d - dArr[1];
        double d3 = dArr[0];
        double d4 = d3 + d2;
        dArr[1] = (d4 - d3) - d2;
        dArr[0] = d4;
        return dArr;
    }
}
