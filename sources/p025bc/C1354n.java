package p025bc;

import java.io.IOException;
import qa.C8298k;

public final class C1354n extends IOException {
    public final EnumC1307b f4935a;

    public C1354n(EnumC1307b bVar) {
        super("stream was reset: " + bVar);
        C8298k.m12934e(bVar, "errorCode");
        this.f4935a = bVar;
    }
}
