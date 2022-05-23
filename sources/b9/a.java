package b9;

import a9.b;
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.Calendar;
import java.util.TimeZone;

public class a {
    public final c9.a f4068a;
    public final TimeZone f4069b;

    public a(c9.a aVar, TimeZone timeZone) {
        this.f4068a = aVar;
        this.f4069b = timeZone;
    }

    public final BigDecimal a(BigDecimal bigDecimal, Calendar calendar) {
        if (this.f4069b.inDaylightTime(calendar.getTime())) {
            bigDecimal = bigDecimal.add(BigDecimal.ONE);
        }
        return bigDecimal.doubleValue() > 24.0d ? bigDecimal.subtract(BigDecimal.valueOf(24L)) : bigDecimal;
    }

    public final BigDecimal b(b bVar, Calendar calendar, boolean z10) {
        calendar.setTimeZone(this.f4069b);
        BigDecimal p10 = p(calendar, Boolean.valueOf(z10));
        BigDecimal u10 = u(q(p10));
        BigDecimal k10 = k(u10, bVar);
        if (k10.doubleValue() < -1.0d || k10.doubleValue() > 1.0d) {
            return null;
        }
        return n(m(u10, p10, t(k10, Boolean.valueOf(z10))), calendar);
    }

    public Calendar c(b bVar, Calendar calendar) {
        return o(b(bVar, calendar, true), calendar);
    }

    public Calendar d(b bVar, Calendar calendar) {
        return o(b(bVar, calendar, false), calendar);
    }

    public final BigDecimal e(BigDecimal bigDecimal) {
        return w(bigDecimal, BigDecimal.valueOf(0.017453292519943295d));
    }

    public final BigDecimal f(BigDecimal bigDecimal) {
        return w(bigDecimal, new BigDecimal(57.29577951308232d));
    }

    public final BigDecimal g(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        return bigDecimal.divide(bigDecimal2, 4, RoundingMode.HALF_EVEN);
    }

    public final BigDecimal h(BigDecimal bigDecimal) {
        return x(BigDecimal.valueOf(Math.acos(bigDecimal.doubleValue())));
    }

    public final BigDecimal i() {
        return g(this.f4068a.b(), BigDecimal.valueOf(15L));
    }

    public final BigDecimal j(BigDecimal bigDecimal) {
        return x(BigDecimal.valueOf(Math.cos(BigDecimal.valueOf(Math.asin(bigDecimal.doubleValue())).doubleValue())));
    }

    public final BigDecimal k(BigDecimal bigDecimal, b bVar) {
        BigDecimal s10 = s(bigDecimal);
        BigDecimal j10 = j(s10);
        return x(g(BigDecimal.valueOf(Math.cos(e(bVar.a()).doubleValue())).subtract(s10.multiply(BigDecimal.valueOf(Math.sin(e(this.f4068a.a()).doubleValue())))), j10.multiply(BigDecimal.valueOf(Math.cos(e(this.f4068a.a()).doubleValue())))));
    }

    public final BigDecimal l(Calendar calendar) {
        return new BigDecimal(calendar.get(6));
    }

    public final BigDecimal m(BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3) {
        BigDecimal r10 = r(bigDecimal);
        BigDecimal subtract = bigDecimal3.add(r10).subtract(bigDecimal2.multiply(new BigDecimal("0.06571"))).subtract(new BigDecimal("6.622"));
        if (subtract.doubleValue() < 0.0d) {
            subtract = subtract.add(BigDecimal.valueOf(24L));
        } else if (subtract.doubleValue() > 24.0d) {
            subtract = subtract.subtract(BigDecimal.valueOf(24L));
        }
        return x(subtract);
    }

    public final BigDecimal n(BigDecimal bigDecimal, Calendar calendar) {
        return a(bigDecimal.subtract(i()).add(v(calendar)), calendar);
    }

    public Calendar o(BigDecimal bigDecimal, Calendar calendar) {
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

    public final BigDecimal p(Calendar calendar, Boolean bool) {
        return x(l(calendar).add(g(BigDecimal.valueOf(bool.booleanValue() ? 6 : 18).subtract(i()), BigDecimal.valueOf(24L))));
    }

    public final BigDecimal q(BigDecimal bigDecimal) {
        return x(w(new BigDecimal("0.9856"), bigDecimal).subtract(new BigDecimal("3.289")));
    }

    public final BigDecimal r(BigDecimal bigDecimal) {
        BigDecimal x10 = x(f(new BigDecimal(Math.atan(e(w(f(new BigDecimal(Math.tan(e(bigDecimal).doubleValue()))), new BigDecimal("0.91764"))).doubleValue()))));
        if (x10.doubleValue() < 0.0d) {
            x10 = x10.add(BigDecimal.valueOf(360L));
        } else if (x10.doubleValue() > 360.0d) {
            x10 = x10.subtract(BigDecimal.valueOf(360L));
        }
        BigDecimal valueOf = BigDecimal.valueOf(90L);
        return g(x10.add(bigDecimal.divide(valueOf, 0, RoundingMode.FLOOR).multiply(valueOf).subtract(x10.divide(valueOf, 0, RoundingMode.FLOOR).multiply(valueOf))), BigDecimal.valueOf(15L));
    }

    public final BigDecimal s(BigDecimal bigDecimal) {
        return x(BigDecimal.valueOf(Math.sin(e(bigDecimal).doubleValue())).multiply(new BigDecimal("0.39782")));
    }

    public final BigDecimal t(BigDecimal bigDecimal, Boolean bool) {
        BigDecimal f10 = f(h(bigDecimal));
        if (bool.booleanValue()) {
            f10 = BigDecimal.valueOf(360L).subtract(f10);
        }
        return g(f10, BigDecimal.valueOf(15L));
    }

    public final BigDecimal u(BigDecimal bigDecimal) {
        BigDecimal add = bigDecimal.add(w(new BigDecimal(Math.sin(e(bigDecimal).doubleValue())), new BigDecimal("1.916"))).add(w(new BigDecimal(Math.sin(w(e(bigDecimal), BigDecimal.valueOf(2L)).doubleValue())), new BigDecimal("0.020")).add(new BigDecimal("282.634")));
        if (add.doubleValue() > 360.0d) {
            add = add.subtract(BigDecimal.valueOf(360L));
        }
        return x(add);
    }

    public final BigDecimal v(Calendar calendar) {
        return new BigDecimal(calendar.get(15)).divide(new BigDecimal(3600000), new MathContext(2));
    }

    public final BigDecimal w(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        return x(bigDecimal.multiply(bigDecimal2));
    }

    public final BigDecimal x(BigDecimal bigDecimal) {
        return bigDecimal.setScale(4, RoundingMode.HALF_EVEN);
    }
}
