package p350yd;

import gd.C4779t2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.drinkless.p210td.libcore.telegram.Client;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import p139jb.AbstractC5912d;
import p139jb.AbstractC5918j;
import p139jb.AbstractC5920l;
import p181mb.C6813d;

public class C10691gc {
    public final C10930q6 f34215a;
    public final String f34216b;
    public long f34217c;

    public C10691gc(C10930q6 q6Var, String str) {
        this.f34215a = q6Var;
        this.f34216b = str;
    }

    public void m4262l(long j, AbstractC5918j jVar, List list) {
        this.f34215a.m2190w4(j, null, false);
        jVar.mo1330a(list);
        this.f34215a.m2866F4();
    }

    public void m4261m(final AbstractC5918j jVar, final long j) {
        if (j == 0) {
            jVar.mo1330a(null);
            return;
        }
        this.f34215a.m2928B6();
        this.f34215a.m2136za(j, null);
        this.f34215a.m2461f5(j, null, new TdApi.SearchMessagesFilterDocument(), new AbstractC5918j() {
            @Override
            public final void mo1330a(Object obj) {
                C10691gc.this.m4262l(j, jVar, (List) obj);
            }
        });
    }

    public static void m4260n(AbstractC5912d dVar, AbstractC5918j jVar, List list) {
        if (dVar != null && list != null) {
            ArrayList arrayList = new ArrayList();
            Iterator it = new C6813d(list, dVar).iterator();
            while (it.hasNext()) {
                arrayList.add((TdApi.Message) it.next());
            }
            jVar.mo1330a(arrayList);
        } else if (list != null) {
            jVar.mo1330a(list);
        } else {
            jVar.mo1330a(new ArrayList());
        }
    }

    public void m4259o(long j, AbstractC5918j jVar, long j2, TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            Log.m14724e("Unable to fetch resource in @%s: %s", this.f34216b, C4779t2.m25378z5(object));
            jVar.mo1330a(null);
        } else if (constructor == -16498159) {
            TdApi.Messages messages = (TdApi.Messages) object;
            TdApi.Message[] messageArr = messages.messages;
            if (messageArr.length <= 0 || TimeUnit.SECONDS.toMillis(messageArr[0].date) <= j) {
                jVar.mo1330a(null);
            } else {
                jVar.mo1330a(messages.messages[0]);
            }
        }
        this.f34215a.m2190w4(j2, null, false);
        this.f34215a.m2866F4();
    }

    public void m4258p(final long j, String str, final long j2, final AbstractC5918j jVar) {
        this.f34215a.m2270r4().m14783o(new TdApi.SearchChatMessages(j, str, null, 0L, 0, 1, new TdApi.SearchMessagesFilterDocument(), 0L), new Client.AbstractC7865g() {
            @Override
            public final void mo255t2(TdApi.Object object) {
                C10691gc.this.m4259o(j2, jVar, j, object);
            }
        });
    }

    public void m4257q(final AbstractC5918j jVar, final String str, final long j, final long j2) {
        if (j2 == 0) {
            jVar.mo1330a(null);
            return;
        }
        this.f34215a.m2928B6();
        this.f34215a.m2940Aa(j2, null, new Runnable() {
            @Override
            public final void run() {
                C10691gc.this.m4258p(j2, str, j, jVar);
            }
        });
    }

    public void m4256r(AbstractC5920l lVar, TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            Log.m14724e("Unable to get resources channel @%s: %s", this.f34216b, C4779t2.m25378z5(object));
        } else if (constructor == -1601123095) {
            this.f34217c = ((TdApi.Chat) object).f25367id;
        }
        lVar.mo3050a(this.f34217c);
        this.f34215a.m2866F4();
    }

    public void m4255s(final AbstractC5920l lVar) {
        this.f34215a.m2928B6();
        long j = this.f34217c;
        if (j != 0) {
            lVar.mo3050a(j);
            this.f34215a.m2866F4();
            return;
        }
        this.f34215a.m2270r4().m14783o(new TdApi.SearchPublicChat(this.f34216b), new Client.AbstractC7865g() {
            @Override
            public final void mo255t2(TdApi.Object object) {
                C10691gc.this.m4256r(lVar, object);
            }
        });
    }

    public final void m4265i(final AbstractC5918j<List<TdApi.Message>> jVar) {
        m4254t(new AbstractC5920l() {
            @Override
            public final void mo3050a(long j) {
                C10691gc.this.m4261m(jVar, j);
            }
        });
    }

    public void m4264j(final AbstractC5918j<List<TdApi.Message>> jVar, final AbstractC5912d<TdApi.Message> dVar) {
        m4265i(new AbstractC5918j() {
            @Override
            public final void mo1330a(Object obj) {
                C10691gc.m4260n(AbstractC5912d.this, jVar, (List) obj);
            }
        });
    }

    public void m4263k(final AbstractC5918j<TdApi.Message> jVar, final String str, final long j) {
        m4254t(new AbstractC5920l() {
            @Override
            public final void mo3050a(long j2) {
                C10691gc.this.m4257q(jVar, str, j, j2);
            }
        });
    }

    public final void m4254t(final AbstractC5920l lVar) {
        this.f34215a.m2573Y1(new Runnable() {
            @Override
            public final void run() {
                C10691gc.this.m4255s(lVar);
            }
        });
    }
}
