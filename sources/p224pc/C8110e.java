package p224pc;

import java.lang.reflect.Array;
import org.json.JSONObject;
import p208oc.C7848t;

public class C8110e extends C8105a {
    public int[] f26345i;
    public C7848t f26346j;
    public int[][] f26347k;
    public int f26348l;

    public C8110e(JSONObject jSONObject) {
        super(jSONObject);
        int length = this.f26327d.get(0).f26332a.length;
        int size = this.f26327d.size();
        this.f26345i = new int[length];
        for (int i = 0; i < length; i++) {
            this.f26345i[i] = 0;
            for (int i2 = 0; i2 < size; i2++) {
                int[] iArr = this.f26345i;
                iArr[i] = iArr[i] + this.f26327d.get(i2).f26332a[i];
            }
        }
        this.f26346j = new C7848t(this.f26345i);
    }

    @Override
    public void mo13585e() {
        super.mo13585e();
        this.f26348l = 0;
        int length = this.f26325b.length;
        int size = this.f26327d.size();
        int max = Math.max(1, Math.round(length / 140.0f));
        int i = length / max;
        this.f26347k = (int[][]) Array.newInstance(int.class, size, i);
        int[] iArr = new int[size];
        for (int i2 = 0; i2 < length; i2++) {
            for (int i3 = 0; i3 < size; i3++) {
                int[] iArr2 = this.f26327d.get(i3).f26332a;
                if (iArr2[i2] > iArr[i3]) {
                    iArr[i3] = iArr2[i2];
                }
            }
            if (i2 % max == 0) {
                for (int i4 = 0; i4 < size; i4++) {
                    this.f26347k[i4][this.f26348l] = iArr[i4];
                    iArr[i4] = 0;
                }
                int i5 = this.f26348l + 1;
                this.f26348l = i5;
                if (i5 >= i) {
                    return;
                }
            }
        }
    }
}
