package ae;

import org.thunderdog.challegram.R;

public final class n implements p {
    public int f1044a;
    public String f1045b;
    public final b0 f1046c;
    public final m f1047d;
    public p f1048e;
    public int f1049f;

    public n(int i10) {
        this.f1044a = i10;
        this.f1046c = new b0();
        this.f1047d = new m();
    }

    @Override
    public int a() {
        return this.f1044a;
    }

    @Override
    public String b() {
        String l10;
        String str = this.f1045b;
        if (str != null) {
            return str;
        }
        Float a10 = this.f1046c.a(R.id.theme_property_wallpaperId);
        if (a10 != null && (l10 = h.l(a10.intValue())) != null) {
            return l10;
        }
        p pVar = this.f1048e;
        if (pVar != null) {
            return pVar.b();
        }
        throw j.B0(0, "wallpaper");
    }

    @Override
    public boolean c() {
        return o.a(this);
    }

    @Override
    public float d(int i10) {
        Float a10 = this.f1046c.a(i10);
        if (a10 != null) {
            return a10.floatValue();
        }
        p pVar = this.f1048e;
        if (pVar != null) {
            return pVar.d(i10);
        }
        throw j.B0(i10, "propertyId");
    }

    @Override
    public int e(int i10) {
        Integer a10 = this.f1047d.a(i10);
        if (a10 != null) {
            return a10.intValue();
        }
        p pVar = this.f1048e;
        if (pVar != null) {
            return pVar.e(i10);
        }
        throw j.B0(i10, "colorId");
    }

    @Override
    public boolean f() {
        return o.b(this);
    }

    public p g() {
        return this.f1048e;
    }

    public boolean h(int i10, boolean z10) {
        Integer a10 = this.f1047d.a(i10);
        return a10 != null && (!z10 || this.f1048e == null || a10.intValue() != this.f1048e.e(i10));
    }

    public boolean i(int i10) {
        return this.f1049f == i10;
    }

    public void j(int i10, Integer num) {
        this.f1049f = i10;
        this.f1047d.e(i10, num);
    }

    public void k(int i10) {
        this.f1044a = i10;
    }

    public final void l(int i10) {
        p a10 = c0.a(i10);
        this.f1048e = a10;
        if (a10 == null) {
            throw new IllegalArgumentException("Invalid themeId: " + i10);
        }
    }

    public void m(int i10, Float f10) {
        if (i10 == R.id.theme_property_parentTheme) {
            l(f10 != null ? f10.intValue() : 0);
        }
        this.f1046c.d(i10, f10);
    }

    public void n(String str) {
        this.f1045b = str;
    }

    public n(int i10, n nVar) {
        this.f1044a = i10;
        this.f1045b = nVar.f1045b;
        this.f1046c = new b0(nVar.f1046c);
        this.f1047d = new m(nVar.f1047d);
        this.f1048e = nVar.f1048e;
    }
}
