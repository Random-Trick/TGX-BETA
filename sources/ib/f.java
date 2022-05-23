package ib;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.concurrent.TimeUnit;

public final class f {
    public static nb.f<Date> f14172a;
    public static nb.f<Date> f14173b;
    public static nb.f<Calendar> f14174c;
    public static nb.f<Calendar> f14175d;

    public static Calendar a(long j10) {
        if (f14175d == null) {
            synchronized (Date.class) {
                if (f14175d == null) {
                    f14175d = new nb.f<>();
                }
            }
        }
        Calendar a10 = f14175d.a();
        if (a10 == null) {
            nb.f<Calendar> fVar = f14175d;
            Calendar gregorianCalendar = GregorianCalendar.getInstance();
            fVar.b(gregorianCalendar);
            a10 = gregorianCalendar;
        }
        a10.setTime(b(j10));
        return a10;
    }

    public static Date b(long j10) {
        if (f14173b == null) {
            synchronized (Date.class) {
                if (f14173b == null) {
                    f14173b = new nb.f<>();
                }
            }
        }
        Date a10 = f14173b.a();
        if (a10 == null) {
            return new Date(j10);
        }
        a10.setTime(j10);
        return a10;
    }

    public static int c(int i10) {
        return a(i10 * 1000).get(7);
    }

    public static Date d() {
        if (f14172a == null) {
            synchronized (Date.class) {
                if (f14172a == null) {
                    f14172a = new nb.f<>();
                }
            }
        }
        Date a10 = f14172a.a();
        if (a10 == null) {
            nb.f<Date> fVar = f14172a;
            Date date = new Date();
            fVar.b(date);
            return date;
        }
        a10.setTime(System.currentTimeMillis());
        return a10;
    }

    public static Calendar e() {
        if (f14174c == null) {
            synchronized (Date.class) {
                if (f14174c == null) {
                    f14174c = new nb.f<>();
                }
            }
        }
        Calendar a10 = f14174c.a();
        if (a10 == null) {
            nb.f<Calendar> fVar = f14174c;
            Calendar calendar = Calendar.getInstance();
            fVar.b(calendar);
            a10 = calendar;
        }
        a10.setTime(d());
        return a10;
    }

    public static long f(Calendar calendar) {
        int i10 = calendar.get(11);
        int i11 = calendar.get(12);
        int i12 = calendar.get(13);
        int i13 = calendar.get(14);
        q(calendar);
        long timeInMillis = calendar.getTimeInMillis();
        calendar.set(11, i10);
        calendar.set(12, i11);
        calendar.set(13, i12);
        calendar.set(14, i13);
        return timeInMillis;
    }

    public static long g() {
        Calendar a10 = a(System.currentTimeMillis());
        q(a10);
        return a10.getTimeInMillis();
    }

    public static boolean h(int i10) {
        Calendar e10 = e();
        int i11 = e10.get(3);
        int i12 = e10.get(1);
        int i13 = e10.get(7);
        Calendar a10 = a(i10 * 1000);
        int i14 = i11 - a10.get(3);
        return (i14 == 1 || (i14 == 0 && i13 != 1 && a10.get(7) == 1)) && i12 - a10.get(1) == 0;
    }

    public static boolean i(int i10, int i11) {
        Calendar a10 = a(i10 * 1000);
        int i12 = a10.get(1);
        int i13 = a10.get(6);
        Calendar a11 = a(i11 * 1000);
        return i13 == a11.get(6) && i12 == a11.get(1);
    }

    public static boolean j(int i10, int i11) {
        Calendar a10 = a(i10 * 1000);
        int i12 = a10.get(1);
        int i13 = a10.get(6);
        int i14 = a10.get(11);
        int i15 = a10.get(12);
        Calendar a11 = a(i11 * 1000);
        return i15 / 15 == a11.get(12) / 20 && i14 == a11.get(11) && i13 == a11.get(6) && i12 == a11.get(1);
    }

    public static boolean k(int i10, int i11) {
        Calendar a10 = a(i10 * 1000);
        int i12 = a10.get(1);
        int i13 = a10.get(2);
        Calendar a11 = a(i11 * 1000);
        return i13 == a11.get(2) && i12 == a11.get(1);
    }

    public static boolean l(long j10, TimeUnit timeUnit) {
        return e().get(1) == a(timeUnit.toMillis(j10)).get(1);
    }

    public static boolean m(long j10, TimeUnit timeUnit) {
        Calendar e10 = e();
        int i10 = e10.get(6);
        int i11 = e10.get(1);
        Calendar a10 = a(timeUnit.toMillis(j10));
        return i10 - a10.get(6) == 0 && i11 - a10.get(1) == 0;
    }

    public static boolean n(long j10, TimeUnit timeUnit) {
        Calendar e10 = e();
        int i10 = e10.get(6);
        int i11 = e10.get(1);
        Calendar a10 = a(timeUnit.toMillis(j10));
        return i10 - a10.get(6) == -1 && i11 - a10.get(1) == 0;
    }

    public static boolean o(int i10) {
        long g10 = g();
        Calendar a10 = a(i10 * 1000);
        q(a10);
        long days = TimeUnit.MILLISECONDS.toDays(g10 - a10.getTimeInMillis());
        return days < 7 && days >= 0;
    }

    public static boolean p(long j10, TimeUnit timeUnit) {
        Calendar e10 = e();
        int i10 = e10.get(6);
        int i11 = e10.get(1);
        Calendar a10 = a(timeUnit.toMillis(j10));
        return i10 - a10.get(6) == 1 && i11 - a10.get(1) == 0;
    }

    public static void q(Calendar calendar) {
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
    }
}
