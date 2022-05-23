package ae;

import org.thunderdog.challegram.R;

public abstract class a0 implements p {
    public final int f792a;

    public a0(int i10) {
        this.f792a = i10;
    }

    @Override
    public final int a() {
        return this.f792a;
    }

    @Override
    public final String b() {
        return h.l(h.q(this.f792a));
    }

    @Override
    public boolean c() {
        return o.a(this);
    }

    @Override
    public float d(int i10) {
        if (i10 == R.id.theme_property_parentTheme) {
            return 0.0f;
        }
        if (i10 == R.id.theme_property_wallpaperId) {
            return h.q(this.f792a);
        }
        throw j.B0(i10, "propertyId");
    }

    @Override
    public int e(int i10) {
        throw j.B0(i10, "colorId");
    }

    public boolean equals(Object obj) {
        return (obj instanceof p) && ((p) obj).a() == a();
    }

    @Override
    public boolean f() {
        return o.b(this);
    }
}
