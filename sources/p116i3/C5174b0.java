package p116i3;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
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
import p018b3.AbstractC1150h;
import p018b3.AbstractC1159m;
import p018b3.C1149g;
import p058e3.C4118a;
import p131j3.AbstractC5843b;
import p131j3.C5842a;
import p146k3.AbstractC6045a;
import p161l3.C6307a;
import p339y2.C10352b;

public class C5174b0 implements AbstractC5179c, AbstractC5843b {
    public static final C10352b f17297N = C10352b.m5368b("proto");
    public final AbstractC5181d f17298M;
    public final C5194h0 f17299a;
    public final AbstractC6045a f17300b;
    public final AbstractC6045a f17301c;

    public interface AbstractC5176b<T, U> {
        U apply(T t);
    }

    public static class C5177c {
        public final String f17302a;
        public final String f17303b;

        public C5177c(String str, String str2) {
            this.f17302a = str;
            this.f17303b = str2;
        }
    }

    public interface AbstractC5178d<T> {
        T mo23619a();
    }

    public C5174b0(AbstractC6045a aVar, AbstractC6045a aVar2, AbstractC5181d dVar, C5194h0 h0Var) {
        this.f17299a = h0Var;
        this.f17300b = aVar;
        this.f17301c = aVar2;
        this.f17298M = dVar;
    }

    public static Integer m23704W0(long j, SQLiteDatabase sQLiteDatabase) {
        return Integer.valueOf(sQLiteDatabase.delete("events", "timestamp_ms < ?", new String[]{String.valueOf(j)}));
    }

    public static Object m23702Y0(Throwable th) {
        throw new C5842a("Timed out while trying to acquire the lock.", th);
    }

    public static SQLiteDatabase m23701Z0(Throwable th) {
        throw new C5842a("Timed out while trying to open db.", th);
    }

    public static Long m23700a1(Cursor cursor) {
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return 0L;
    }

    public static Long m23699b1(Cursor cursor) {
        if (!cursor.moveToNext()) {
            return null;
        }
        return Long.valueOf(cursor.getLong(0));
    }

    public Boolean m23698c1(AbstractC1159m mVar, SQLiteDatabase sQLiteDatabase) {
        Long S0 = m23708S0(sQLiteDatabase, mVar);
        if (S0 == null) {
            return Boolean.FALSE;
        }
        return (Boolean) m23680t1(m23711P0().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{S0.toString()}), C5201m.f17330a);
    }

    public static List m23697d1(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            arrayList.add(AbstractC1159m.m38267a().mo38261b(cursor.getString(1)).mo38259d(C6307a.m20688b(cursor.getInt(2))).mo38260c(m23686o1(cursor.getString(3))).mo38262a());
        }
        return arrayList;
    }

    public static List m23696e1(SQLiteDatabase sQLiteDatabase) {
        return (List) m23680t1(sQLiteDatabase.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), C5172a0.f17293a);
    }

    public List m23695f1(AbstractC1159m mVar, SQLiteDatabase sQLiteDatabase) {
        List<AbstractC5196i> m1 = m23688m1(sQLiteDatabase, mVar);
        return m23705V0(m1, m23687n1(sQLiteDatabase, m1));
    }

    public Object m23694g1(List list, AbstractC1159m mVar, Cursor cursor) {
        while (cursor.moveToNext()) {
            boolean z = false;
            long j = cursor.getLong(0);
            if (cursor.getInt(7) != 0) {
                z = true;
            }
            AbstractC1150h.AbstractC1151a k = AbstractC1150h.m38308a().mo38287j(cursor.getString(1)).mo38288i(cursor.getLong(2)).mo38286k(cursor.getLong(3));
            if (z) {
                k.mo38289h(new C1149g(m23683r1(cursor.getString(4)), cursor.getBlob(5)));
            } else {
                k.mo38289h(new C1149g(m23683r1(cursor.getString(4)), m23685p1(j)));
            }
            if (!cursor.isNull(6)) {
                k.mo38290g(Integer.valueOf(cursor.getInt(6)));
            }
            list.add(AbstractC5196i.m23626a(j, mVar, k.mo38293d()));
        }
        return null;
    }

    public static Object m23693h1(Map map, Cursor cursor) {
        while (cursor.moveToNext()) {
            long j = cursor.getLong(0);
            Set set = (Set) map.get(Long.valueOf(j));
            if (set == null) {
                set = new HashSet();
                map.put(Long.valueOf(j), set);
            }
            set.add(new C5177c(cursor.getString(1), cursor.getString(2)));
        }
        return null;
    }

    public Long m23692i1(AbstractC1159m mVar, AbstractC1150h hVar, SQLiteDatabase sQLiteDatabase) {
        if (m23706U0()) {
            return -1L;
        }
        long O0 = m23712O0(sQLiteDatabase, mVar);
        int e = this.f17298M.mo23661e();
        byte[] a = hVar.mo38304e().m38310a();
        boolean z = a.length <= e;
        ContentValues contentValues = new ContentValues();
        contentValues.put("context_id", Long.valueOf(O0));
        contentValues.put("transport_name", hVar.mo38299j());
        contentValues.put("timestamp_ms", Long.valueOf(hVar.mo38303f()));
        contentValues.put("uptime_ms", Long.valueOf(hVar.mo38298k()));
        contentValues.put("payload_encoding", hVar.mo38304e().m38309b().m5369a());
        contentValues.put("code", hVar.mo38305d());
        contentValues.put("num_attempts", (Integer) 0);
        contentValues.put("inline", Boolean.valueOf(z));
        contentValues.put("payload", z ? a : new byte[0]);
        long insert = sQLiteDatabase.insert("events", null, contentValues);
        if (!z) {
            int ceil = (int) Math.ceil(a.length / e);
            for (int i = 1; i <= ceil; i++) {
                byte[] copyOfRange = Arrays.copyOfRange(a, (i - 1) * e, Math.min(i * e, a.length));
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("event_id", Long.valueOf(insert));
                contentValues2.put("sequence_num", Integer.valueOf(i));
                contentValues2.put("bytes", copyOfRange);
                sQLiteDatabase.insert("event_payloads", null, contentValues2);
            }
        }
        for (Map.Entry<String, String> entry : hVar.m38300i().entrySet()) {
            ContentValues contentValues3 = new ContentValues();
            contentValues3.put("event_id", Long.valueOf(insert));
            contentValues3.put("name", entry.getKey());
            contentValues3.put("value", entry.getValue());
            sQLiteDatabase.insert("event_metadata", null, contentValues3);
        }
        return Long.valueOf(insert);
    }

    public static byte[] m23691j1(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (cursor.moveToNext()) {
            byte[] blob = cursor.getBlob(0);
            arrayList.add(blob);
            i += blob.length;
        }
        byte[] bArr = new byte[i];
        int i2 = 0;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            byte[] bArr2 = (byte[]) arrayList.get(i3);
            System.arraycopy(bArr2, 0, bArr, i2, bArr2.length);
            i2 += bArr2.length;
        }
        return bArr;
    }

    public static Object m23690k1(String str, SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement(str).execute();
        sQLiteDatabase.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
        return null;
    }

    public static Object m23689l1(long j, AbstractC1159m mVar, SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(j));
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{mVar.mo38266b(), String.valueOf(C6307a.m20689a(mVar.mo38264d()))}) < 1) {
            contentValues.put("backend_name", mVar.mo38266b());
            contentValues.put("priority", Integer.valueOf(C6307a.m20689a(mVar.mo38264d())));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    public static byte[] m23686o1(String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 0);
    }

    public static C10352b m23683r1(String str) {
        if (str == null) {
            return f17297N;
        }
        return C10352b.m5368b(str);
    }

    public static String m23682s1(Iterable<AbstractC5196i> iterable) {
        StringBuilder sb2 = new StringBuilder("(");
        Iterator<AbstractC5196i> it = iterable.iterator();
        while (it.hasNext()) {
            sb2.append(it.next().mo23624c());
            if (it.hasNext()) {
                sb2.append(',');
            }
        }
        sb2.append(')');
        return sb2.toString();
    }

    public static <T> T m23680t1(Cursor cursor, AbstractC5176b<Cursor, T> bVar) {
        try {
            return bVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    @Override
    public Iterable<AbstractC1159m> mo23677E() {
        return (Iterable) m23707T0(C5202n.f17331a);
    }

    @Override
    public void mo23676F(final AbstractC1159m mVar, final long j) {
        m23707T0(new AbstractC5176b() {
            @Override
            public final Object apply(Object obj) {
                Object l1;
                l1 = C5174b0.m23689l1(j, mVar, (SQLiteDatabase) obj);
                return l1;
            }
        });
    }

    public final void m23713N0(final SQLiteDatabase sQLiteDatabase) {
        m23684q1(new AbstractC5178d() {
            @Override
            public final Object mo23619a() {
                Object beginTransaction;
                beginTransaction = sQLiteDatabase.beginTransaction();
                return beginTransaction;
            }
        }, C5204p.f17333a);
    }

    public final long m23712O0(SQLiteDatabase sQLiteDatabase, AbstractC1159m mVar) {
        Long S0 = m23708S0(sQLiteDatabase, mVar);
        if (S0 != null) {
            return S0.longValue();
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("backend_name", mVar.mo38266b());
        contentValues.put("priority", Integer.valueOf(C6307a.m20689a(mVar.mo38264d())));
        contentValues.put("next_request_ms", (Integer) 0);
        if (mVar.mo38265c() != null) {
            contentValues.put("extras", Base64.encodeToString(mVar.mo38265c(), 0));
        }
        return sQLiteDatabase.insert("transport_contexts", null, contentValues);
    }

    @Override
    public AbstractC5196i mo23675P(final AbstractC1159m mVar, final AbstractC1150h hVar) {
        C4118a.m28885b("SQLiteEventStore", "Storing event with priority=%s, name=%s for destination %s", mVar.mo38264d(), hVar.mo38299j(), mVar.mo38266b());
        long longValue = ((Long) m23707T0(new AbstractC5176b() {
            @Override
            public final Object apply(Object obj) {
                Long i1;
                i1 = C5174b0.this.m23692i1(mVar, hVar, (SQLiteDatabase) obj);
                return i1;
            }
        })).longValue();
        if (longValue < 1) {
            return null;
        }
        return AbstractC5196i.m23626a(longValue, mVar, hVar);
    }

    public SQLiteDatabase m23711P0() {
        final C5194h0 h0Var = this.f17299a;
        Objects.requireNonNull(h0Var);
        return (SQLiteDatabase) m23684q1(new AbstractC5178d() {
            @Override
            public final Object mo23619a() {
                return C5194h0.this.getWritableDatabase();
            }
        }, C5203o.f17332a);
    }

    public final long m23710Q0() {
        return m23711P0().compileStatement("PRAGMA page_count").simpleQueryForLong();
    }

    public final long m23709R0() {
        return m23711P0().compileStatement("PRAGMA page_size").simpleQueryForLong();
    }

    public final Long m23708S0(SQLiteDatabase sQLiteDatabase, AbstractC1159m mVar) {
        StringBuilder sb2 = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(mVar.mo38266b(), String.valueOf(C6307a.m20689a(mVar.mo38264d()))));
        if (mVar.mo38265c() != null) {
            sb2.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(mVar.mo38265c(), 0));
        } else {
            sb2.append(" and extras is null");
        }
        return (Long) m23680t1(sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb2.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null), C5199k.f17328a);
    }

    public <T> T m23707T0(AbstractC5176b<SQLiteDatabase, T> bVar) {
        SQLiteDatabase P0 = m23711P0();
        P0.beginTransaction();
        try {
            T apply = bVar.apply(P0);
            P0.setTransactionSuccessful();
            return apply;
        } finally {
            P0.endTransaction();
        }
    }

    public final boolean m23706U0() {
        return m23710Q0() * m23709R0() >= this.f17298M.mo23660f();
    }

    public final List<AbstractC5196i> m23705V0(List<AbstractC5196i> list, Map<Long, Set<C5177c>> map) {
        ListIterator<AbstractC5196i> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            AbstractC5196i next = listIterator.next();
            if (map.containsKey(Long.valueOf(next.mo23624c()))) {
                AbstractC1150h.AbstractC1151a l = next.mo23625b().m38297l();
                for (C5177c cVar : map.get(Long.valueOf(next.mo23624c()))) {
                    l.m38294c(cVar.f17302a, cVar.f17303b);
                }
                listIterator.set(AbstractC5196i.m23626a(next.mo23624c(), next.mo23623d(), l.mo38293d()));
            }
        }
        return list;
    }

    @Override
    public void close() {
        this.f17299a.close();
    }

    @Override
    public int mo23674f() {
        final long a = this.f17300b.mo21443a() - this.f17298M.mo23663c();
        return ((Integer) m23707T0(new AbstractC5176b() {
            @Override
            public final Object apply(Object obj) {
                Integer W0;
                W0 = C5174b0.m23704W0(a, (SQLiteDatabase) obj);
                return W0;
            }
        })).intValue();
    }

    @Override
    public void mo23673k(Iterable<AbstractC5196i> iterable) {
        if (iterable.iterator().hasNext()) {
            m23711P0().compileStatement("DELETE FROM events WHERE _id in " + m23682s1(iterable)).execute();
        }
    }

    @Override
    public <T> T mo21946m(AbstractC5843b.AbstractC5844a<T> aVar) {
        SQLiteDatabase P0 = m23711P0();
        m23713N0(P0);
        try {
            T a = aVar.mo21945a();
            P0.setTransactionSuccessful();
            return a;
        } finally {
            P0.endTransaction();
        }
    }

    @Override
    public Iterable<AbstractC5196i> mo23672m0(final AbstractC1159m mVar) {
        return (Iterable) m23707T0(new AbstractC5176b() {
            @Override
            public final Object apply(Object obj) {
                List f1;
                f1 = C5174b0.this.m23695f1(mVar, (SQLiteDatabase) obj);
                return f1;
            }
        });
    }

    public final List<AbstractC5196i> m23688m1(SQLiteDatabase sQLiteDatabase, final AbstractC1159m mVar) {
        final ArrayList arrayList = new ArrayList();
        Long S0 = m23708S0(sQLiteDatabase, mVar);
        if (S0 == null) {
            return arrayList;
        }
        m23680t1(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{S0.toString()}, null, null, null, String.valueOf(this.f17298M.mo23662d())), new AbstractC5176b() {
            @Override
            public final Object apply(Object obj) {
                Object g1;
                g1 = C5174b0.this.m23694g1(arrayList, mVar, (Cursor) obj);
                return g1;
            }
        });
        return arrayList;
    }

    public final Map<Long, Set<C5177c>> m23687n1(SQLiteDatabase sQLiteDatabase, List<AbstractC5196i> list) {
        final HashMap hashMap = new HashMap();
        StringBuilder sb2 = new StringBuilder("event_id IN (");
        for (int i = 0; i < list.size(); i++) {
            sb2.append(list.get(i).mo23624c());
            if (i < list.size() - 1) {
                sb2.append(',');
            }
        }
        sb2.append(')');
        m23680t1(sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb2.toString(), null, null, null, null), new AbstractC5176b() {
            @Override
            public final Object apply(Object obj) {
                Object h1;
                h1 = C5174b0.m23693h1(hashMap, (Cursor) obj);
                return h1;
            }
        });
        return hashMap;
    }

    @Override
    public boolean mo23671o0(final AbstractC1159m mVar) {
        return ((Boolean) m23707T0(new AbstractC5176b() {
            @Override
            public final Object apply(Object obj) {
                Boolean c1;
                c1 = C5174b0.this.m23698c1(mVar, (SQLiteDatabase) obj);
                return c1;
            }
        })).booleanValue();
    }

    public final byte[] m23685p1(long j) {
        return (byte[]) m23680t1(m23711P0().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j)}, null, null, "sequence_num"), C5214z.f17350a);
    }

    public final <T> T m23684q1(AbstractC5178d<T> dVar, AbstractC5176b<Throwable, T> bVar) {
        long a = this.f17301c.mo21443a();
        while (true) {
            try {
                return dVar.mo23619a();
            } catch (SQLiteDatabaseLockedException e) {
                if (this.f17301c.mo21443a() >= this.f17298M.mo23664b() + a) {
                    return bVar.apply(e);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    @Override
    public void mo23670r0(Iterable<AbstractC5196i> iterable) {
        if (iterable.iterator().hasNext()) {
            final String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + m23682s1(iterable);
            m23707T0(new AbstractC5176b() {
                @Override
                public final Object apply(Object obj) {
                    Object k1;
                    k1 = C5174b0.m23690k1(str, (SQLiteDatabase) obj);
                    return k1;
                }
            });
        }
    }

    @Override
    public long mo23669y(AbstractC1159m mVar) {
        return ((Long) m23680t1(m23711P0().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{mVar.mo38266b(), String.valueOf(C6307a.m20689a(mVar.mo38264d()))}), C5200l.f17329a)).longValue();
    }
}
