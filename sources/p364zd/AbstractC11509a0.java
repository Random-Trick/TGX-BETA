package p364zd;

import org.thunderdog.challegram.R;

public abstract class AbstractC11509a0 implements AbstractC11531p {
    public final int f36524a;

    public AbstractC11509a0(int i) {
        this.f36524a = i;
    }

    @Override
    public final int mo96a() {
        return this.f36524a;
    }

    @Override
    public final String mo95b() {
        return C11520h.m288l(C11520h.m278q(this.f36524a));
    }

    @Override
    public boolean mo94c() {
        return C11530o.m116a(this);
    }

    @Override
    public float mo93d(int i) {
        if (i == R.id.theme_property_parentTheme) {
            return 0.0f;
        }
        if (i == R.id.theme_property_wallpaperId) {
            return C11520h.m278q(this.f36524a);
        }
        throw C11524j.m247D0(i, "propertyId");
    }

    @Override
    public int mo92e(int i) {
        throw C11524j.m247D0(i, "colorId");
    }

    public boolean equals(Object obj) {
        return (obj instanceof AbstractC11531p) && ((AbstractC11531p) obj).mo96a() == mo96a();
    }

    @Override
    public boolean mo91f() {
        return C11530o.m115b(this);
    }
}
