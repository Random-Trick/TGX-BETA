package p198o2;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;
import p281u1.AbstractC9418b;
import p281u1.AbstractC9421e;
import p281u1.C9430h;
import p308w1.C9940c;
import p323x1.AbstractC10074f;

public final class C7546l implements AbstractC7545k {
    public final AbstractC9421e f24126a;
    public final AbstractC9418b<C7544j> f24127b;

    public class C7547a extends AbstractC9418b<C7544j> {
        public C7547a(AbstractC9421e eVar) {
            super(eVar);
        }

        @Override
        public String mo8674d() {
            return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
        }

        public void mo8741g(AbstractC10074f fVar, C7544j jVar) {
            String str = jVar.f24124a;
            if (str == null) {
                fVar.mo5374d0(1);
            } else {
                fVar.mo5373q(1, str);
            }
            String str2 = jVar.f24125b;
            if (str2 == null) {
                fVar.mo5374d0(2);
            } else {
                fVar.mo5373q(2, str2);
            }
        }
    }

    public C7546l(AbstractC9421e eVar) {
        this.f24126a = eVar;
        this.f24127b = new C7547a(eVar);
    }

    @Override
    public void mo15708a(C7544j jVar) {
        this.f24126a.m8732b();
        this.f24126a.m8731c();
        try {
            this.f24127b.m8740h(jVar);
            this.f24126a.m8714t();
        } finally {
            this.f24126a.m8727g();
        }
    }

    @Override
    public List<String> mo15707b(String str) {
        C9430h y0 = C9430h.m8682y0("SELECT name FROM workname WHERE work_spec_id=?", 1);
        if (str == null) {
            y0.mo5374d0(1);
        } else {
            y0.mo5373q(1, str);
        }
        this.f24126a.m8732b();
        Cursor b = C9940c.m6454b(this.f24126a, y0, false, null);
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
}
