package p224pc;

import org.json.JSONObject;
import p208oc.C7848t;

public class C8109d extends C8105a {
    public int[] f26340i;
    public C7848t f26341j;

    public C8109d(JSONObject jSONObject) {
        super(jSONObject);
        m13587g();
    }

    public int m13588f(int i, int i2) {
        return this.f26341j.m14869f(i, i2);
    }

    public void m13587g() {
        int length = this.f26324d.get(0).f26329a.length;
        int size = this.f26324d.size();
        this.f26340i = new int[length];
        for (int i = 0; i < length; i++) {
            this.f26340i[i] = 0;
            for (int i2 = 0; i2 < size; i2++) {
                int[] iArr = this.f26340i;
                iArr[i] = iArr[i] + this.f26324d.get(i2).f26329a[i];
            }
        }
        this.f26341j = new C7848t(this.f26340i);
    }
}
