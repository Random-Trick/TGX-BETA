package zd;

import hd.t2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kb.d;
import kb.j;
import kb.l;
import org.drinkless.td.libcore.telegram.Client;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;

public class ec {
    public final o6 f27467a;
    public final String f27468b;
    public long f27469c;

    public ec(o6 o6Var, String str) {
        this.f27467a = o6Var;
        this.f27468b = str;
    }

    public void l(long j10, j jVar, List list) {
        this.f27467a.A4(j10, null, false);
        jVar.a(list);
        this.f27467a.J4();
    }

    public void m(final j jVar, final long j10) {
        if (j10 == 0) {
            jVar.a(null);
            return;
        }
        this.f27467a.F6();
        this.f27467a.Da(j10, null);
        this.f27467a.j5(j10, null, new TdApi.SearchMessagesFilterDocument(), new j() {
            @Override
            public final void a(Object obj) {
                ec.this.l(j10, jVar, (List) obj);
            }
        });
    }

    public static void n(d dVar, j jVar, List list) {
        if (dVar != null && list != null) {
            ArrayList arrayList = new ArrayList();
            Iterator it = new nb.d(list, dVar).iterator();
            while (it.hasNext()) {
                arrayList.add((TdApi.Message) it.next());
            }
            jVar.a(arrayList);
        } else if (list != null) {
            jVar.a(list);
        } else {
            jVar.a(new ArrayList());
        }
    }

    public void o(long j10, j jVar, long j11, TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            Log.e("Unable to fetch resource in @%s: %s", this.f27468b, t2.z5(object));
            jVar.a(null);
        } else if (constructor == -16498159) {
            TdApi.Messages messages = (TdApi.Messages) object;
            TdApi.Message[] messageArr = messages.messages;
            if (messageArr.length <= 0 || TimeUnit.SECONDS.toMillis(messageArr[0].date) <= j10) {
                jVar.a(null);
            } else {
                jVar.a(messages.messages[0]);
            }
        }
        this.f27467a.A4(j11, null, false);
        this.f27467a.J4();
    }

    public void p(final long j10, String str, final long j11, final j jVar) {
        this.f27467a.v4().o(new TdApi.SearchChatMessages(j10, str, null, 0L, 0, 1, new TdApi.SearchMessagesFilterDocument(), 0L), new Client.g() {
            @Override
            public final void r2(TdApi.Object object) {
                ec.this.o(j11, jVar, j10, object);
            }
        });
    }

    public void q(final j jVar, final String str, final long j10, final long j11) {
        if (j11 == 0) {
            jVar.a(null);
            return;
        }
        this.f27467a.F6();
        this.f27467a.Ea(j11, null, new Runnable() {
            @Override
            public final void run() {
                ec.this.p(j11, str, j10, jVar);
            }
        });
    }

    public void r(l lVar, TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            Log.e("Unable to get resources channel @%s: %s", this.f27468b, t2.z5(object));
        } else if (constructor == -1601123095) {
            this.f27469c = ((TdApi.Chat) object).f19908id;
        }
        lVar.a(this.f27469c);
        this.f27467a.J4();
    }

    public void s(final l lVar) {
        this.f27467a.F6();
        long j10 = this.f27469c;
        if (j10 != 0) {
            lVar.a(j10);
            this.f27467a.J4();
            return;
        }
        this.f27467a.v4().o(new TdApi.SearchPublicChat(this.f27468b), new Client.g() {
            @Override
            public final void r2(TdApi.Object object) {
                ec.this.r(lVar, object);
            }
        });
    }

    public final void i(final j<List<TdApi.Message>> jVar) {
        t(new l() {
            @Override
            public final void a(long j10) {
                ec.this.m(jVar, j10);
            }
        });
    }

    public void j(final j<List<TdApi.Message>> jVar, final d<TdApi.Message> dVar) {
        i(new j() {
            @Override
            public final void a(Object obj) {
                ec.n(d.this, jVar, (List) obj);
            }
        });
    }

    public void k(final j<TdApi.Message> jVar, final String str, final long j10) {
        t(new l() {
            @Override
            public final void a(long j11) {
                ec.this.q(jVar, str, j10, j11);
            }
        });
    }

    public final void t(final l lVar) {
        this.f27467a.Y1(new Runnable() {
            @Override
            public final void run() {
                ec.this.s(lVar);
            }
        });
    }
}
