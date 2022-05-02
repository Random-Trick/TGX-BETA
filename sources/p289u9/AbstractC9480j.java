package p289u9;

import p289u9.AbstractC9461b;
import p289u9.AbstractC9475i;
import qa.C8298k;

public interface AbstractC9480j<Input, InputChannel extends AbstractC9461b, Output, OutputChannel extends AbstractC9461b> {

    public static final class C9481a {
        public static <Input, InputChannel extends AbstractC9461b, Output, OutputChannel extends AbstractC9461b> void m8557a(AbstractC9480j<Input, InputChannel, Output, OutputChannel> jVar, OutputChannel outputchannel) {
            C8298k.m12933e(outputchannel, "next");
        }

        public static <Input, InputChannel extends AbstractC9461b, Output, OutputChannel extends AbstractC9461b> void m8556b(AbstractC9480j<Input, InputChannel, Output, OutputChannel> jVar) {
        }
    }

    void mo5861a();

    InputChannel mo5860e();

    AbstractC9475i<Output> mo5858g(AbstractC9475i.C9477b<Input> bVar, boolean z);

    void mo5856i(OutputChannel outputchannel);
}
