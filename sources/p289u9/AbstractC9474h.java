package p289u9;

import p289u9.AbstractC9461b;
import p289u9.AbstractC9475i;
import qa.C8298k;

public abstract class AbstractC9474h<Input, InputChannel extends AbstractC9461b, Output, OutputChannel extends AbstractC9461b> extends AbstractC9460a<Input, InputChannel, Output, OutputChannel> {
    @Override
    public final AbstractC9475i<Output> mo5858g(AbstractC9475i.C9477b<Input> bVar, boolean z) {
        C8298k.m12933e(bVar, "state");
        if (z) {
            if (bVar instanceof AbstractC9475i.C9476a) {
                mo8559m(bVar.m8558a());
            } else {
                mo8560l(bVar.m8558a());
            }
        }
        return mo8561k();
    }

    public abstract AbstractC9475i<Output> mo8561k();

    public abstract void mo8560l(Input input);

    public abstract void mo8559m(Input input);
}
