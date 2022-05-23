package hd;

import ib.i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import kb.k;
import ob.e;
import org.drinkless.td.libcore.telegram.Client;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import zd.b1;
import zd.c1;
import zd.g1;
import zd.h1;
import zd.o6;

public class y0 extends b1<TdApi.Message> implements h1, Comparator<TdApi.Message> {
    public final long U;
    public final long V;
    public final String W;
    public final TdApi.MessageSender X;
    public final TdApi.SearchMessagesFilter Y;
    public final long Z;
    public boolean f13742a0;
    public boolean f13743b0;
    public long f13744c0;
    public final b1.b<TdApi.Message> f13745d0;
    public final List<c> f13746e0;

    public class a implements b1.b<TdApi.Message> {
        public a() {
        }

        @Override
        public void D(b1<TdApi.Message> b1Var, List<TdApi.Message> list, int i10, boolean z10) {
            if (i10 == 0) {
                y0.this.g1(list.get(0).f19946id);
            }
        }

        @Override
        public void I2(b1<TdApi.Message> b1Var, int i10) {
            c1.i(this, b1Var, i10);
        }

        @Override
        public void K(b1<TdApi.Message> b1Var, boolean z10) {
            c1.a(this, b1Var, z10);
        }

        @Override
        public void V5(b1<TdApi.Message> b1Var) {
            c1.h(this, b1Var);
        }

        public void s3(b1<TdApi.Message> b1Var, TdApi.Message message, int i10) {
            if (i10 == 0) {
                y0.this.g1(message.f19946id);
            }
        }

        public void T2(b1<TdApi.Message> b1Var, TdApi.Message message, int i10, int i11) {
            if (i10 == 0) {
                y0.this.g1(message.f19946id);
            }
        }

        public void C3(b1<TdApi.Message> b1Var, TdApi.Message message, int i10, int i11) {
            if (i11 == 0) {
                y0.this.g1(message.f19946id);
            } else if (i10 == 0) {
                y0 y0Var = y0.this;
                y0Var.g1(((TdApi.Message) y0Var.f27261b.get(0)).f19946id);
            }
        }

        public void G1(b1<TdApi.Message> b1Var, TdApi.Message message, int i10) {
            if (i10 == 0) {
                y0 y0Var = y0.this;
                y0Var.g1(y0Var.f27261b.isEmpty() ? 0L : ((TdApi.Message) y0.this.f27261b.get(0)).f19946id);
            }
        }

        @Override
        public void e4(b1<TdApi.Message> b1Var) {
            c1.b(this, b1Var);
        }
    }

    public interface b extends b1.b<TdApi.Message> {
    }

    public interface c {
        void a(b1<TdApi.Message> b1Var, long j10);
    }

    public y0(o6 o6Var, int i10, int i11, b bVar, long j10, long j11, String str, TdApi.MessageSender messageSender, TdApi.SearchMessagesFilter searchMessagesFilter, long j12) {
        super(o6Var, i10, i11, j11 != 0, bVar);
        a aVar = new a();
        this.f13745d0 = aVar;
        this.f13746e0 = new ArrayList();
        this.U = j10;
        this.V = j11;
        this.W = str;
        this.X = messageSender;
        this.Y = searchMessagesFilter;
        this.Z = j12;
        a0();
        I(null);
        r(aVar);
    }

    public void K0(boolean z10, long j10, TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor != -1679978726) {
            if (constructor == 1435961258) {
                final TdApi.Message message = (TdApi.Message) object;
                if (c1(message)) {
                    X(new Runnable() {
                        @Override
                        public final void run() {
                            y0.this.J0(message);
                        }
                    });
                }
            }
        } else if (z10) {
            D0(j10, false);
        }
    }

    public void M0(final k kVar, TdApi.Object object) {
        final int i10;
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            Log.e("GetChatMessageCount: %s, filter:%s, chatId:%s", t2.z5(object), this.Y, Long.valueOf(this.U));
            i10 = -1;
        } else if (constructor == 1295577348) {
            i10 = ((TdApi.Count) object).count;
        } else {
            Log.unexpectedTdlibResponse(object, TdApi.GetChatMessageCount.class, TdApi.Count.class);
            throw new AssertionError(object.toString());
        }
        if (kVar != null) {
            X(new Runnable() {
                @Override
                public final void run() {
                    k.this.a(i10);
                }
            });
        }
    }

    public void O0(TdApi.Function function, final k kVar, TdApi.Object object) {
        final int i10;
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            Log.e("%s: %s, chatId: %d", function.getClass().getSimpleName(), t2.z5(object), Long.valueOf(this.U));
            i10 = -1;
        } else if (constructor == -16498159) {
            i10 = ((TdApi.Messages) object).totalCount;
        } else {
            Log.unexpectedTdlibResponse(object, function.getClass(), TdApi.Messages.class);
            throw new AssertionError(object.toString());
        }
        if (kVar != null) {
            X(new Runnable() {
                @Override
                public final void run() {
                    k.this.a(i10);
                }
            });
        }
    }

    public void P0(Runnable runnable, int i10) {
        if (i10 != -1 && v() == -1) {
            Z(i10);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public void Q0(final Runnable runnable, int i10) {
        if (i10 != -1) {
            if (v() == -1) {
                Z(i10);
            }
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        E0(false, new k() {
            @Override
            public final void a(int i11) {
                y0.this.P0(runnable, i11);
            }
        });
    }

    public void R0(long j10, TdApi.MessageContent messageContent) {
        int I0 = I0(j10);
        if (I0 != -1) {
            TdApi.Message message = (TdApi.Message) this.f27261b.get(I0);
            message.content = messageContent;
            if (c1(message)) {
                M(I0, 3);
            } else {
                e1(I0);
            }
        }
    }

    public void S0(long j10, int i10, TdApi.ReplyMarkup replyMarkup) {
        int I0 = I0(j10);
        if (I0 != -1) {
            TdApi.Message message = (TdApi.Message) this.f27261b.get(I0);
            message.f19946id = j10;
            message.editDate = i10;
            message.replyMarkup = replyMarkup;
            M(I0, 4);
        }
    }

    public void U0(long j10, TdApi.MessageInteractionInfo messageInteractionInfo) {
        int I0 = I0(j10);
        if (I0 != -1) {
            ((TdApi.Message) this.f27261b.get(I0)).interactionInfo = messageInteractionInfo;
            M(I0, 7);
        }
    }

    public void V0(long j10) {
        int I0 = I0(j10);
        if (I0 != -1) {
            TdApi.Message message = (TdApi.Message) this.f27261b.get(I0);
            if (message.containsUnreadMention) {
                message.containsUnreadMention = false;
                if (c1(message)) {
                    M(I0, 6);
                } else {
                    e1(I0);
                }
            }
        }
    }

    public void W0(long j10) {
        int I0 = I0(j10);
        if (I0 != -1) {
            t2.i5((TdApi.Message) this.f27261b.get(I0));
            M(I0, 5);
        }
    }

    public void X0(long j10, boolean z10) {
        int I0 = I0(j10);
        if (I0 != -1) {
            TdApi.Message message = (TdApi.Message) this.f27261b.get(I0);
            if (message.isPinned != z10) {
                message.isPinned = z10;
                if (!c1(message)) {
                    e1(I0);
                    return;
                }
                return;
            }
            return;
        }
        TdApi.SearchMessagesFilter searchMessagesFilter = this.Y;
        if (searchMessagesFilter != null && searchMessagesFilter.getConstructor() == 371805512 && z10) {
            D0(j10, true);
        }
    }

    public void Y0(TdApi.Message message, long j10) {
        f1(message, j10, 2);
    }

    public void Z0(TdApi.Message message, long j10) {
        f1(message, j10, 1);
    }

    public void a1(long[] jArr) {
        int i10 = 0;
        for (long j10 : jArr) {
            int I0 = I0(j10);
            if (I0 != -1) {
                R((TdApi.Message) this.f27261b.remove(I0), I0);
                i10++;
            }
        }
        s(-i10);
    }

    public final int b1(TdApi.Message message) {
        int i10 = -1;
        if (c1(message)) {
            int binarySearch = Collections.binarySearch(this.f27261b, message, this);
            if (binarySearch >= 0) {
                return -1;
            }
            int i11 = (binarySearch * (-1)) - 1;
            if (i11 != this.f27261b.size() || z()) {
                this.f27261b.add(i11, message);
                P(message, i11);
                i10 = i11;
            }
            s(1);
        }
        return i10;
    }

    public int compare(TdApi.Message message, TdApi.Message message2) {
        return Long.compare(message2.f19946id, message.f19946id);
    }

    public void C0(long j10) {
        if (d1() > j10) {
            z();
        }
    }

    public final void D0(final long j10, final boolean z10) {
        this.f27260a.v4().o(z10 ? new TdApi.GetMessageLocally(this.U, j10) : new TdApi.GetMessage(this.U, j10), new Client.g() {
            @Override
            public final void r2(TdApi.Object object) {
                y0.this.K0(z10, j10, object);
            }
        });
    }

    @Override
    public void D5(long j10, long j11) {
        g1.e(this, j10, j11);
    }

    public final void E0(boolean z10, final k kVar) {
        final TdApi.Function function;
        if (G0() || this.Y == null) {
            if (!G0()) {
                function = new TdApi.GetChatHistory(this.U, 0L, 0, 1, z10);
            } else if (!z10) {
                function = new TdApi.SearchChatMessages(this.U, this.W, this.X, 0L, 0, 1, this.Y, this.Z);
            } else if (kVar != null) {
                kVar.a(-1);
                return;
            } else {
                return;
            }
            this.f27260a.v4().o(function, new Client.g() {
                @Override
                public final void r2(TdApi.Object object) {
                    y0.this.O0(function, kVar, object);
                }
            });
            return;
        }
        this.f27260a.v4().o(new TdApi.GetChatMessageCount(this.U, this.Y, z10), new Client.g() {
            @Override
            public final void r2(TdApi.Object object) {
                y0.this.M0(kVar, object);
            }
        });
    }

    public long F0() {
        return this.f13744c0;
    }

    public final boolean G0() {
        return (i.i(this.W) && this.X == null && this.Z == 0) ? false : true;
    }

    @Override
    public void H(long j10, final long[] jArr) {
        if (this.U == j10) {
            Y(new Runnable() {
                @Override
                public final void run() {
                    y0.this.a1(jArr);
                }
            });
        }
    }

    public final boolean H0() {
        return this.Y != null || G0();
    }

    @Override
    public void I(final Runnable runnable) {
        E0(true, new k() {
            @Override
            public final void a(int i10) {
                y0.this.Q0(runnable, i10);
            }
        });
    }

    public final int I0(long j10) {
        int i10 = 0;
        for (T t10 : this.f27261b) {
            if (t10.f19946id == j10) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    @Override
    public TdApi.Function J(boolean z10, int i10, int i11) {
        long j10;
        if (this.f27261b.isEmpty()) {
            j10 = this.V;
        } else {
            List<T> list = this.f27261b;
            j10 = ((TdApi.Message) list.get(z10 ? 0 : list.size() - 1)).f19946id;
        }
        long j11 = j10;
        if (H0()) {
            if (z10) {
                return new TdApi.SearchChatMessages(this.U, this.W, this.X, j11, -i11, i11 + 1, this.Y, this.Z);
            }
            return new TdApi.SearchChatMessages(this.U, this.W, this.X, j11, 0, i11, this.Y, this.Z);
        } else if (z10) {
            return new TdApi.GetChatHistory(this.U, j11, -i10, i10 + 1, !this.f13743b0);
        } else {
            return new TdApi.GetChatHistory(this.U, j11, 0, i10, !this.f13742a0);
        }
    }

    @Override
    public void J3(long j10, long j11) {
        g1.i(this, j10, j11);
    }

    @Override
    public void S1(long j10, final long j11, final boolean z10) {
        if (this.U == j10) {
            Y(new Runnable() {
                @Override
                public final void run() {
                    y0.this.X0(j11, z10);
                }
            });
        }
    }

    @Override
    public void T0(long j10, final long j11, final TdApi.MessageInteractionInfo messageInteractionInfo) {
        if (this.U == j10) {
            Y(new Runnable() {
                @Override
                public final void run() {
                    y0.this.U0(j11, messageInteractionInfo);
                }
            });
        }
    }

    @Override
    public b1.c<TdApi.Message> U(TdApi.Object object, Client.g gVar, int i10, boolean z10) {
        TdApi.Messages messages = (TdApi.Messages) object;
        List asList = Arrays.asList(messages.messages);
        if (H0() || !asList.isEmpty()) {
            return new b1.c<>(asList, messages.totalCount);
        }
        if (z10) {
            this.f13743b0 = true;
        } else {
            this.f13742a0 = true;
        }
        this.f27260a.v4().o(J(z10, this.f27261b.size(), i10), gVar);
        return null;
    }

    @Override
    public void W(long j10, final long j11) {
        if (this.U == j10) {
            Y(new Runnable() {
                @Override
                public final void run() {
                    y0.this.V0(j11);
                }
            });
        }
    }

    @Override
    public void X1(final TdApi.Message message, final long j10) {
        if (message.chatId == this.U) {
            Y(new Runnable() {
                @Override
                public final void run() {
                    y0.this.Z0(message, j10);
                }
            });
        }
    }

    @Override
    public void a0() {
        if (this.U != 0) {
            this.f27260a.O9().g0(this.U, this);
        }
    }

    @Override
    public void b0() {
        this.f27260a.O9().t0(this.U, this);
    }

    @Override
    public void b6(long j10, long j11, TdApi.Sticker sticker) {
        g1.a(this, j10, j11, sticker);
    }

    public final boolean c1(TdApi.Message message) {
        TdApi.MessageSender messageSender;
        TdApi.SearchMessagesFilter searchMessagesFilter;
        if (message.chatId == this.U) {
            if (H0()) {
                if (i.i(this.W)) {
                    long j10 = this.Z;
                    if ((j10 == 0 || message.messageThreadId == j10) && (((messageSender = this.X) == null || e.Y(message.senderId, messageSender)) && ((searchMessagesFilter = this.Y) == null || e.k1(message, searchMessagesFilter)))) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    public long d1() {
        if (this.f27261b.isEmpty()) {
            return 0L;
        }
        List<T> list = this.f27261b;
        return ((TdApi.Message) list.get(list.size() - 1)).f19946id;
    }

    public final void e1(int i10) {
        R((TdApi.Message) this.f27261b.remove(i10), i10);
        s(-1);
    }

    public final void f1(TdApi.Message message, long j10, int i10) {
        int I0 = I0(j10);
        if (I0 != -1) {
            TdApi.Message message2 = (TdApi.Message) this.f27261b.remove(I0);
            int A0 = b1(message);
            if (A0 == I0) {
                M(I0, i10);
            } else if (A0 == -1) {
                R(message2, I0);
            } else {
                Q(message2, I0, A0);
                M(A0, i10);
            }
        } else {
            b1(message);
        }
    }

    public final void g1(long j10) {
        if (this.f13744c0 != j10) {
            this.f13744c0 = j10;
            if (!y()) {
                for (int size = this.f13746e0.size() - 1; size >= 0; size--) {
                    this.f13746e0.get(size).a(this, j10);
                }
            }
        }
    }

    @Override
    public void g5(final TdApi.Message message, final long j10, int i10, String str) {
        if (message.chatId == this.U) {
            Y(new Runnable() {
                @Override
                public final void run() {
                    y0.this.Y0(message, j10);
                }
            });
        }
    }

    @Override
    public void j0(long j10, final long j11, final TdApi.MessageContent messageContent) {
        if (this.U == j10) {
            Y(new Runnable() {
                @Override
                public final void run() {
                    y0.this.R0(j11, messageContent);
                }
            });
        }
    }

    @Override
    public void k1(long j10, long j11, TdApi.UnreadReaction[] unreadReactionArr, int i10) {
        g1.l(this, j10, j11, unreadReactionArr, i10);
    }

    @Override
    public void l5(long j10, final long j11, final int i10, final TdApi.ReplyMarkup replyMarkup) {
        if (this.U == j10) {
            Y(new Runnable() {
                @Override
                public final void run() {
                    y0.this.S0(j11, i10, replyMarkup);
                }
            });
        }
    }

    @Override
    public void s5(long j10, final long j11) {
        if (this.U == j10) {
            Y(new Runnable() {
                @Override
                public final void run() {
                    y0.this.W0(j11);
                }
            });
        }
    }

    @Override
    public void y2(final TdApi.Message message) {
        if (c1(message)) {
            Y(new Runnable() {
                @Override
                public final void run() {
                    y0.this.b1(message);
                }
            });
        }
    }

    public void z0(c cVar) {
        this.f13746e0.add(cVar);
    }
}
