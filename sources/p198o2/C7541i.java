package p198o2;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;
import p281u1.AbstractC9418b;
import p281u1.AbstractC9421e;
import p281u1.AbstractC9433k;
import p281u1.C9430h;
import p308w1.C9939b;
import p308w1.C9940c;
import p323x1.AbstractC10074f;

public final class C7541i implements AbstractC7540h {
    public final AbstractC9421e f24119a;
    public final AbstractC9418b<C7539g> f24120b;
    public final AbstractC9433k f24121c;

    public class C7542a extends AbstractC9418b<C7539g> {
        public C7542a(AbstractC9421e eVar) {
            super(eVar);
        }

        @Override
        public String mo8674d() {
            return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`system_id`) VALUES (?,?)";
        }

        public void mo8741g(AbstractC10074f fVar, C7539g gVar) {
            String str = gVar.f24117a;
            if (str == null) {
                fVar.mo5374d0(1);
            } else {
                fVar.mo5373q(1, str);
            }
            fVar.mo5376J(2, gVar.f24118b);
        }
    }

    public class C7543b extends AbstractC9433k {
        public C7543b(AbstractC9421e eVar) {
            super(eVar);
        }

        @Override
        public String mo8674d() {
            return "DELETE FROM SystemIdInfo where work_spec_id=?";
        }
    }

    public C7541i(AbstractC9421e eVar) {
        this.f24119a = eVar;
        this.f24120b = new C7542a(eVar);
        this.f24121c = new C7543b(eVar);
    }

    @Override
    public List<String> mo15713a() {
        C9430h y0 = C9430h.m8682y0("SELECT DISTINCT work_spec_id FROM SystemIdInfo", 0);
        this.f24119a.m8732b();
        Cursor b = C9940c.m6454b(this.f24119a, y0, false, null);
        try {
            ArrayList arrayList = new ArrayList(b.getCount());
            while (b.moveToNext()) {
                arrayList.add(b.getString(0));
            }
            return arrayList;
        } finally {
            b.close();
            y0.m8683B0();
        }
    }

    @Override
    public void mo15712b(C7539g gVar) {
        this.f24119a.m8732b();
        this.f24119a.m8731c();
        try {
            this.f24120b.m8740h(gVar);
            this.f24119a.m8714t();
        } finally {
            this.f24119a.m8727g();
        }
    }

    @Override
    public C7539g mo15711c(String str) {
        C9430h y0 = C9430h.m8682y0("SELECT `SystemIdInfo`.`work_spec_id` AS `work_spec_id`, `SystemIdInfo`.`system_id` AS `system_id` FROM SystemIdInfo WHERE work_spec_id=?", 1);
        if (str == null) {
            y0.mo5374d0(1);
        } else {
            y0.mo5373q(1, str);
        }
        this.f24119a.m8732b();
        C7539g gVar = null;
        Cursor b = C9940c.m6454b(this.f24119a, y0, false, null);
        try {
            int c = C9939b.m6456c(b, "work_spec_id");
            int c2 = C9939b.m6456c(b, "system_id");
            if (b.moveToFirst()) {
                gVar = new C7539g(b.getString(c), b.getInt(c2));
            }
            return gVar;
        } finally {
            b.close();
            y0.m8683B0();
        }
    }

    @Override
    public void mo15710d(String str) {
        this.f24119a.m8732b();
        AbstractC10074f a = this.f24121c.m8677a();
        if (str == null) {
            a.mo5374d0(1);
        } else {
            a.mo5373q(1, str);
        }
        this.f24119a.m8731c();
        try {
            a.mo5371u();
            this.f24119a.m8714t();
        } finally {
            this.f24119a.m8727g();
            this.f24121c.m8672f(a);
        }
    }
}
