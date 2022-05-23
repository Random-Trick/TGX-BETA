package o2;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;
import u1.b;
import u1.e;
import u1.h;
import x1.f;

public final class c implements b {
    public final e f18559a;
    public final b<o2.a> f18560b;

    public class a extends b<o2.a> {
        public a(e eVar) {
            super(eVar);
        }

        @Override
        public String d() {
            return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
        }

        public void g(f fVar, o2.a aVar) {
            String str = aVar.f18557a;
            if (str == null) {
                fVar.f0(1);
            } else {
                fVar.q(1, str);
            }
            String str2 = aVar.f18558b;
            if (str2 == null) {
                fVar.f0(2);
            } else {
                fVar.q(2, str2);
            }
        }
    }

    public c(e eVar) {
        this.f18559a = eVar;
        this.f18560b = new a(eVar);
    }

    @Override
    public List<String> a(String str) {
        h y02 = h.y0("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            y02.f0(1);
        } else {
            y02.q(1, str);
        }
        this.f18559a.b();
        Cursor b10 = w1.c.b(this.f18559a, y02, false, null);
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
    public boolean b(String str) {
        boolean z10 = true;
        h y02 = h.y0("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)", 1);
        if (str == null) {
            y02.f0(1);
        } else {
            y02.q(1, str);
        }
        this.f18559a.b();
        boolean z11 = false;
        Cursor b10 = w1.c.b(this.f18559a, y02, false, null);
        try {
            if (b10.moveToFirst()) {
                if (b10.getInt(0) == 0) {
                    z10 = false;
                }
                z11 = z10;
            }
            return z11;
        } finally {
            b10.close();
            y02.B0();
        }
    }

    @Override
    public void c(o2.a aVar) {
        this.f18559a.b();
        this.f18559a.c();
        try {
            this.f18560b.h(aVar);
            this.f18559a.t();
        } finally {
            this.f18559a.g();
        }
    }

    @Override
    public boolean d(String str) {
        boolean z10 = true;
        h y02 = h.y0("SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            y02.f0(1);
        } else {
            y02.q(1, str);
        }
        this.f18559a.b();
        boolean z11 = false;
        Cursor b10 = w1.c.b(this.f18559a, y02, false, null);
        try {
            if (b10.moveToFirst()) {
                if (b10.getInt(0) == 0) {
                    z10 = false;
                }
                z11 = z10;
            }
            return z11;
        } finally {
            b10.close();
            y02.B0();
        }
    }
}
