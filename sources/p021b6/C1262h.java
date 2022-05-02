package p021b6;

import java.util.List;
import javax.annotation.CheckForNull;

public final class C1262h extends AbstractC1264i {
    public final transient int f4623M;
    public final AbstractC1264i f4624N;
    public final transient int f4625c;

    public C1262h(AbstractC1264i iVar, int i, int i2) {
        this.f4624N = iVar;
        this.f4625c = i;
        this.f4623M = i2;
    }

    @Override
    public final Object get(int i) {
        C1250b.m37828a(i, this.f4623M, "index");
        return this.f4624N.get(i + this.f4625c);
    }

    @Override
    public final int mo37810i() {
        return this.f4624N.mo37809m() + this.f4625c + this.f4623M;
    }

    @Override
    public final int mo37809m() {
        return this.f4624N.mo37809m() + this.f4625c;
    }

    @Override
    @CheckForNull
    public final Object[] mo37808r() {
        return this.f4624N.mo37808r();
    }

    @Override
    public final AbstractC1264i mo37819s(int i, int i2) {
        C1250b.m37826c(i, i2, this.f4623M);
        AbstractC1264i iVar = this.f4624N;
        int i3 = this.f4625c;
        return iVar.subList(i + i3, i2 + i3);
    }

    @Override
    public final int size() {
        return this.f4623M;
    }

    @Override
    public final List subList(int i, int i2) {
        return subList(i, i2);
    }
}
