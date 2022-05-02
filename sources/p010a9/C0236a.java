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

    public final BigDecimal m42056a(BigDecimal bigDecimal, Calendar calendar) {
        if (this.f731b.inDaylightTime(calendar.getTime())) {
            bigDecimal = bigDecimal.add(BigDecimal.ONE);
        }
        return bigDecimal.doubleValue() > 24.0d ? bigDecimal.subtract(BigDecimal.valueOf(24L)) : bigDecimal;
    }

    public final BigDecimal m42055b(C11429b bVar, Calendar calendar, boolean z) {
        calendar.setTimeZone(this.f731b);
        BigDecimal p = m42041p(calendar, Boolean.valueOf(z));
        BigDecimal u = m42036u(m42040q(p));
        BigDecimal k = m42046k(u, bVar);
        if (k.doubleValue() < -1.0d || k.doubleValue() > 1.0d) {
            return null;
        }
        return m42043n(m42044m(u, p, m42037t(k, Boolean.valueOf(z))), calendar);
    }

    public Calendar m42054c(C11429b bVar, Calendar calendar) {
        return m42042o(m42055b(bVar, calendar, true), calendar);
    }

    public Calendar m42053d(C11429b bVar, Calendar calendar) {
        return m42042o(m42055b(bVar, calendar, false), calendar);
    }

    public final BigDecimal m42052e(BigDecimal bigDecimal) {
        return m42034w(bigDecimal, BigDecimal.valueOf(0.017453292519943295d));
    }

    public final BigDecimal m42051f(BigDecimal bigDecimal) {
        return m42034w(bigDecimal, new BigDecimal(57.29577951308232d));
    }

    public final BigDecimal m42050g(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        return bigDecimal.divide(bigDecimal2, 4, RoundingMode.HALF_EVEN);
    }

    public final BigDecimal m42049h(BigDecimal bigDecimal) {
        return m42033x(BigDecimal.valueOf(Math.acos(bigDecimal.doubleValue())));
    }

    public final BigDecimal m42048i() {
        return m42050g(this.f730a.m37789b(), BigDecimal.valueOf(15L));
    }

    public final BigDecimal m42047j(BigDecimal bigDecimal) {
        return m42033x(BigDecimal.valueOf(Math.cos(BigDecimal.valueOf(Math.asin(bigDecimal.doubleValue())).doubleValue())));
    }

    public final BigDecimal m42046k(BigDecimal bigDecimal, C11429b bVar) {
        BigDecimal s = m42038s(bigDecimal);
        BigDecimal j = m42047j(s);
        return m42033x(m42050g(BigDecimal.valueOf(Math.cos(m42052e(bVar.m664a()).doubleValue())).subtract(s.multiply(BigDecimal.valueOf(Math.sin(m42052e(this.f730a.m37790a()).doubleValue())))), j.multiply(BigDecimal.valueOf(Math.cos(m42052e(this.f730a.m37790a()).doubleValue())))));
    }

    public final BigDecimal m42045l(Calendar calendar) {
        return new BigDecimal(calendar.get(6));
    }

    public final BigDecimal m42044m(BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3) {
        BigDecimal r = m42039r(bigDecimal);
        BigDecimal subtract = bigDecimal3.add(r).subtract(bigDecimal2.multiply(new BigDecimal("0.06571"))).subtract(new BigDecimal("6.622"));
        if (subtract.doubleValue() < 0.0d) {
            subtract = subtract.add(BigDecimal.valueOf(24L));
        } else if (subtract.doubleValue() > 24.0d) {
            subtract = subtract.subtract(BigDecimal.valueOf(24L));
        }
        return m42033x(subtract);
    }

    public final BigDecimal m42043n(BigDecimal bigDecimal, Calendar calendar) {
        return m42056a(bigDecimal.subtract(m42048i()).add(m42035v(calendar)), calendar);
    }

    public Calendar m42042o(BigDecimal bigDecimal, Calendar calendar) {
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

    public final BigDecimal m42041p(Calendar calendar, Boolean bool) {
        return m42033x(m42045l(calendar).add(m42050g(BigDecimal.valueOf(bool.booleanValue() ? 6 : 18).subtract(m42048i()), BigDecimal.valueOf(24L))));
    }

    public final BigDecimal m42040q(BigDecimal bigDecimal) {
        return m42033x(m42034w(new BigDecimal("0.9856"), bigDecimal).subtract(new BigDecimal("3.289")));
    }

    public final BigDecimal m42039r(BigDecimal bigDecimal) {
        BigDecimal x = m42033x(m42051f(new BigDecimal(Math.atan(m42052e(m42034w(m42051f(new BigDecimal(Math.tan(m42052e(bigDecimal).doubleValue()))), new BigDecimal("0.91764"))).doubleValue()))));
        if (x.doubleValue() < 0.0d) {
            x = x.add(BigDecimal.valueOf(360L));
        } else if (x.doubleValue() > 360.0d) {
            x = x.subtract(BigDecimal.valueOf(360L));
        }
        BigDecimal valueOf = BigDecimal.valueOf(90L);
        return m42050g(x.add(bigDecimal.divide(valueOf, 0, RoundingMode.FLOOR).multiply(valueOf).subtract(x.divide(valueOf, 0, RoundingMode.FLOOR).multiply(valueOf))), BigDecimal.valueOf(15L));
    }

    public final BigDecimal m42038s(BigDecimal bigDecimal) {
        return m42033x(BigDecimal.valueOf(Math.sin(m42052e(bigDecimal).doubleValue())).multiply(new BigDecimal("0.39782")));
    }

    public final BigDecimal m42037t(BigDecimal bigDecimal, Boolean bool) {
        BigDecimal f = m42051f(m42049h(bigDecimal));
        if (bool.booleanValue()) {
            f = BigDecimal.valueOf(360L).subtract(f);
        }
        return m42050g(f, BigDecimal.valueOf(15L));
    }

    public final BigDecimal m42036u(BigDecimal bigDecimal) {
        BigDecimal add = bigDecimal.add(m42034w(new BigDecimal(Math.sin(m42052e(bigDecimal).doubleValue())), new BigDecimal("1.916"))).add(m42034w(new BigDecimal(Math.sin(m42034w(m42052e(bigDecimal), BigDecimal.valueOf(2L)).doubleValue())), new BigDecimal("0.020")).add(new BigDecimal("282.634")));
        if (add.doubleValue() > 360.0d) {
            add = add.subtract(BigDecimal.valueOf(360L));
        }
        return m42033x(add);
    }

    public final BigDecimal m42035v(Calendar calendar) {
        return new BigDecimal(calendar.get(15)).divide(new BigDecimal(3600000), new MathContext(2));
    }

    public final BigDecimal m42034w(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        return m42033x(bigDecimal.multiply(bigDecimal2));
    }

    public final BigDecimal m42033x(BigDecimal bigDecimal) {
        return bigDecimal.setScale(4, RoundingMode.HALF_EVEN);
    }
}
