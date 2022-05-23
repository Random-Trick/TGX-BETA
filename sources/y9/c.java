package y9;

import x9.i;

public final class c {

    public static final class a implements b {
        public final i f26660a = new i("FrameDropper");
        public final double f26661b;
        public final double f26662c;
        public double f26663d;
        public int f26664e;
        public final int f26665f;
        public final int f26666g;

        public a(int i10, int i11) {
            this.f26665f = i10;
            this.f26666g = i11;
            this.f26661b = 1.0d / i10;
            this.f26662c = 1.0d / i11;
        }

        @Override
        public boolean a(long j10) {
            double d10 = this.f26663d + this.f26661b;
            this.f26663d = d10;
            int i10 = this.f26664e;
            this.f26664e = i10 + 1;
            if (i10 == 0) {
                i iVar = this.f26660a;
                iVar.h("RENDERING (first frame) - currentSpf=" + this.f26663d + " inputSpf=" + this.f26661b + " outputSpf=" + this.f26662c);
                return true;
            }
            double d11 = this.f26662c;
            if (d10 > d11) {
                this.f26663d = d10 - d11;
                i iVar2 = this.f26660a;
                iVar2.h("RENDERING - currentSpf=" + this.f26663d + " inputSpf=" + this.f26661b + " outputSpf=" + this.f26662c);
                return true;
            }
            i iVar3 = this.f26660a;
            iVar3.h("DROPPING - currentSpf=" + this.f26663d + " inputSpf=" + this.f26661b + " outputSpf=" + this.f26662c);
            return false;
        }
    }

    public static final b a(int i10, int i11) {
        return new a(i10, i11);
    }
}
