package ae;

import org.thunderdog.challegram.R;

public abstract class s implements p {
    public final int f1056a;
    public final p f1057b;

    public s(int i10, int i11) {
        this.f1056a = i10;
        p a10 = c0.a(i11);
        this.f1057b = a10;
        if (a10 == null) {
            throw new IllegalArgumentException("parentThemeId == " + i10);
        }
    }

    @Override
    public int a() {
        return this.f1056a;
    }

    @Override
    public String b() {
        return this.f1057b.b();
    }

    @Override
    public boolean c() {
        return o.a(this);
    }

    @Override
    public float d(int i10) {
        if (i10 == R.id.theme_property_parentTheme) {
            return this.f1057b.a();
        }
        return this.f1057b.d(i10);
    }

    @Override
    public int e(int i10) {
        return this.f1057b.e(i10);
    }

    @Override
    public boolean f() {
        return o.b(this);
    }
}
