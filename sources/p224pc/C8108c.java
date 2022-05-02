package p224pc;

import org.json.JSONObject;

public class C8108c extends C8105a {
    public float[] f26342i;

    public C8108c(JSONObject jSONObject) {
        super(jSONObject);
    }

    @Override
    public void mo13585e() {
        super.mo13585e();
        int size = this.f26327d.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            int i3 = this.f26327d.get(i2).f26336e;
            if (i3 > i) {
                i = i3;
            }
        }
        this.f26342i = new float[size];
        for (int i4 = 0; i4 < size; i4++) {
            int i5 = this.f26327d.get(i4).f26336e;
            if (i == i5) {
                this.f26342i[i4] = 1.0f;
            } else {
                this.f26342i[i4] = i / i5;
            }
        }
    }
}
