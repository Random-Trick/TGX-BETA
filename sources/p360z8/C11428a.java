package p360z8;

import java.util.Calendar;
import java.util.TimeZone;
import p010a9.C0236a;
import p024b9.C1294a;

public class C11428a {
    public static Calendar m666a(double d, double d2, TimeZone timeZone, Calendar calendar, double d3) {
        return new C0236a(new C1294a(d, d2), timeZone).m42057c(new C11429b(90.0d - d3), calendar);
    }

    public static Calendar m665b(double d, double d2, TimeZone timeZone, Calendar calendar, double d3) {
        return new C0236a(new C1294a(d, d2), timeZone).m42056d(new C11429b(90.0d - d3), calendar);
    }
}
