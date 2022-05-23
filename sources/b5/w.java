package b5;

import b5.b0;
import b5.c0;
import b5.y;
import java.io.FileNotFoundException;
import java.io.IOException;
import m3.k2;

public class w implements b0 {
    public final int f4000a;

    public w() {
        this(-1);
    }

    @Override
    public long a(b0.a aVar) {
        IOException iOException = aVar.f3825c;
        if ((iOException instanceof k2) || (iOException instanceof FileNotFoundException) || (iOException instanceof y.a) || (iOException instanceof c0.h) || l.a(iOException)) {
            return -9223372036854775807L;
        }
        return Math.min((aVar.f3826d - 1) * 1000, 5000);
    }

    @Override
    public void b(long j10) {
        a0.a(this, j10);
    }

    @Override
    public int c(int i10) {
        int i11 = this.f4000a;
        return i11 == -1 ? i10 == 7 ? 6 : 3 : i11;
    }

    public w(int i10) {
        this.f4000a = i10;
    }
}
