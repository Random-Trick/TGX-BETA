package e6;

import java.util.List;
import javax.annotation.CheckForNull;

public final class y7 extends z7 {
    public final transient int M;
    public final z7 N;
    public final transient int f11263c;

    public y7(z7 z7Var, int i10, int i11) {
        this.N = z7Var;
        this.f11263c = i10;
        this.M = i11;
    }

    @Override
    public final int g() {
        return this.N.m() + this.f11263c + this.M;
    }

    @Override
    public final Object get(int i10) {
        f4.a(i10, this.M, "index");
        return this.N.get(i10 + this.f11263c);
    }

    @Override
    public final int m() {
        return this.N.m() + this.f11263c;
    }

    @Override
    @CheckForNull
    public final Object[] r() {
        return this.N.r();
    }

    @Override
    public final z7 s(int i10, int i11) {
        f4.c(i10, i11, this.M);
        z7 z7Var = this.N;
        int i12 = this.f11263c;
        return z7Var.subList(i10 + i12, i11 + i12);
    }

    @Override
    public final int size() {
        return this.M;
    }

    @Override
    public final List subList(int i10, int i11) {
        return subList(i10, i11);
    }
}
