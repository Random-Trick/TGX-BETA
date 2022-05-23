package j$.util.stream;

import java.util.Collections;
import java.util.EnumSet;

public abstract class AbstractC0356n {
    static {
        EnumC0331i iVar = EnumC0331i.CONCURRENT;
        EnumC0331i iVar2 = EnumC0331i.UNORDERED;
        EnumC0331i iVar3 = EnumC0331i.IDENTITY_FINISH;
        Collections.unmodifiableSet(EnumSet.of(iVar, iVar2, iVar3));
        Collections.unmodifiableSet(EnumSet.of(iVar, iVar2));
        Collections.unmodifiableSet(EnumSet.of(iVar3));
        Collections.unmodifiableSet(EnumSet.of(iVar2, iVar3));
        Collections.emptySet();
    }

    public static double a(double[] dArr) {
        double d10 = dArr[0] + dArr[1];
        double d11 = dArr[dArr.length - 1];
        return (!Double.isNaN(d10) || !Double.isInfinite(d11)) ? d10 : d11;
    }

    public static double[] b(double[] dArr, double d10) {
        double d11 = d10 - dArr[1];
        double d12 = dArr[0];
        double d13 = d12 + d11;
        dArr[1] = (d13 - d12) - d11;
        dArr[0] = d13;
        return dArr;
    }
}
