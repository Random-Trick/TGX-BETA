package p146k3;

import p043d3.AbstractC3589b;
import p043d3.C3591d;

public final class C6049d implements AbstractC3589b<AbstractC6045a> {

    public static final class C6050a {
        public static final C6049d f19259a = new C6049d();
    }

    public static C6049d m21447a() {
        return C6050a.f19259a;
    }

    public static AbstractC6045a m21445c() {
        return (AbstractC6045a) C3591d.m29917c(AbstractC6046b.m21452b(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public AbstractC6045a get() {
        return m21445c();
    }
}
