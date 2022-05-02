package p220p7;

import p220p7.C8055a;
import p220p7.C8059c;

public abstract class AbstractC8061d {
    public static AbstractC8061d f26254a = m13676a().mo13656a();

    public static abstract class AbstractC8062a {
        public abstract AbstractC8061d mo13656a();

        public abstract AbstractC8062a mo13655b(String str);

        public abstract AbstractC8062a mo13654c(long j);

        public abstract AbstractC8062a mo13653d(String str);

        public abstract AbstractC8062a mo13652e(String str);

        public abstract AbstractC8062a mo13651f(String str);

        public abstract AbstractC8062a mo13650g(C8059c.EnumC8060a aVar);

        public abstract AbstractC8062a mo13649h(long j);
    }

    public static AbstractC8062a m13676a() {
        return new C8055a.C8057b().mo13649h(0L).mo13650g(C8059c.EnumC8060a.ATTEMPT_MIGRATION).mo13654c(0L);
    }

    public abstract String mo13675b();

    public abstract long mo13674c();

    public abstract String mo13673d();

    public abstract String mo13672e();

    public abstract String mo13671f();

    public abstract C8059c.EnumC8060a mo13670g();

    public abstract long mo13669h();

    public boolean m13668i() {
        return mo13670g() == C8059c.EnumC8060a.REGISTER_ERROR;
    }

    public boolean m13667j() {
        return mo13670g() == C8059c.EnumC8060a.NOT_GENERATED || mo13670g() == C8059c.EnumC8060a.ATTEMPT_MIGRATION;
    }

    public boolean m13666k() {
        return mo13670g() == C8059c.EnumC8060a.REGISTERED;
    }

    public boolean m13665l() {
        return mo13670g() == C8059c.EnumC8060a.UNREGISTERED;
    }

    public boolean m13664m() {
        return mo13670g() == C8059c.EnumC8060a.ATTEMPT_MIGRATION;
    }

    public abstract AbstractC8062a mo13663n();

    public AbstractC8061d m13662o(String str, long j, long j2) {
        return mo13663n().mo13655b(str).mo13654c(j).mo13649h(j2).mo13656a();
    }

    public AbstractC8061d m13661p() {
        return mo13663n().mo13655b(null).mo13656a();
    }

    public AbstractC8061d m13660q(String str) {
        return mo13663n().mo13652e(str).mo13650g(C8059c.EnumC8060a.REGISTER_ERROR).mo13656a();
    }

    public AbstractC8061d m13659r() {
        return mo13663n().mo13650g(C8059c.EnumC8060a.NOT_GENERATED).mo13656a();
    }

    public AbstractC8061d m13658s(String str, String str2, long j, String str3, long j2) {
        return mo13663n().mo13653d(str).mo13650g(C8059c.EnumC8060a.REGISTERED).mo13655b(str3).mo13651f(str2).mo13654c(j2).mo13649h(j).mo13656a();
    }

    public AbstractC8061d m13657t(String str) {
        return mo13663n().mo13653d(str).mo13650g(C8059c.EnumC8060a.UNREGISTERED).mo13656a();
    }
}
