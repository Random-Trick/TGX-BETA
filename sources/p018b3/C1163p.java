package p018b3;

import p339y2.AbstractC10353c;
import p339y2.AbstractC10355e;
import p339y2.AbstractC10356f;
import p339y2.AbstractC10358h;
import p339y2.C10352b;

public final class C1163p<T> implements AbstractC10356f<T> {
    public final AbstractC1159m f4387a;
    public final String f4388b;
    public final C10352b f4389c;
    public final AbstractC10355e<T, byte[]> f4390d;
    public final AbstractC1164q f4391e;

    public C1163p(AbstractC1159m mVar, String str, C10352b bVar, AbstractC10355e<T, byte[]> eVar, AbstractC1164q qVar) {
        this.f4387a = mVar;
        this.f4388b = str;
        this.f4389c = bVar;
        this.f4390d = eVar;
        this.f4391e = qVar;
    }

    public static void m38257c(Exception exc) {
    }

    @Override
    public void mo5362a(AbstractC10353c<T> cVar) {
        m38256d(cVar, C1162o.f4386a);
    }

    public void m38256d(AbstractC10353c<T> cVar, AbstractC10358h hVar) {
        this.f4391e.mo38255a(AbstractC1157l.m38280a().mo38269e(this.f4387a).mo38271c(cVar).mo38268f(this.f4388b).mo38270d(this.f4390d).mo38272b(this.f4389c).mo38273a(), hVar);
    }
}
