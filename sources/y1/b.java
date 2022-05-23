package y1;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import java.io.File;
import x1.c;

public class b implements c {
    public final boolean M;
    public final Object N = new Object();
    public a O;
    public boolean P;
    public final Context f26476a;
    public final String f26477b;
    public final c.a f26478c;

    public static class a extends SQLiteOpenHelper {
        public final y1.a[] f26479a;
        public final c.a f26480b;
        public boolean f26481c;

        public class C0247a implements DatabaseErrorHandler {
            public final c.a f26482a;
            public final y1.a[] f26483b;

            public C0247a(c.a aVar, y1.a[] aVarArr) {
                this.f26482a = aVar;
                this.f26483b = aVarArr;
            }

            @Override
            public void onCorruption(SQLiteDatabase sQLiteDatabase) {
                this.f26482a.c(a.s(this.f26483b, sQLiteDatabase));
            }
        }

        public a(Context context, String str, y1.a[] aVarArr, c.a aVar) {
            super(context, str, null, aVar.f25932a, new C0247a(aVar, aVarArr));
            this.f26480b = aVar;
            this.f26479a = aVarArr;
        }

        public static y1.a s(y1.a[] aVarArr, SQLiteDatabase sQLiteDatabase) {
            y1.a aVar = aVarArr[0];
            if (aVar == null || !aVar.m(sQLiteDatabase)) {
                aVarArr[0] = new y1.a(sQLiteDatabase);
            }
            return aVarArr[0];
        }

        @Override
        public synchronized void close() {
            super.close();
            this.f26479a[0] = null;
        }

        public y1.a m(SQLiteDatabase sQLiteDatabase) {
            return s(this.f26479a, sQLiteDatabase);
        }

        @Override
        public void onConfigure(SQLiteDatabase sQLiteDatabase) {
            this.f26480b.b(m(sQLiteDatabase));
        }

        @Override
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            this.f26480b.d(m(sQLiteDatabase));
        }

        @Override
        public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
            this.f26481c = true;
            this.f26480b.e(m(sQLiteDatabase), i10, i11);
        }

        @Override
        public void onOpen(SQLiteDatabase sQLiteDatabase) {
            if (!this.f26481c) {
                this.f26480b.f(m(sQLiteDatabase));
            }
        }

        @Override
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
            this.f26481c = true;
            this.f26480b.g(m(sQLiteDatabase), i10, i11);
        }

        public synchronized x1.b y0() {
            this.f26481c = false;
            SQLiteDatabase writableDatabase = super.getWritableDatabase();
            if (this.f26481c) {
                close();
                return y0();
            }
            return m(writableDatabase);
        }
    }

    public b(Context context, String str, c.a aVar, boolean z10) {
        this.f26476a = context;
        this.f26477b = str;
        this.f26478c = aVar;
        this.M = z10;
    }

    @Override
    public x1.b R() {
        return m().y0();
    }

    @Override
    public void close() {
        m().close();
    }

    @Override
    public String getDatabaseName() {
        return this.f26477b;
    }

    public final a m() {
        a aVar;
        synchronized (this.N) {
            if (this.O == null) {
                y1.a[] aVarArr = new y1.a[1];
                if (Build.VERSION.SDK_INT < 23 || this.f26477b == null || !this.M) {
                    this.O = new a(this.f26476a, this.f26477b, aVarArr, this.f26478c);
                } else {
                    this.O = new a(this.f26476a, new File(this.f26476a.getNoBackupFilesDir(), this.f26477b).getAbsolutePath(), aVarArr, this.f26478c);
                }
                this.O.setWriteAheadLoggingEnabled(this.P);
            }
            aVar = this.O;
        }
        return aVar;
    }

    @Override
    public void setWriteAheadLoggingEnabled(boolean z10) {
        synchronized (this.N) {
            a aVar = this.O;
            if (aVar != null) {
                aVar.setWriteAheadLoggingEnabled(z10);
            }
            this.P = z10;
        }
    }
}
