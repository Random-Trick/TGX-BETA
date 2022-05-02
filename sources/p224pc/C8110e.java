package p224pc;

import java.lang.reflect.Array;
import org.json.JSONObject;
import p208oc.C7848t;

public class C8110e extends C8105a {
    public int[] f26342i;
    public C7848t f26343j;
    public int[][] f26344k;
    public int f26345l;

    public C8110e(JSONObject jSONObject) {
        super(jSONObject);
        int length = this.f26324d.get(0).f26329a.length;
        int size = this.f26324d.size();
        this.f26342i = new int[length];
        for (int i = 0; i < length; i++) {
            this.f26342i[i] = 0;
            for (int i2 = 0; i2 < size; i2++) {
                int[] iArr = this.f26342i;
                iArr[i] = iArr[i] + this.f26324d.get(i2).f26329a[i];
            }
        }
        this.f26343j = new C7848t(this.f26342i);
    }

    @Override
    public void mo13586e() {
        super.mo13586e();
        this.f26345l = 0;
        int length = this.f26322b.length;
        int size = this.f26324d.size();
        int max = Math.max(1, Math.round(length / 140.0f));
        int i = length / max;
        this.f26344k = (int[][]) Array.newInstance(int.class, size, i);
        int[] iArr = new int[size];
        for (int i2 = 0; i2 < length; i2++) {
            for (int i3 = 0; i3 < size; i3++) {
                int[] iArr2 = this.f26324d.get(i3).f26329a;
                if (iArr2[i2] > iArr[i3]) {
                    iArr[i3] = iArr2[i2];
                }
            }
            if (i2 % max == 0) {
                for (int i4 = 0; i4 < size; i4++) {
                    this.f26344k[i4][this.f26345l] = iArr[i4];
                    iArr[i4] = 0;
                }
                int i5 = this.f26345l + 1;
                this.f26345l = i5;
                if (i5 >= i) {
                    return;
                }
            }
        }
    }
}
