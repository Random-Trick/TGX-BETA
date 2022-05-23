package i3;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import b3.g;
import b3.h;
import b3.m;
import j3.b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class b0 implements i3.c, j3.b {
    public static final y2.b N = y2.b.b("proto");
    public final i3.d M;
    public final h0 f13941a;
    public final k3.a f13942b;
    public final k3.a f13943c;

    public interface b<T, U> {
        U apply(T t10);
    }

    public static class c {
        public final String f13944a;
        public final String f13945b;

        public c(String str, String str2) {
            this.f13944a = str;
            this.f13945b = str2;
        }
    }

    public interface d<T> {
        T a();
    }

    public b0(k3.a aVar, k3.a aVar2, i3.d dVar, h0 h0Var) {
        this.f13941a = h0Var;
        this.f13942b = aVar;
        this.f13943c = aVar2;
        this.M = dVar;
    }

    public static Integer W0(long j10, SQLiteDatabase sQLiteDatabase) {
        return Integer.valueOf(sQLiteDatabase.delete("events", "timestamp_ms < ?", new String[]{String.valueOf(j10)}));
    }

    public static Object Y0(Throwable th) {
        throw new j3.a("Timed out while trying to acquire the lock.", th);
    }

    public static SQLiteDatabase Z0(Throwable th) {
        throw new j3.a("Timed out while trying to open db.", th);
    }

    public static Long a1(Cursor cursor) {
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return 0L;
    }

    public static Long b1(Cursor cursor) {
        if (!cursor.moveToNext()) {
            return null;
        }
        return Long.valueOf(cursor.getLong(0));
    }

    public Boolean c1(m mVar, SQLiteDatabase sQLiteDatabase) {
        Long S0 = S0(sQLiteDatabase, mVar);
        if (S0 == null) {
            return Boolean.FALSE;
        }
        return (Boolean) t1(P0().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{S0.toString()}), m.f13967a);
    }

    public static List d1(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            arrayList.add(m.a().b(cursor.getString(1)).d(l3.a.b(cursor.getInt(2))).c(o1(cursor.getString(3))).a());
        }
        return arrayList;
    }

    public static List e1(SQLiteDatabase sQLiteDatabase) {
        return (List) t1(sQLiteDatabase.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), a0.f13937a);
    }

    public List f1(m mVar, SQLiteDatabase sQLiteDatabase) {
        List<i> m12 = m1(sQLiteDatabase, mVar);
        return V0(m12, n1(sQLiteDatabase, m12));
    }

    public Object g1(List list, m mVar, Cursor cursor) {
        while (cursor.moveToNext()) {
            boolean z10 = false;
            long j10 = cursor.getLong(0);
            if (cursor.getInt(7) != 0) {
                z10 = true;
            }
            h.a k10 = h.a().j(cursor.getString(1)).i(cursor.getLong(2)).k(cursor.getLong(3));
            if (z10) {
                k10.h(new g(r1(cursor.getString(4)), cursor.getBlob(5)));
            } else {
                k10.h(new g(r1(cursor.getString(4)), p1(j10)));
            }
            if (!cursor.isNull(6)) {
                k10.g(Integer.valueOf(cursor.getInt(6)));
            }
            list.add(i.a(j10, mVar, k10.d()));
        }
        return null;
    }

    public static Object h1(Map map, Cursor cursor) {
        while (cursor.moveToNext()) {
            long j10 = cursor.getLong(0);
            Set set = (Set) map.get(Long.valueOf(j10));
            if (set == null) {
                set = new HashSet();
                map.put(Long.valueOf(j10), set);
            }
            set.add(new c(cursor.getString(1), cursor.getString(2)));
        }
        return null;
    }

    public Long i1(m mVar, h hVar, SQLiteDatabase sQLiteDatabase) {
        if (U0()) {
            return -1L;
        }
        long O0 = O0(sQLiteDatabase, mVar);
        int e10 = this.M.e();
        byte[] a10 = hVar.e().a();
        boolean z10 = a10.length <= e10;
        ContentValues contentValues = new ContentValues();
        contentValues.put("context_id", Long.valueOf(O0));
        contentValues.put("transport_name", hVar.j());
        contentValues.put("timestamp_ms", Long.valueOf(hVar.f()));
        contentValues.put("uptime_ms", Long.valueOf(hVar.k()));
        contentValues.put("payload_encoding", hVar.e().b().a());
        contentValues.put("code", hVar.d());
        contentValues.put("num_attempts", (Integer) 0);
        contentValues.put("inline", Boolean.valueOf(z10));
        contentValues.put("payload", z10 ? a10 : new byte[0]);
        long insert = sQLiteDatabase.insert("events", null, contentValues);
        if (!z10) {
            int ceil = (int) Math.ceil(a10.length / e10);
            for (int i10 = 1; i10 <= ceil; i10++) {
                byte[] copyOfRange = Arrays.copyOfRange(a10, (i10 - 1) * e10, Math.min(i10 * e10, a10.length));
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("event_id", Long.valueOf(insert));
                contentValues2.put("sequence_num", Integer.valueOf(i10));
                contentValues2.put("bytes", copyOfRange);
                sQLiteDatabase.insert("event_payloads", null, contentValues2);
            }
        }
        for (Map.Entry<String, String> entry : hVar.i().entrySet()) {
            ContentValues contentValues3 = new ContentValues();
            contentValues3.put("event_id", Long.valueOf(insert));
            contentValues3.put("name", entry.getKey());
            contentValues3.put("value", entry.getValue());
            sQLiteDatabase.insert("event_metadata", null, contentValues3);
        }
        return Long.valueOf(insert);
    }

    public static byte[] j1(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (cursor.moveToNext()) {
            byte[] blob = cursor.getBlob(0);
            arrayList.add(blob);
            i10 += blob.length;
        }
        byte[] bArr = new byte[i10];
        int i11 = 0;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            byte[] bArr2 = (byte[]) arrayList.get(i12);
            System.arraycopy(bArr2, 0, bArr, i11, bArr2.length);
            i11 += bArr2.length;
        }
        return bArr;
    }

    public static Object k1(String str, SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement(str).execute();
        sQLiteDatabase.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
        return null;
    }

    public static Object l1(long j10, m mVar, SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(j10));
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{mVar.b(), String.valueOf(l3.a.a(mVar.d()))}) < 1) {
            contentValues.put("backend_name", mVar.b());
            contentValues.put("priority", Integer.valueOf(l3.a.a(mVar.d())));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    public static byte[] o1(String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 0);
    }

    public static y2.b r1(String str) {
        if (str == null) {
            return N;
        }
        return y2.b.b(str);
    }

    public static String s1(Iterable<i> iterable) {
        StringBuilder sb2 = new StringBuilder("(");
        Iterator<i> it = iterable.iterator();
        while (it.hasNext()) {
            sb2.append(it.next().c());
            if (it.hasNext()) {
                sb2.append(',');
            }
        }
        sb2.append(')');
        return sb2.toString();
    }

    public static <T> T t1(Cursor cursor, b<Cursor, T> bVar) {
        try {
            return bVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    @Override
    public Iterable<m> F() {
        return (Iterable) T0(n.f13968a);
    }

    @Override
    public void G(final m mVar, final long j10) {
        T0(new b() {
            @Override
            public final Object apply(Object obj) {
                Object l12;
                l12 = b0.l1(j10, mVar, (SQLiteDatabase) obj);
                return l12;
            }
        });
    }

    public final void N0(final SQLiteDatabase sQLiteDatabase) {
        q1(new d() {
            @Override
            public final Object a() {
                Object beginTransaction;
                beginTransaction = sQLiteDatabase.beginTransaction();
                return beginTransaction;
            }
        }, p.f13970a);
    }

    public final long O0(SQLiteDatabase sQLiteDatabase, m mVar) {
        Long S0 = S0(sQLiteDatabase, mVar);
        if (S0 != null) {
            return S0.longValue();
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("backend_name", mVar.b());
        contentValues.put("priority", Integer.valueOf(l3.a.a(mVar.d())));
        contentValues.put("next_request_ms", (Integer) 0);
        if (mVar.c() != null) {
            contentValues.put("extras", Base64.encodeToString(mVar.c(), 0));
        }
        return sQLiteDatabase.insert("transport_contexts", null, contentValues);
    }

    public SQLiteDatabase P0() {
        final h0 h0Var = this.f13941a;
        Objects.requireNonNull(h0Var);
        return (SQLiteDatabase) q1(new d() {
            @Override
            public final Object a() {
                return h0.this.getWritableDatabase();
            }
        }, o.f13969a);
    }

    @Override
    public i Q(final m mVar, final h hVar) {
        e3.a.b("SQLiteEventStore", "Storing event with priority=%s, name=%s for destination %s", mVar.d(), hVar.j(), mVar.b());
        long longValue = ((Long) T0(new b() {
            @Override
            public final Object apply(Object obj) {
                Long i12;
                i12 = b0.this.i1(mVar, hVar, (SQLiteDatabase) obj);
                return i12;
            }
        })).longValue();
        if (longValue < 1) {
            return null;
        }
        return i.a(longValue, mVar, hVar);
    }

    public final long Q0() {
        return P0().compileStatement("PRAGMA page_count").simpleQueryForLong();
    }

    public final long R0() {
        return P0().compileStatement("PRAGMA page_size").simpleQueryForLong();
    }

    public final Long S0(SQLiteDatabase sQLiteDatabase, m mVar) {
        StringBuilder sb2 = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(mVar.b(), String.valueOf(l3.a.a(mVar.d()))));
        if (mVar.c() != null) {
            sb2.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(mVar.c(), 0));
        } else {
            sb2.append(" and extras is null");
        }
        return (Long) t1(sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb2.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null), k.f13965a);
    }

    public <T> T T0(b<SQLiteDatabase, T> bVar) {
        SQLiteDatabase P0 = P0();
        P0.beginTransaction();
        try {
            T apply = bVar.apply(P0);
            P0.setTransactionSuccessful();
            return apply;
        } finally {
            P0.endTransaction();
        }
    }

    public final boolean U0() {
        return Q0() * R0() >= this.M.f();
    }

    public final List<i> V0(List<i> list, Map<Long, Set<c>> map) {
        ListIterator<i> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            i next = listIterator.next();
            if (map.containsKey(Long.valueOf(next.c()))) {
                h.a l10 = next.b().l();
                for (c cVar : map.get(Long.valueOf(next.c()))) {
                    l10.c(cVar.f13944a, cVar.f13945b);
                }
                listIterator.set(i.a(next.c(), next.d(), l10.d()));
            }
        }
        return list;
    }

    @Override
    public void close() {
        this.f13941a.close();
    }

    @Override
    public int f() {
        final long a10 = this.f13942b.a() - this.M.c();
        return ((Integer) T0(new b() {
            @Override
            public final Object apply(Object obj) {
                Integer W0;
                W0 = b0.W0(a10, (SQLiteDatabase) obj);
                return W0;
            }
        })).intValue();
    }

    @Override
    public void k(Iterable<i> iterable) {
        if (iterable.iterator().hasNext()) {
            P0().compileStatement("DELETE FROM events WHERE _id in " + s1(iterable)).execute();
        }
    }

    @Override
    public <T> T m(b.a<T> aVar) {
        SQLiteDatabase P0 = P0();
        N0(P0);
        try {
            T a10 = aVar.a();
            P0.setTransactionSuccessful();
            return a10;
        } finally {
            P0.endTransaction();
        }
    }

    @Override
    public Iterable<i> m0(final m mVar) {
        return (Iterable) T0(new b() {
            @Override
            public final Object apply(Object obj) {
                List f12;
                f12 = b0.this.f1(mVar, (SQLiteDatabase) obj);
                return f12;
            }
        });
    }

    public final List<i> m1(SQLiteDatabase sQLiteDatabase, final m mVar) {
        final ArrayList arrayList = new ArrayList();
        Long S0 = S0(sQLiteDatabase, mVar);
        if (S0 == null) {
            return arrayList;
        }
        t1(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{S0.toString()}, null, null, null, String.valueOf(this.M.d())), new b() {
            @Override
            public final Object apply(Object obj) {
                Object g12;
                g12 = b0.this.g1(arrayList, mVar, (Cursor) obj);
                return g12;
            }
        });
        return arrayList;
    }

    public final Map<Long, Set<c>> n1(SQLiteDatabase sQLiteDatabase, List<i> list) {
        final HashMap hashMap = new HashMap();
        StringBuilder sb2 = new StringBuilder("event_id IN (");
        for (int i10 = 0; i10 < list.size(); i10++) {
            sb2.append(list.get(i10).c());
            if (i10 < list.size() - 1) {
                sb2.append(',');
            }
        }
        sb2.append(')');
        t1(sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb2.toString(), null, null, null, null), new b() {
            @Override
            public final Object apply(Object obj) {
                Object h12;
                h12 = b0.h1(hashMap, (Cursor) obj);
                return h12;
            }
        });
        return hashMap;
    }

    @Override
    public boolean o0(final m mVar) {
        return ((Boolean) T0(new b() {
            @Override
            public final Object apply(Object obj) {
                Boolean c12;
                c12 = b0.this.c1(mVar, (SQLiteDatabase) obj);
                return c12;
            }
        })).booleanValue();
    }

    public final byte[] p1(long j10) {
        return (byte[]) t1(P0().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j10)}, null, null, "sequence_num"), z.f13987a);
    }

    public final <T> T q1(d<T> dVar, b<Throwable, T> bVar) {
        long a10 = this.f13943c.a();
        while (true) {
            try {
                return dVar.a();
            } catch (SQLiteDatabaseLockedException e10) {
                if (this.f13943c.a() >= this.M.b() + a10) {
                    return bVar.apply(e10);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    @Override
    public void r0(Iterable<i> iterable) {
        if (iterable.iterator().hasNext()) {
            final String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + s1(iterable);
            T0(new b() {
                @Override
                public final Object apply(Object obj) {
                    Object k12;
                    k12 = b0.k1(str, (SQLiteDatabase) obj);
                    return k12;
                }
            });
        }
    }

    @Override
    public long x(m mVar) {
        return ((Long) t1(P0().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{mVar.b(), String.valueOf(l3.a.a(mVar.d()))}), l.f13966a)).longValue();
    }
}
