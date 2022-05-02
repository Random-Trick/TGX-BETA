package de;

public class C4059n {
    public final boolean f13686a;
    public int f13687b;
    public int f13688c = -1;

    public C4059n(boolean z) {
        this.f13686a = z;
    }

    public void m29109a(int i) {
        this.f13687b = i | this.f13687b;
    }

    public boolean m29108b(boolean z) {
        return m29104f(z ? 6145 : 6144);
    }

    public boolean m29107c() {
        return m29104f(6);
    }

    public boolean m29106d() {
        return this.f13688c > 0 && m29104f(3145728);
    }

    public int m29105e() {
        return this.f13688c;
    }

    public boolean m29104f(int i) {
        return (i & this.f13687b) != 0;
    }

    public void m29103g(int i) {
        this.f13688c = i;
    }
}
