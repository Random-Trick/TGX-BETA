package p033c6;

import java.util.List;
import javax.annotation.CheckForNull;

public final class C1706e1 extends AbstractC1721f1 {
    public final transient int f6235M;
    public final AbstractC1721f1 f6236N;
    public final transient int f6237c;

    public C1706e1(AbstractC1721f1 f1Var, int i, int i2) {
        this.f6236N = f1Var;
        this.f6237c = i;
        this.f6235M = i2;
    }

    @Override
    public final Object get(int i) {
        C1893r.m35938a(i, this.f6235M, "index");
        return this.f6236N.get(i + this.f6237c);
    }

    @Override
    public final int mo35831i() {
        return this.f6236N.mo35830m() + this.f6237c + this.f6235M;
    }

    @Override
    public final int mo35830m() {
        return this.f6236N.mo35830m() + this.f6237c;
    }

    @Override
    @CheckForNull
    public final Object[] mo35828s() {
        return this.f6236N.mo35828s();
    }

    @Override
    public final int size() {
        return this.f6235M;
    }

    @Override
    public final List subList(int i, int i2) {
        return subList(i, i2);
    }

    @Override
    public final AbstractC1721f1 mo36063t(int i, int i2) {
        C1893r.m35936c(i, i2, this.f6235M);
        AbstractC1721f1 f1Var = this.f6236N;
        int i3 = this.f6237c;
        return f1Var.subList(i + i3, i2 + i3);
    }
}
