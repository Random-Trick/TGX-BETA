package y1;

import android.database.sqlite.SQLiteProgram;

public class d implements x1.d {
    public final SQLiteProgram f26484a;

    public d(SQLiteProgram sQLiteProgram) {
        this.f26484a = sQLiteProgram;
    }

    @Override
    public void K(int i10, long j10) {
        this.f26484a.bindLong(i10, j10);
    }

    @Override
    public void O(int i10, byte[] bArr) {
        this.f26484a.bindBlob(i10, bArr);
    }

    @Override
    public void close() {
        this.f26484a.close();
    }

    @Override
    public void f0(int i10) {
        this.f26484a.bindNull(i10);
    }

    @Override
    public void q(int i10, String str) {
        this.f26484a.bindString(i10, str);
    }

    @Override
    public void y(int i10, double d10) {
        this.f26484a.bindDouble(i10, d10);
    }
}
