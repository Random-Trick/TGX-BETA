package p338y1;

import android.database.sqlite.SQLiteStatement;
import p323x1.AbstractC10074f;

public class C10350e extends C10349d implements AbstractC10074f {
    public final SQLiteStatement f33226b;

    public C10350e(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.f33226b = sQLiteStatement;
    }

    @Override
    public int mo5371u() {
        return this.f33226b.executeUpdateDelete();
    }

    @Override
    public long mo5370u0() {
        return this.f33226b.executeInsert();
    }
}
