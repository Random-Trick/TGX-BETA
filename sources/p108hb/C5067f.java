package p108hb;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.concurrent.TimeUnit;
import p181mb.C6815f;

public final class C5067f {
    public static C6815f<Date> f17079a;
    public static C6815f<Date> f17080b;
    public static C6815f<Calendar> f17081c;
    public static C6815f<Calendar> f17082d;

    public static Calendar m24119a(long j) {
        if (f17082d == null) {
            synchronized (Date.class) {
                if (f17082d == null) {
                    f17082d = new C6815f<>();
                }
            }
        }
        Calendar a = f17082d.m18901a();
        if (a == null) {
            C6815f<Calendar> fVar = f17082d;
            Calendar gregorianCalendar = GregorianCalendar.getInstance();
            fVar.m18900b(gregorianCalendar);
            a = gregorianCalendar;
        }
        a.setTime(m24118b(j));
        return a;
    }

    public static Date m24118b(long j) {
        if (f17080b == null) {
            synchronized (Date.class) {
                if (f17080b == null) {
                    f17080b = new C6815f<>();
                }
            }
        }
        Date a = f17080b.m18901a();
        if (a == null) {
            return new Date(j);
        }
        a.setTime(j);
        return a;
    }

    public static int m24117c(int i) {
        return m24119a(i * 1000).get(7);
    }

    public static Date m24116d() {
        if (f17079a == null) {
            synchronized (Date.class) {
                if (f17079a == null) {
                    f17079a = new C6815f<>();
                }
            }
        }
        Date a = f17079a.m18901a();
        if (a == null) {
            C6815f<Date> fVar = f17079a;
            Date date = new Date();
            fVar.m18900b(date);
            return date;
        }
        a.setTime(System.currentTimeMillis());
        return a;
    }

    public static Calendar m24115e() {
        if (f17081c == null) {
            synchronized (Date.class) {
                if (f17081c == null) {
                    f17081c = new C6815f<>();
                }
            }
        }
        Calendar a = f17081c.m18901a();
        if (a == null) {
            C6815f<Calendar> fVar = f17081c;
            Calendar calendar = Calendar.getInstance();
            fVar.m18900b(calendar);
            a = calendar;
        }
        a.setTime(m24116d());
        return a;
    }

    public static long m24114f(Calendar calendar) {
        int i = calendar.get(11);
        int i2 = calendar.get(12);
        int i3 = calendar.get(13);
        int i4 = calendar.get(14);
        m24103q(calendar);
        long timeInMillis = calendar.getTimeInMillis();
        calendar.set(11, i);
        calendar.set(12, i2);
        calendar.set(13, i3);
        calendar.set(14, i4);
        return timeInMillis;
    }

    public static long m24113g() {
        Calendar a = m24119a(System.currentTimeMillis());
        m24103q(a);
        return a.getTimeInMillis();
    }

    public static boolean m24112h(int i) {
        Calendar e = m24115e();
        int i2 = e.get(3);
        int i3 = e.get(1);
        int i4 = e.get(7);
        Calendar a = m24119a(i * 1000);
        int i5 = i2 - a.get(3);
        return (i5 == 1 || (i5 == 0 && i4 != 1 && a.get(7) == 1)) && i3 - a.get(1) == 0;
    }

    public static boolean m24111i(int i, int i2) {
        Calendar a = m24119a(i * 1000);
        int i3 = a.get(1);
        int i4 = a.get(6);
        Calendar a2 = m24119a(i2 * 1000);
        return i4 == a2.get(6) && i3 == a2.get(1);
    }

    public static boolean m24110j(int i, int i2) {
        Calendar a = m24119a(i * 1000);
        int i3 = a.get(1);
        int i4 = a.get(6);
        int i5 = a.get(11);
        int i6 = a.get(12);
        Calendar a2 = m24119a(i2 * 1000);
        return i6 / 15 == a2.get(12) / 20 && i5 == a2.get(11) && i4 == a2.get(6) && i3 == a2.get(1);
    }

    public static boolean m24109k(int i, int i2) {
        Calendar a = m24119a(i * 1000);
        int i3 = a.get(1);
        int i4 = a.get(2);
        Calendar a2 = m24119a(i2 * 1000);
        return i4 == a2.get(2) && i3 == a2.get(1);
    }

    public static boolean m24108l(long j, TimeUnit timeUnit) {
        return m24115e().get(1) == m24119a(timeUnit.toMillis(j)).get(1);
    }

    public static boolean m24107m(long j, TimeUnit timeUnit) {
        Calendar e = m24115e();
        int i = e.get(6);
        int i2 = e.get(1);
        Calendar a = m24119a(timeUnit.toMillis(j));
        return i - a.get(6) == 0 && i2 - a.get(1) == 0;
    }

    public static boolean m24106n(long j, TimeUnit timeUnit) {
        Calendar e = m24115e();
        int i = e.get(6);
        int i2 = e.get(1);
        Calendar a = m24119a(timeUnit.toMillis(j));
        return i - a.get(6) == -1 && i2 - a.get(1) == 0;
    }

    public static boolean m24105o(int i) {
        long g = m24113g();
        Calendar a = m24119a(i * 1000);
        m24103q(a);
        long days = TimeUnit.MILLISECONDS.toDays(g - a.getTimeInMillis());
        return days < 7 && days >= 0;
    }

    public static boolean m24104p(long j, TimeUnit timeUnit) {
        Calendar e = m24115e();
        int i = e.get(6);
        int i2 = e.get(1);
        Calendar a = m24119a(timeUnit.toMillis(j));
        return i - a.get(6) == 1 && i2 - a.get(1) == 0;
    }

    public static void m24103q(Calendar calendar) {
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
    }
}
