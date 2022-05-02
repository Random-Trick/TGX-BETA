package p046d6;

import java.util.List;
import javax.annotation.CheckForNull;

public final class C3849y7 extends AbstractC3858z7 {
    public final transient int f13088M;
    public final AbstractC3858z7 f13089N;
    public final transient int f13090c;

    public C3849y7(AbstractC3858z7 z7Var, int i, int i2) {
        this.f13089N = z7Var;
        this.f13090c = i;
        this.f13088M = i2;
    }

    @Override
    public final Object get(int i) {
        C3669f4.m29839a(i, this.f13088M, "index");
        return this.f13089N.get(i + this.f13090c);
    }

    @Override
    public final int mo29731i() {
        return this.f13089N.mo29730m() + this.f13090c + this.f13088M;
    }

    @Override
    public final int mo29730m() {
        return this.f13089N.mo29730m() + this.f13090c;
    }

    @Override
    @CheckForNull
    public final Object[] mo29729r() {
        return this.f13089N.mo29729r();
    }

    @Override
    public final AbstractC3858z7 mo29723s(int i, int i2) {
        C3669f4.m29837c(i, i2, this.f13088M);
        AbstractC3858z7 z7Var = this.f13089N;
        int i3 = this.f13090c;
        return z7Var.subList(i + i3, i2 + i3);
    }

    @Override
    public final int size() {
        return this.f13088M;
    }

    @Override
    public final List subList(int i, int i2) {
        return subList(i, i2);
    }
}
