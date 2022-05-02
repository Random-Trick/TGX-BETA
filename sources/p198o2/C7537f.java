package p198o2;

import android.database.Cursor;
import p281u1.AbstractC9418b;
import p281u1.AbstractC9421e;
import p281u1.C9430h;
import p308w1.C9940c;
import p323x1.AbstractC10074f;

public final class C7537f implements AbstractC7536e {
    public final AbstractC9421e f24117a;
    public final AbstractC9418b<C7535d> f24118b;

    public class C7538a extends AbstractC9418b<C7535d> {
        public C7538a(AbstractC9421e eVar) {
            super(eVar);
        }

        @Override
        public String mo8674d() {
            return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
        }

        public void mo8741g(AbstractC10074f fVar, C7535d dVar) {
            String str = dVar.f24115a;
            if (str == null) {
                fVar.mo5374d0(1);
            } else {
                fVar.mo5373q(1, str);
            }
            Long l = dVar.f24116b;
            if (l == null) {
                fVar.mo5374d0(2);
            } else {
                fVar.mo5376J(2, l.longValue());
            }
        }
    }

    public C7537f(AbstractC9421e eVar) {
        this.f24117a = eVar;
        this.f24118b = new C7538a(eVar);
    }

    @Override
    public void mo15716a(C7535d dVar) {
        this.f24117a.m8732b();
        this.f24117a.m8731c();
        try {
            this.f24118b.m8740h(dVar);
            this.f24117a.m8714t();
        } finally {
            this.f24117a.m8727g();
        }
    }

    @Override
    public Long mo15715b(String str) {
        C9430h y0 = C9430h.m8682y0("SELECT long_value FROM Preference where `key`=?", 1);
        if (str == null) {
            y0.mo5374d0(1);
        } else {
            y0.mo5373q(1, str);
        }
        this.f24117a.m8732b();
        Long l = null;
        Cursor b = C9940c.m6454b(this.f24117a, y0, false, null);
        try {
            if (b.moveToFirst() && !b.isNull(0)) {
                l = Long.valueOf(b.getLong(0));
            }
            return l;
        } finally {
            b.close();
            y0.m8683B0();
        }
    }
}
