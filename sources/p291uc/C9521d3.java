package p291uc;

import be.C1379j0;
import java.util.ArrayList;
import java.util.Collections;
import org.drinkless.p210td.libcore.telegram.Client;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import p139jb.AbstractRunnableC5910b;
import p193nb.C7319d;
import p350yd.C10930q6;

public class C9521d3 {
    public final C10930q6 f30820a;
    public final AbstractC9523b f30821b;
    public int f30822c;
    public int f30823d;
    public int f30824e;
    public int f30825f;
    public long f30826g;
    public long f30827h;
    public TdApi.MessageSender f30828i;
    public boolean f30829j;
    public String f30830k;
    public String f30831l;
    public ArrayList<TdApi.Message> f30832m;
    public AbstractRunnableC5910b f30833n;

    public class C9522a extends AbstractRunnableC5910b {
        public final int f30834M;
        public final long f30835N;
        public final long f30836O;
        public final TdApi.MessageSender f30837P;
        public final boolean f30838Q;
        public final String f30839R;

        public C9522a(int i, long j, long j2, TdApi.MessageSender messageSender, boolean z, String str) {
            this.f30834M = i;
            this.f30835N = j;
            this.f30836O = j2;
            this.f30837P = messageSender;
            this.f30838Q = z;
            this.f30839R = str;
        }

        @Override
        public void mo1364b() {
            C9521d3.this.m8428q(this.f30834M, this.f30835N, this.f30836O, this.f30837P, this.f30838Q, this.f30839R, 0L, null);
        }
    }

    public interface AbstractC9523b {
        void mo7727a();

        void mo7718c();

        void mo7713d();

        void mo7708e(int i, int i2, C7319d dVar);
    }

    public C9521d3(C10930q6 q6Var, AbstractC9523b bVar) {
        this.f30820a = q6Var;
        this.f30821b = bVar;
    }

    public void m8436i(int i, long j, boolean z, TdApi.Object object) {
        int constructor = object.getConstructor();
        boolean z2 = true;
        if (constructor == -1679978726) {
            C1379j0.m37305t0(object);
            if (j == 0) {
                z2 = false;
            }
            m8440e(i, z2, null);
        } else if (constructor == -529809608) {
            if (j == 0) {
                z2 = false;
            }
            m8439f(i, z2, (TdApi.FoundMessages) object);
        } else if (constructor == -16498159) {
            if (j == 0) {
                z2 = false;
            }
            m8440e(i, z2, (TdApi.Messages) object);
        } else if (z) {
            Log.unexpectedTdlibResponse(object, TdApi.SearchSecretMessages.class, TdApi.FoundMessages.class);
        } else {
            Log.unexpectedTdlibResponse(object, TdApi.SearchChatMessages.class, TdApi.Messages.class);
        }
    }

    public final void m8440e(final int i, final boolean z, final TdApi.Messages messages) {
        if (this.f30822c == i) {
            C1379j0.m37337d0(new Runnable() {
                @Override
                public final void run() {
                    C9521d3.this.m8438g(i, z, messages);
                }
            });
        }
    }

    public final void m8439f(final int i, final boolean z, final TdApi.FoundMessages foundMessages) {
        if (this.f30822c == i) {
            C1379j0.m37337d0(new Runnable() {
                @Override
                public final void run() {
                    C9521d3.this.m8437h(i, z, foundMessages);
                }
            });
        }
    }

    public void m8435j(boolean z) {
        TdApi.Message message;
        if ((this.f30823d & 1) == 0) {
            int i = this.f30824e + (z ? 1 : -1);
            if (i < 0) {
                this.f30821b.mo7718c();
            } else if (i >= this.f30825f) {
                this.f30821b.mo7713d();
            } else {
                ArrayList<TdApi.Message> arrayList = this.f30832m;
                if (arrayList != null) {
                    if (i < arrayList.size()) {
                        TdApi.Message message2 = this.f30832m.get(i);
                        AbstractC9523b bVar = this.f30821b;
                        this.f30824e = i;
                        bVar.mo7708e(i, this.f30825f, new C7319d(message2.chatId, message2.f25409id));
                        return;
                    }
                    int i2 = this.f30823d;
                    if ((i2 & 2) != 0) {
                        this.f30823d = i2 | 1;
                        this.f30821b.mo7727a();
                        if (this.f30832m.isEmpty()) {
                            message = null;
                        } else {
                            ArrayList<TdApi.Message> arrayList2 = this.f30832m;
                            message = arrayList2.get(arrayList2.size() - 1);
                        }
                        m8428q(this.f30822c, this.f30826g, this.f30827h, this.f30828i, this.f30829j, this.f30830k, message.f25409id, this.f30831l);
                    }
                }
            }
        }
    }

    public void m8434k() {
        m8430o(0L, 0L, "");
    }

    public void m8433l() {
    }

    public final void m8438g(int i, boolean z, TdApi.Messages messages) {
        if (this.f30822c == i) {
            int i2 = this.f30823d & (-2);
            this.f30823d = i2;
            if (z) {
                if (messages != null) {
                    TdApi.Message[] messageArr = messages.messages;
                    if (messageArr.length != 0) {
                        Collections.addAll(this.f30832m, messageArr);
                        AbstractC9523b bVar = this.f30821b;
                        int i3 = this.f30824e + 1;
                        this.f30824e = i3;
                        int i4 = this.f30825f;
                        TdApi.Message[] messageArr2 = messages.messages;
                        bVar.mo7708e(i3, i4, new C7319d(messageArr2[0].chatId, messageArr2[0].f25409id));
                        return;
                    }
                }
                this.f30823d = i2 & (-3);
            } else if (messages == null || messages.messages.length == 0) {
                this.f30821b.mo7708e(-3, 0, null);
            } else {
                ArrayList<TdApi.Message> arrayList = this.f30832m;
                if (arrayList == null) {
                    this.f30832m = new ArrayList<>();
                } else {
                    arrayList.clear();
                }
                Collections.addAll(this.f30832m, messages.messages);
                int size = this.f30832m.size();
                int i5 = messages.totalCount;
                if (size < i5) {
                    this.f30823d |= 2;
                }
                AbstractC9523b bVar2 = this.f30821b;
                this.f30824e = 0;
                this.f30825f = i5;
                TdApi.Message[] messageArr3 = messages.messages;
                bVar2.mo7708e(0, i5, new C7319d(messageArr3[0].chatId, messageArr3[0].f25409id));
            }
        }
    }

    public final void m8437h(int i, boolean z, TdApi.FoundMessages foundMessages) {
        if (this.f30822c == i) {
            int i2 = this.f30823d & (-2);
            this.f30823d = i2;
            if (z) {
                this.f30831l = foundMessages.nextOffset;
                TdApi.Message[] messageArr = foundMessages.messages;
                if (messageArr.length == 0) {
                    this.f30823d = i2 & (-3);
                    return;
                }
                Collections.addAll(this.f30832m, messageArr);
                AbstractC9523b bVar = this.f30821b;
                int i3 = this.f30824e + 1;
                this.f30824e = i3;
                int i4 = this.f30825f;
                TdApi.Message[] messageArr2 = foundMessages.messages;
                bVar.mo7708e(i3, i4, new C7319d(messageArr2[0].chatId, messageArr2[0].f25409id));
            } else if (foundMessages == null || foundMessages.messages.length == 0) {
                this.f30821b.mo7708e(-3, 0, null);
            } else {
                ArrayList<TdApi.Message> arrayList = this.f30832m;
                if (arrayList == null) {
                    this.f30832m = new ArrayList<>(foundMessages.messages.length);
                } else {
                    arrayList.clear();
                    this.f30832m.ensureCapacity(foundMessages.messages.length);
                }
                Collections.addAll(this.f30832m, foundMessages.messages);
                this.f30823d |= 2;
                AbstractC9523b bVar2 = this.f30821b;
                this.f30824e = 0;
                int size = this.f30832m.size();
                this.f30825f = size;
                TdApi.Message[] messageArr3 = foundMessages.messages;
                bVar2.mo7708e(0, size, new C7319d(messageArr3[0].chatId, messageArr3[0].f25409id));
            }
        }
    }

    public final int m8430o(long j, long j2, String str) {
        this.f30826g = j;
        this.f30827h = j2;
        this.f30830k = str;
        this.f30825f = 0;
        this.f30824e = 0;
        this.f30823d = 0;
        ArrayList<TdApi.Message> arrayList = this.f30832m;
        if (arrayList != null) {
            arrayList.clear();
        }
        int i = this.f30822c + 1;
        this.f30822c = i;
        return i;
    }

    public void m8429p(long j, long j2, TdApi.MessageSender messageSender, boolean z, String str) {
        int o = m8430o(j, j2, str);
        if (str.length() == 0 && messageSender == null) {
            this.f30821b.mo7708e(-1, 0, null);
            return;
        }
        this.f30829j = z;
        this.f30828i = messageSender;
        this.f30823d |= 1;
        this.f30821b.mo7708e(-2, 0, null);
        AbstractRunnableC5910b bVar = this.f30833n;
        if (bVar != null) {
            bVar.m21858c();
            this.f30833n = null;
        }
        C9522a aVar = new C9522a(o, j, j2, messageSender, z, str);
        this.f30833n = aVar;
        C1379j0.m37335e0(aVar, z ? 0L : 100L);
    }

    public final void m8428q(final int i, long j, long j2, TdApi.MessageSender messageSender, final boolean z, String str, final long j3, String str2) {
        TdApi.Function function;
        if (this.f30822c == i) {
            if (z) {
                function = new TdApi.SearchSecretMessages(j, str, str2, 20, new TdApi.SearchMessagesFilterEmpty());
            } else {
                function = new TdApi.SearchChatMessages(j, str, messageSender, j3, 0, 20, new TdApi.SearchMessagesFilterEmpty(), j2);
            }
            this.f30820a.m2270r4().m14783o(function, new Client.AbstractC7865g() {
                @Override
                public final void mo255t2(TdApi.Object object) {
                    C9521d3.this.m8436i(i, j3, z, object);
                }
            });
        }
    }
}
