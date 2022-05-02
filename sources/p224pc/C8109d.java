package p224pc;

import org.json.JSONObject;
import p208oc.C7848t;

public class C8109d extends C8105a {
    public int[] f26343i;
    public C7848t f26344j;

    public C8109d(JSONObject jSONObject) {
        super(jSONObject);
        m13586g();
    }

    public int m13587f(int i, int i2) {
        return this.f26344j.m14869f(i, i2);
    }

    public void m13586g() {
        int length = this.f26327d.get(0).f26332a.length;
        int size = this.f26327d.size();
        this.f26343i = new int[length];
        for (int i = 0; i < length; i++) {
            this.f26343i[i] = 0;
            for (int i2 = 0; i2 < size; i2++) {
                int[] iArr = this.f26343i;
                iArr[i] = iArr[i] + this.f26327d.get(i2).f26332a[i];
            }
        }
        this.f26344j = new C7848t(this.f26343i);
    }
}
