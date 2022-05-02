package p338y1;

import android.database.sqlite.SQLiteStatement;
import p323x1.AbstractC10074f;

public class C10350e extends C10349d implements AbstractC10074f {
    public final SQLiteStatement f33229b;

    public C10350e(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.f33229b = sQLiteStatement;
    }

    @Override
    public int mo5371u() {
        return this.f33229b.executeUpdateDelete();
    }

    @Override
    public long mo5370u0() {
        return this.f33229b.executeInsert();
    }
}
