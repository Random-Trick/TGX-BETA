package v9;

import ra.k;
import v9.b;
import v9.j;

public abstract class a<Input, InputChannel extends b, Output, OutputChannel extends b> implements j<Input, InputChannel, Output, OutputChannel> {
    public OutputChannel f24785b;

    @Override
    public void a() {
        j.a.b(this);
    }

    @Override
    public void d(OutputChannel outputchannel) {
        k.e(outputchannel, "next");
        this.f24785b = outputchannel;
    }

    public final OutputChannel j() {
        OutputChannel outputchannel = this.f24785b;
        if (outputchannel == null) {
            k.n("next");
        }
        return outputchannel;
    }
}
