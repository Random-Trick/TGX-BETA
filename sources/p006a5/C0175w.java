package p006a5;

import java.io.FileNotFoundException;
import java.io.IOException;
import p006a5.AbstractC0118b0;
import p006a5.AbstractC0180y;
import p006a5.C0122c0;
import p174m3.C6556a2;

public class C0175w implements AbstractC0118b0 {
    public final int f650a;

    public C0175w() {
        this(-1);
    }

    @Override
    public void mo42143a(long j) {
        C0116a0.m42259a(this, j);
    }

    @Override
    public long mo42142b(AbstractC0118b0.C0119a aVar) {
        IOException iOException = aVar.f463c;
        if ((iOException instanceof C6556a2) || (iOException instanceof FileNotFoundException) || (iOException instanceof AbstractC0180y.C0181a) || (iOException instanceof C0122c0.C0130h) || C0156l.m42210a(iOException)) {
            return -9223372036854775807L;
        }
        return Math.min((aVar.f464d - 1) * 1000, 5000);
    }

    @Override
    public int mo42141c(int i) {
        int i2 = this.f650a;
        return i2 == -1 ? i == 7 ? 6 : 3 : i2;
    }

    public C0175w(int i) {
        this.f650a = i;
    }
}
