package p338y1;

import android.database.sqlite.SQLiteProgram;
import p323x1.AbstractC10072d;

public class C10349d implements AbstractC10072d {
    public final SQLiteProgram f33228a;

    public C10349d(SQLiteProgram sQLiteProgram) {
        this.f33228a = sQLiteProgram;
    }

    @Override
    public void mo5376J(int i, long j) {
        this.f33228a.bindLong(i, j);
    }

    @Override
    public void mo5375N(int i, byte[] bArr) {
        this.f33228a.bindBlob(i, bArr);
    }

    @Override
    public void close() {
        this.f33228a.close();
    }

    @Override
    public void mo5374d0(int i) {
        this.f33228a.bindNull(i);
    }

    @Override
    public void mo5373q(int i, String str) {
        this.f33228a.bindString(i, str);
    }

    @Override
    public void mo5372z(int i, double d) {
        this.f33228a.bindDouble(i, d);
    }
}
