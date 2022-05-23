package d6;

import java.util.List;
import javax.annotation.CheckForNull;

public final class e1 extends f1 {
    public final transient int M;
    public final f1 N;
    public final transient int f6467c;

    public e1(f1 f1Var, int i10, int i11) {
        this.N = f1Var;
        this.f6467c = i10;
        this.M = i11;
    }

    @Override
    public final int g() {
        return this.N.m() + this.f6467c + this.M;
    }

    @Override
    public final Object get(int i10) {
        r.a(i10, this.M, "index");
        return this.N.get(i10 + this.f6467c);
    }

    @Override
    public final int m() {
        return this.N.m() + this.f6467c;
    }

    @Override
    @CheckForNull
    public final Object[] s() {
        return this.N.s();
    }

    @Override
    public final int size() {
        return this.M;
    }

    @Override
    public final List subList(int i10, int i11) {
        return subList(i10, i11);
    }

    @Override
    public final f1 t(int i10, int i11) {
        r.c(i10, i11, this.M);
        f1 f1Var = this.N;
        int i12 = this.f6467c;
        return f1Var.subList(i10 + i12, i11 + i12);
    }
}
