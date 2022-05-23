package i3;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.Arrays;
import java.util.List;

public final class h0 extends SQLiteOpenHelper {
    public static final a M;
    public static final a N;
    public static final a O;
    public static final a P;
    public static final List<a> Q;
    public static int f13958c = 4;
    public final int f13959a;
    public boolean f13960b = false;

    public interface a {
        void a(SQLiteDatabase sQLiteDatabase);
    }

    static {
        g0 g0Var = g0.f13956a;
        M = g0Var;
        d0 d0Var = d0.f13951a;
        N = d0Var;
        e0 e0Var = e0.f13952a;
        O = e0Var;
        f0 f0Var = f0.f13954a;
        P = f0Var;
        Q = Arrays.asList(g0Var, d0Var, e0Var, f0Var);
    }

    public h0(Context context, String str, int i10) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i10);
        this.f13959a = i10;
    }

    public static void B0(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE events (_id INTEGER PRIMARY KEY, context_id INTEGER NOT NULL, transport_name TEXT NOT NULL, timestamp_ms INTEGER NOT NULL, uptime_ms INTEGER NOT NULL, payload BLOB NOT NULL, code INTEGER, num_attempts INTEGER NOT NULL,FOREIGN KEY (context_id) REFERENCES transport_contexts(_id) ON DELETE CASCADE)");
        sQLiteDatabase.execSQL("CREATE TABLE event_metadata (_id INTEGER PRIMARY KEY, event_id INTEGER NOT NULL, name TEXT NOT NULL, value TEXT NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE)");
        sQLiteDatabase.execSQL("CREATE TABLE transport_contexts (_id INTEGER PRIMARY KEY, backend_name TEXT NOT NULL, priority INTEGER NOT NULL, next_request_ms INTEGER NOT NULL)");
        sQLiteDatabase.execSQL("CREATE INDEX events_backend_id on events(context_id)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority on transport_contexts(backend_name, priority)");
    }

    public static void C0(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE transport_contexts ADD COLUMN extras BLOB");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority_extras on transport_contexts(backend_name, priority, extras)");
        sQLiteDatabase.execSQL("DROP INDEX contexts_backend_priority");
    }

    public static void E0(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN inline BOOLEAN NOT NULL DEFAULT 1");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("CREATE TABLE event_payloads (sequence_num INTEGER NOT NULL, event_id INTEGER NOT NULL, bytes BLOB NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE,PRIMARY KEY (sequence_num, event_id))");
    }

    public final void A0(SQLiteDatabase sQLiteDatabase) {
        if (!this.f13960b) {
            onConfigure(sQLiteDatabase);
        }
    }

    public final void F0(SQLiteDatabase sQLiteDatabase, int i10) {
        A0(sQLiteDatabase);
        G0(sQLiteDatabase, 0, i10);
    }

    public final void G0(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        List<a> list = Q;
        if (i11 <= list.size()) {
            while (i10 < i11) {
                Q.get(i10).a(sQLiteDatabase);
                i10++;
            }
            return;
        }
        throw new IllegalArgumentException("Migration from " + i10 + " to " + i11 + " was requested, but cannot be performed. Only " + list.size() + " migrations are provided");
    }

    @Override
    public void onConfigure(SQLiteDatabase sQLiteDatabase) {
        this.f13960b = true;
        sQLiteDatabase.rawQuery("PRAGMA busy_timeout=0;", new String[0]).close();
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
    }

    @Override
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        F0(sQLiteDatabase, this.f13959a);
    }

    @Override
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        sQLiteDatabase.execSQL("DROP TABLE events");
        sQLiteDatabase.execSQL("DROP TABLE event_metadata");
        sQLiteDatabase.execSQL("DROP TABLE transport_contexts");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        F0(sQLiteDatabase, i11);
    }

    @Override
    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        A0(sQLiteDatabase);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        A0(sQLiteDatabase);
        G0(sQLiteDatabase, i10, i11);
    }
}
