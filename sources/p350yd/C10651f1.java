package p350yd;

import android.content.Intent;
import android.location.Location;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import be.C1379j0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import nc.C7389v0;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.AbstractView$OnTouchListenerC7889a;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.service.LiveLocationService;
import p082fd.C4403w;
import p141jd.C5996x0;
import p154kb.C6227d;
import p193nb.C7316a;

public class C10651f1 implements C5996x0.AbstractC6003g, C1379j0.AbstractC1380a, C6227d.AbstractC6228a {
    public static final long f34097W;
    public static final long f34098X;
    public static final long f34099Y;
    public static final long f34100Z;
    public static final long f34101a0;
    public static final long f34102b0;
    public static final long f34103c0;
    public boolean f34104M;
    public TdApi.Location f34108Q;
    public int f34109R;
    public boolean f34110S;
    public long f34111T;
    public boolean f34112U;
    public long f34113V;
    public boolean f34116c;
    public final C6227d<AbstractC10654c> f34105N = new C6227d<>(false, true, this);
    public final C6227d<AbstractC10652a> f34106O = new C6227d<>(false);
    public final C6227d<AbstractC10656e> f34107P = new C6227d<>(false);
    public final HandlerC10655d f34114a = new HandlerC10655d(this);
    public final C5996x0 f34115b = new C5996x0(C1379j0.m37315n(), this, false, true);

    public interface AbstractC10652a extends AbstractC10656e {
        void mo4352Q0(C10930q6 q6Var, ArrayList<TdApi.Message> arrayList);

        void mo4351b4(ArrayList<C10930q6> arrayList, ArrayList<ArrayList<TdApi.Message>> arrayList2);

        void mo4350k1(C10930q6 q6Var, TdApi.Message message);

        void mo4349w5(boolean z);
    }

    public static class C10653b {
        public final TdApi.Location f34117a;
        public final int f34118b;

        public C10653b(TdApi.Location location, int i) {
            this.f34117a = location;
            this.f34118b = i;
        }
    }

    public interface AbstractC10654c extends AbstractC10656e {
        void mo1661b3(ArrayList<C10930q6> arrayList, ArrayList<ArrayList<TdApi.Message>> arrayList2);
    }

    public static class HandlerC10655d extends Handler {
        public final C10651f1 f34119a;

        public HandlerC10655d(C10651f1 f1Var) {
            super(Looper.getMainLooper());
            this.f34119a = f1Var;
        }

        @Override
        public void handleMessage(Message message) {
            this.f34119a.m4365l(message);
        }
    }

    public interface AbstractC10656e {
        void mo1718L1(TdApi.Location location, int i);
    }

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f34097W = timeUnit.toMillis(10L);
        f34098X = timeUnit.toMillis(20L);
        f34099Y = timeUnit.toMillis(60L);
        f34100Z = timeUnit.toMillis(10L);
        f34101a0 = timeUnit.toMillis(10L);
        f34102b0 = timeUnit.toMillis(2L);
        f34103c0 = timeUnit.toMillis(15L);
    }

    public C10651f1(C10536ab abVar) {
        boolean z = false;
        this.f34116c = C1379j0.m37364F() == 0 ? true : z;
        C1379j0.m37335d(this);
    }

    @Override
    public void mo4376V3(C5996x0 x0Var, String str, Location location) {
        synchronized (this) {
            double latitude = location.getLatitude();
            double longitude = location.getLongitude();
            float accuracy = location.getAccuracy();
            int A0 = C7389v0.m16757A0(location);
            long uptimeMillis = SystemClock.uptimeMillis();
            TdApi.Location location2 = this.f34108Q;
            int i = 0;
            if (location2 != null && !this.f34110S && location2.latitude == latitude && location2.longitude == longitude && location2.horizontalAccuracy == accuracy && this.f34109R == A0) {
                long j = this.f34111T;
                if (j != 0 && uptimeMillis - j < f34103c0) {
                    Log.m14714v("Ignoring live location, because it is not changed", new Object[0]);
                }
            }
            this.f34108Q = new TdApi.Location(latitude, longitude, accuracy);
            this.f34109R = A0;
            this.f34111T = uptimeMillis;
            m4353w(false);
            Log.m14714v("Broadcasting live location", new Object[0]);
            HandlerC10655d dVar = this.f34114a;
            if (this.f34104M) {
                i = 1;
            }
            dVar.sendMessage(Message.obtain(dVar, 1, A0, i, this.f34108Q));
        }
    }

    @Override
    public void mo4374b(C6227d<?> dVar, boolean z) {
        synchronized (this) {
            if (this.f34104M != z) {
                this.f34104M = z;
                Intent intent = new Intent(C1379j0.m37315n(), LiveLocationService.class);
                if (z) {
                    C1379j0.m37367D0(intent, true, true);
                    if (this.f34108Q == null) {
                        m4360p(null);
                    } else {
                        m4355u();
                    }
                    m4367j(this.f34108Q, this.f34109R);
                } else {
                    C1379j0.m37315n().stopService(intent);
                    m4368i();
                    m4367j(null, 0);
                }
            }
        }
    }

    public void m4373c(AbstractC10654c cVar) {
        this.f34105N.add(cVar);
    }

    public void m4372d(AbstractC10652a aVar) {
        this.f34106O.add(aVar);
        synchronized (this) {
            if (this.f34104M) {
                ArrayList<C10930q6> arrayList = new ArrayList<>();
                ArrayList<ArrayList<TdApi.Message>> arrayList2 = new ArrayList<>();
                Iterator<AbstractC10654c> it = this.f34105N.iterator();
                while (it.hasNext()) {
                    it.next().mo1661b3(arrayList, arrayList2);
                }
                aVar.mo4351b4(arrayList, arrayList2);
            }
        }
    }

    public C10653b m4371e(AbstractC10656e eVar) {
        TdApi.Location location;
        int i;
        this.f34107P.add(eVar);
        synchronized (this) {
            if (this.f34104M) {
                location = this.f34108Q;
                i = this.f34109R;
            } else {
                i = 0;
                location = null;
            }
        }
        if (location != null) {
            return new C10653b(location, i);
        }
        return null;
    }

    public String m4370f(ArrayList<C10930q6> arrayList, ArrayList<ArrayList<TdApi.Message>> arrayList2, long j) {
        Iterator<ArrayList<TdApi.Message>> it = arrayList2.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += it.next().size();
        }
        String str = null;
        if (arrayList.size() == 1) {
            str = m4369g(arrayList.get(0), arrayList2.get(0), j, true, null);
        }
        return str == null ? C4403w.m27844o2(R.string.SharingWithXChats, i) : str;
    }

    public String m4369g(C10930q6 q6Var, ArrayList<TdApi.Message> arrayList, long j, boolean z, TdApi.Location location) {
        if (q6Var == null) {
            return null;
        }
        if (j != 0) {
            TdApi.Message f0 = q6Var.m2480e2().m1648f0(j);
            if (f0 == null) {
                return null;
            }
            if (!z && arrayList.size() == 2) {
                TdApi.Message message = arrayList.get(0);
                if (message.isOutgoing) {
                    message = arrayList.get(1);
                }
                if (location == null) {
                    location = ((TdApi.MessageLocation) f0.content).location;
                }
                TdApi.Location location2 = ((TdApi.MessageLocation) message.content).location;
                return C4403w.m27909Z1(C4403w.m27956N2(C7389v0.m16664Y(location.latitude, location.longitude, location2.latitude, location2.longitude)));
            } else if (C7316a.m17049l(j)) {
                if (!z) {
                    return null;
                }
                return "- " + C4403w.m27869i1(R.string.FromYou);
            } else if (z) {
                return "- " + C4403w.m27869i1(R.string.FromYou);
            } else if (arrayList == null || arrayList.isEmpty()) {
                return null;
            } else {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(C4403w.m27869i1(R.string.FromYou));
                Iterator<TdApi.Message> it = arrayList.iterator();
                while (it.hasNext()) {
                    TdApi.Message next = it.next();
                    if (!next.isOutgoing) {
                        arrayList2.add(q6Var.m2167xb(next, true, false));
                        if (arrayList2.size() >= 3) {
                            break;
                        }
                    }
                }
                if (arrayList2.size() <= 1) {
                    return null;
                }
                if (arrayList2.size() >= 3) {
                    return "- " + C4403w.m27865j1(R.string.SharingYouAndOtherName, C4403w.m27844o2(R.string.xMembers, arrayList2.size() - 1));
                }
                return "- " + TextUtils.join(C4403w.m27854m0(), arrayList2);
            }
        } else if (arrayList == null || arrayList.isEmpty()) {
            return null;
        } else {
            if (arrayList.size() != 1) {
                return C4403w.m27844o2(R.string.SharingWithXChats, arrayList.size());
            }
            TdApi.Message message2 = arrayList.get(0);
            if (!C7316a.m17049l(message2.chatId)) {
                return C4403w.m27865j1(R.string.AttachLiveLocationIsSharing, q6Var.m2691Q3(message2.chatId));
            }
            TdApi.User a4 = q6Var.m2541a4(message2.chatId);
            if (a4 != null) {
                return C4403w.m27865j1(R.string.SharingWithX, a4.firstName);
            }
            return null;
        }
    }

    @Override
    public void mo1641h(int i) {
        synchronized (this) {
            boolean z = i == 0;
            if (this.f34116c != z) {
                this.f34116c = z;
                m4355u();
            }
        }
    }

    public final void m4368i() {
        if (this.f34112U) {
            this.f34112U = false;
            this.f34114a.removeMessages(0);
        }
    }

    public final void m4367j(TdApi.Location location, int i) {
        HandlerC10655d dVar = this.f34114a;
        dVar.sendMessage(Message.obtain(dVar, 4, i, 0, location));
    }

    public void m4366k() {
        synchronized (this) {
            this.f34111T = 0L;
            HandlerC10655d dVar = this.f34114a;
            dVar.sendMessage(Message.obtain(dVar, 1, 0, this.f34104M ? 1 : 0, null));
        }
    }

    public final void m4365l(Message message) {
        boolean z = false;
        switch (message.what) {
            case 0:
                synchronized (this) {
                    this.f34112U = false;
                    m4360p(null);
                }
                return;
            case 1:
                TdApi.Location location = (TdApi.Location) message.obj;
                int i = message.arg1;
                if (message.arg2 == 1) {
                    z = true;
                }
                Iterator<AbstractC10654c> it = this.f34105N.iterator();
                while (it.hasNext()) {
                    it.next().mo1718L1(location, i);
                }
                Iterator<AbstractC10652a> it2 = this.f34106O.iterator();
                while (it2.hasNext()) {
                    it2.next().mo1718L1(location, i);
                }
                if (z) {
                    Iterator<AbstractC10656e> it3 = this.f34107P.iterator();
                    while (it3.hasNext()) {
                        it3.next().mo1718L1(location, i);
                    }
                    return;
                }
                return;
            case 2:
                Object[] objArr = (Object[]) message.obj;
                Iterator<AbstractC10652a> it4 = this.f34106O.iterator();
                while (it4.hasNext()) {
                    it4.next().mo4352Q0((C10930q6) objArr[0], (ArrayList) objArr[1]);
                }
                objArr[0] = null;
                objArr[1] = null;
                return;
            case 3:
                Iterator<AbstractC10652a> it5 = this.f34106O.iterator();
                while (it5.hasNext()) {
                    it5.next().mo4352Q0((C10930q6) message.obj, null);
                }
                return;
            case 4:
                TdApi.Location location2 = (TdApi.Location) message.obj;
                int i2 = message.arg1;
                Iterator<AbstractC10656e> it6 = this.f34107P.iterator();
                while (it6.hasNext()) {
                    it6.next().mo1718L1(location2, i2);
                }
                return;
            case 5:
                Object[] objArr2 = (Object[]) message.obj;
                Iterator<AbstractC10652a> it7 = this.f34106O.iterator();
                while (it7.hasNext()) {
                    it7.next().mo4350k1((C10930q6) objArr2[0], (TdApi.Message) objArr2[1]);
                }
                objArr2[0] = null;
                objArr2[1] = null;
                return;
            case 6:
                if (message.arg1 == 1) {
                    z = true;
                }
                Iterator<AbstractC10652a> it8 = this.f34106O.iterator();
                while (it8.hasNext()) {
                    it8.next().mo4349w5(z);
                }
                return;
            case 7:
                synchronized (this) {
                    m4368i();
                    m4360p(null);
                }
                return;
            default:
                return;
        }
    }

    public boolean m4364m() {
        boolean z;
        synchronized (this) {
            z = this.f34110S && this.f34104M;
        }
        return z;
    }

    public void m4363n(C10930q6 q6Var, ArrayList<TdApi.Message> arrayList) {
        if (arrayList != null) {
            HandlerC10655d dVar = this.f34114a;
            dVar.sendMessage(Message.obtain(dVar, 2, new Object[]{q6Var, arrayList}));
            return;
        }
        HandlerC10655d dVar2 = this.f34114a;
        dVar2.sendMessage(Message.obtain(dVar2, 3, q6Var));
    }

    @Override
    public void mo4362n5(C5996x0 x0Var, int i, String str, Location location) {
        synchronized (this) {
            m4353w(true);
            m4355u();
        }
    }

    public void m4361o(C10930q6 q6Var, TdApi.Message message) {
        HandlerC10655d dVar = this.f34114a;
        dVar.sendMessage(Message.obtain(dVar, 5, new Object[]{q6Var, message}));
    }

    public final void m4360p(AbstractView$OnTouchListenerC7889a aVar) {
        if (this.f34104M) {
            Log.m14714v("Performing live location worker", new Object[0]);
            m4368i();
            this.f34113V = SystemClock.elapsedRealtime();
            this.f34115b.m21585s("", aVar, this.f34110S ? f34098X : f34097W, aVar != null);
            m4355u();
        }
    }

    public void m4359q(AbstractC10654c cVar) {
        this.f34105N.remove(cVar);
    }

    public void m4358r(AbstractC10652a aVar) {
        this.f34106O.remove(aVar);
    }

    public void m4357s(AbstractC10656e eVar) {
        this.f34107P.remove(eVar);
    }

    public void m4356t() {
        HandlerC10655d dVar = this.f34114a;
        dVar.sendMessage(Message.obtain(dVar, 7));
    }

    public final void m4355u() {
        m4368i();
        if (this.f34104M) {
            this.f34112U = true;
            long j = this.f34110S ? this.f34116c ? f34102b0 : f34101a0 : this.f34116c ? f34100Z : f34099Y;
            long j2 = this.f34113V;
            if (j2 != 0) {
                j = (j2 + j) - SystemClock.elapsedRealtime();
            }
            if (j > 0) {
                Log.m14714v("Scheduling live location worker in %dms", Long.valueOf(j));
                HandlerC10655d dVar = this.f34114a;
                dVar.sendMessageDelayed(Message.obtain(dVar, 0), j);
                return;
            }
            m4360p(null);
        }
    }

    public void m4354v(AbstractView$OnTouchListenerC7889a aVar) {
        synchronized (this) {
            if (this.f34110S && this.f34104M) {
                m4360p(aVar);
            }
        }
    }

    public final void m4353w(boolean z) {
        if (this.f34110S != z) {
            this.f34110S = z;
            HandlerC10655d dVar = this.f34114a;
            dVar.sendMessage(Message.obtain(dVar, 6, z ? 1 : 0, 0));
        }
    }
}
