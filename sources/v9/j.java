package v9;

import ra.k;
import v9.b;
import v9.i;

public interface j<Input, InputChannel extends b, Output, OutputChannel extends b> {

    public static final class a {
        public static <Input, InputChannel extends b, Output, OutputChannel extends b> void a(j<Input, InputChannel, Output, OutputChannel> jVar, OutputChannel outputchannel) {
            k.e(outputchannel, "next");
        }

        public static <Input, InputChannel extends b, Output, OutputChannel extends b> void b(j<Input, InputChannel, Output, OutputChannel> jVar) {
        }
    }

    void a();

    void d(OutputChannel outputchannel);

    InputChannel f();

    i<Output> i(i.b<Input> bVar, boolean z10);
}
