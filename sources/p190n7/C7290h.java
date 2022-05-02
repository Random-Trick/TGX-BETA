package p190n7;

import p034c7.C2031h;

public class C7290h extends C2031h {
    public final EnumC7291a f23162a;

    public enum EnumC7291a {
        BAD_CONFIG,
        UNAVAILABLE,
        TOO_MANY_REQUESTS
    }

    public C7290h(EnumC7291a aVar) {
        this.f23162a = aVar;
    }

    public C7290h(String str, EnumC7291a aVar) {
        super(str);
        this.f23162a = aVar;
    }
}
