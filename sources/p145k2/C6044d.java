package p145k2;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import p071f2.AbstractC4234j;
import p160l2.AbstractC6300c;
import p160l2.C6298a;
import p160l2.C6299b;
import p160l2.C6302d;
import p160l2.C6303e;
import p160l2.C6304f;
import p160l2.C6305g;
import p160l2.C6306h;
import p198o2.C7554p;
import p243r2.AbstractC8354a;

public class C6044d implements AbstractC6300c.AbstractC6301a {
    public static final String f19254d = AbstractC4234j.m28362f("WorkConstraintsTracker");
    public final AbstractC6043c f19255a;
    public final AbstractC6300c<?>[] f19256b;
    public final Object f19257c = new Object();

    public C6044d(Context context, AbstractC8354a aVar, AbstractC6043c cVar) {
        Context applicationContext = context.getApplicationContext();
        this.f19255a = cVar;
        this.f19256b = new AbstractC6300c[]{new C6298a(applicationContext, aVar), new C6299b(applicationContext, aVar), new C6306h(applicationContext, aVar), new C6302d(applicationContext, aVar), new C6305g(applicationContext, aVar), new C6304f(applicationContext, aVar), new C6303e(applicationContext, aVar)};
    }

    @Override
    public void mo20698a(List<String> list) {
        synchronized (this.f19257c) {
            ArrayList arrayList = new ArrayList();
            for (String str : list) {
                if (m21456c(str)) {
                    AbstractC4234j.m28364c().mo28361a(f19254d, String.format("Constraints met for %s", str), new Throwable[0]);
                    arrayList.add(str);
                }
            }
            AbstractC6043c cVar = this.f19255a;
            if (cVar != null) {
                cVar.mo21457f(arrayList);
            }
        }
    }

    @Override
    public void mo20697b(List<String> list) {
        synchronized (this.f19257c) {
            AbstractC6043c cVar = this.f19255a;
            if (cVar != null) {
                cVar.mo21458b(list);
            }
        }
    }

    public boolean m21456c(String str) {
        AbstractC6300c<?>[] cVarArr;
        synchronized (this.f19257c) {
            for (AbstractC6300c<?> cVar : this.f19256b) {
                if (cVar.m20703d(str)) {
                    AbstractC4234j.m28364c().mo28361a(f19254d, String.format("Work %s constrained by %s", str, cVar.getClass().getSimpleName()), new Throwable[0]);
                    return false;
                }
            }
            return true;
        }
    }

    public void m21455d(Iterable<C7554p> iterable) {
        synchronized (this.f19257c) {
            for (AbstractC6300c<?> cVar : this.f19256b) {
                cVar.m20700g(null);
            }
            for (AbstractC6300c<?> cVar2 : this.f19256b) {
                cVar2.m20702e(iterable);
            }
            for (AbstractC6300c<?> cVar3 : this.f19256b) {
                cVar3.m20700g(this);
            }
        }
    }

    public void m21454e() {
        synchronized (this.f19257c) {
            for (AbstractC6300c<?> cVar : this.f19256b) {
                cVar.m20701f();
            }
        }
    }
}
