package o2;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;
import u1.e;
import u1.h;
import u1.k;
import w1.c;
import x1.f;

public final class i implements h {
    public final e f18569a;
    public final u1.b<g> f18570b;
    public final k f18571c;

    public class a extends u1.b<g> {
        public a(e eVar) {
            super(eVar);
        }

        @Override
        public String d() {
            return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`system_id`) VALUES (?,?)";
        }

        public void g(f fVar, g gVar) {
            String str = gVar.f18567a;
            if (str == null) {
                fVar.f0(1);
            } else {
                fVar.q(1, str);
            }
            fVar.K(2, gVar.f18568b);
        }
    }

    public class b extends k {
        public b(e eVar) {
            super(eVar);
        }

        @Override
        public String d() {
            return "DELETE FROM SystemIdInfo where work_spec_id=?";
        }
    }

    public i(e eVar) {
        this.f18569a = eVar;
        this.f18570b = new a(eVar);
        this.f18571c = new b(eVar);
    }

    @Override
    public List<String> a() {
        h y02 = h.y0("SELECT DISTINCT work_spec_id FROM SystemIdInfo", 0);
        this.f18569a.b();
        Cursor b10 = c.b(this.f18569a, y02, false, null);
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
    public void b(g gVar) {
        this.f18569a.b();
        this.f18569a.c();
        try {
            this.f18570b.h(gVar);
            this.f18569a.t();
        } finally {
            this.f18569a.g();
        }
    }

    @Override
    public g c(String str) {
        h y02 = h.y0("SELECT `SystemIdInfo`.`work_spec_id` AS `work_spec_id`, `SystemIdInfo`.`system_id` AS `system_id` FROM SystemIdInfo WHERE work_spec_id=?", 1);
        if (str == null) {
            y02.f0(1);
        } else {
            y02.q(1, str);
        }
        this.f18569a.b();
        g gVar = null;
        Cursor b10 = c.b(this.f18569a, y02, false, null);
        try {
            int c10 = w1.b.c(b10, "work_spec_id");
            int c11 = w1.b.c(b10, "system_id");
            if (b10.moveToFirst()) {
                gVar = new g(b10.getString(c10), b10.getInt(c11));
            }
            return gVar;
        } finally {
            b10.close();
            y02.B0();
        }
    }

    @Override
    public void d(String str) {
        this.f18569a.b();
        f a10 = this.f18571c.a();
        if (str == null) {
            a10.f0(1);
        } else {
            a10.q(1, str);
        }
        this.f18569a.c();
        try {
            a10.t();
            this.f18569a.t();
        } finally {
            this.f18569a.g();
            this.f18571c.f(a10);
        }
    }
}
