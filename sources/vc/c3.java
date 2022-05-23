package vc;

import ce.j0;
import java.util.ArrayList;
import java.util.Collections;
import ob.d;
import org.drinkless.td.libcore.telegram.Client;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import zd.o6;

public class c3 {
    public final o6 f24860a;
    public final b f24861b;
    public int f24862c;
    public int f24863d;
    public int f24864e;
    public int f24865f;
    public long f24866g;
    public long f24867h;
    public TdApi.MessageSender f24868i;
    public boolean f24869j;
    public String f24870k;
    public String f24871l;
    public ArrayList<TdApi.Message> f24872m;
    public kb.b f24873n;

    public class a extends kb.b {
        public final int M;
        public final long N;
        public final long O;
        public final TdApi.MessageSender P;
        public final boolean Q;
        public final String R;

        public a(int i10, long j10, long j11, TdApi.MessageSender messageSender, boolean z10, String str) {
            this.M = i10;
            this.N = j10;
            this.O = j11;
            this.P = messageSender;
            this.Q = z10;
            this.R = str;
        }

        @Override
        public void b() {
            c3.this.q(this.M, this.N, this.O, this.P, this.Q, this.R, 0L, null);
        }
    }

    public interface b {
        void a();

        void c();

        void d();

        void g(int i10, int i11, d dVar);
    }

    public c3(o6 o6Var, b bVar) {
        this.f24860a = o6Var;
        this.f24861b = bVar;
    }

    public void i(int i10, long j10, boolean z10, TdApi.Object object) {
        int constructor = object.getConstructor();
        boolean z11 = true;
        if (constructor == -1679978726) {
            j0.t0(object);
            if (j10 == 0) {
                z11 = false;
            }
            e(i10, z11, null);
        } else if (constructor == -529809608) {
            if (j10 == 0) {
                z11 = false;
            }
            f(i10, z11, (TdApi.FoundMessages) object);
        } else if (constructor == -16498159) {
            if (j10 == 0) {
                z11 = false;
            }
            e(i10, z11, (TdApi.Messages) object);
        } else if (z10) {
            Log.unexpectedTdlibResponse(object, TdApi.SearchSecretMessages.class, TdApi.FoundMessages.class);
        } else {
            Log.unexpectedTdlibResponse(object, TdApi.SearchChatMessages.class, TdApi.Messages.class);
        }
    }

    public final void e(final int i10, final boolean z10, final TdApi.Messages messages) {
        if (this.f24862c == i10) {
            j0.d0(new Runnable() {
                @Override
                public final void run() {
                    c3.this.g(i10, z10, messages);
                }
            });
        }
    }

    public final void f(final int i10, final boolean z10, final TdApi.FoundMessages foundMessages) {
        if (this.f24862c == i10) {
            j0.d0(new Runnable() {
                @Override
                public final void run() {
                    c3.this.h(i10, z10, foundMessages);
                }
            });
        }
    }

    public void j(boolean z10) {
        TdApi.Message message;
        if ((this.f24863d & 1) == 0) {
            int i10 = this.f24864e + (z10 ? 1 : -1);
            if (i10 < 0) {
                this.f24861b.c();
            } else if (i10 >= this.f24865f) {
                this.f24861b.d();
            } else {
                ArrayList<TdApi.Message> arrayList = this.f24872m;
                if (arrayList != null) {
                    if (i10 < arrayList.size()) {
                        TdApi.Message message2 = this.f24872m.get(i10);
                        b bVar = this.f24861b;
                        this.f24864e = i10;
                        bVar.g(i10, this.f24865f, new d(message2.chatId, message2.f19946id));
                        return;
                    }
                    int i11 = this.f24863d;
                    if ((i11 & 2) != 0) {
                        this.f24863d = i11 | 1;
                        this.f24861b.a();
                        if (this.f24872m.isEmpty()) {
                            message = null;
                        } else {
                            ArrayList<TdApi.Message> arrayList2 = this.f24872m;
                            message = arrayList2.get(arrayList2.size() - 1);
                        }
                        q(this.f24862c, this.f24866g, this.f24867h, this.f24868i, this.f24869j, this.f24870k, message.f19946id, this.f24871l);
                    }
                }
            }
        }
    }

    public void k() {
        o(0L, 0L, "");
    }

    public void l() {
    }

    public final void g(int i10, boolean z10, TdApi.Messages messages) {
        if (this.f24862c == i10) {
            int i11 = this.f24863d & (-2);
            this.f24863d = i11;
            if (z10) {
                if (messages != null) {
                    TdApi.Message[] messageArr = messages.messages;
                    if (messageArr.length != 0) {
                        Collections.addAll(this.f24872m, messageArr);
                        b bVar = this.f24861b;
                        int i12 = this.f24864e + 1;
                        this.f24864e = i12;
                        int i13 = this.f24865f;
                        TdApi.Message[] messageArr2 = messages.messages;
                        bVar.g(i12, i13, new d(messageArr2[0].chatId, messageArr2[0].f19946id));
                        return;
                    }
                }
                this.f24863d = i11 & (-3);
            } else if (messages == null || messages.messages.length == 0) {
                this.f24861b.g(-3, 0, null);
            } else {
                ArrayList<TdApi.Message> arrayList = this.f24872m;
                if (arrayList == null) {
                    this.f24872m = new ArrayList<>();
                } else {
                    arrayList.clear();
                }
                Collections.addAll(this.f24872m, messages.messages);
                int size = this.f24872m.size();
                int i14 = messages.totalCount;
                if (size < i14) {
                    this.f24863d |= 2;
                }
                b bVar2 = this.f24861b;
                this.f24864e = 0;
                this.f24865f = i14;
                TdApi.Message[] messageArr3 = messages.messages;
                bVar2.g(0, i14, new d(messageArr3[0].chatId, messageArr3[0].f19946id));
            }
        }
    }

    public final void h(int i10, boolean z10, TdApi.FoundMessages foundMessages) {
        if (this.f24862c == i10) {
            int i11 = this.f24863d & (-2);
            this.f24863d = i11;
            if (z10) {
                this.f24871l = foundMessages.nextOffset;
                TdApi.Message[] messageArr = foundMessages.messages;
                if (messageArr.length == 0) {
                    this.f24863d = i11 & (-3);
                    return;
                }
                Collections.addAll(this.f24872m, messageArr);
                b bVar = this.f24861b;
                int i12 = this.f24864e + 1;
                this.f24864e = i12;
                int i13 = this.f24865f;
                TdApi.Message[] messageArr2 = foundMessages.messages;
                bVar.g(i12, i13, new d(messageArr2[0].chatId, messageArr2[0].f19946id));
            } else if (foundMessages == null || foundMessages.messages.length == 0) {
                this.f24861b.g(-3, 0, null);
            } else {
                ArrayList<TdApi.Message> arrayList = this.f24872m;
                if (arrayList == null) {
                    this.f24872m = new ArrayList<>(foundMessages.messages.length);
                } else {
                    arrayList.clear();
                    this.f24872m.ensureCapacity(foundMessages.messages.length);
                }
                Collections.addAll(this.f24872m, foundMessages.messages);
                this.f24863d |= 2;
                b bVar2 = this.f24861b;
                this.f24864e = 0;
                int size = this.f24872m.size();
                this.f24865f = size;
                TdApi.Message[] messageArr3 = foundMessages.messages;
                bVar2.g(0, size, new d(messageArr3[0].chatId, messageArr3[0].f19946id));
            }
        }
    }

    public final int o(long j10, long j11, String str) {
        this.f24866g = j10;
        this.f24867h = j11;
        this.f24870k = str;
        this.f24865f = 0;
        this.f24864e = 0;
        this.f24863d = 0;
        ArrayList<TdApi.Message> arrayList = this.f24872m;
        if (arrayList != null) {
            arrayList.clear();
        }
        int i10 = this.f24862c + 1;
        this.f24862c = i10;
        return i10;
    }

    public void p(long j10, long j11, TdApi.MessageSender messageSender, boolean z10, String str) {
        int o10 = o(j10, j11, str);
        if (str.length() == 0 && messageSender == null) {
            this.f24861b.g(-1, 0, null);
            return;
        }
        this.f24869j = z10;
        this.f24868i = messageSender;
        this.f24863d |= 1;
        this.f24861b.g(-2, 0, null);
        kb.b bVar = this.f24873n;
        if (bVar != null) {
            bVar.c();
            this.f24873n = null;
        }
        a aVar = new a(o10, j10, j11, messageSender, z10, str);
        this.f24873n = aVar;
        j0.e0(aVar, z10 ? 0L : 100L);
    }

    public final void q(final int i10, long j10, long j11, TdApi.MessageSender messageSender, final boolean z10, String str, final long j12, String str2) {
        TdApi.Function function;
        if (this.f24862c == i10) {
            if (z10) {
                function = new TdApi.SearchSecretMessages(j10, str, str2, 20, new TdApi.SearchMessagesFilterEmpty());
            } else {
                function = new TdApi.SearchChatMessages(j10, str, messageSender, j12, 0, 20, new TdApi.SearchMessagesFilterEmpty(), j11);
            }
            this.f24860a.v4().o(function, new Client.g() {
                @Override
                public final void r2(TdApi.Object object) {
                    c3.this.i(i10, j12, z10, object);
                }
            });
        }
    }
}
