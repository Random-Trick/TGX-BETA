package v9;

import ra.k;
import v9.b;
import v9.i;

public abstract class h<Input, InputChannel extends b, Output, OutputChannel extends b> extends a<Input, InputChannel, Output, OutputChannel> {
    @Override
    public final i<Output> i(i.b<Input> bVar, boolean z10) {
        k.e(bVar, "state");
        if (z10) {
            if (bVar instanceof i.a) {
                m(bVar.a());
            } else {
                l(bVar.a());
            }
        }
        return k();
    }

    public abstract i<Output> k();

    public abstract void l(Input input);

    public abstract void m(Input input);
}
