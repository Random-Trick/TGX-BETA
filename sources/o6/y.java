package o6;

import o6.d;

public final class y extends d.a {
    public int f19264a;
    public boolean f19265b;
    public byte f19266c;

    @Override
    public final d a() {
        if (this.f19266c == 3) {
            return new a0(this.f19264a, this.f19265b, null);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.f19266c & 1) == 0) {
            sb2.append(" appUpdateType");
        }
        if ((this.f19266c & 2) == 0) {
            sb2.append(" allowAssetPackDeletion");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }

    @Override
    public final d.a b(boolean z10) {
        this.f19265b = z10;
        this.f19266c = (byte) (this.f19266c | 2);
        return this;
    }

    public final d.a c(int i10) {
        this.f19264a = i10;
        this.f19266c = (byte) (this.f19266c | 1);
        return this;
    }
}
