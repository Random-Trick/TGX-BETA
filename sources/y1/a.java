package y1;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.os.CancellationSignal;
import android.util.Pair;
import java.util.List;
import x1.e;
import x1.f;

public class a implements x1.b {
    public static final String[] f26469b = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};
    public static final String[] f26470c = new String[0];
    public final SQLiteDatabase f26471a;

    public class C0246a implements SQLiteDatabase.CursorFactory {
        public final e f26472a;

        public C0246a(e eVar) {
            this.f26472a = eVar;
        }

        @Override
        public Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            this.f26472a.m(new d(sQLiteQuery));
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    public class b implements SQLiteDatabase.CursorFactory {
        public final e f26474a;

        public b(e eVar) {
            this.f26474a = eVar;
        }

        @Override
        public Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            this.f26474a.m(new d(sQLiteQuery));
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    public a(SQLiteDatabase sQLiteDatabase) {
        this.f26471a = sQLiteDatabase;
    }

    @Override
    public void L() {
        this.f26471a.setTransactionSuccessful();
    }

    @Override
    public void N(String str, Object[] objArr) {
        this.f26471a.execSQL(str, objArr);
    }

    @Override
    public Cursor T(String str) {
        return p0(new x1.a(str));
    }

    @Override
    public void W() {
        this.f26471a.endTransaction();
    }

    @Override
    public void close() {
        this.f26471a.close();
    }

    @Override
    public Cursor d(e eVar, CancellationSignal cancellationSignal) {
        return this.f26471a.rawQueryWithFactory(new b(eVar), eVar.s(), f26470c, null, cancellationSignal);
    }

    @Override
    public void e() {
        this.f26471a.beginTransaction();
    }

    @Override
    public String h0() {
        return this.f26471a.getPath();
    }

    @Override
    public boolean isOpen() {
        return this.f26471a.isOpen();
    }

    @Override
    public boolean j0() {
        return this.f26471a.inTransaction();
    }

    public boolean m(SQLiteDatabase sQLiteDatabase) {
        return this.f26471a == sQLiteDatabase;
    }

    @Override
    public List<Pair<String, String>> n() {
        return this.f26471a.getAttachedDbs();
    }

    @Override
    public void p(String str) {
        this.f26471a.execSQL(str);
    }

    @Override
    public Cursor p0(e eVar) {
        return this.f26471a.rawQueryWithFactory(new C0246a(eVar), eVar.s(), f26470c, null);
    }

    @Override
    public f u(String str) {
        return new e(this.f26471a.compileStatement(str));
    }
}
