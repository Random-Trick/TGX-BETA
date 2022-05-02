package p323x1;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.List;

public interface AbstractC10067c extends Closeable {

    public static abstract class AbstractC10068a {
        public final int f32733a;

        public AbstractC10068a(int i) {
            this.f32733a = i;
        }

        public final void m6083a(String str) {
            if (!str.equalsIgnoreCase(":memory:") && str.trim().length() != 0) {
                Log.w("SupportSQLite", "deleting the database file: " + str);
                try {
                    if (Build.VERSION.SDK_INT >= 16) {
                        SQLiteDatabase.deleteDatabase(new File(str));
                    } else {
                        try {
                            if (!new File(str).delete()) {
                                Log.e("SupportSQLite", "Could not delete the database file " + str);
                            }
                        } catch (Exception e) {
                            Log.e("SupportSQLite", "error while deleting corrupted database file", e);
                        }
                    }
                } catch (Exception e2) {
                    Log.w("SupportSQLite", "delete failed: ", e2);
                }
            }
        }

        public void mo6082b(AbstractC10066b bVar) {
        }

        public void m6081c(AbstractC10066b bVar) {
            Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + bVar.mo5389f0());
            if (!bVar.isOpen()) {
                m6083a(bVar.mo5389f0());
                return;
            }
            List<Pair<String, String>> list = null;
            try {
                try {
                    list = bVar.mo5386n();
                } catch (SQLiteException unused) {
                }
                try {
                    bVar.close();
                } catch (IOException unused2) {
                }
            } finally {
                if (list != null) {
                    for (Pair<String, String> next : list) {
                        m6083a((String) next.second);
                    }
                } else {
                    m6083a(bVar.mo5389f0());
                }
            }
        }

        public abstract void mo6080d(AbstractC10066b bVar);

        public abstract void mo6079e(AbstractC10066b bVar, int i, int i2);

        public void mo6078f(AbstractC10066b bVar) {
        }

        public abstract void mo6077g(AbstractC10066b bVar, int i, int i2);
    }

    public static class C10069b {
        public final Context f32734a;
        public final String f32735b;
        public final AbstractC10068a f32736c;
        public final boolean f32737d;

        public static class C10070a {
            public Context f32738a;
            public String f32739b;
            public AbstractC10068a f32740c;
            public boolean f32741d;

            public C10070a(Context context) {
                this.f32738a = context;
            }

            public C10069b m6075a() {
                if (this.f32740c == null) {
                    throw new IllegalArgumentException("Must set a callback to create the configuration.");
                } else if (this.f32738a == null) {
                    throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
                } else if (!this.f32741d || !TextUtils.isEmpty(this.f32739b)) {
                    return new C10069b(this.f32738a, this.f32739b, this.f32740c, this.f32741d);
                } else {
                    throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
                }
            }

            public C10070a m6074b(AbstractC10068a aVar) {
                this.f32740c = aVar;
                return this;
            }

            public C10070a m6073c(String str) {
                this.f32739b = str;
                return this;
            }

            public C10070a m6072d(boolean z) {
                this.f32741d = z;
                return this;
            }
        }

        public C10069b(Context context, String str, AbstractC10068a aVar, boolean z) {
            this.f32734a = context;
            this.f32735b = str;
            this.f32736c = aVar;
            this.f32737d = z;
        }

        public static C10070a m6076a(Context context) {
            return new C10070a(context);
        }
    }

    public interface AbstractC10071c {
        AbstractC10067c mo5377a(C10069b bVar);
    }

    AbstractC10066b mo5382Q();

    @Override
    void close();

    String getDatabaseName();

    void setWriteAheadLoggingEnabled(boolean z);
}
