package p189n6;

import p189n6.AbstractC7254d;

public final class C7277y extends AbstractC7254d.AbstractC7255a {
    public int f23129a;
    public boolean f23130b;
    public byte f23131c;

    @Override
    public final AbstractC7254d mo17166a() {
        if (this.f23131c == 3) {
            return new C7249a0(this.f23129a, this.f23130b, null);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.f23131c & 1) == 0) {
            sb2.append(" appUpdateType");
        }
        if ((this.f23131c & 2) == 0) {
            sb2.append(" allowAssetPackDeletion");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }

    @Override
    public final AbstractC7254d.AbstractC7255a mo17165b(boolean z) {
        this.f23130b = z;
        this.f23131c = (byte) (this.f23131c | 2);
        return this;
    }

    public final AbstractC7254d.AbstractC7255a m17164c(int i) {
        this.f23129a = i;
        this.f23131c = (byte) (this.f23131c | 1);
        return this;
    }
}
