package de;

public class C4059n {
    public final boolean f13686a;
    public int f13687b;
    public int f13688c = -1;

    public C4059n(boolean z) {
        this.f13686a = z;
    }

    public void m29111a(int i) {
        this.f13687b = i | this.f13687b;
    }

    public boolean m29110b(boolean z) {
        return m29106f(z ? 6145 : 6144);
    }

    public boolean m29109c() {
        return m29106f(6);
    }

    public boolean m29108d() {
        return this.f13688c > 0 && m29106f(3145728);
    }

    public int m29107e() {
        return this.f13688c;
    }

    public boolean m29106f(int i) {
        return (i & this.f13687b) != 0;
    }

    public void m29105g(int i) {
        this.f13688c = i;
    }
}
