package gd;

import be.C1363c0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import p082fd.C4403w;
import p108hb.C5067f;
import p350yd.C10930q6;

public class C4619e {
    public final ArrayList<TdApi.Message> f15336a;
    public final long f15337b;

    public C4619e(C10930q6 q6Var, TdApi.Message message) {
        ArrayList<TdApi.Message> arrayList = new ArrayList<>();
        this.f15336a = arrayList;
        arrayList.add(message);
        this.f15337b = q6Var.m2416i2(message);
    }

    public static String m26854h(TdApi.Message message, boolean z, int i) {
        StringBuilder sb2;
        TdApi.MessageCall messageCall = (TdApi.MessageCall) message.content;
        if (z) {
            sb2 = new StringBuilder();
        } else {
            sb2 = new StringBuilder(C4403w.m27869i1(C4779t2.m25660K0(messageCall, message.isOutgoing, false)));
        }
        if (i != 1) {
            sb2.append(" (");
            sb2.append(C1363c0.m37437f(i));
            sb2.append(")");
        } else if (messageCall.duration != 0) {
            if (!z) {
                sb2.append(" (");
            }
            int i2 = messageCall.duration;
            if (i2 >= 60) {
                sb2.append(C4403w.m27844o2(z ? R.string.xMinutes : R.string.xMin, Math.round(i2 / 60.0f)));
            } else {
                sb2.append(C4403w.m27844o2(z ? R.string.xSeconds : R.string.xSec, i2));
            }
            if (!z) {
                sb2.append(")");
            }
        }
        return sb2.toString();
    }

    public static int m26852j(TdApi.MessageCall messageCall, boolean z) {
        return z ? R.drawable.baseline_call_made_18 : m26847o(messageCall) ? R.drawable.baseline_call_missed_18 : R.drawable.baseline_call_received_18;
    }

    public static int m26850l(TdApi.MessageCall messageCall) {
        return m26846p(messageCall) ? R.id.theme_color_iconNegative : R.id.theme_color_iconPositive;
    }

    public static boolean m26847o(TdApi.MessageCall messageCall) {
        return messageCall.discardReason.getConstructor() == 1680358012;
    }

    public static boolean m26846p(TdApi.MessageCall messageCall) {
        return messageCall.discardReason.getConstructor() == 1680358012 || messageCall.discardReason.getConstructor() == -1729926094;
    }

    public static int m26844r(TdApi.Message message, TdApi.Message message2) {
        return Integer.compare(((TdApi.MessageCall) message.content).discardReason.getConstructor(), ((TdApi.MessageCall) message2.content).discardReason.getConstructor());
    }

    public boolean m26860b() {
        Iterator<TdApi.Message> it = this.f15336a.iterator();
        while (it.hasNext()) {
            if (!it.next().canBeDeletedForAllUsers) {
                return false;
            }
        }
        return true;
    }

    public long m26859c() {
        return this.f15336a.get(0).chatId;
    }

    public int m26858d() {
        return this.f15336a.get(0).date;
    }

    public long m26857e() {
        return this.f15336a.get(0).f25406id;
    }

    public long[] m26856f() {
        long[] jArr = new long[this.f15336a.size()];
        Iterator<TdApi.Message> it = this.f15336a.iterator();
        int i = 0;
        while (it.hasNext()) {
            i++;
            jArr[i] = it.next().f25406id;
        }
        return jArr;
    }

    public String m26855g() {
        StringBuilder sb2 = new StringBuilder();
        if (this.f15336a.size() > 1) {
            Collections.sort(this.f15336a, C4610d.f15302a);
        }
        TdApi.Message message = null;
        Iterator<TdApi.Message> it = this.f15336a.iterator();
        int i = 0;
        while (it.hasNext()) {
            TdApi.Message next = it.next();
            if (message == null) {
                message = next;
            } else if (((TdApi.MessageCall) next.content).discardReason.getConstructor() != ((TdApi.MessageCall) message.content).discardReason.getConstructor()) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                TdApi.MessageCall messageCall = (TdApi.MessageCall) message.content;
                sb2.append(C4403w.m27869i1(C4779t2.m25660K0(messageCall, message.isOutgoing, false)));
                if (i != 1) {
                    sb2.append(" (");
                    sb2.append(C1363c0.m37437f(i));
                    sb2.append(")");
                } else {
                    int i2 = messageCall.duration;
                    if (i2 != 0) {
                        sb2.append(C4403w.m27866j0(i2));
                    }
                }
                message = next;
                i = 0;
            }
            i++;
        }
        if (i > 0) {
            if (sb2.length() > 0) {
                sb2.append(", ");
            }
            TdApi.MessageCall messageCall2 = (TdApi.MessageCall) message.content;
            sb2.append(C4403w.m27869i1(C4779t2.m25660K0(messageCall2, message.isOutgoing, false)));
            if (i != 1) {
                sb2.append(" (");
                sb2.append(C1363c0.m37437f(i));
                sb2.append(")");
            } else if (messageCall2.duration != 0) {
                sb2.append(" (");
                int i3 = messageCall2.duration;
                if (i3 >= 60) {
                    sb2.append(C4403w.m27844o2(R.string.xMin, Math.round(i3 / 60.0f)));
                } else {
                    sb2.append(C4403w.m27844o2(R.string.xSec, i3));
                }
                sb2.append(")");
            }
        }
        return sb2.toString();
    }

    public int m26853i() {
        return m26852j((TdApi.MessageCall) m26843s().content, m26845q());
    }

    public int m26851k() {
        return m26850l((TdApi.MessageCall) m26843s().content);
    }

    public long m26849m() {
        return this.f15337b;
    }

    public boolean m26848n() {
        return this.f15336a.isEmpty();
    }

    public boolean m26845q() {
        return m26843s().isOutgoing;
    }

    public TdApi.Message m26843s() {
        ArrayList<TdApi.Message> arrayList = this.f15336a;
        return arrayList.get(arrayList.size() - 1);
    }

    public boolean m26842t(C4619e eVar) {
        TdApi.Message s = eVar.m26843s();
        ArrayList<TdApi.Message> arrayList = this.f15336a;
        TdApi.Message message = arrayList.get(arrayList.size() - 1);
        if (s.chatId != message.chatId || !C5067f.m24111i(s.date, message.date) || s.isOutgoing != message.isOutgoing || message.date - s.date > 3600) {
            return false;
        }
        TdApi.MessageCall messageCall = (TdApi.MessageCall) s.content;
        TdApi.MessageCall messageCall2 = (TdApi.MessageCall) message.content;
        int i = messageCall.duration;
        if (i != messageCall2.duration || i != 0) {
            return false;
        }
        if (messageCall.discardReason.getConstructor() != messageCall2.discardReason.getConstructor() && (!C4779t2.m25651L2(messageCall.discardReason) || !C4779t2.m25651L2(messageCall2.discardReason))) {
            return false;
        }
        this.f15336a.add(s);
        return true;
    }

    public boolean m26841u(long j, long j2) {
        Iterator<TdApi.Message> it = this.f15336a.iterator();
        int i = 0;
        while (it.hasNext()) {
            TdApi.Message next = it.next();
            if (next.chatId == j && next.f25406id == j2) {
                this.f15336a.remove(i);
                return true;
            }
            i++;
        }
        return false;
    }
}
