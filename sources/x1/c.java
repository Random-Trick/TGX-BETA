package x1;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.List;

public interface c extends Closeable {

    public static abstract class a {
        public final int f25932a;

        public a(int i10) {
            this.f25932a = i10;
        }

        public final void a(String str) {
            if (!str.equalsIgnoreCase(":memory:") && str.trim().length() != 0) {
                Log.w("SupportSQLite", "deleting the database file: " + str);
                try {
                    SQLiteDatabase.deleteDatabase(new File(str));
                } catch (Exception e10) {
                    Log.w("SupportSQLite", "delete failed: ", e10);
                }
            }
        }

        public void b(x1.b bVar) {
        }

        public void c(x1.b bVar) {
            Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + bVar.h0());
            if (!bVar.isOpen()) {
                a(bVar.h0());
                return;
            }
            List<Pair<String, String>> list = null;
            try {
                try {
                    list = bVar.n();
                } catch (SQLiteException unused) {
                }
                try {
                    bVar.close();
                } catch (IOException unused2) {
                }
            } finally {
                if (list != null) {
                    for (Pair<String, String> next : list) {
                        a((String) next.second);
                    }
                } else {
                    a(bVar.h0());
                }
            }
        }

        public abstract void d(x1.b bVar);

        public abstract void e(x1.b bVar, int i10, int i11);

        public void f(x1.b bVar) {
        }

        public abstract void g(x1.b bVar, int i10, int i11);
    }

    public static class b {
        public final Context f25933a;
        public final String f25934b;
        public final a f25935c;
        public final boolean f25936d;

        public static class a {
            public Context f25937a;
            public String f25938b;
            public a f25939c;
            public boolean f25940d;

            public a(Context context) {
                this.f25937a = context;
            }

            public b a() {
                if (this.f25939c == null) {
                    throw new IllegalArgumentException("Must set a callback to create the configuration.");
                } else if (this.f25937a == null) {
                    throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
                } else if (!this.f25940d || !TextUtils.isEmpty(this.f25938b)) {
                    return new b(this.f25937a, this.f25938b, this.f25939c, this.f25940d);
                } else {
                    throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
                }
            }

            public a b(a aVar) {
                this.f25939c = aVar;
                return this;
            }

            public a c(String str) {
                this.f25938b = str;
                return this;
            }

            public a d(boolean z10) {
                this.f25940d = z10;
                return this;
            }
        }

        public b(Context context, String str, a aVar, boolean z10) {
            this.f25933a = context;
            this.f25934b = str;
            this.f25935c = aVar;
            this.f25936d = z10;
        }

        public static a a(Context context) {
            return new a(context);
        }
    }

    public interface AbstractC0241c {
        c a(b bVar);
    }

    x1.b R();

    @Override
    void close();

    String getDatabaseName();

    void setWriteAheadLoggingEnabled(boolean z10);
}
