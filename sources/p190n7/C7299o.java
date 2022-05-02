package p190n7;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import p220p7.AbstractC8061d;
import p248r7.AbstractC8375a;
import p248r7.C8376b;

public final class C7299o {
    public static final long f23170b = TimeUnit.HOURS.toSeconds(1);
    public static final Pattern f23171c = Pattern.compile("\\AA[\\w-]{38}\\z");
    public static C7299o f23172d;
    public final AbstractC8375a f23173a;

    public C7299o(AbstractC8375a aVar) {
        this.f23173a = aVar;
    }

    public static C7299o m17117c() {
        return m17116d(C8376b.m12652b());
    }

    public static C7299o m17116d(AbstractC8375a aVar) {
        if (f23172d == null) {
            f23172d = new C7299o(aVar);
        }
        return f23172d;
    }

    public static boolean m17113g(String str) {
        return f23171c.matcher(str).matches();
    }

    public static boolean m17112h(String str) {
        return str.contains(":");
    }

    public long m17119a() {
        return this.f23173a.mo12653a();
    }

    public long m17118b() {
        return TimeUnit.MILLISECONDS.toSeconds(m17119a());
    }

    public long m17115e() {
        return (long) (Math.random() * 1000.0d);
    }

    public boolean m17114f(AbstractC8061d dVar) {
        return TextUtils.isEmpty(dVar.mo13676b()) || dVar.mo13670h() + dVar.mo13675c() < m17118b() + f23170b;
    }
}
