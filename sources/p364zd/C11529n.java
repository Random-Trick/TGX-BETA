package p364zd;

import org.thunderdog.challegram.R;

public final class C11529n implements AbstractC11531p {
    public int f36961a;
    public String f36962b;
    public final C11511b0 f36963c;
    public final C11527m f36964d;
    public AbstractC11531p f36965e;
    public int f36966f;

    public C11529n(int i) {
        this.f36961a = i;
        this.f36963c = new C11511b0();
        this.f36964d = new C11527m();
    }

    @Override
    public int mo96a() {
        return this.f36961a;
    }

    @Override
    public String mo95b() {
        String l;
        String str = this.f36962b;
        if (str != null) {
            return str;
        }
        Float a = this.f36963c.m356a(R.id.theme_property_wallpaperId);
        if (a != null && (l = C11520h.m288l(a.intValue())) != null) {
            return l;
        }
        AbstractC11531p pVar = this.f36965e;
        if (pVar != null) {
            return pVar.mo95b();
        }
        throw C11524j.m247D0(0, "wallpaper");
    }

    @Override
    public boolean mo94c() {
        return C11530o.m116a(this);
    }

    @Override
    public float mo93d(int i) {
        Float a = this.f36963c.m356a(i);
        if (a != null) {
            return a.floatValue();
        }
        AbstractC11531p pVar = this.f36965e;
        if (pVar != null) {
            return pVar.mo93d(i);
        }
        throw C11524j.m247D0(i, "propertyId");
    }

    @Override
    public int mo92e(int i) {
        Integer a = this.f36964d.m132a(i);
        if (a != null) {
            return a.intValue();
        }
        AbstractC11531p pVar = this.f36965e;
        if (pVar != null) {
            return pVar.mo92e(i);
        }
        throw C11524j.m247D0(i, "colorId");
    }

    @Override
    public boolean mo91f() {
        return C11530o.m115b(this);
    }

    public AbstractC11531p m124g() {
        return this.f36965e;
    }

    public boolean m123h(int i, boolean z) {
        Integer a = this.f36964d.m132a(i);
        return a != null && (!z || this.f36965e == null || a.intValue() != this.f36965e.mo92e(i));
    }

    public boolean m122i(int i) {
        return this.f36966f == i;
    }

    public void m121j(int i, Integer num) {
        this.f36966f = i;
        this.f36964d.m128e(i, num);
    }

    public void m120k(int i) {
        this.f36961a = i;
    }

    public final void m119l(int i) {
        AbstractC11531p a = C11514c0.m348a(i);
        this.f36965e = a;
        if (a == null) {
            throw new IllegalArgumentException("Invalid themeId: " + i);
        }
    }

    public void m118m(int i, Float f) {
        if (i == R.id.theme_property_parentTheme) {
            m119l(f != null ? f.intValue() : 0);
        }
        this.f36963c.m353d(i, f);
    }

    public void m117n(String str) {
        this.f36962b = str;
    }

    public C11529n(int i, C11529n nVar) {
        this.f36961a = i;
        this.f36962b = nVar.f36962b;
        this.f36963c = new C11511b0(nVar.f36963c);
        this.f36964d = new C11527m(nVar.f36964d);
        this.f36965e = nVar.f36965e;
    }
}
