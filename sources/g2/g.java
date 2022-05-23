package g2;

import android.text.TextUtils;
import f2.d;
import f2.j;
import f2.m;
import f2.r;
import f2.u;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import p2.b;

public class g extends r {
    public static final String f12032j = j.f("WorkContinuationImpl");
    public final i f12033a;
    public final String f12034b;
    public final d f12035c;
    public final List<? extends u> f12036d;
    public final List<String> f12037e;
    public final List<String> f12038f;
    public final List<g> f12039g;
    public boolean f12040h;
    public m f12041i;

    public g(i iVar, List<? extends u> list) {
        this(iVar, null, d.KEEP, list, null);
    }

    public static boolean i(g gVar, Set<String> set) {
        set.addAll(gVar.c());
        Set<String> l10 = l(gVar);
        for (String str : set) {
            if (l10.contains(str)) {
                return true;
            }
        }
        List<g> e10 = gVar.e();
        if (e10 != null && !e10.isEmpty()) {
            for (g gVar2 : e10) {
                if (i(gVar2, set)) {
                    return true;
                }
            }
        }
        set.removeAll(gVar.c());
        return false;
    }

    public static Set<String> l(g gVar) {
        HashSet hashSet = new HashSet();
        List<g> e10 = gVar.e();
        if (e10 != null && !e10.isEmpty()) {
            for (g gVar2 : e10) {
                hashSet.addAll(gVar2.c());
            }
        }
        return hashSet;
    }

    public m a() {
        if (!this.f12040h) {
            b bVar = new b(this);
            this.f12033a.t().b(bVar);
            this.f12041i = bVar.d();
        } else {
            j.c().h(f12032j, String.format("Already enqueued work ids (%s)", TextUtils.join(", ", this.f12037e)), new Throwable[0]);
        }
        return this.f12041i;
    }

    public d b() {
        return this.f12035c;
    }

    public List<String> c() {
        return this.f12037e;
    }

    public String d() {
        return this.f12034b;
    }

    public List<g> e() {
        return this.f12039g;
    }

    public List<? extends u> f() {
        return this.f12036d;
    }

    public i g() {
        return this.f12033a;
    }

    public boolean h() {
        return i(this, new HashSet());
    }

    public boolean j() {
        return this.f12040h;
    }

    public void k() {
        this.f12040h = true;
    }

    public g(i iVar, String str, d dVar, List<? extends u> list) {
        this(iVar, str, dVar, list, null);
    }

    public g(i iVar, String str, d dVar, List<? extends u> list, List<g> list2) {
        this.f12033a = iVar;
        this.f12034b = str;
        this.f12035c = dVar;
        this.f12036d = list;
        this.f12039g = list2;
        this.f12037e = new ArrayList(list.size());
        this.f12038f = new ArrayList();
        if (list2 != null) {
            for (g gVar : list2) {
                this.f12038f.addAll(gVar.f12038f);
            }
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            String a10 = list.get(i10).a();
            this.f12037e.add(a10);
            this.f12038f.add(a10);
        }
    }
}
