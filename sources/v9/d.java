package v9;

import ia.f;
import ia.h;
import ia.q;
import ja.n;
import ja.v;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import ra.g;
import ra.k;
import ra.l;
import v9.i;
import x9.i;

public final class d {
    public static final b f24789e = new b(null);
    public final i f24790a;
    public i.b<Object> f24791b;
    public int f24792c;
    public final List<j<Object, v9.b, Object, v9.b>> f24793d;

    public static final class a<D, C extends v9.b> {
        public final List<j<?, ?, ?, ?>> f24794a;

        public a() {
            this(null, 1, null);
        }

        public a(List<? extends j<?, ?, ?, ?>> list) {
            k.e(list, "steps");
            this.f24794a = list;
        }

        public final List<j<?, ?, ?, ?>> a() {
            return this.f24794a;
        }

        public final <NewData, NewChannel extends v9.b> a<NewData, NewChannel> b(j<D, C, NewData, NewChannel> jVar) {
            k.e(jVar, "step");
            return new a<>(v.K(this.f24794a, jVar));
        }

        public a(List list, int i10, g gVar) {
            this((i10 & 1) != 0 ? n.f() : list);
        }
    }

    public static final class b {

        public static final class a extends l implements qa.a<a<q, v9.b>> {
            public static final a f24795b = new a();

            public a() {
                super(0);
            }

            public final a<q, v9.b> b() {
                return new a<>(null, 1, null);
            }
        }

        public b() {
        }

        public b(g gVar) {
            this();
        }

        public static d b(b bVar, String str, qa.a aVar, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                aVar = a.f24795b;
            }
            return bVar.a(str, aVar);
        }

        public final d a(String str, qa.a<? extends a<?, v9.b>> aVar) {
            k.e(str, "name");
            k.e(aVar, "builder");
            List<j<?, ?, ?, ?>> a10 = aVar.b().a();
            Objects.requireNonNull(a10, "null cannot be cast to non-null type kotlin.collections.List<com.otaliastudios.transcoder.internal.pipeline.AnyStep /* = com.otaliastudios.transcoder.internal.pipeline.Step<kotlin.Any, com.otaliastudios.transcoder.internal.pipeline.Channel, kotlin.Any, com.otaliastudios.transcoder.internal.pipeline.Channel> */>");
            return new d(str, a10, null);
        }
    }

    public d(String str, List<? extends j<Object, v9.b, Object, v9.b>> list) {
        this.f24793d = list;
        this.f24790a = new x9.i("Pipeline(" + str + ')');
        this.f24791b = new i.b<>(q.f14159a);
        for (h hVar : v.L(v.Y(list))) {
            ((j) hVar.a()).d(((j) hVar.b()).f());
        }
    }

    public final i<q> a() {
        x9.i iVar = this.f24790a;
        iVar.h("execute(): starting. head=" + this.f24792c + " steps=" + this.f24793d.size() + " remaining=" + (this.f24793d.size() - this.f24792c));
        int i10 = this.f24792c;
        i.b<Object> bVar = this.f24791b;
        int i11 = 0;
        for (Object obj : this.f24793d) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                n.n();
            }
            j<Object, v9.b, Object, v9.b> jVar = (j) obj;
            if (i11 >= i10) {
                bVar = b(bVar, jVar, i10 == 0 || i11 != i10);
                if (bVar == null) {
                    x9.i iVar2 = this.f24790a;
                    iVar2.h("execute(): step " + k.a(jVar) + " (#" + i11 + '/' + this.f24793d.size() + ") is waiting. headState=" + this.f24791b + " headIndex=" + this.f24792c);
                    return i.d.f24805a;
                } else if (bVar instanceof i.a) {
                    x9.i iVar3 = this.f24790a;
                    iVar3.c("execute(): EOS from " + k.a(jVar) + " (#" + i11 + '/' + this.f24793d.size() + ").");
                    this.f24791b = bVar;
                    this.f24792c = i12;
                }
            }
            i11 = i12;
        }
        if (!this.f24793d.isEmpty() && !(bVar instanceof i.a)) {
            return new i.b(q.f14159a);
        }
        return new i.a(q.f14159a);
    }

    public final i.b<Object> b(i.b<Object> bVar, j<Object, v9.b, Object, v9.b> jVar, boolean z10) {
        i<Object> i10 = jVar.i(bVar, z10);
        if (i10 instanceof i.b) {
            return (i.b) i10;
        }
        if (i10 instanceof i.c) {
            return b(bVar, jVar, false);
        }
        if (i10 instanceof i.d) {
            return null;
        }
        throw new f();
    }

    public final void c() {
        Iterator<T> it = this.f24793d.iterator();
        while (it.hasNext()) {
            ((j) it.next()).a();
        }
    }

    public d(String str, List list, g gVar) {
        this(str, list);
    }
}
