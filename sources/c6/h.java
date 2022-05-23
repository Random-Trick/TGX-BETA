package c6;

import java.util.List;
import javax.annotation.CheckForNull;

public final class h extends i {
    public final transient int M;
    public final i N;
    public final transient int f4952c;

    public h(i iVar, int i10, int i11) {
        this.N = iVar;
        this.f4952c = i10;
        this.M = i11;
    }

    @Override
    public final int g() {
        return this.N.m() + this.f4952c + this.M;
    }

    @Override
    public final Object get(int i10) {
        b.a(i10, this.M, "index");
        return this.N.get(i10 + this.f4952c);
    }

    @Override
    public final int m() {
        return this.N.m() + this.f4952c;
    }

    @Override
    @CheckForNull
    public final Object[] r() {
        return this.N.r();
    }

    @Override
    public final i s(int i10, int i11) {
        b.c(i10, i11, this.M);
        i iVar = this.N;
        int i12 = this.f4952c;
        return iVar.subList(i10 + i12, i11 + i12);
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
