package qc;

import java.lang.reflect.Array;
import org.json.JSONObject;
import pc.t;

public class e extends a {
    public int[] f21528i;
    public t f21529j;
    public int[][] f21530k;
    public int f21531l;

    public e(JSONObject jSONObject) {
        super(jSONObject);
        int length = this.f21510d.get(0).f21515a.length;
        int size = this.f21510d.size();
        this.f21528i = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            this.f21528i[i10] = 0;
            for (int i11 = 0; i11 < size; i11++) {
                int[] iArr = this.f21528i;
                iArr[i10] = iArr[i10] + this.f21510d.get(i11).f21515a[i10];
            }
        }
        this.f21529j = new t(this.f21528i);
    }

    @Override
    public void e() {
        super.e();
        this.f21531l = 0;
        int length = this.f21508b.length;
        int size = this.f21510d.size();
        int max = Math.max(1, Math.round(length / 140.0f));
        int i10 = length / max;
        this.f21530k = (int[][]) Array.newInstance(int.class, size, i10);
        int[] iArr = new int[size];
        for (int i11 = 0; i11 < length; i11++) {
            for (int i12 = 0; i12 < size; i12++) {
                int[] iArr2 = this.f21510d.get(i12).f21515a;
                if (iArr2[i11] > iArr[i12]) {
                    iArr[i12] = iArr2[i11];
                }
            }
            if (i11 % max == 0) {
                for (int i13 = 0; i13 < size; i13++) {
                    this.f21530k[i13][this.f21531l] = iArr[i13];
                    iArr[i13] = 0;
                }
                int i14 = this.f21531l + 1;
                this.f21531l = i14;
                if (i14 >= i10) {
                    return;
                }
            }
        }
    }
}
