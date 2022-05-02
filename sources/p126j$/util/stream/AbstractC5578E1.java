package p126j$.util.stream;

import java.util.concurrent.CountedCompleter;

public abstract class AbstractC5578E1 extends CountedCompleter {
    protected final AbstractC5632P0 f18131a;
    protected final int f18132b;

    public AbstractC5578E1(AbstractC5578E1 e1, AbstractC5632P0 p0, int i) {
        super(e1);
        this.f18131a = p0;
        this.f18132b = i;
    }

    public AbstractC5578E1(AbstractC5632P0 p0, int i) {
        this.f18131a = p0;
        this.f18132b = i;
    }

    abstract void mo22397a();

    abstract AbstractC5578E1 mo22396b(int i, int i2);

    @Override
    public void compute() {
        AbstractC5578E1 e1 = this;
        while (e1.f18131a.mo22154o() != 0) {
            e1.setPendingCount(e1.f18131a.mo22154o() - 1);
            int i = 0;
            int i2 = 0;
            while (i < e1.f18131a.mo22154o() - 1) {
                AbstractC5578E1 b = e1.mo22396b(i, e1.f18132b + i2);
                i2 = (int) (i2 + b.f18131a.count());
                b.fork();
                i++;
            }
            e1 = e1.mo22396b(i, e1.f18132b + i2);
        }
        e1.mo22397a();
        e1.propagateCompletion();
    }
}
