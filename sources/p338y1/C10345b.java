package p338y1;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import java.io.File;
import p323x1.AbstractC10066b;
import p323x1.AbstractC10067c;

public class C10345b implements AbstractC10067c {
    public final boolean f33216M;
    public final Object f33217N = new Object();
    public C10346a f33218O;
    public boolean f33219P;
    public final Context f33220a;
    public final String f33221b;
    public final AbstractC10067c.AbstractC10068a f33222c;

    public static class C10346a extends SQLiteOpenHelper {
        public final C10342a[] f33223a;
        public final AbstractC10067c.AbstractC10068a f33224b;
        public boolean f33225c;

        public class C10347a implements DatabaseErrorHandler {
            public final AbstractC10067c.AbstractC10068a f33226a;
            public final C10342a[] f33227b;

            public C10347a(AbstractC10067c.AbstractC10068a aVar, C10342a[] aVarArr) {
                this.f33226a = aVar;
                this.f33227b = aVarArr;
            }

            @Override
            public void onCorruption(SQLiteDatabase sQLiteDatabase) {
                this.f33226a.m6081c(C10346a.m5379t(this.f33227b, sQLiteDatabase));
            }
        }

        public C10346a(Context context, String str, C10342a[] aVarArr, AbstractC10067c.AbstractC10068a aVar) {
            super(context, str, null, aVar.f32736a, new C10347a(aVar, aVarArr));
            this.f33224b = aVar;
            this.f33223a = aVarArr;
        }

        public static C10342a m5379t(C10342a[] aVarArr, SQLiteDatabase sQLiteDatabase) {
            C10342a aVar = aVarArr[0];
            if (aVar == null || !aVar.m5387m(sQLiteDatabase)) {
                aVarArr[0] = new C10342a(sQLiteDatabase);
            }
            return aVarArr[0];
        }

        @Override
        public synchronized void close() {
            super.close();
            this.f33223a[0] = null;
        }

        public C10342a m5380m(SQLiteDatabase sQLiteDatabase) {
            return m5379t(this.f33223a, sQLiteDatabase);
        }

        @Override
        public void onConfigure(SQLiteDatabase sQLiteDatabase) {
            this.f33224b.mo6082b(m5380m(sQLiteDatabase));
        }

        @Override
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            this.f33224b.mo6080d(m5380m(sQLiteDatabase));
        }

        @Override
        public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            this.f33225c = true;
            this.f33224b.mo6079e(m5380m(sQLiteDatabase), i, i2);
        }

        @Override
        public void onOpen(SQLiteDatabase sQLiteDatabase) {
            if (!this.f33225c) {
                this.f33224b.mo6078f(m5380m(sQLiteDatabase));
            }
        }

        @Override
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            this.f33225c = true;
            this.f33224b.mo6077g(m5380m(sQLiteDatabase), i, i2);
        }

        public synchronized AbstractC10066b m5378y0() {
            this.f33225c = false;
            SQLiteDatabase writableDatabase = super.getWritableDatabase();
            if (this.f33225c) {
                close();
                return m5378y0();
            }
            return m5380m(writableDatabase);
        }
    }

    public C10345b(Context context, String str, AbstractC10067c.AbstractC10068a aVar, boolean z) {
        this.f33220a = context;
        this.f33221b = str;
        this.f33222c = aVar;
        this.f33216M = z;
    }

    @Override
    public AbstractC10066b mo5382Q() {
        return m5381m().m5378y0();
    }

    @Override
    public void close() {
        m5381m().close();
    }

    @Override
    public String getDatabaseName() {
        return this.f33221b;
    }

    public final C10346a m5381m() {
        C10346a aVar;
        synchronized (this.f33217N) {
            if (this.f33218O == null) {
                C10342a[] aVarArr = new C10342a[1];
                int i = Build.VERSION.SDK_INT;
                if (i < 23 || this.f33221b == null || !this.f33216M) {
                    this.f33218O = new C10346a(this.f33220a, this.f33221b, aVarArr, this.f33222c);
                } else {
                    this.f33218O = new C10346a(this.f33220a, new File(this.f33220a.getNoBackupFilesDir(), this.f33221b).getAbsolutePath(), aVarArr, this.f33222c);
                }
                if (i >= 16) {
                    this.f33218O.setWriteAheadLoggingEnabled(this.f33219P);
                }
            }
            aVar = this.f33218O;
        }
        return aVar;
    }

    @Override
    public void setWriteAheadLoggingEnabled(boolean z) {
        synchronized (this.f33217N) {
            C10346a aVar = this.f33218O;
            if (aVar != null) {
                aVar.setWriteAheadLoggingEnabled(z);
            }
            this.f33219P = z;
        }
    }
}
