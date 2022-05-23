package a3;

public final class b implements i7.a {
    public static final i7.a f106a = new b();

    public static final class a implements h7.e<a3.a> {
        public static final a f107a = new a();
        public static final h7.d f108b = h7.d.d("sdkVersion");
        public static final h7.d f109c = h7.d.d("model");
        public static final h7.d f110d = h7.d.d("hardware");
        public static final h7.d f111e = h7.d.d("device");
        public static final h7.d f112f = h7.d.d("product");
        public static final h7.d f113g = h7.d.d("osBuild");
        public static final h7.d f114h = h7.d.d("manufacturer");
        public static final h7.d f115i = h7.d.d("fingerprint");
        public static final h7.d f116j = h7.d.d("locale");
        public static final h7.d f117k = h7.d.d("country");
        public static final h7.d f118l = h7.d.d("mccMnc");
        public static final h7.d f119m = h7.d.d("applicationBuild");

        public void a(a3.a aVar, h7.f fVar) {
            fVar.a(f108b, aVar.m());
            fVar.a(f109c, aVar.j());
            fVar.a(f110d, aVar.f());
            fVar.a(f111e, aVar.d());
            fVar.a(f112f, aVar.l());
            fVar.a(f113g, aVar.k());
            fVar.a(f114h, aVar.h());
            fVar.a(f115i, aVar.e());
            fVar.a(f116j, aVar.g());
            fVar.a(f117k, aVar.c());
            fVar.a(f118l, aVar.i());
            fVar.a(f119m, aVar.b());
        }
    }

    public static final class C0010b implements h7.e<j> {
        public static final C0010b f120a = new C0010b();
        public static final h7.d f121b = h7.d.d("logRequest");

        public void a(j jVar, h7.f fVar) {
            fVar.a(f121b, jVar.c());
        }
    }

    public static final class c implements h7.e<k> {
        public static final c f122a = new c();
        public static final h7.d f123b = h7.d.d("clientType");
        public static final h7.d f124c = h7.d.d("androidClientInfo");

        public void a(k kVar, h7.f fVar) {
            fVar.a(f123b, kVar.c());
            fVar.a(f124c, kVar.b());
        }
    }

    public static final class d implements h7.e<l> {
        public static final d f125a = new d();
        public static final h7.d f126b = h7.d.d("eventTimeMs");
        public static final h7.d f127c = h7.d.d("eventCode");
        public static final h7.d f128d = h7.d.d("eventUptimeMs");
        public static final h7.d f129e = h7.d.d("sourceExtension");
        public static final h7.d f130f = h7.d.d("sourceExtensionJsonProto3");
        public static final h7.d f131g = h7.d.d("timezoneOffsetSeconds");
        public static final h7.d f132h = h7.d.d("networkConnectionInfo");

        public void a(l lVar, h7.f fVar) {
            fVar.b(f126b, lVar.c());
            fVar.a(f127c, lVar.b());
            fVar.b(f128d, lVar.d());
            fVar.a(f129e, lVar.f());
            fVar.a(f130f, lVar.g());
            fVar.b(f131g, lVar.h());
            fVar.a(f132h, lVar.e());
        }
    }

    public static final class e implements h7.e<m> {
        public static final e f133a = new e();
        public static final h7.d f134b = h7.d.d("requestTimeMs");
        public static final h7.d f135c = h7.d.d("requestUptimeMs");
        public static final h7.d f136d = h7.d.d("clientInfo");
        public static final h7.d f137e = h7.d.d("logSource");
        public static final h7.d f138f = h7.d.d("logSourceName");
        public static final h7.d f139g = h7.d.d("logEvent");
        public static final h7.d f140h = h7.d.d("qosTier");

        public void a(m mVar, h7.f fVar) {
            fVar.b(f134b, mVar.g());
            fVar.b(f135c, mVar.h());
            fVar.a(f136d, mVar.b());
            fVar.a(f137e, mVar.d());
            fVar.a(f138f, mVar.e());
            fVar.a(f139g, mVar.c());
            fVar.a(f140h, mVar.f());
        }
    }

    public static final class f implements h7.e<o> {
        public static final f f141a = new f();
        public static final h7.d f142b = h7.d.d("networkType");
        public static final h7.d f143c = h7.d.d("mobileSubtype");

        public void a(o oVar, h7.f fVar) {
            fVar.a(f142b, oVar.c());
            fVar.a(f143c, oVar.b());
        }
    }

    @Override
    public void a(i7.b<?> bVar) {
        C0010b bVar2 = C0010b.f120a;
        bVar.a(j.class, bVar2);
        bVar.a(a3.d.class, bVar2);
        e eVar = e.f133a;
        bVar.a(m.class, eVar);
        bVar.a(g.class, eVar);
        c cVar = c.f122a;
        bVar.a(k.class, cVar);
        bVar.a(a3.e.class, cVar);
        a aVar = a.f107a;
        bVar.a(a3.a.class, aVar);
        bVar.a(a3.c.class, aVar);
        d dVar = d.f125a;
        bVar.a(l.class, dVar);
        bVar.a(a3.f.class, dVar);
        f fVar = f.f141a;
        bVar.a(o.class, fVar);
        bVar.a(i.class, fVar);
    }
}
