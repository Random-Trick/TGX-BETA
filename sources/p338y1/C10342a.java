package p338y1;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.os.CancellationSignal;
import android.util.Pair;
import java.util.List;
import p323x1.AbstractC10066b;
import p323x1.AbstractC10073e;
import p323x1.AbstractC10074f;
import p323x1.C10065a;

public class C10342a implements AbstractC10066b {
    public static final String[] f33206b = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};
    public static final String[] f33207c = new String[0];
    public final SQLiteDatabase f33208a;

    public class C10343a implements SQLiteDatabase.CursorFactory {
        public final AbstractC10073e f33209a;

        public C10343a(AbstractC10073e eVar) {
            this.f33209a = eVar;
        }

        @Override
        public Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            this.f33209a.mo6071m(new C10349d(sQLiteQuery));
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    public class C10344b implements SQLiteDatabase.CursorFactory {
        public final AbstractC10073e f33211a;

        public C10344b(AbstractC10073e eVar) {
            this.f33211a = eVar;
        }

        @Override
        public Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            this.f33211a.mo6071m(new C10349d(sQLiteQuery));
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    public C10342a(SQLiteDatabase sQLiteDatabase) {
        this.f33208a = sQLiteDatabase;
    }

    @Override
    public void mo5395K() {
        this.f33208a.setTransactionSuccessful();
    }

    @Override
    public void mo5394M(String str, Object[] objArr) {
        this.f33208a.execSQL(str, objArr);
    }

    @Override
    public Cursor mo5393S(String str) {
        return mo5384p0(new C10065a(str));
    }

    @Override
    public void mo5392V() {
        this.f33208a.endTransaction();
    }

    @Override
    public void close() {
        this.f33208a.close();
    }

    @Override
    public Cursor mo5391d(AbstractC10073e eVar, CancellationSignal cancellationSignal) {
        return this.f33208a.rawQueryWithFactory(new C10344b(eVar), eVar.mo6070t(), f33207c, null, cancellationSignal);
    }

    @Override
    public void mo5390e() {
        this.f33208a.beginTransaction();
    }

    @Override
    public String mo5389f0() {
        return this.f33208a.getPath();
    }

    @Override
    public boolean mo5388i0() {
        return this.f33208a.inTransaction();
    }

    @Override
    public boolean isOpen() {
        return this.f33208a.isOpen();
    }

    public boolean m5387m(SQLiteDatabase sQLiteDatabase) {
        return this.f33208a == sQLiteDatabase;
    }

    @Override
    public List<Pair<String, String>> mo5386n() {
        return this.f33208a.getAttachedDbs();
    }

    @Override
    public void mo5385p(String str) {
        this.f33208a.execSQL(str);
    }

    @Override
    public Cursor mo5384p0(AbstractC10073e eVar) {
        return this.f33208a.rawQueryWithFactory(new C10343a(eVar), eVar.mo6070t(), f33207c, null);
    }

    @Override
    public AbstractC10074f mo5383v(String str) {
        return new C10350e(this.f33208a.compileStatement(str));
    }
}
