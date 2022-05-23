package hd;

import ce.c0;
import gd.w;
import ib.f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import zd.o6;

public class e {
    public final ArrayList<TdApi.Message> f12927a;
    public final long f12928b;

    public e(o6 o6Var, TdApi.Message message) {
        ArrayList<TdApi.Message> arrayList = new ArrayList<>();
        this.f12927a = arrayList;
        arrayList.add(message);
        this.f12928b = o6Var.i2(message);
    }

    public static String h(TdApi.Message message, boolean z10, int i10) {
        StringBuilder sb2;
        TdApi.MessageCall messageCall = (TdApi.MessageCall) message.content;
        if (z10) {
            sb2 = new StringBuilder();
        } else {
            sb2 = new StringBuilder(w.i1(t2.K0(messageCall, message.isOutgoing, false)));
        }
        if (i10 != 1) {
            sb2.append(" (");
            sb2.append(c0.f(i10));
            sb2.append(")");
        } else if (messageCall.duration != 0) {
            if (!z10) {
                sb2.append(" (");
            }
            int i11 = messageCall.duration;
            if (i11 >= 60) {
                sb2.append(w.o2(z10 ? R.string.xMinutes : R.string.xMin, Math.round(i11 / 60.0f)));
            } else {
                sb2.append(w.o2(z10 ? R.string.xSeconds : R.string.xSec, i11));
            }
            if (!z10) {
                sb2.append(")");
            }
        }
        return sb2.toString();
    }

    public static int j(TdApi.MessageCall messageCall, boolean z10) {
        return z10 ? R.drawable.baseline_call_made_18 : o(messageCall) ? R.drawable.baseline_call_missed_18 : R.drawable.baseline_call_received_18;
    }

    public static int l(TdApi.MessageCall messageCall) {
        return p(messageCall) ? R.id.theme_color_iconNegative : R.id.theme_color_iconPositive;
    }

    public static boolean o(TdApi.MessageCall messageCall) {
        return messageCall.discardReason.getConstructor() == 1680358012;
    }

    public static boolean p(TdApi.MessageCall messageCall) {
        return messageCall.discardReason.getConstructor() == 1680358012 || messageCall.discardReason.getConstructor() == -1729926094;
    }

    public static int r(TdApi.Message message, TdApi.Message message2) {
        return Integer.compare(((TdApi.MessageCall) message.content).discardReason.getConstructor(), ((TdApi.MessageCall) message2.content).discardReason.getConstructor());
    }

    public boolean b() {
        Iterator<TdApi.Message> it = this.f12927a.iterator();
        while (it.hasNext()) {
            if (!it.next().canBeDeletedForAllUsers) {
                return false;
            }
        }
        return true;
    }

    public long c() {
        return this.f12927a.get(0).chatId;
    }

    public int d() {
        return this.f12927a.get(0).date;
    }

    public long e() {
        return this.f12927a.get(0).f19946id;
    }

    public long[] f() {
        long[] jArr = new long[this.f12927a.size()];
        Iterator<TdApi.Message> it = this.f12927a.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            i10++;
            jArr[i10] = it.next().f19946id;
        }
        return jArr;
    }

    public String g() {
        StringBuilder sb2 = new StringBuilder();
        if (this.f12927a.size() > 1) {
            Collections.sort(this.f12927a, d.f12907a);
        }
        TdApi.Message message = null;
        Iterator<TdApi.Message> it = this.f12927a.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            TdApi.Message next = it.next();
            if (message == null) {
                message = next;
            } else if (((TdApi.MessageCall) next.content).discardReason.getConstructor() != ((TdApi.MessageCall) message.content).discardReason.getConstructor()) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                TdApi.MessageCall messageCall = (TdApi.MessageCall) message.content;
                sb2.append(w.i1(t2.K0(messageCall, message.isOutgoing, false)));
                if (i10 != 1) {
                    sb2.append(" (");
                    sb2.append(c0.f(i10));
                    sb2.append(")");
                } else {
                    int i11 = messageCall.duration;
                    if (i11 != 0) {
                        sb2.append(w.j0(i11));
                    }
                }
                message = next;
                i10 = 0;
            }
            i10++;
        }
        if (i10 > 0) {
            if (sb2.length() > 0) {
                sb2.append(", ");
            }
            TdApi.MessageCall messageCall2 = (TdApi.MessageCall) message.content;
            sb2.append(w.i1(t2.K0(messageCall2, message.isOutgoing, false)));
            if (i10 != 1) {
                sb2.append(" (");
                sb2.append(c0.f(i10));
                sb2.append(")");
            } else if (messageCall2.duration != 0) {
                sb2.append(" (");
                int i12 = messageCall2.duration;
                if (i12 >= 60) {
                    sb2.append(w.o2(R.string.xMin, Math.round(i12 / 60.0f)));
                } else {
                    sb2.append(w.o2(R.string.xSec, i12));
                }
                sb2.append(")");
            }
        }
        return sb2.toString();
    }

    public int i() {
        return j((TdApi.MessageCall) s().content, q());
    }

    public int k() {
        return l((TdApi.MessageCall) s().content);
    }

    public long m() {
        return this.f12928b;
    }

    public boolean n() {
        return this.f12927a.isEmpty();
    }

    public boolean q() {
        return s().isOutgoing;
    }

    public TdApi.Message s() {
        ArrayList<TdApi.Message> arrayList = this.f12927a;
        return arrayList.get(arrayList.size() - 1);
    }

    public boolean t(e eVar) {
        TdApi.Message s10 = eVar.s();
        ArrayList<TdApi.Message> arrayList = this.f12927a;
        TdApi.Message message = arrayList.get(arrayList.size() - 1);
        if (s10.chatId != message.chatId || !f.i(s10.date, message.date) || s10.isOutgoing != message.isOutgoing || message.date - s10.date > 3600) {
            return false;
        }
        TdApi.MessageCall messageCall = (TdApi.MessageCall) s10.content;
        TdApi.MessageCall messageCall2 = (TdApi.MessageCall) message.content;
        int i10 = messageCall.duration;
        if (i10 != messageCall2.duration || i10 != 0) {
            return false;
        }
        if (messageCall.discardReason.getConstructor() != messageCall2.discardReason.getConstructor() && (!t2.L2(messageCall.discardReason) || !t2.L2(messageCall2.discardReason))) {
            return false;
        }
        this.f12927a.add(s10);
        return true;
    }

    public boolean u(long j10, long j11) {
        Iterator<TdApi.Message> it = this.f12927a.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            TdApi.Message next = it.next();
            if (next.chatId == j10 && next.f19946id == j11) {
                this.f12927a.remove(i10);
                return true;
            }
            i10++;
        }
        return false;
    }
}
