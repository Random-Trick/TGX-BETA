package p116i3;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import java.util.Arrays;
import java.util.List;

public final class C5194h0 extends SQLiteOpenHelper {
    public static final AbstractC5195a f17316M;
    public static final AbstractC5195a f17317N;
    public static final AbstractC5195a f17318O;
    public static final AbstractC5195a f17319P;
    public static final List<AbstractC5195a> f17320Q;
    public static int f17321c = 4;
    public final int f17322a;
    public boolean f17323b = false;

    public interface AbstractC5195a {
        void mo23626a(SQLiteDatabase sQLiteDatabase);
    }

    static {
        C5191g0 g0Var = C5191g0.f17314a;
        f17316M = g0Var;
        C5183d0 d0Var = C5183d0.f17309a;
        f17317N = d0Var;
        C5185e0 e0Var = C5185e0.f17310a;
        f17318O = e0Var;
        C5188f0 f0Var = C5188f0.f17312a;
        f17319P = f0Var;
        f17320Q = Arrays.asList(g0Var, d0Var, e0Var, f0Var);
    }

    public C5194h0(Context context, String str, int i) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i);
        this.f17322a = i;
    }

    public static void m23636B0(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE events (_id INTEGER PRIMARY KEY, context_id INTEGER NOT NULL, transport_name TEXT NOT NULL, timestamp_ms INTEGER NOT NULL, uptime_ms INTEGER NOT NULL, payload BLOB NOT NULL, code INTEGER, num_attempts INTEGER NOT NULL,FOREIGN KEY (context_id) REFERENCES transport_contexts(_id) ON DELETE CASCADE)");
        sQLiteDatabase.execSQL("CREATE TABLE event_metadata (_id INTEGER PRIMARY KEY, event_id INTEGER NOT NULL, name TEXT NOT NULL, value TEXT NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE)");
        sQLiteDatabase.execSQL("CREATE TABLE transport_contexts (_id INTEGER PRIMARY KEY, backend_name TEXT NOT NULL, priority INTEGER NOT NULL, next_request_ms INTEGER NOT NULL)");
        sQLiteDatabase.execSQL("CREATE INDEX events_backend_id on events(context_id)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority on transport_contexts(backend_name, priority)");
    }

    public static void m23635C0(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE transport_contexts ADD COLUMN extras BLOB");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority_extras on transport_contexts(backend_name, priority, extras)");
        sQLiteDatabase.execSQL("DROP INDEX contexts_backend_priority");
    }

    public static void m23633E0(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN inline BOOLEAN NOT NULL DEFAULT 1");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("CREATE TABLE event_payloads (sequence_num INTEGER NOT NULL, event_id INTEGER NOT NULL, bytes BLOB NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE,PRIMARY KEY (sequence_num, event_id))");
    }

    public final void m23637A0(SQLiteDatabase sQLiteDatabase) {
        if (!this.f17323b) {
            onConfigure(sQLiteDatabase);
        }
    }

    public final void m23632F0(SQLiteDatabase sQLiteDatabase, int i) {
        m23637A0(sQLiteDatabase);
        m23631G0(sQLiteDatabase, 0, i);
    }

    public final void m23631G0(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        List<AbstractC5195a> list = f17320Q;
        if (i2 <= list.size()) {
            while (i < i2) {
                f17320Q.get(i).mo23626a(sQLiteDatabase);
                i++;
            }
            return;
        }
        throw new IllegalArgumentException("Migration from " + i + " to " + i2 + " was requested, but cannot be performed. Only " + list.size() + " migrations are provided");
    }

    @Override
    public void onConfigure(SQLiteDatabase sQLiteDatabase) {
        this.f17323b = true;
        sQLiteDatabase.rawQuery("PRAGMA busy_timeout=0;", new String[0]).close();
        if (Build.VERSION.SDK_INT >= 16) {
            sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
        }
    }

    @Override
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        m23632F0(sQLiteDatabase, this.f17322a);
    }

    @Override
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE events");
        sQLiteDatabase.execSQL("DROP TABLE event_metadata");
        sQLiteDatabase.execSQL("DROP TABLE transport_contexts");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        m23632F0(sQLiteDatabase, i2);
    }

    @Override
    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        m23637A0(sQLiteDatabase);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        m23637A0(sQLiteDatabase);
        m23631G0(sQLiteDatabase, i, i2);
    }
}
