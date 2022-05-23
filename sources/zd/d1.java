package zd;

import android.content.Intent;
import android.location.Location;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import ce.j0;
import gd.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import kd.x0;
import lb.d;
import oc.v0;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.service.LiveLocationService;

public class d1 implements x0.g, j0.a, d.a {
    public static final long W;
    public static final long X;
    public static final long Y;
    public static final long Z;
    public static final long f27371a0;
    public static final long f27372b0;
    public static final long f27373c0;
    public boolean M;
    public TdApi.Location Q;
    public int R;
    public boolean S;
    public long T;
    public boolean U;
    public long V;
    public boolean f27376c;
    public final lb.d<c> N = new lb.d<>(false, true, this);
    public final lb.d<a> O = new lb.d<>(false);
    public final lb.d<e> P = new lb.d<>(false);
    public final d f27374a = new d(this);
    public final x0 f27375b = new x0(j0.n(), this, false, true);

    public interface a extends e {
        void M5(o6 o6Var, TdApi.Message message);

        void Q3(ArrayList<o6> arrayList, ArrayList<ArrayList<TdApi.Message>> arrayList2);

        void f2(o6 o6Var, ArrayList<TdApi.Message> arrayList);

        void q5(boolean z10);
    }

    public static class b {
        public final TdApi.Location f27377a;
        public final int f27378b;

        public b(TdApi.Location location, int i10) {
            this.f27377a = location;
            this.f27378b = i10;
        }
    }

    public interface c extends e {
        void R2(ArrayList<o6> arrayList, ArrayList<ArrayList<TdApi.Message>> arrayList2);
    }

    public static class d extends Handler {
        public final d1 f27379a;

        public d(d1 d1Var) {
            super(Looper.getMainLooper());
            this.f27379a = d1Var;
        }

        @Override
        public void handleMessage(Message message) {
            this.f27379a.l(message);
        }
    }

    public interface e {
        void H1(TdApi.Location location, int i10);
    }

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        W = timeUnit.toMillis(10L);
        X = timeUnit.toMillis(20L);
        Y = timeUnit.toMillis(60L);
        Z = timeUnit.toMillis(10L);
        f27371a0 = timeUnit.toMillis(10L);
        f27372b0 = timeUnit.toMillis(2L);
        f27373c0 = timeUnit.toMillis(15L);
    }

    public d1(ya yaVar) {
        boolean z10 = false;
        this.f27376c = j0.F() == 0 ? true : z10;
        j0.d(this);
    }

    @Override
    public void S4(x0 x0Var, String str, Location location) {
        synchronized (this) {
            double latitude = location.getLatitude();
            double longitude = location.getLongitude();
            float accuracy = location.getAccuracy();
            int A0 = v0.A0(location);
            long uptimeMillis = SystemClock.uptimeMillis();
            TdApi.Location location2 = this.Q;
            int i10 = 0;
            if (location2 != null && !this.S && location2.latitude == latitude && location2.longitude == longitude && location2.horizontalAccuracy == accuracy && this.R == A0) {
                long j10 = this.T;
                if (j10 != 0 && uptimeMillis - j10 < f27373c0) {
                    Log.v("Ignoring live location, because it is not changed", new Object[0]);
                }
            }
            this.Q = new TdApi.Location(latitude, longitude, accuracy);
            this.R = A0;
            this.T = uptimeMillis;
            w(false);
            Log.v("Broadcasting live location", new Object[0]);
            d dVar = this.f27374a;
            if (this.M) {
                i10 = 1;
            }
            dVar.sendMessage(Message.obtain(dVar, 1, A0, i10, this.Q));
        }
    }

    @Override
    public void b(lb.d<?> dVar, boolean z10) {
        synchronized (this) {
            if (this.M != z10) {
                this.M = z10;
                Intent intent = new Intent(j0.n(), LiveLocationService.class);
                if (z10) {
                    j0.D0(intent, true, true);
                    if (this.Q == null) {
                        p(null);
                    } else {
                        u();
                    }
                    j(this.Q, this.R);
                } else {
                    j0.n().stopService(intent);
                    i();
                    j(null, 0);
                }
            }
        }
    }

    public void c(c cVar) {
        this.N.add(cVar);
    }

    public void d(a aVar) {
        this.O.add(aVar);
        synchronized (this) {
            if (this.M) {
                ArrayList<o6> arrayList = new ArrayList<>();
                ArrayList<ArrayList<TdApi.Message>> arrayList2 = new ArrayList<>();
                Iterator<c> it = this.N.iterator();
                while (it.hasNext()) {
                    it.next().R2(arrayList, arrayList2);
                }
                aVar.Q3(arrayList, arrayList2);
            }
        }
    }

    public b e(e eVar) {
        TdApi.Location location;
        int i10;
        this.P.add(eVar);
        synchronized (this) {
            if (this.M) {
                location = this.Q;
                i10 = this.R;
            } else {
                i10 = 0;
                location = null;
            }
        }
        if (location != null) {
            return new b(location, i10);
        }
        return null;
    }

    @Override
    public void f(int i10) {
        synchronized (this) {
            boolean z10 = i10 == 0;
            if (this.f27376c != z10) {
                this.f27376c = z10;
                u();
            }
        }
    }

    public String g(ArrayList<o6> arrayList, ArrayList<ArrayList<TdApi.Message>> arrayList2, long j10) {
        Iterator<ArrayList<TdApi.Message>> it = arrayList2.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            i10 += it.next().size();
        }
        String str = null;
        if (arrayList.size() == 1) {
            str = h(arrayList.get(0), arrayList2.get(0), j10, true, null);
        }
        return str == null ? w.o2(R.string.SharingWithXChats, i10) : str;
    }

    public String h(o6 o6Var, ArrayList<TdApi.Message> arrayList, long j10, boolean z10, TdApi.Location location) {
        if (o6Var == null) {
            return null;
        }
        if (j10 != 0) {
            TdApi.Message f02 = o6Var.e2().f0(j10);
            if (f02 == null) {
                return null;
            }
            if (!z10 && arrayList.size() == 2) {
                TdApi.Message message = arrayList.get(0);
                if (message.isOutgoing) {
                    message = arrayList.get(1);
                }
                if (location == null) {
                    location = ((TdApi.MessageLocation) f02.content).location;
                }
                TdApi.Location location2 = ((TdApi.MessageLocation) message.content).location;
                return w.Z1(w.N2(v0.Y(location.latitude, location.longitude, location2.latitude, location2.longitude)));
            } else if (ob.a.l(j10)) {
                if (!z10) {
                    return null;
                }
                return "- " + w.i1(R.string.FromYou);
            } else if (z10) {
                return "- " + w.i1(R.string.FromYou);
            } else if (arrayList == null || arrayList.isEmpty()) {
                return null;
            } else {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(w.i1(R.string.FromYou));
                Iterator<TdApi.Message> it = arrayList.iterator();
                while (it.hasNext()) {
                    TdApi.Message next = it.next();
                    if (!next.isOutgoing) {
                        arrayList2.add(o6Var.Bb(next, true, false));
                        if (arrayList2.size() >= 3) {
                            break;
                        }
                    }
                }
                if (arrayList2.size() <= 1) {
                    return null;
                }
                if (arrayList2.size() >= 3) {
                    return "- " + w.j1(R.string.SharingYouAndOtherName, w.o2(R.string.xMembers, arrayList2.size() - 1));
                }
                return "- " + TextUtils.join(w.m0(), arrayList2);
            }
        } else if (arrayList == null || arrayList.isEmpty()) {
            return null;
        } else {
            if (arrayList.size() != 1) {
                return w.o2(R.string.SharingWithXChats, arrayList.size());
            }
            TdApi.Message message2 = arrayList.get(0);
            if (!ob.a.l(message2.chatId)) {
                return w.j1(R.string.AttachLiveLocationIsSharing, o6Var.U3(message2.chatId));
            }
            TdApi.User e42 = o6Var.e4(message2.chatId);
            if (e42 != null) {
                return w.j1(R.string.SharingWithX, e42.firstName);
            }
            return null;
        }
    }

    public final void i() {
        if (this.U) {
            this.U = false;
            this.f27374a.removeMessages(0);
        }
    }

    public final void j(TdApi.Location location, int i10) {
        d dVar = this.f27374a;
        dVar.sendMessage(Message.obtain(dVar, 4, i10, 0, location));
    }

    public void k() {
        synchronized (this) {
            this.T = 0L;
            d dVar = this.f27374a;
            dVar.sendMessage(Message.obtain(dVar, 1, 0, this.M ? 1 : 0, null));
        }
    }

    public final void l(Message message) {
        boolean z10 = false;
        switch (message.what) {
            case 0:
                synchronized (this) {
                    this.U = false;
                    p(null);
                }
                return;
            case 1:
                TdApi.Location location = (TdApi.Location) message.obj;
                int i10 = message.arg1;
                if (message.arg2 == 1) {
                    z10 = true;
                }
                Iterator<c> it = this.N.iterator();
                while (it.hasNext()) {
                    it.next().H1(location, i10);
                }
                Iterator<a> it2 = this.O.iterator();
                while (it2.hasNext()) {
                    it2.next().H1(location, i10);
                }
                if (z10) {
                    Iterator<e> it3 = this.P.iterator();
                    while (it3.hasNext()) {
                        it3.next().H1(location, i10);
                    }
                    return;
                }
                return;
            case 2:
                Object[] objArr = (Object[]) message.obj;
                Iterator<a> it4 = this.O.iterator();
                while (it4.hasNext()) {
                    it4.next().f2((o6) objArr[0], (ArrayList) objArr[1]);
                }
                objArr[0] = null;
                objArr[1] = null;
                return;
            case 3:
                Iterator<a> it5 = this.O.iterator();
                while (it5.hasNext()) {
                    it5.next().f2((o6) message.obj, null);
                }
                return;
            case 4:
                TdApi.Location location2 = (TdApi.Location) message.obj;
                int i11 = message.arg1;
                Iterator<e> it6 = this.P.iterator();
                while (it6.hasNext()) {
                    it6.next().H1(location2, i11);
                }
                return;
            case 5:
                Object[] objArr2 = (Object[]) message.obj;
                Iterator<a> it7 = this.O.iterator();
                while (it7.hasNext()) {
                    it7.next().M5((o6) objArr2[0], (TdApi.Message) objArr2[1]);
                }
                objArr2[0] = null;
                objArr2[1] = null;
                return;
            case 6:
                if (message.arg1 == 1) {
                    z10 = true;
                }
                Iterator<a> it8 = this.O.iterator();
                while (it8.hasNext()) {
                    it8.next().q5(z10);
                }
                return;
            case 7:
                synchronized (this) {
                    i();
                    p(null);
                }
                return;
            default:
                return;
        }
    }

    @Override
    public void l4(x0 x0Var, int i10, String str, Location location) {
        synchronized (this) {
            w(true);
            u();
        }
    }

    public boolean m() {
        boolean z10;
        synchronized (this) {
            z10 = this.S && this.M;
        }
        return z10;
    }

    public void n(o6 o6Var, ArrayList<TdApi.Message> arrayList) {
        if (arrayList != null) {
            d dVar = this.f27374a;
            dVar.sendMessage(Message.obtain(dVar, 2, new Object[]{o6Var, arrayList}));
            return;
        }
        d dVar2 = this.f27374a;
        dVar2.sendMessage(Message.obtain(dVar2, 3, o6Var));
    }

    public void o(o6 o6Var, TdApi.Message message) {
        d dVar = this.f27374a;
        dVar.sendMessage(Message.obtain(dVar, 5, new Object[]{o6Var, message}));
    }

    public final void p(org.thunderdog.challegram.a aVar) {
        if (this.M) {
            Log.v("Performing live location worker", new Object[0]);
            i();
            this.V = SystemClock.elapsedRealtime();
            this.f27375b.s("", aVar, this.S ? X : W, aVar != null);
            u();
        }
    }

    public void q(c cVar) {
        this.N.remove(cVar);
    }

    public void r(a aVar) {
        this.O.remove(aVar);
    }

    public void s(e eVar) {
        this.P.remove(eVar);
    }

    public void t() {
        d dVar = this.f27374a;
        dVar.sendMessage(Message.obtain(dVar, 7));
    }

    public final void u() {
        i();
        if (this.M) {
            this.U = true;
            long j10 = this.S ? this.f27376c ? f27372b0 : f27371a0 : this.f27376c ? Z : Y;
            long j11 = this.V;
            if (j11 != 0) {
                j10 = (j11 + j10) - SystemClock.elapsedRealtime();
            }
            if (j10 > 0) {
                Log.v("Scheduling live location worker in %dms", Long.valueOf(j10));
                d dVar = this.f27374a;
                dVar.sendMessageDelayed(Message.obtain(dVar, 0), j10);
                return;
            }
            p(null);
        }
    }

    public void v(org.thunderdog.challegram.a aVar) {
        synchronized (this) {
            if (this.S && this.M) {
                p(aVar);
            }
        }
    }

    public final void w(boolean z10) {
        if (this.S != z10) {
            this.S = z10;
            d dVar = this.f27374a;
            dVar.sendMessage(Message.obtain(dVar, 6, z10 ? 1 : 0, 0));
        }
    }
}
