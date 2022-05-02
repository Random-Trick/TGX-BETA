package p306w;

import android.util.Size;
import p293v.C9814i;
import p293v.C9824s;
import p336y.AbstractC10231g2;

public class C9929g {
    public final C9824s f32307a;

    public C9929g() {
        this((C9824s) C9814i.m6817a(C9824s.class));
    }

    public Size m6471a(Size size) {
        Size c;
        C9824s sVar = this.f32307a;
        if (sVar == null || (c = sVar.m6790c(AbstractC10231g2.EnumC10233b.PRIV)) == null) {
            return size;
        }
        return c.getWidth() * c.getHeight() > size.getWidth() * size.getHeight() ? c : size;
    }

    public C9929g(C9824s sVar) {
        this.f32307a = sVar;
    }
}
