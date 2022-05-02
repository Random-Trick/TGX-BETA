package p202o6;

import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import p219p6.C8054b;
import p262s6.AbstractC8689y;
import p262s6.C8646a;

public final class C7789z1 {
    public static final C8646a f24963g = new C8646a("ExtractorSessionStoreView");
    public final C7688f0 f24964a;
    public final AbstractC8689y f24965b;
    public final C7714k1 f24966c;
    public final AbstractC8689y f24967d;
    public final Map f24968e = new HashMap();
    public final ReentrantLock f24969f = new ReentrantLock();

    public C7789z1(C7688f0 f0Var, AbstractC8689y yVar, C7714k1 k1Var, AbstractC8689y yVar2) {
        this.f24964a = f0Var;
        this.f24965b = yVar;
        this.f24966c = k1Var;
        this.f24967d = yVar2;
    }

    public static String m15084q(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("pack_names");
        if (stringArrayList != null && !stringArrayList.isEmpty()) {
            return stringArrayList.get(0);
        }
        throw new C7694g1("Session without pack received.");
    }

    public static List m15083r(List list) {
        return list == null ? Collections.emptyList() : list;
    }

    public final Boolean m15100a(Bundle bundle) {
        int i = bundle.getInt("session_id");
        if (i == 0) {
            return Boolean.TRUE;
        }
        Map map = this.f24968e;
        Integer valueOf = Integer.valueOf(i);
        if (!map.containsKey(valueOf)) {
            return Boolean.TRUE;
        }
        C7774w1 w1Var = (C7774w1) this.f24968e.get(valueOf);
        if (w1Var.f24891c.f24879d == 6) {
            return Boolean.FALSE;
        }
        return Boolean.valueOf(!C7682e0.m15267c(w1Var.f24891c.f24879d, bundle.getInt(C8054b.m13690a("status", m15084q(bundle)))));
    }

    public final Boolean m15099b(Bundle bundle) {
        int i = bundle.getInt("session_id");
        if (i == 0) {
            return Boolean.FALSE;
        }
        Map map = this.f24968e;
        Integer valueOf = Integer.valueOf(i);
        boolean z = true;
        if (map.containsKey(valueOf)) {
            C7774w1 o = m15086o(i);
            int i2 = bundle.getInt(C8054b.m13690a("status", o.f24891c.f24876a));
            C7769v1 v1Var = o.f24891c;
            int i3 = v1Var.f24879d;
            if (C7682e0.m15267c(i3, i2)) {
                f24963g.m11817a("Found stale update for session %s with status %d.", valueOf, Integer.valueOf(i3));
                C7769v1 v1Var2 = o.f24891c;
                String str = v1Var2.f24876a;
                int i4 = v1Var2.f24879d;
                if (i4 == 4) {
                    ((AbstractC7680d4) this.f24965b.zza()).mo15141a(i, str);
                } else if (i4 == 5) {
                    ((AbstractC7680d4) this.f24965b.zza()).mo15138d(i);
                } else if (i4 == 6) {
                    ((AbstractC7680d4) this.f24965b.zza()).mo15136f(Arrays.asList(str));
                }
            } else {
                v1Var.f24879d = i2;
                if (C7682e0.m15266d(i2)) {
                    m15089l(i);
                    this.f24966c.m15184c(o.f24891c.f24876a);
                } else {
                    for (C7779x1 x1Var : v1Var.f24881f) {
                        ArrayList parcelableArrayList = bundle.getParcelableArrayList(C8054b.m13689b("chunk_intents", o.f24891c.f24876a, x1Var.f24902a));
                        if (parcelableArrayList != null) {
                            for (int i5 = 0; i5 < parcelableArrayList.size(); i5++) {
                                if (!(parcelableArrayList.get(i5) == null || ((Intent) parcelableArrayList.get(i5)).getData() == null)) {
                                    ((C7759t1) x1Var.f24905d.get(i5)).f24852a = true;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            String q = m15084q(bundle);
            long j = bundle.getLong(C8054b.m13690a("pack_version", q));
            String string = bundle.getString(C8054b.m13690a("pack_version_tag", q), "");
            int i6 = bundle.getInt(C8054b.m13690a("status", q));
            long j2 = bundle.getLong(C8054b.m13690a("total_bytes_to_download", q));
            ArrayList<String> stringArrayList = bundle.getStringArrayList(C8054b.m13690a("slice_ids", q));
            ArrayList arrayList = new ArrayList();
            for (String str2 : m15083r(stringArrayList)) {
                ArrayList parcelableArrayList2 = bundle.getParcelableArrayList(C8054b.m13689b("chunk_intents", q, str2));
                ArrayList arrayList2 = new ArrayList();
                for (Intent intent : m15083r(parcelableArrayList2)) {
                    if (intent == null) {
                        z = false;
                    }
                    arrayList2.add(new C7759t1(z));
                    z = true;
                }
                String string2 = bundle.getString(C8054b.m13689b("uncompressed_hash_sha256", q, str2));
                long j3 = bundle.getLong(C8054b.m13689b("uncompressed_size", q, str2));
                int i7 = bundle.getInt(C8054b.m13689b("patch_format", q, str2), 0);
                arrayList.add(i7 != 0 ? new C7779x1(str2, string2, j3, arrayList2, 0, i7) : new C7779x1(str2, string2, j3, arrayList2, bundle.getInt(C8054b.m13689b("compression_format", q, str2), 0), 0));
                z = true;
            }
            this.f24968e.put(Integer.valueOf(i), new C7774w1(i, bundle.getInt("app_version_code"), new C7769v1(q, j, i6, j2, arrayList, string)));
        }
        return Boolean.TRUE;
    }

    public final Object m15098c(String str, int i, long j) {
        C7774w1 w1Var = (C7774w1) m15082s(Arrays.asList(str)).get(str);
        if (w1Var == null || C7682e0.m15266d(w1Var.f24891c.f24879d)) {
            f24963g.m11816b(String.format("Could not find pack %s while trying to complete it", str), new Object[0]);
        }
        this.f24964a.m15248d(str, i, j);
        w1Var.f24891c.f24879d = 4;
        return null;
    }

    public final Object m15097d(int i, int i2) {
        m15086o(i).f24891c.f24879d = 5;
        return null;
    }

    public final Object m15096e(int i) {
        C7774w1 o = m15086o(i);
        C7769v1 v1Var = o.f24891c;
        if (C7682e0.m15266d(v1Var.f24879d)) {
            this.f24964a.m15248d(v1Var.f24876a, o.f24890b, v1Var.f24877b);
            C7769v1 v1Var2 = o.f24891c;
            int i2 = v1Var2.f24879d;
            if (i2 != 5 && i2 != 6) {
                return null;
            }
            this.f24964a.m15247e(v1Var2.f24876a, o.f24890b, v1Var2.f24877b);
            return null;
        }
        throw new C7694g1(String.format("Could not safely delete session %d because it is not in a terminal state.", Integer.valueOf(i)), i);
    }

    public final Map m15095f() {
        return this.f24968e;
    }

    public final Map m15094g(List list) {
        HashMap hashMap = new HashMap();
        for (C7774w1 w1Var : this.f24968e.values()) {
            String str = w1Var.f24891c.f24876a;
            if (list.contains(str)) {
                C7774w1 w1Var2 = (C7774w1) hashMap.get(str);
                if ((w1Var2 == null ? -1 : w1Var2.f24889a) < w1Var.f24889a) {
                    hashMap.put(str, w1Var);
                }
            }
        }
        return hashMap;
    }

    public final void m15093h() {
        this.f24969f.lock();
    }

    public final void m15092i(final String str, final int i, final long j) {
        m15085p(new AbstractC7784y1() {
            @Override
            public final Object zza() {
                C7789z1.this.m15098c(str, i, j);
                return null;
            }
        });
    }

    public final void m15091j() {
        this.f24969f.unlock();
    }

    public final void m15090k(final int i, int i2) {
        m15085p(new AbstractC7784y1(i, 5) {
            public final int f24780b;

            @Override
            public final Object zza() {
                C7789z1.this.m15097d(this.f24780b, 5);
                return null;
            }
        });
    }

    public final void m15089l(final int i) {
        m15085p(new AbstractC7784y1() {
            @Override
            public final Object zza() {
                C7789z1.this.m15096e(i);
                return null;
            }
        });
    }

    public final boolean m15088m(final Bundle bundle) {
        return ((Boolean) m15085p(new AbstractC7784y1() {
            @Override
            public final Object zza() {
                return C7789z1.this.m15100a(bundle);
            }
        })).booleanValue();
    }

    public final boolean m15087n(final Bundle bundle) {
        return ((Boolean) m15085p(new AbstractC7784y1() {
            @Override
            public final Object zza() {
                return C7789z1.this.m15099b(bundle);
            }
        })).booleanValue();
    }

    public final C7774w1 m15086o(int i) {
        Map map = this.f24968e;
        Integer valueOf = Integer.valueOf(i);
        C7774w1 w1Var = (C7774w1) map.get(valueOf);
        if (w1Var != null) {
            return w1Var;
        }
        throw new C7694g1(String.format("Could not find session %d while trying to get it", valueOf), i);
    }

    public final Object m15085p(AbstractC7784y1 y1Var) {
        try {
            this.f24969f.lock();
            return y1Var.zza();
        } finally {
            this.f24969f.unlock();
        }
    }

    public final Map m15082s(final List list) {
        return (Map) m15085p(new AbstractC7784y1() {
            @Override
            public final Object zza() {
                return C7789z1.this.m15094g(list);
            }
        });
    }
}
