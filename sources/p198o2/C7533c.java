package p198o2;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;
import p281u1.AbstractC9418b;
import p281u1.AbstractC9421e;
import p281u1.C9430h;
import p308w1.C9940c;
import p323x1.AbstractC10074f;

public final class C7533c implements AbstractC7532b {
    public final AbstractC9421e f24112a;
    public final AbstractC9418b<C7531a> f24113b;

    public class C7534a extends AbstractC9418b<C7531a> {
        public C7534a(AbstractC9421e eVar) {
            super(eVar);
        }

        @Override
        public String mo8674d() {
            return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
        }

        public void mo8741g(AbstractC10074f fVar, C7531a aVar) {
            String str = aVar.f24110a;
            if (str == null) {
                fVar.mo5374d0(1);
            } else {
                fVar.mo5373q(1, str);
            }
            String str2 = aVar.f24111b;
            if (str2 == null) {
                fVar.mo5374d0(2);
            } else {
                fVar.mo5373q(2, str2);
            }
        }
    }

    public C7533c(AbstractC9421e eVar) {
        this.f24112a = eVar;
        this.f24113b = new C7534a(eVar);
    }

    @Override
    public List<String> mo15721a(String str) {
        C9430h y0 = C9430h.m8682y0("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            y0.mo5374d0(1);
        } else {
            y0.mo5373q(1, str);
        }
        this.f24112a.m8732b();
        Cursor b = C9940c.m6454b(this.f24112a, y0, false, null);
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
    public boolean mo15720b(String str) {
        boolean z = true;
        C9430h y0 = C9430h.m8682y0("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)", 1);
        if (str == null) {
            y0.mo5374d0(1);
        } else {
            y0.mo5373q(1, str);
        }
        this.f24112a.m8732b();
        boolean z2 = false;
        Cursor b = C9940c.m6454b(this.f24112a, y0, false, null);
        try {
            if (b.moveToFirst()) {
                if (b.getInt(0) == 0) {
                    z = false;
                }
                z2 = z;
            }
            return z2;
        } finally {
            b.close();
            y0.m8683B0();
        }
    }

    @Override
    public void mo15719c(C7531a aVar) {
        this.f24112a.m8732b();
        this.f24112a.m8731c();
        try {
            this.f24113b.m8740h(aVar);
            this.f24112a.m8714t();
        } finally {
            this.f24112a.m8727g();
        }
    }

    @Override
    public boolean mo15718d(String str) {
        boolean z = true;
        C9430h y0 = C9430h.m8682y0("SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            y0.mo5374d0(1);
        } else {
            y0.mo5373q(1, str);
        }
        this.f24112a.m8732b();
        boolean z2 = false;
        Cursor b = C9940c.m6454b(this.f24112a, y0, false, null);
        try {
            if (b.moveToFirst()) {
                if (b.getInt(0) == 0) {
                    z = false;
                }
                z2 = z;
            }
            return z2;
        } finally {
            b.close();
            y0.m8683B0();
        }
    }
}
