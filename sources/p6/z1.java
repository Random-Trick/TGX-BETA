package p6;

import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import q6.b;
import t6.a;
import t6.y;

public final class z1 {
    public static final a f20911g = new a("ExtractorSessionStoreView");
    public final f0 f20912a;
    public final y f20913b;
    public final k1 f20914c;
    public final y f20915d;
    public final Map f20916e = new HashMap();
    public final ReentrantLock f20917f = new ReentrantLock();

    public z1(f0 f0Var, y yVar, k1 k1Var, y yVar2) {
        this.f20912a = f0Var;
        this.f20913b = yVar;
        this.f20914c = k1Var;
        this.f20915d = yVar2;
    }

    public static String q(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("pack_names");
        if (stringArrayList != null && !stringArrayList.isEmpty()) {
            return stringArrayList.get(0);
        }
        throw new g1("Session without pack received.");
    }

    public static List r(List list) {
        return list == null ? Collections.emptyList() : list;
    }

    public final Boolean a(Bundle bundle) {
        int i10 = bundle.getInt("session_id");
        if (i10 == 0) {
            return Boolean.TRUE;
        }
        Map map = this.f20916e;
        Integer valueOf = Integer.valueOf(i10);
        if (!map.containsKey(valueOf)) {
            return Boolean.TRUE;
        }
        w1 w1Var = (w1) this.f20916e.get(valueOf);
        if (w1Var.f20843c.f20831d == 6) {
            return Boolean.FALSE;
        }
        return Boolean.valueOf(!e0.c(w1Var.f20843c.f20831d, bundle.getInt(b.a("status", q(bundle)))));
    }

    public final Boolean b(Bundle bundle) {
        int i10 = bundle.getInt("session_id");
        if (i10 == 0) {
            return Boolean.FALSE;
        }
        Map map = this.f20916e;
        Integer valueOf = Integer.valueOf(i10);
        boolean z10 = true;
        if (map.containsKey(valueOf)) {
            w1 o10 = o(i10);
            int i11 = bundle.getInt(b.a("status", o10.f20843c.f20828a));
            v1 v1Var = o10.f20843c;
            int i12 = v1Var.f20831d;
            if (e0.c(i12, i11)) {
                f20911g.a("Found stale update for session %s with status %d.", valueOf, Integer.valueOf(i12));
                v1 v1Var2 = o10.f20843c;
                String str = v1Var2.f20828a;
                int i13 = v1Var2.f20831d;
                if (i13 == 4) {
                    ((d4) this.f20913b.zza()).a(i10, str);
                } else if (i13 == 5) {
                    ((d4) this.f20913b.zza()).d(i10);
                } else if (i13 == 6) {
                    ((d4) this.f20913b.zza()).f(Arrays.asList(str));
                }
            } else {
                v1Var.f20831d = i11;
                if (e0.d(i11)) {
                    l(i10);
                    this.f20914c.c(o10.f20843c.f20828a);
                } else {
                    for (x1 x1Var : v1Var.f20833f) {
                        ArrayList parcelableArrayList = bundle.getParcelableArrayList(b.b("chunk_intents", o10.f20843c.f20828a, x1Var.f20854a));
                        if (parcelableArrayList != null) {
                            for (int i14 = 0; i14 < parcelableArrayList.size(); i14++) {
                                if (!(parcelableArrayList.get(i14) == null || ((Intent) parcelableArrayList.get(i14)).getData() == null)) {
                                    ((t1) x1Var.f20857d.get(i14)).f20804a = true;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            String q10 = q(bundle);
            long j10 = bundle.getLong(b.a("pack_version", q10));
            String string = bundle.getString(b.a("pack_version_tag", q10), "");
            int i15 = bundle.getInt(b.a("status", q10));
            long j11 = bundle.getLong(b.a("total_bytes_to_download", q10));
            ArrayList<String> stringArrayList = bundle.getStringArrayList(b.a("slice_ids", q10));
            ArrayList arrayList = new ArrayList();
            for (String str2 : r(stringArrayList)) {
                ArrayList parcelableArrayList2 = bundle.getParcelableArrayList(b.b("chunk_intents", q10, str2));
                ArrayList arrayList2 = new ArrayList();
                for (Intent intent : r(parcelableArrayList2)) {
                    if (intent == null) {
                        z10 = false;
                    }
                    arrayList2.add(new t1(z10));
                    z10 = true;
                }
                String string2 = bundle.getString(b.b("uncompressed_hash_sha256", q10, str2));
                long j12 = bundle.getLong(b.b("uncompressed_size", q10, str2));
                int i16 = bundle.getInt(b.b("patch_format", q10, str2), 0);
                arrayList.add(i16 != 0 ? new x1(str2, string2, j12, arrayList2, 0, i16) : new x1(str2, string2, j12, arrayList2, bundle.getInt(b.b("compression_format", q10, str2), 0), 0));
                z10 = true;
            }
            this.f20916e.put(Integer.valueOf(i10), new w1(i10, bundle.getInt("app_version_code"), new v1(q10, j10, i15, j11, arrayList, string)));
        }
        return Boolean.TRUE;
    }

    public final Object c(String str, int i10, long j10) {
        w1 w1Var = (w1) s(Arrays.asList(str)).get(str);
        if (w1Var == null || e0.d(w1Var.f20843c.f20831d)) {
            f20911g.b(String.format("Could not find pack %s while trying to complete it", str), new Object[0]);
        }
        this.f20912a.d(str, i10, j10);
        w1Var.f20843c.f20831d = 4;
        return null;
    }

    public final Object d(int i10, int i11) {
        o(i10).f20843c.f20831d = 5;
        return null;
    }

    public final Object e(int i10) {
        w1 o10 = o(i10);
        v1 v1Var = o10.f20843c;
        if (e0.d(v1Var.f20831d)) {
            this.f20912a.d(v1Var.f20828a, o10.f20842b, v1Var.f20829b);
            v1 v1Var2 = o10.f20843c;
            int i11 = v1Var2.f20831d;
            if (i11 != 5 && i11 != 6) {
                return null;
            }
            this.f20912a.e(v1Var2.f20828a, o10.f20842b, v1Var2.f20829b);
            return null;
        }
        throw new g1(String.format("Could not safely delete session %d because it is not in a terminal state.", Integer.valueOf(i10)), i10);
    }

    public final Map f() {
        return this.f20916e;
    }

    public final Map g(List list) {
        HashMap hashMap = new HashMap();
        for (w1 w1Var : this.f20916e.values()) {
            String str = w1Var.f20843c.f20828a;
            if (list.contains(str)) {
                w1 w1Var2 = (w1) hashMap.get(str);
                if ((w1Var2 == null ? -1 : w1Var2.f20841a) < w1Var.f20841a) {
                    hashMap.put(str, w1Var);
                }
            }
        }
        return hashMap;
    }

    public final void h() {
        this.f20917f.lock();
    }

    public final void i(final String str, final int i10, final long j10) {
        p(new y1() {
            @Override
            public final Object zza() {
                z1.this.c(str, i10, j10);
                return null;
            }
        });
    }

    public final void j() {
        this.f20917f.unlock();
    }

    public final void k(final int i10, int i11) {
        p(new y1(i10, 5) {
            public final int f20734b;

            @Override
            public final Object zza() {
                z1.this.d(this.f20734b, 5);
                return null;
            }
        });
    }

    public final void l(final int i10) {
        p(new y1() {
            @Override
            public final Object zza() {
                z1.this.e(i10);
                return null;
            }
        });
    }

    public final boolean m(final Bundle bundle) {
        return ((Boolean) p(new y1() {
            @Override
            public final Object zza() {
                return z1.this.a(bundle);
            }
        })).booleanValue();
    }

    public final boolean n(final Bundle bundle) {
        return ((Boolean) p(new y1() {
            @Override
            public final Object zza() {
                return z1.this.b(bundle);
            }
        })).booleanValue();
    }

    public final w1 o(int i10) {
        Map map = this.f20916e;
        Integer valueOf = Integer.valueOf(i10);
        w1 w1Var = (w1) map.get(valueOf);
        if (w1Var != null) {
            return w1Var;
        }
        throw new g1(String.format("Could not find session %d while trying to get it", valueOf), i10);
    }

    public final Object p(y1 y1Var) {
        try {
            this.f20917f.lock();
            return y1Var.zza();
        } finally {
            this.f20917f.unlock();
        }
    }

    public final Map s(final List list) {
        return (Map) p(new y1() {
            @Override
            public final Object zza() {
                return z1.this.g(list);
            }
        });
    }
}
