package x8;

import java.util.Arrays;
import java.util.List;

public class g {
    public f[] f26113a;
    public f[] f26114b;

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ScalingMatrix{ScalingList4x4=");
        f[] fVarArr = this.f26113a;
        List list = null;
        sb2.append(fVarArr == null ? null : Arrays.asList(fVarArr));
        sb2.append("\n");
        sb2.append(", ScalingList8x8=");
        f[] fVarArr2 = this.f26114b;
        if (fVarArr2 != null) {
            list = Arrays.asList(fVarArr2);
        }
        sb2.append(list);
        sb2.append("\n");
        sb2.append('}');
        return sb2.toString();
    }
}
