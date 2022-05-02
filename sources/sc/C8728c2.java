package sc;

import android.location.Location;
import android.location.LocationManager;
import android.os.Build;
import be.C1379j0;
import java.util.ArrayList;
import java.util.List;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import p111he.AbstractC5123k;
import p193nb.C7316a;
import p350yd.C10930q6;
import p350yd.HandlerC10770jj;
import sc.C8728c2;

public class C8728c2 {
    public static C8728c2 f28136b;
    public final LocationManager f28137a;

    public class C8729a extends AbstractC5123k {
        public final TdApi.Location f28138M;
        public final String f28139N;
        public final AbstractC8730b f28140O;
        public final Location f28141P;
        public final C10930q6 f28142b;
        public final long f28143c;

        public C8729a(C10930q6 q6Var, long j, TdApi.Location location, String str, AbstractC8730b bVar, Location location2) {
            this.f28142b = q6Var;
            this.f28143c = j;
            this.f28138M = location;
            this.f28139N = str;
            this.f28140O = bVar;
            this.f28141P = location2;
        }

        public void m11653f(AbstractC8730b bVar, Location location, TdApi.InlineQueryResults inlineQueryResults, List list) {
            bVar.mo11651M1(this, location, inlineQueryResults.inlineQueryId, list, inlineQueryResults.nextOffset);
        }

        public void m11652g(AbstractC8730b bVar, Location location, TdApi.Object object) {
            bVar.mo11650Z1(this, location, (TdApi.Error) object);
        }

        @Override
        public void mo7438c(final TdApi.Object object) {
            TdApi.InlineQueryResult[] inlineQueryResultArr;
            int constructor = object.getConstructor();
            if (constructor == -1679978726) {
                HandlerC10770jj dd = this.f28142b.m2485dd();
                final AbstractC8730b bVar = this.f28140O;
                final Location location = this.f28141P;
                dd.post(new Runnable() {
                    @Override
                    public final void run() {
                        C8728c2.C8729a.this.m11652g(bVar, location, object);
                    }
                });
            } else if (constructor == -1601123095) {
                this.f28142b.m2270r4().m14783o(new TdApi.GetInlineQueryResults(C7316a.m17044q(((TdApi.Chat) object).f25370id), this.f28143c, this.f28138M, this.f28139N, null), this);
            } else if (constructor == 1000709656) {
                final TdApi.InlineQueryResults inlineQueryResults = (TdApi.InlineQueryResults) object;
                final ArrayList arrayList = new ArrayList(inlineQueryResults.results.length);
                for (TdApi.InlineQueryResult inlineQueryResult : inlineQueryResults.results) {
                    if (inlineQueryResult.getConstructor() == 1281036382) {
                        arrayList.add(new C8862z1(this.f28142b, (TdApi.InlineQueryResultVenue) inlineQueryResult, this.f28138M));
                    }
                }
                HandlerC10770jj dd2 = this.f28142b.m2485dd();
                final AbstractC8730b bVar2 = this.f28140O;
                final Location location2 = this.f28141P;
                dd2.post(new Runnable() {
                    @Override
                    public final void run() {
                        C8728c2.C8729a.this.m11653f(bVar2, location2, inlineQueryResults, arrayList);
                    }
                });
            }
        }
    }

    public interface AbstractC8730b {
        void mo11651M1(AbstractC5123k kVar, Location location, long j, List<C8862z1> list, String str);

        void mo11650Z1(AbstractC5123k kVar, Location location, TdApi.Error error);
    }

    public C8728c2() {
        LocationManager locationManager;
        try {
            locationManager = (LocationManager) C1379j0.m37318n().getSystemService("location");
        } catch (Throwable th) {
            Log.m14725e("LocationService is unavailable", th, new Object[0]);
            locationManager = null;
        }
        this.f28137a = locationManager;
    }

    public static AbstractC5123k m11658a(C10930q6 q6Var, long j, Location location, String str, AbstractC8730b bVar) {
        if (bVar != null) {
            C8729a aVar = new C8729a(q6Var, j, new TdApi.Location(location.getLatitude(), location.getLongitude(), location.getAccuracy()), str, bVar, location);
            q6Var.m2270r4().m14783o(new TdApi.SearchPublicChat(q6Var.m2396j6()), aVar);
            return aVar;
        }
        throw new IllegalArgumentException();
    }

    public static C8728c2 m11656c() {
        if (f28136b == null) {
            f28136b = new C8728c2();
        }
        return f28136b;
    }

    public Location m11657b() {
        if (this.f28137a == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 23 && C1379j0.m37318n().checkSelfPermission("android.permission.ACCESS_FINE_LOCATION") != 0) {
            return null;
        }
        List<String> providers = this.f28137a.getProviders(true);
        for (int size = providers.size() - 1; size >= 0; size--) {
            Location lastKnownLocation = this.f28137a.getLastKnownLocation(providers.get(size));
            if (lastKnownLocation != null) {
                return new Location(lastKnownLocation);
            }
        }
        return null;
    }
}
