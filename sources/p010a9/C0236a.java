package p010a9;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.Calendar;
import java.util.TimeZone;
import p024b9.C1294a;
import p360z8.C11429b;

public class C0236a {
    public final C1294a f730a;
    public final TimeZone f731b;

    public C0236a(C1294a aVar, TimeZone timeZone) {
        this.f730a = aVar;
        this.f731b = timeZone;
    }

    public final BigDecimal m42059a(BigDecimal bigDecimal, Calendar calendar) {
        if (this.f731b.inDaylightTime(calendar.getTime())) {
            bigDecimal = bigDecimal.add(BigDecimal.ONE);
        }
        return bigDecimal.doubleValue() > 24.0d ? bigDecimal.subtract(BigDecimal.valueOf(24L)) : bigDecimal;
    }

    public final BigDecimal m42058b(C11429b bVar, Calendar calendar, boolean z) {
        calendar.setTimeZone(this.f731b);
        BigDecimal p = m42044p(calendar, Boolean.valueOf(z));
        BigDecimal u = m42039u(m42043q(p));
        BigDecimal k = m42049k(u, bVar);
        if (k.doubleValue() < -1.0d || k.doubleValue() > 1.0d) {
            return null;
        }
        return m42046n(m42047m(u, p, m42040t(k, Boolean.valueOf(z))), calendar);
    }

    public Calendar m42057c(C11429b bVar, Calendar calendar) {
        return m42045o(m42058b(bVar, calendar, true), calendar);
    }

    public Calendar m42056d(C11429b bVar, Calendar calendar) {
        return m42045o(m42058b(bVar, calendar, false), calendar);
    }

    public final BigDecimal m42055e(BigDecimal bigDecimal) {
        return m42037w(bigDecimal, BigDecimal.valueOf(0.017453292519943295d));
    }

    public final BigDecimal m42054f(BigDecimal bigDecimal) {
        return m42037w(bigDecimal, new BigDecimal(57.29577951308232d));
    }

    public final BigDecimal m42053g(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        return bigDecimal.divide(bigDecimal2, 4, RoundingMode.HALF_EVEN);
    }

    public final BigDecimal m42052h(BigDecimal bigDecimal) {
        return m42036x(BigDecimal.valueOf(Math.acos(bigDecimal.doubleValue())));
    }

    public final BigDecimal m42051i() {
        return m42053g(this.f730a.m37792b(), BigDecimal.valueOf(15L));
    }

    public final BigDecimal m42050j(BigDecimal bigDecimal) {
        return m42036x(BigDecimal.valueOf(Math.cos(BigDecimal.valueOf(Math.asin(bigDecimal.doubleValue())).doubleValue())));
    }

    public final BigDecimal m42049k(BigDecimal bigDecimal, C11429b bVar) {
        BigDecimal s = m42041s(bigDecimal);
        BigDecimal j = m42050j(s);
        return m42036x(m42053g(BigDecimal.valueOf(Math.cos(m42055e(bVar.m664a()).doubleValue())).subtract(s.multiply(BigDecimal.valueOf(Math.sin(m42055e(this.f730a.m37793a()).doubleValue())))), j.multiply(BigDecimal.valueOf(Math.cos(m42055e(this.f730a.m37793a()).doubleValue())))));
    }

    public final BigDecimal m42048l(Calendar calendar) {
        return new BigDecimal(calendar.get(6));
    }

    public final BigDecimal m42047m(BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3) {
        BigDecimal r = m42042r(bigDecimal);
        BigDecimal subtract = bigDecimal3.add(r).subtract(bigDecimal2.multiply(new BigDecimal("0.06571"))).subtract(new BigDecimal("6.622"));
        if (subtract.doubleValue() < 0.0d) {
            subtract = subtract.add(BigDecimal.valueOf(24L));
        } else if (subtract.doubleValue() > 24.0d) {
            subtract = subtract.subtract(BigDecimal.valueOf(24L));
        }
        return m42036x(subtract);
    }

    public final BigDecimal m42046n(BigDecimal bigDecimal, Calendar calendar) {
        return m42059a(bigDecimal.subtract(m42051i()).add(m42038v(calendar)), calendar);
    }

    public Calendar m42045o(BigDecimal bigDecimal, Calendar calendar) {
        if (bigDecimal == null) {
            return null;
        }
        Calendar calendar2 = (Calendar) calendar.clone();
        if (bigDecimal.compareTo(BigDecimal.ZERO) == -1) {
            bigDecimal = bigDecimal.add(BigDecimal.valueOf(24.0d));
            calendar2.add(11, -24);
        }
        String[] split = bigDecimal.toPlainString().split("\\.");
        int parseInt = Integer.parseInt(split[0]);
        BigDecimal scale = new BigDecimal("0." + split[1]).multiply(BigDecimal.valueOf(60L)).setScale(0, RoundingMode.HALF_EVEN);
        if (scale.intValue() == 60) {
            scale = BigDecimal.ZERO;
            parseInt++;
        }
        if (parseInt == 24) {
            parseInt = 0;
        }
        calendar2.set(11, parseInt);
        calendar2.set(12, scale.intValue());
        calendar2.set(13, 0);
        calendar2.set(14, 0);
        calendar2.setTimeZone(calendar.getTimeZone());
        return calendar2;
    }

    public final BigDecimal m42044p(Calendar calendar, Boolean bool) {
        return m42036x(m42048l(calendar).add(m42053g(BigDecimal.valueOf(bool.booleanValue() ? 6 : 18).subtract(m42051i()), BigDecimal.valueOf(24L))));
    }

    public final BigDecimal m42043q(BigDecimal bigDecimal) {
        return m42036x(m42037w(new BigDecimal("0.9856"), bigDecimal).subtract(new BigDecimal("3.289")));
    }

    public final BigDecimal m42042r(BigDecimal bigDecimal) {
        BigDecimal x = m42036x(m42054f(new BigDecimal(Math.atan(m42055e(m42037w(m42054f(new BigDecimal(Math.tan(m42055e(bigDecimal).doubleValue()))), new BigDecimal("0.91764"))).doubleValue()))));
        if (x.doubleValue() < 0.0d) {
            x = x.add(BigDecimal.valueOf(360L));
        } else if (x.doubleValue() > 360.0d) {
            x = x.subtract(BigDecimal.valueOf(360L));
        }
        BigDecimal valueOf = BigDecimal.valueOf(90L);
        return m42053g(x.add(bigDecimal.divide(valueOf, 0, RoundingMode.FLOOR).multiply(valueOf).subtract(x.divide(valueOf, 0, RoundingMode.FLOOR).multiply(valueOf))), BigDecimal.valueOf(15L));
    }

    public final BigDecimal m42041s(BigDecimal bigDecimal) {
        return m42036x(BigDecimal.valueOf(Math.sin(m42055e(bigDecimal).doubleValue())).multiply(new BigDecimal("0.39782")));
    }

    public final BigDecimal m42040t(BigDecimal bigDecimal, Boolean bool) {
        BigDecimal f = m42054f(m42052h(bigDecimal));
        if (bool.booleanValue()) {
            f = BigDecimal.valueOf(360L).subtract(f);
        }
        return m42053g(f, BigDecimal.valueOf(15L));
    }

    public final BigDecimal m42039u(BigDecimal bigDecimal) {
        BigDecimal add = bigDecimal.add(m42037w(new BigDecimal(Math.sin(m42055e(bigDecimal).doubleValue())), new BigDecimal("1.916"))).add(m42037w(new BigDecimal(Math.sin(m42037w(m42055e(bigDecimal), BigDecimal.valueOf(2L)).doubleValue())), new BigDecimal("0.020")).add(new BigDecimal("282.634")));
        if (add.doubleValue() > 360.0d) {
            add = add.subtract(BigDecimal.valueOf(360L));
        }
        return m42036x(add);
    }

    public final BigDecimal m42038v(Calendar calendar) {
        return new BigDecimal(calendar.get(15)).divide(new BigDecimal(3600000), new MathContext(2));
    }

    public final BigDecimal m42037w(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        return m42036x(bigDecimal.multiply(bigDecimal2));
    }

    public final BigDecimal m42036x(BigDecimal bigDecimal) {
        return bigDecimal.setScale(4, RoundingMode.HALF_EVEN);
    }
}
