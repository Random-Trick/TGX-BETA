package p087g2;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import p071f2.AbstractC4234j;
import p071f2.AbstractC4239m;
import p071f2.AbstractC4249r;
import p071f2.AbstractC4253u;
import p071f2.EnumC4227d;
import p215p2.RunnableC7995b;

public class C4456g extends AbstractC4249r {
    public static final String f14734j = AbstractC4234j.m28360f("WorkContinuationImpl");
    public final C4458i f14735a;
    public final String f14736b;
    public final EnumC4227d f14737c;
    public final List<? extends AbstractC4253u> f14738d;
    public final List<String> f14739e;
    public final List<String> f14740f;
    public final List<C4456g> f14741g;
    public boolean f14742h;
    public AbstractC4239m f14743i;

    public C4456g(C4458i iVar, List<? extends AbstractC4253u> list) {
        this(iVar, null, EnumC4227d.KEEP, list, null);
    }

    public static boolean m27614i(C4456g gVar, Set<String> set) {
        set.addAll(gVar.m27620c());
        Set<String> l = m27611l(gVar);
        for (String str : set) {
            if (l.contains(str)) {
                return true;
            }
        }
        List<C4456g> e = gVar.m27618e();
        if (e != null && !e.isEmpty()) {
            for (C4456g gVar2 : e) {
                if (m27614i(gVar2, set)) {
                    return true;
                }
            }
        }
        set.removeAll(gVar.m27620c());
        return false;
    }

    public static Set<String> m27611l(C4456g gVar) {
        HashSet hashSet = new HashSet();
        List<C4456g> e = gVar.m27618e();
        if (e != null && !e.isEmpty()) {
            for (C4456g gVar2 : e) {
                hashSet.addAll(gVar2.m27620c());
            }
        }
        return hashSet;
    }

    public AbstractC4239m m27622a() {
        if (!this.f14742h) {
            RunnableC7995b bVar = new RunnableC7995b(this);
            this.f14735a.m27586t().mo12682b(bVar);
            this.f14743i = bVar.m13815d();
        } else {
            AbstractC4234j.m28362c().mo28355h(f14734j, String.format("Already enqueued work ids (%s)", TextUtils.join(", ", this.f14739e)), new Throwable[0]);
        }
        return this.f14743i;
    }

    public EnumC4227d m27621b() {
        return this.f14737c;
    }

    public List<String> m27620c() {
        return this.f14739e;
    }

    public String m27619d() {
        return this.f14736b;
    }

    public List<C4456g> m27618e() {
        return this.f14741g;
    }

    public List<? extends AbstractC4253u> m27617f() {
        return this.f14738d;
    }

    public C4458i m27616g() {
        return this.f14735a;
    }

    public boolean m27615h() {
        return m27614i(this, new HashSet());
    }

    public boolean m27613j() {
        return this.f14742h;
    }

    public void m27612k() {
        this.f14742h = true;
    }

    public C4456g(C4458i iVar, String str, EnumC4227d dVar, List<? extends AbstractC4253u> list) {
        this(iVar, str, dVar, list, null);
    }

    public C4456g(C4458i iVar, String str, EnumC4227d dVar, List<? extends AbstractC4253u> list, List<C4456g> list2) {
        this.f14735a = iVar;
        this.f14736b = str;
        this.f14737c = dVar;
        this.f14738d = list;
        this.f14741g = list2;
        this.f14739e = new ArrayList(list.size());
        this.f14740f = new ArrayList();
        if (list2 != null) {
            for (C4456g gVar : list2) {
                this.f14740f.addAll(gVar.f14740f);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            String a = list.get(i).m28344a();
            this.f14739e.add(a);
            this.f14740f.add(a);
        }
    }
}
