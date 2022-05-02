package p190n7;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import p220p7.AbstractC8061d;
import p248r7.AbstractC8375a;
import p248r7.C8376b;

public final class C7299o {
    public static final long f23173b = TimeUnit.HOURS.toSeconds(1);
    public static final Pattern f23174c = Pattern.compile("\\AA[\\w-]{38}\\z");
    public static C7299o f23175d;
    public final AbstractC8375a f23176a;

    public C7299o(AbstractC8375a aVar) {
        this.f23176a = aVar;
    }

    public static C7299o m17117c() {
        return m17116d(C8376b.m12651b());
    }

    public static C7299o m17116d(AbstractC8375a aVar) {
        if (f23175d == null) {
            f23175d = new C7299o(aVar);
        }
        return f23175d;
    }

    public static boolean m17113g(String str) {
        return f23174c.matcher(str).matches();
    }

    public static boolean m17112h(String str) {
        return str.contains(":");
    }

    public long m17119a() {
        return this.f23176a.mo12652a();
    }

    public long m17118b() {
        return TimeUnit.MILLISECONDS.toSeconds(m17119a());
    }

    public long m17115e() {
        return (long) (Math.random() * 1000.0d);
    }

    public boolean m17114f(AbstractC8061d dVar) {
        return TextUtils.isEmpty(dVar.mo13675b()) || dVar.mo13669h() + dVar.mo13674c() < m17118b() + f23173b;
    }
}
