package o2;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;
import u1.b;
import u1.e;
import u1.h;
import w1.c;
import x1.f;

public final class l implements k {
    public final e f18576a;
    public final b<j> f18577b;

    public class a extends b<j> {
        public a(e eVar) {
            super(eVar);
        }

        @Override
        public String d() {
            return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
        }

        public void g(f fVar, j jVar) {
            String str = jVar.f18574a;
            if (str == null) {
                fVar.f0(1);
            } else {
                fVar.q(1, str);
            }
            String str2 = jVar.f18575b;
            if (str2 == null) {
                fVar.f0(2);
            } else {
                fVar.q(2, str2);
            }
        }
    }

    public l(e eVar) {
        this.f18576a = eVar;
        this.f18577b = new a(eVar);
    }

    @Override
    public void a(j jVar) {
        this.f18576a.b();
        this.f18576a.c();
        try {
            this.f18577b.h(jVar);
            this.f18576a.t();
        } finally {
            this.f18576a.g();
        }
    }

    @Override
    public List<String> b(String str) {
        h y02 = h.y0("SELECT name FROM workname WHERE work_spec_id=?", 1);
        if (str == null) {
            y02.f0(1);
        } else {
            y02.q(1, str);
        }
        this.f18576a.b();
        Cursor b10 = c.b(this.f18576a, y02, false, null);
        try {
            ArrayList arrayList = new ArrayList(b10.getCount());
            while (b10.moveToNext()) {
                arrayList.add(b10.getString(0));
            }
            return arrayList;
        } finally {
            b10.close();
            y02.B0();
        }
    }
}
