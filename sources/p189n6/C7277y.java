package p189n6;

import p189n6.AbstractC7254d;

public final class C7277y extends AbstractC7254d.AbstractC7255a {
    public int f23126a;
    public boolean f23127b;
    public byte f23128c;

    @Override
    public final AbstractC7254d mo17166a() {
        if (this.f23128c == 3) {
            return new C7249a0(this.f23126a, this.f23127b, null);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.f23128c & 1) == 0) {
            sb2.append(" appUpdateType");
        }
        if ((this.f23128c & 2) == 0) {
            sb2.append(" allowAssetPackDeletion");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }

    @Override
    public final AbstractC7254d.AbstractC7255a mo17165b(boolean z) {
        this.f23127b = z;
        this.f23128c = (byte) (this.f23128c | 2);
        return this;
    }

    public final AbstractC7254d.AbstractC7255a m17164c(int i) {
        this.f23126a = i;
        this.f23128c = (byte) (this.f23128c | 1);
        return this;
    }
}
