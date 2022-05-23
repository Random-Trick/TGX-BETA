package u1;

import android.database.Cursor;
import java.util.List;
import x1.c;

public class g extends c.a {
    public u1.a f23513b;
    public final a f23514c;
    public final String f23515d;
    public final String f23516e;

    public static abstract class a {
        public final int f23517a;

        public a(int i10) {
            this.f23517a = i10;
        }

        public abstract void a(x1.b bVar);

        public abstract void b(x1.b bVar);

        public abstract void c(x1.b bVar);

        public abstract void d(x1.b bVar);

        public abstract void e(x1.b bVar);

        public abstract void f(x1.b bVar);

        public abstract b g(x1.b bVar);
    }

    public static class b {
        public final boolean f23518a;
        public final String f23519b;

        public b(boolean z10, String str) {
            this.f23518a = z10;
            this.f23519b = str;
        }
    }

    public g(u1.a aVar, a aVar2, String str, String str2) {
        super(aVar2.f23517a);
        this.f23513b = aVar;
        this.f23514c = aVar2;
        this.f23515d = str;
        this.f23516e = str2;
    }

    public static boolean j(x1.b bVar) {
        Cursor T = bVar.T("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z10 = false;
            if (T.moveToFirst()) {
                if (T.getInt(0) == 0) {
                    z10 = true;
                }
            }
            return z10;
        } finally {
            T.close();
        }
    }

    public static boolean k(x1.b bVar) {
        Cursor T = bVar.T("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
        try {
            boolean z10 = false;
            if (T.moveToFirst()) {
                if (T.getInt(0) != 0) {
                    z10 = true;
                }
            }
            return z10;
        } finally {
            T.close();
        }
    }

    @Override
    public void b(x1.b bVar) {
        super.b(bVar);
    }

    @Override
    public void d(x1.b bVar) {
        boolean j10 = j(bVar);
        this.f23514c.a(bVar);
        if (!j10) {
            b g10 = this.f23514c.g(bVar);
            if (!g10.f23518a) {
                throw new IllegalStateException("Pre-packaged database has an invalid schema: " + g10.f23519b);
            }
        }
        l(bVar);
        this.f23514c.c(bVar);
    }

    @Override
    public void e(x1.b bVar, int i10, int i11) {
        g(bVar, i10, i11);
    }

    @Override
    public void f(x1.b bVar) {
        super.f(bVar);
        h(bVar);
        this.f23514c.d(bVar);
        this.f23513b = null;
    }

    @Override
    public void g(x1.b bVar, int i10, int i11) {
        boolean z10;
        List<v1.a> c10;
        u1.a aVar = this.f23513b;
        if (aVar == null || (c10 = aVar.f23467d.c(i10, i11)) == null) {
            z10 = false;
        } else {
            this.f23514c.f(bVar);
            for (v1.a aVar2 : c10) {
                aVar2.a(bVar);
            }
            b g10 = this.f23514c.g(bVar);
            if (g10.f23518a) {
                this.f23514c.e(bVar);
                l(bVar);
                z10 = true;
            } else {
                throw new IllegalStateException("Migration didn't properly handle: " + g10.f23519b);
            }
        }
        if (!z10) {
            u1.a aVar3 = this.f23513b;
            if (aVar3 == null || aVar3.a(i10, i11)) {
                throw new IllegalStateException("A migration from " + i10 + " to " + i11 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.");
            }
            this.f23514c.b(bVar);
            this.f23514c.a(bVar);
        }
    }

    public final void h(x1.b bVar) {
        if (k(bVar)) {
            String str = null;
            Cursor p02 = bVar.p0(new x1.a("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"));
            try {
                if (p02.moveToFirst()) {
                    str = p02.getString(0);
                }
                p02.close();
                if (!this.f23515d.equals(str) && !this.f23516e.equals(str)) {
                    throw new IllegalStateException("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number.");
                }
            } catch (Throwable th) {
                p02.close();
                throw th;
            }
        } else {
            b g10 = this.f23514c.g(bVar);
            if (g10.f23518a) {
                this.f23514c.e(bVar);
                l(bVar);
                return;
            }
            throw new IllegalStateException("Pre-packaged database has an invalid schema: " + g10.f23519b);
        }
    }

    public final void i(x1.b bVar) {
        bVar.p("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
    }

    public final void l(x1.b bVar) {
        i(bVar);
        bVar.p(f.a(this.f23515d));
    }
}
