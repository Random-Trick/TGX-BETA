package p289u9;

import p289u9.AbstractC9461b;
import p289u9.AbstractC9480j;
import qa.C8298k;

public abstract class AbstractC9460a<Input, InputChannel extends AbstractC9461b, Output, OutputChannel extends AbstractC9461b> implements AbstractC9480j<Input, InputChannel, Output, OutputChannel> {
    public OutputChannel f30684b;

    @Override
    public void mo5861a() {
        AbstractC9480j.C9481a.m8556b(this);
    }

    @Override
    public void mo5856i(OutputChannel outputchannel) {
        C8298k.m12934e(outputchannel, "next");
        this.f30684b = outputchannel;
    }

    public final OutputChannel m8580j() {
        OutputChannel outputchannel = this.f30684b;
        if (outputchannel == null) {
            C8298k.m12925n("next");
        }
        return outputchannel;
    }
}
