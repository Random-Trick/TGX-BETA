package p331x9;

import p316w9.C10007i;

public final class C10163c {

    public static final class C10164a implements AbstractC10162b {
        public final C10007i f32876a = new C10007i("FrameDropper");
        public final double f32877b;
        public final double f32878c;
        public double f32879d;
        public int f32880e;
        public final int f32881f;
        public final int f32882g;

        public C10164a(int i, int i2) {
            this.f32881f = i;
            this.f32882g = i2;
            this.f32877b = 1.0d / i;
            this.f32878c = 1.0d / i2;
        }

        @Override
        public boolean mo5864a(long j) {
            double d = this.f32879d + this.f32877b;
            this.f32879d = d;
            int i = this.f32880e;
            this.f32880e = i + 1;
            if (i == 0) {
                C10007i iVar = this.f32876a;
                iVar.m6262h("RENDERING (first frame) - currentSpf=" + this.f32879d + " inputSpf=" + this.f32877b + " outputSpf=" + this.f32878c);
                return true;
            }
            double d2 = this.f32878c;
            if (d > d2) {
                this.f32879d = d - d2;
                C10007i iVar2 = this.f32876a;
                iVar2.m6262h("RENDERING - currentSpf=" + this.f32879d + " inputSpf=" + this.f32877b + " outputSpf=" + this.f32878c);
                return true;
            }
            C10007i iVar3 = this.f32876a;
            iVar3.m6262h("DROPPING - currentSpf=" + this.f32879d + " inputSpf=" + this.f32877b + " outputSpf=" + this.f32878c);
            return false;
        }
    }

    public static final AbstractC10162b m5865a(int i, int i2) {
        return new C10164a(i, i2);
    }
}
