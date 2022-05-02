package p220p7;

import p220p7.C8055a;
import p220p7.C8059c;

public abstract class AbstractC8061d {
    public static AbstractC8061d f26251a = m13677a().mo13657a();

    public static abstract class AbstractC8062a {
        public abstract AbstractC8061d mo13657a();

        public abstract AbstractC8062a mo13656b(String str);

        public abstract AbstractC8062a mo13655c(long j);

        public abstract AbstractC8062a mo13654d(String str);

        public abstract AbstractC8062a mo13653e(String str);

        public abstract AbstractC8062a mo13652f(String str);

        public abstract AbstractC8062a mo13651g(C8059c.EnumC8060a aVar);

        public abstract AbstractC8062a mo13650h(long j);
    }

    public static AbstractC8062a m13677a() {
        return new C8055a.C8057b().mo13650h(0L).mo13651g(C8059c.EnumC8060a.ATTEMPT_MIGRATION).mo13655c(0L);
    }

    public abstract String mo13676b();

    public abstract long mo13675c();

    public abstract String mo13674d();

    public abstract String mo13673e();

    public abstract String mo13672f();

    public abstract C8059c.EnumC8060a mo13671g();

    public abstract long mo13670h();

    public boolean m13669i() {
        return mo13671g() == C8059c.EnumC8060a.REGISTER_ERROR;
    }

    public boolean m13668j() {
        return mo13671g() == C8059c.EnumC8060a.NOT_GENERATED || mo13671g() == C8059c.EnumC8060a.ATTEMPT_MIGRATION;
    }

    public boolean m13667k() {
        return mo13671g() == C8059c.EnumC8060a.REGISTERED;
    }

    public boolean m13666l() {
        return mo13671g() == C8059c.EnumC8060a.UNREGISTERED;
    }

    public boolean m13665m() {
        return mo13671g() == C8059c.EnumC8060a.ATTEMPT_MIGRATION;
    }

    public abstract AbstractC8062a mo13664n();

    public AbstractC8061d m13663o(String str, long j, long j2) {
        return mo13664n().mo13656b(str).mo13655c(j).mo13650h(j2).mo13657a();
    }

    public AbstractC8061d m13662p() {
        return mo13664n().mo13656b(null).mo13657a();
    }

    public AbstractC8061d m13661q(String str) {
        return mo13664n().mo13653e(str).mo13651g(C8059c.EnumC8060a.REGISTER_ERROR).mo13657a();
    }

    public AbstractC8061d m13660r() {
        return mo13664n().mo13651g(C8059c.EnumC8060a.NOT_GENERATED).mo13657a();
    }

    public AbstractC8061d m13659s(String str, String str2, long j, String str3, long j2) {
        return mo13664n().mo13654d(str).mo13651g(C8059c.EnumC8060a.REGISTERED).mo13656b(str3).mo13652f(str2).mo13655c(j2).mo13650h(j).mo13657a();
    }

    public AbstractC8061d m13658t(String str) {
        return mo13664n().mo13654d(str).mo13651g(C8059c.EnumC8060a.UNREGISTERED).mo13657a();
    }
}
