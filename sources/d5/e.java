package d5;

import c5.b0;
import com.coremedia.iso.boxes.sampleentry.VisualSampleEntry;

public final class e {
    public final int f6239a;
    public final int f6240b;
    public final String f6241c;

    public e(int i10, int i11, String str) {
        this.f6239a = i10;
        this.f6240b = i11;
        this.f6241c = str;
    }

    public static e a(b0 b0Var) {
        String str;
        b0Var.Q(2);
        int D = b0Var.D();
        int i10 = D >> 1;
        int D2 = ((b0Var.D() >> 3) & 31) | ((D & 1) << 5);
        if (i10 == 4 || i10 == 5 || i10 == 7) {
            str = "dvhe";
        } else if (i10 == 8) {
            str = VisualSampleEntry.TYPE7;
        } else if (i10 != 9) {
            return null;
        } else {
            str = VisualSampleEntry.TYPE4;
        }
        String str2 = D2 < 10 ? ".0" : ".";
        StringBuilder sb2 = new StringBuilder(str.length() + 24 + str2.length());
        sb2.append(str);
        sb2.append(".0");
        sb2.append(i10);
        sb2.append(str2);
        sb2.append(D2);
        return new e(i10, D2, sb2.toString());
    }
}
