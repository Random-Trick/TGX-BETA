package qc;

import org.json.JSONObject;

public class c extends a {
    public float[] f21525i;

    public c(JSONObject jSONObject) {
        super(jSONObject);
    }

    @Override
    public void e() {
        super.e();
        int size = this.f21510d.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            int i12 = this.f21510d.get(i11).f21519e;
            if (i12 > i10) {
                i10 = i12;
            }
        }
        this.f21525i = new float[size];
        for (int i13 = 0; i13 < size; i13++) {
            int i14 = this.f21510d.get(i13).f21519e;
            if (i10 == i14) {
                this.f21525i[i13] = 1.0f;
            } else {
                this.f21525i[i13] = i10 / i14;
            }
        }
    }
}
