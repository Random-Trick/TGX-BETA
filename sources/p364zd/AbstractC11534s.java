package p364zd;

import org.thunderdog.challegram.R;

public abstract class AbstractC11534s implements AbstractC11531p {
    public final int f36973a;
    public final AbstractC11531p f36974b;

    public AbstractC11534s(int i, int i2) {
        this.f36973a = i;
        AbstractC11531p a = C11514c0.m348a(i2);
        this.f36974b = a;
        if (a == null) {
            throw new IllegalArgumentException("parentThemeId == " + i);
        }
    }

    @Override
    public int mo96a() {
        return this.f36973a;
    }

    @Override
    public String mo95b() {
        return this.f36974b.mo95b();
    }

    @Override
    public boolean mo94c() {
        return C11530o.m116a(this);
    }

    @Override
    public float mo93d(int i) {
        if (i == R.id.theme_property_parentTheme) {
            return this.f36974b.mo96a();
        }
        return this.f36974b.mo93d(i);
    }

    @Override
    public int mo92e(int i) {
        return this.f36974b.mo92e(i);
    }

    @Override
    public boolean mo91f() {
        return C11530o.m115b(this);
    }
}
