package p345y8;

import java.util.Date;

public class C10448c {
    public static long m5102a(Date date) {
        return (date.getTime() / 1000) + 2082844800;
    }

    public static Date m5101b(long j) {
        return new Date((j - 2082844800) * 1000);
    }
}
