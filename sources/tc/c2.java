package tc;

import android.location.Location;
import android.location.LocationManager;
import android.os.Build;
import ce.j0;
import ie.k;
import java.util.ArrayList;
import java.util.List;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import tc.c2;
import zd.hj;
import zd.o6;

public class c2 {
    public static c2 f23068b;
    public final LocationManager f23069a;

    public class a extends k {
        public final TdApi.Location M;
        public final String N;
        public final b O;
        public final Location P;
        public final o6 f23070b;
        public final long f23071c;

        public a(o6 o6Var, long j10, TdApi.Location location, String str, b bVar, Location location2) {
            this.f23070b = o6Var;
            this.f23071c = j10;
            this.M = location;
            this.N = str;
            this.O = bVar;
            this.P = location2;
        }

        public void f(b bVar, Location location, TdApi.InlineQueryResults inlineQueryResults, List list) {
            bVar.h4(this, location, inlineQueryResults.inlineQueryId, list, inlineQueryResults.nextOffset);
        }

        public void g(b bVar, Location location, TdApi.Object object) {
            bVar.t3(this, location, (TdApi.Error) object);
        }

        @Override
        public void c(final TdApi.Object object) {
            TdApi.InlineQueryResult[] inlineQueryResultArr;
            int constructor = object.getConstructor();
            if (constructor == -1679978726) {
                hj hd2 = this.f23070b.hd();
                final b bVar = this.O;
                final Location location = this.P;
                hd2.post(new Runnable() {
                    @Override
                    public final void run() {
                        c2.a.this.g(bVar, location, object);
                    }
                });
            } else if (constructor == -1601123095) {
                this.f23070b.v4().o(new TdApi.GetInlineQueryResults(ob.a.q(((TdApi.Chat) object).f19908id), this.f23071c, this.M, this.N, null), this);
            } else if (constructor == 1000709656) {
                final TdApi.InlineQueryResults inlineQueryResults = (TdApi.InlineQueryResults) object;
                final ArrayList arrayList = new ArrayList(inlineQueryResults.results.length);
                for (TdApi.InlineQueryResult inlineQueryResult : inlineQueryResults.results) {
                    if (inlineQueryResult.getConstructor() == 1281036382) {
                        arrayList.add(new z1(this.f23070b, (TdApi.InlineQueryResultVenue) inlineQueryResult, this.M));
                    }
                }
                hj hd3 = this.f23070b.hd();
                final b bVar2 = this.O;
                final Location location2 = this.P;
                hd3.post(new Runnable() {
                    @Override
                    public final void run() {
                        c2.a.this.f(bVar2, location2, inlineQueryResults, arrayList);
                    }
                });
            }
        }
    }

    public interface b {
        void h4(k kVar, Location location, long j10, List<z1> list, String str);

        void t3(k kVar, Location location, TdApi.Error error);
    }

    public c2() {
        LocationManager locationManager;
        try {
            locationManager = (LocationManager) j0.n().getSystemService("location");
        } catch (Throwable th) {
            Log.e("LocationService is unavailable", th, new Object[0]);
            locationManager = null;
        }
        this.f23069a = locationManager;
    }

    public static k a(o6 o6Var, long j10, Location location, String str, b bVar) {
        if (bVar != null) {
            a aVar = new a(o6Var, j10, new TdApi.Location(location.getLatitude(), location.getLongitude(), location.getAccuracy()), str, bVar, location);
            o6Var.v4().o(new TdApi.SearchPublicChat(o6Var.n6()), aVar);
            return aVar;
        }
        throw new IllegalArgumentException();
    }

    public static c2 c() {
        if (f23068b == null) {
            f23068b = new c2();
        }
        return f23068b;
    }

    public Location b() {
        if (this.f23069a == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 23 && j0.n().checkSelfPermission("android.permission.ACCESS_FINE_LOCATION") != 0) {
            return null;
        }
        List<String> providers = this.f23069a.getProviders(true);
        for (int size = providers.size() - 1; size >= 0; size--) {
            Location lastKnownLocation = this.f23069a.getLastKnownLocation(providers.get(size));
            if (lastKnownLocation != null) {
                return new Location(lastKnownLocation);
            }
        }
        return null;
    }
}
