package p331x9;

import p316w9.C10007i;

public final class C10163c {

    public static final class C10164a implements AbstractC10162b {
        public final C10007i f32879a = new C10007i("FrameDropper");
        public final double f32880b;
        public final double f32881c;
        public double f32882d;
        public int f32883e;
        public final int f32884f;
        public final int f32885g;

        public C10164a(int i, int i2) {
            this.f32884f = i;
            this.f32885g = i2;
            this.f32880b = 1.0d / i;
            this.f32881c = 1.0d / i2;
        }

        @Override
        public boolean mo5864a(long j) {
            double d = this.f32882d + this.f32880b;
            this.f32882d = d;
            int i = this.f32883e;
            this.f32883e = i + 1;
            if (i == 0) {
                C10007i iVar = this.f32879a;
                iVar.m6262h("RENDERING (first frame) - currentSpf=" + this.f32882d + " inputSpf=" + this.f32880b + " outputSpf=" + this.f32881c);
                return true;
            }
            double d2 = this.f32881c;
            if (d > d2) {
                this.f32882d = d - d2;
                C10007i iVar2 = this.f32879a;
                iVar2.m6262h("RENDERING - currentSpf=" + this.f32882d + " inputSpf=" + this.f32880b + " outputSpf=" + this.f32881c);
                return true;
            }
            C10007i iVar3 = this.f32879a;
            iVar3.m6262h("DROPPING - currentSpf=" + this.f32882d + " inputSpf=" + this.f32880b + " outputSpf=" + this.f32881c);
            return false;
        }
    }

    public static final AbstractC10162b m5865a(int i, int i2) {
        return new C10164a(i, i2);
    }
}
