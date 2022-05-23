package o7;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import q7.d;
import s7.a;
import s7.b;

public final class o {
    public static final long f19307b = TimeUnit.HOURS.toSeconds(1);
    public static final Pattern f19308c = Pattern.compile("\\AA[\\w-]{38}\\z");
    public static o f19309d;
    public final a f19310a;

    public o(a aVar) {
        this.f19310a = aVar;
    }

    public static o c() {
        return d(b.b());
    }

    public static o d(a aVar) {
        if (f19309d == null) {
            f19309d = new o(aVar);
        }
        return f19309d;
    }

    public static boolean g(String str) {
        return f19308c.matcher(str).matches();
    }

    public static boolean h(String str) {
        return str.contains(":");
    }

    public long a() {
        return this.f19310a.a();
    }

    public long b() {
        return TimeUnit.MILLISECONDS.toSeconds(a());
    }

    public long e() {
        return (long) (Math.random() * 1000.0d);
    }

    public boolean f(d dVar) {
        return TextUtils.isEmpty(dVar.b()) || dVar.h() + dVar.c() < b() + f19307b;
    }
}
