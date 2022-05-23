package qc;

import org.json.JSONObject;
import pc.t;

public class d extends a {
    public int[] f21526i;
    public t f21527j;

    public d(JSONObject jSONObject) {
        super(jSONObject);
        g();
    }

    public int f(int i10, int i11) {
        return this.f21527j.f(i10, i11);
    }

    public void g() {
        int length = this.f21510d.get(0).f21515a.length;
        int size = this.f21510d.size();
        this.f21526i = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            this.f21526i[i10] = 0;
            for (int i11 = 0; i11 < size; i11++) {
                int[] iArr = this.f21526i;
                iArr[i10] = iArr[i10] + this.f21510d.get(i11).f21515a[i10];
            }
        }
        this.f21527j = new t(this.f21526i);
    }
}
