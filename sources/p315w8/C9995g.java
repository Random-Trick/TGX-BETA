package p315w8;

import java.util.Arrays;
import java.util.List;

public class C9995g {
    public C9994f[] f32530a;
    public C9994f[] f32531b;

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ScalingMatrix{ScalingList4x4=");
        C9994f[] fVarArr = this.f32530a;
        List list = null;
        sb2.append(fVarArr == null ? null : Arrays.asList(fVarArr));
        sb2.append("\n");
        sb2.append(", ScalingList8x8=");
        C9994f[] fVarArr2 = this.f32531b;
        if (fVarArr2 != null) {
            list = Arrays.asList(fVarArr2);
        }
        sb2.append(list);
        sb2.append("\n");
        sb2.append('}');
        return sb2.toString();
    }
}
