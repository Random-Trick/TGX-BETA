package ac;

import ia.q;
import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import ra.k;
import vb.b;

public final class c {
    public static final a f719a = new a();
    public static final String[] f720b;
    public static final DateFormat[] f721c;

    public static final class a extends ThreadLocal<DateFormat> {
        public DateFormat initialValue() {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
            simpleDateFormat.setLenient(false);
            simpleDateFormat.setTimeZone(b.f24814f);
            return simpleDateFormat;
        }
    }

    static {
        String[] strArr = {"EEE, dd MMM yyyy HH:mm:ss zzz", "EEEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy", "EEE, dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MMM-yyyy HH-mm-ss z", "EEE, dd MMM yy HH:mm:ss z", "EEE dd-MMM-yyyy HH:mm:ss z", "EEE dd MMM yyyy HH:mm:ss z", "EEE dd-MMM-yyyy HH-mm-ss z", "EEE dd-MMM-yy HH:mm:ss z", "EEE dd MMM yy HH:mm:ss z", "EEE,dd-MMM-yy HH:mm:ss z", "EEE,dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MM-yyyy HH:mm:ss z", "EEE MMM d yyyy HH:mm:ss z"};
        f720b = strArr;
        f721c = new DateFormat[strArr.length];
    }

    public static final Date a(String str) {
        k.e(str, "$this$toHttpDateOrNull");
        if (str.length() == 0) {
            return null;
        }
        ParsePosition parsePosition = new ParsePosition(0);
        Date parse = f719a.get().parse(str, parsePosition);
        if (parsePosition.getIndex() == str.length()) {
            return parse;
        }
        String[] strArr = f720b;
        synchronized (strArr) {
            int length = strArr.length;
            for (int i10 = 0; i10 < length; i10++) {
                DateFormat[] dateFormatArr = f721c;
                DateFormat dateFormat = dateFormatArr[i10];
                SimpleDateFormat simpleDateFormat = dateFormat;
                if (dateFormat == null) {
                    SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(f720b[i10], Locale.US);
                    simpleDateFormat2.setTimeZone(b.f24814f);
                    dateFormatArr[i10] = simpleDateFormat2;
                    simpleDateFormat = simpleDateFormat2;
                }
                parsePosition.setIndex(0);
                Date parse2 = simpleDateFormat.parse(str, parsePosition);
                if (parsePosition.getIndex() != 0) {
                    return parse2;
                }
            }
            q qVar = q.f14159a;
            return null;
        }
    }

    public static final String b(Date date) {
        k.e(date, "$this$toHttpDateString");
        String format = f719a.get().format(date);
        k.d(format, "STANDARD_DATE_FORMAT.get().format(this)");
        return format;
    }
}
