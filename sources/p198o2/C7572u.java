package p198o2;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;
import p281u1.AbstractC9418b;
import p281u1.AbstractC9421e;
import p281u1.C9430h;
import p308w1.C9940c;
import p323x1.AbstractC10074f;

public final class C7572u implements AbstractC7571t {
    public final AbstractC9421e f24189a;
    public final AbstractC9418b<C7570s> f24190b;

    public class C7573a extends AbstractC9418b<C7570s> {
        public C7573a(AbstractC9421e eVar) {
            super(eVar);
        }

        @Override
        public String mo8674d() {
            return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
        }

        public void mo8741g(AbstractC10074f fVar, C7570s sVar) {
            String str = sVar.f24187a;
            if (str == null) {
                fVar.mo5374d0(1);
            } else {
                fVar.mo5373q(1, str);
            }
            String str2 = sVar.f24188b;
            if (str2 == null) {
                fVar.mo5374d0(2);
            } else {
                fVar.mo5373q(2, str2);
            }
        }
    }

    public C7572u(AbstractC9421e eVar) {
        this.f24189a = eVar;
        this.f24190b = new C7573a(eVar);
    }

    @Override
    public List<String> mo15666a(String str) {
        C9430h y0 = C9430h.m8682y0("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?", 1);
        if (str == null) {
            y0.mo5374d0(1);
        } else {
            y0.mo5373q(1, str);
        }
        this.f24189a.m8732b();
        Cursor b = C9940c.m6454b(this.f24189a, y0, false, null);
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
    public void mo15665b(C7570s sVar) {
        this.f24189a.m8732b();
        this.f24189a.m8731c();
        try {
            this.f24190b.m8740h(sVar);
            this.f24189a.m8714t();
        } finally {
            this.f24189a.m8727g();
        }
    }
}
