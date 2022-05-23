package y1;

import android.database.sqlite.SQLiteStatement;
import x1.f;

public class e extends d implements f {
    public final SQLiteStatement f26485b;

    public e(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.f26485b = sQLiteStatement;
    }

    @Override
    public int t() {
        return this.f26485b.executeUpdateDelete();
    }

    @Override
    public long u0() {
        return this.f26485b.executeInsert();
    }
}
