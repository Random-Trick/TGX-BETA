package o2;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;
import u1.b;
import u1.e;
import u1.h;
import w1.c;
import x1.f;

public final class u implements t {
    public final e f18639a;
    public final b<s> f18640b;

    public class a extends b<s> {
        public a(e eVar) {
            super(eVar);
        }

        @Override
        public String d() {
            return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
        }

        public void g(f fVar, s sVar) {
            String str = sVar.f18637a;
            if (str == null) {
                fVar.f0(1);
            } else {
                fVar.q(1, str);
            }
            String str2 = sVar.f18638b;
            if (str2 == null) {
                fVar.f0(2);
            } else {
                fVar.q(2, str2);
            }
        }
    }

    public u(e eVar) {
        this.f18639a = eVar;
        this.f18640b = new a(eVar);
    }

    @Override
    public List<String> a(String str) {
        h y02 = h.y0("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?", 1);
        if (str == null) {
            y02.f0(1);
        } else {
            y02.q(1, str);
        }
        this.f18639a.b();
        Cursor b10 = c.b(this.f18639a, y02, false, null);
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

    @Override
    public void b(s sVar) {
        this.f18639a.b();
        this.f18639a.c();
        try {
            this.f18640b.h(sVar);
            this.f18639a.t();
        } finally {
            this.f18639a.g();
        }
    }
}
