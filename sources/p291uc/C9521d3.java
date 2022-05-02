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
    public final C10930q6 f30817a;
    public final AbstractC9523b f30818b;
    public int f30819c;
    public int f30820d;
    public int f30821e;
    public int f30822f;
    public long f30823g;
    public long f30824h;
    public TdApi.MessageSender f30825i;
    public boolean f30826j;
    public String f30827k;
    public String f30828l;
    public ArrayList<TdApi.Message> f30829m;
    public AbstractRunnableC5910b f30830n;

    public class C9522a extends AbstractRunnableC5910b {
        public final int f30831M;
        public final long f30832N;
        public final long f30833O;
        public final TdApi.MessageSender f30834P;
        public final boolean f30835Q;
        public final String f30836R;

        public C9522a(int i, long j, long j2, TdApi.MessageSender messageSender, boolean z, String str) {
            this.f30831M = i;
            this.f30832N = j;
            this.f30833O = j2;
            this.f30834P = messageSender;
            this.f30835Q = z;
            this.f30836R = str;
        }

        @Override
        public void mo1364b() {
            C9521d3.this.m8428q(this.f30831M, this.f30832N, this.f30833O, this.f30834P, this.f30835Q, this.f30836R, 0L, null);
        }
    }

    public interface AbstractC9523b {
        void mo7727a();

        void mo7718c();

        void mo7713d();

        void mo7708e(int i, int i2, C7319d dVar);
    }

    public C9521d3(C10930q6 q6Var, AbstractC9523b bVar) {
        this.f30817a = q6Var;
        this.f30818b = bVar;
    }

    public void m8436i(int i, long j, boolean z, TdApi.Object object) {
        int constructor = object.getConstructor();
        boolean z2 = true;
        if (constructor == -1679978726) {
            C1379j0.m37302t0(object);
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
        if (this.f30819c == i) {
            C1379j0.m37334d0(new Runnable() {
                @Override
                public final void run() {
                    C9521d3.this.m8438g(i, z, messages);
                }
            });
        }
    }

    public final void m8439f(final int i, final boolean z, final TdApi.FoundMessages foundMessages) {
        if (this.f30819c == i) {
            C1379j0.m37334d0(new Runnable() {
                @Override
                public final void run() {
                    C9521d3.this.m8437h(i, z, foundMessages);
                }
            });
        }
    }

    public void m8435j(boolean z) {
        TdApi.Message message;
        if ((this.f30820d & 1) == 0) {
            int i = this.f30821e + (z ? 1 : -1);
            if (i < 0) {
                this.f30818b.mo7718c();
            } else if (i >= this.f30822f) {
                this.f30818b.mo7713d();
            } else {
                ArrayList<TdApi.Message> arrayList = this.f30829m;
                if (arrayList != null) {
                    if (i < arrayList.size()) {
                        TdApi.Message message2 = this.f30829m.get(i);
                        AbstractC9523b bVar = this.f30818b;
                        this.f30821e = i;
                        bVar.mo7708e(i, this.f30822f, new C7319d(message2.chatId, message2.f25406id));
                        return;
                    }
                    int i2 = this.f30820d;
                    if ((i2 & 2) != 0) {
                        this.f30820d = i2 | 1;
                        this.f30818b.mo7727a();
                        if (this.f30829m.isEmpty()) {
                            message = null;
                        } else {
                            ArrayList<TdApi.Message> arrayList2 = this.f30829m;
                            message = arrayList2.get(arrayList2.size() - 1);
                        }
                        m8428q(this.f30819c, this.f30823g, this.f30824h, this.f30825i, this.f30826j, this.f30827k, message.f25406id, this.f30828l);
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
        if (this.f30819c == i) {
            int i2 = this.f30820d & (-2);
            this.f30820d = i2;
            if (z) {
                if (messages != null) {
                    TdApi.Message[] messageArr = messages.messages;
                    if (messageArr.length != 0) {
                        Collections.addAll(this.f30829m, messageArr);
                        AbstractC9523b bVar = this.f30818b;
                        int i3 = this.f30821e + 1;
                        this.f30821e = i3;
                        int i4 = this.f30822f;
                        TdApi.Message[] messageArr2 = messages.messages;
                        bVar.mo7708e(i3, i4, new C7319d(messageArr2[0].chatId, messageArr2[0].f25406id));
                        return;
                    }
                }
                this.f30820d = i2 & (-3);
            } else if (messages == null || messages.messages.length == 0) {
                this.f30818b.mo7708e(-3, 0, null);
            } else {
                ArrayList<TdApi.Message> arrayList = this.f30829m;
                if (arrayList == null) {
                    this.f30829m = new ArrayList<>();
                } else {
                    arrayList.clear();
                }
                Collections.addAll(this.f30829m, messages.messages);
                int size = this.f30829m.size();
                int i5 = messages.totalCount;
                if (size < i5) {
                    this.f30820d |= 2;
                }
                AbstractC9523b bVar2 = this.f30818b;
                this.f30821e = 0;
                this.f30822f = i5;
                TdApi.Message[] messageArr3 = messages.messages;
                bVar2.mo7708e(0, i5, new C7319d(messageArr3[0].chatId, messageArr3[0].f25406id));
            }
        }
    }

    public final void m8437h(int i, boolean z, TdApi.FoundMessages foundMessages) {
        if (this.f30819c == i) {
            int i2 = this.f30820d & (-2);
            this.f30820d = i2;
            if (z) {
                this.f30828l = foundMessages.nextOffset;
                TdApi.Message[] messageArr = foundMessages.messages;
                if (messageArr.length == 0) {
                    this.f30820d = i2 & (-3);
                    return;
                }
                Collections.addAll(this.f30829m, messageArr);
                AbstractC9523b bVar = this.f30818b;
                int i3 = this.f30821e + 1;
                this.f30821e = i3;
                int i4 = this.f30822f;
                TdApi.Message[] messageArr2 = foundMessages.messages;
                bVar.mo7708e(i3, i4, new C7319d(messageArr2[0].chatId, messageArr2[0].f25406id));
            } else if (foundMessages == null || foundMessages.messages.length == 0) {
                this.f30818b.mo7708e(-3, 0, null);
            } else {
                ArrayList<TdApi.Message> arrayList = this.f30829m;
                if (arrayList == null) {
                    this.f30829m = new ArrayList<>(foundMessages.messages.length);
                } else {
                    arrayList.clear();
                    this.f30829m.ensureCapacity(foundMessages.messages.length);
                }
                Collections.addAll(this.f30829m, foundMessages.messages);
                this.f30820d |= 2;
                AbstractC9523b bVar2 = this.f30818b;
                this.f30821e = 0;
                int size = this.f30829m.size();
                this.f30822f = size;
                TdApi.Message[] messageArr3 = foundMessages.messages;
                bVar2.mo7708e(0, size, new C7319d(messageArr3[0].chatId, messageArr3[0].f25406id));
            }
        }
    }

    public final int m8430o(long j, long j2, String str) {
        this.f30823g = j;
        this.f30824h = j2;
        this.f30827k = str;
        this.f30822f = 0;
        this.f30821e = 0;
        this.f30820d = 0;
        ArrayList<TdApi.Message> arrayList = this.f30829m;
        if (arrayList != null) {
            arrayList.clear();
        }
        int i = this.f30819c + 1;
        this.f30819c = i;
        return i;
    }

    public void m8429p(long j, long j2, TdApi.MessageSender messageSender, boolean z, String str) {
        int o = m8430o(j, j2, str);
        if (str.length() == 0 && messageSender == null) {
            this.f30818b.mo7708e(-1, 0, null);
            return;
        }
        this.f30826j = z;
        this.f30825i = messageSender;
        this.f30820d |= 1;
        this.f30818b.mo7708e(-2, 0, null);
        AbstractRunnableC5910b bVar = this.f30830n;
        if (bVar != null) {
            bVar.m21857c();
            this.f30830n = null;
        }
        C9522a aVar = new C9522a(o, j, j2, messageSender, z, str);
        this.f30830n = aVar;
        C1379j0.m37332e0(aVar, z ? 0L : 100L);
    }

    public final void m8428q(final int i, long j, long j2, TdApi.MessageSender messageSender, final boolean z, String str, final long j3, String str2) {
        TdApi.Function function;
        if (this.f30819c == i) {
            if (z) {
                function = new TdApi.SearchSecretMessages(j, str, str2, 20, new TdApi.SearchMessagesFilterEmpty());
            } else {
                function = new TdApi.SearchChatMessages(j, str, messageSender, j3, 0, 20, new TdApi.SearchMessagesFilterEmpty(), j2);
            }
            this.f30817a.m2270r4().m14783o(function, new Client.AbstractC7865g() {
                @Override
                public final void mo255t2(TdApi.Object object) {
                    C9521d3.this.m8436i(i, j3, z, object);
                }
            });
        }
    }
}
