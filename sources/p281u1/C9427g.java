package p281u1;

import android.database.Cursor;
import java.util.List;
import p295v1.AbstractC9832a;
import p323x1.AbstractC10066b;
import p323x1.AbstractC10067c;
import p323x1.C10065a;

public class C9427g extends AbstractC10067c.AbstractC10068a {
    public C9417a f30529b;
    public final AbstractC9428a f30530c;
    public final String f30531d;
    public final String f30532e;

    public static abstract class AbstractC9428a {
        public final int f30533a;

        public AbstractC9428a(int i) {
            this.f30533a = i;
        }

        public abstract void mo8691a(AbstractC10066b bVar);

        public abstract void mo8690b(AbstractC10066b bVar);

        public abstract void mo8689c(AbstractC10066b bVar);

        public abstract void mo8688d(AbstractC10066b bVar);

        public abstract void mo8687e(AbstractC10066b bVar);

        public abstract void mo8686f(AbstractC10066b bVar);

        public abstract C9429b mo8685g(AbstractC10066b bVar);
    }

    public static class C9429b {
        public final boolean f30534a;
        public final String f30535b;

        public C9429b(boolean z, String str) {
            this.f30534a = z;
            this.f30535b = str;
        }
    }

    public C9427g(C9417a aVar, AbstractC9428a aVar2, String str, String str2) {
        super(aVar2.f30533a);
        this.f30529b = aVar;
        this.f30530c = aVar2;
        this.f30531d = str;
        this.f30532e = str2;
    }

    public static boolean m8694j(AbstractC10066b bVar) {
        Cursor S = bVar.mo5393S("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z = false;
            if (S.moveToFirst()) {
                if (S.getInt(0) == 0) {
                    z = true;
                }
            }
            return z;
        } finally {
            S.close();
        }
    }

    public static boolean m8693k(AbstractC10066b bVar) {
        Cursor S = bVar.mo5393S("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
        try {
            boolean z = false;
            if (S.moveToFirst()) {
                if (S.getInt(0) != 0) {
                    z = true;
                }
            }
            return z;
        } finally {
            S.close();
        }
    }

    @Override
    public void mo6082b(AbstractC10066b bVar) {
        super.mo6082b(bVar);
    }

    @Override
    public void mo6080d(AbstractC10066b bVar) {
        boolean j = m8694j(bVar);
        this.f30530c.mo8691a(bVar);
        if (!j) {
            C9429b g = this.f30530c.mo8685g(bVar);
            if (!g.f30534a) {
                throw new IllegalStateException("Pre-packaged database has an invalid schema: " + g.f30535b);
            }
        }
        m8692l(bVar);
        this.f30530c.mo8689c(bVar);
    }

    @Override
    public void mo6079e(AbstractC10066b bVar, int i, int i2) {
        mo6077g(bVar, i, i2);
    }

    @Override
    public void mo6078f(AbstractC10066b bVar) {
        super.mo6078f(bVar);
        m8696h(bVar);
        this.f30530c.mo8688d(bVar);
        this.f30529b = null;
    }

    @Override
    public void mo6077g(AbstractC10066b bVar, int i, int i2) {
        boolean z;
        List<AbstractC9832a> c;
        C9417a aVar = this.f30529b;
        if (aVar == null || (c = aVar.f30482d.m8699c(i, i2)) == null) {
            z = false;
        } else {
            this.f30530c.mo8686f(bVar);
            for (AbstractC9832a aVar2 : c) {
                aVar2.mo6782a(bVar);
            }
            C9429b g = this.f30530c.mo8685g(bVar);
            if (g.f30534a) {
                this.f30530c.mo8687e(bVar);
                m8692l(bVar);
                z = true;
            } else {
                throw new IllegalStateException("Migration didn't properly handle: " + g.f30535b);
            }
        }
        if (!z) {
            C9417a aVar3 = this.f30529b;
            if (aVar3 == null || aVar3.m8742a(i, i2)) {
                throw new IllegalStateException("A migration from " + i + " to " + i2 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.");
            }
            this.f30530c.mo8690b(bVar);
            this.f30530c.mo8691a(bVar);
        }
    }

    public final void m8696h(AbstractC10066b bVar) {
        if (m8693k(bVar)) {
            String str = null;
            Cursor p0 = bVar.mo5384p0(new C10065a("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"));
            try {
                if (p0.moveToFirst()) {
                    str = p0.getString(0);
                }
                p0.close();
                if (!this.f30531d.equals(str) && !this.f30532e.equals(str)) {
                    throw new IllegalStateException("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number.");
                }
            } catch (Throwable th) {
                p0.close();
                throw th;
            }
        } else {
            C9429b g = this.f30530c.mo8685g(bVar);
            if (g.f30534a) {
                this.f30530c.mo8687e(bVar);
                m8692l(bVar);
                return;
            }
            throw new IllegalStateException("Pre-packaged database has an invalid schema: " + g.f30535b);
        }
    }

    public final void m8695i(AbstractC10066b bVar) {
        bVar.mo5385p("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
    }

    public final void m8692l(AbstractC10066b bVar) {
        m8695i(bVar);
        bVar.mo5385p(C9426f.m8697a(this.f30531d));
    }
}
