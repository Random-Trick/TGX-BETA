package o2;

import android.database.Cursor;
import u1.b;
import u1.e;
import u1.h;
import w1.c;

public final class f implements e {
    public final e f18564a;
    public final b<d> f18565b;

    public class a extends b<d> {
        public a(e eVar) {
            super(eVar);
        }

        @Override
        public String d() {
            return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
        }

        public void g(x1.f fVar, d dVar) {
            String str = dVar.f18562a;
            if (str == null) {
                fVar.f0(1);
            } else {
                fVar.q(1, str);
            }
            Long l10 = dVar.f18563b;
            if (l10 == null) {
                fVar.f0(2);
            } else {
                fVar.K(2, l10.longValue());
            }
        }
    }

    public f(e eVar) {
        this.f18564a = eVar;
        this.f18565b = new a(eVar);
    }

    @Override
    public void a(d dVar) {
        this.f18564a.b();
        this.f18564a.c();
        try {
            this.f18565b.h(dVar);
            this.f18564a.t();
        } finally {
            this.f18564a.g();
        }
    }

    @Override
    public Long b(String str) {
        h y02 = h.y0("SELECT long_value FROM Preference where `key`=?", 1);
        if (str == null) {
            y02.f0(1);
        } else {
            y02.q(1, str);
        }
        this.f18564a.b();
        Long l10 = null;
        Cursor b10 = c.b(this.f18564a, y02, false, null);
        try {
            if (b10.moveToFirst() && !b10.isNull(0)) {
                l10 = Long.valueOf(b10.getLong(0));
            }
            return l10;
        } finally {
            b10.close();
            y02.B0();
        }
    }
}
