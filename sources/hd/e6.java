package hd;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.view.View;
import ce.a0;
import ce.y;
import hd.e6;
import he.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import jb.d;
import ld.b;
import ld.c;
import ld.h;
import md.j;
import md.m;
import md.s;
import ob.e;
import org.drinkless.td.libcore.telegram.Client;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.loader.gif.GifBridge;
import vc.g1;
import vc.v2;
import zd.o6;

public class e6 extends s4 implements zd.a {
    public TdApi.DiceStickers U2;
    public Path V2;
    public List<a> W2;
    public int X2;
    public int Y2;
    public final int Z2;
    public TdApi.MessageDice f12940a3;
    public TdApi.MessageAnimatedEmoji f12941b3;
    public TdApi.MessageAnimatedEmoji f12942c3;
    public TdApi.MessageAnimatedEmoji f12943d3;
    public boolean f12944e3;
    public float f12945f3;
    public float f12946g3;

    public class a {
        public final TdApi.Sticker f12947a;
        public h f12948b;
        public h f12949c;
        public j f12950d;

        public a(TdApi.Sticker sticker, int i10, boolean z10, boolean z11) {
            this.f12947a = sticker;
            if (i10 == 0 || !e.X0(sticker.type)) {
                h D5 = t2.D5(e6.this.O0, sticker.thumbnail);
                this.f12948b = D5;
                if (D5 != null) {
                    D5.s0(1);
                }
            }
            if (e.X0(sticker.type)) {
                j jVar = new j(e6.this.O0, sticker);
                this.f12950d = jVar;
                jVar.I(2);
                this.f12950d.A(i10);
                if (z10) {
                    this.f12950d.H(z11 || e6.this.Z2 != 0 || i.c2().k1(8L));
                    if (e6.this.Z2 != 2) {
                        return;
                    }
                    if (!e6.this.H5() || e6.this.Z5()) {
                        this.f12950d.z(true);
                        this.f12950d.D(true);
                        this.f12948b = null;
                    } else if (e6.this.f12940a3.value != 0) {
                        this.f12950d.b(new Runnable() {
                            @Override
                            public final void run() {
                                e6.a.this.g();
                            }
                        });
                    }
                } else if (z11) {
                    this.f12950d.H(true);
                }
            } else {
                h hVar = new h(e6.this.O0, sticker.sticker);
                this.f12949c = hVar;
                hVar.s0(1);
                this.f12949c.x0();
            }
        }

        public void g() {
            if ((e6.this.W2 != null ? e6.this.W2.indexOf(this) : -1) != -1) {
                this.f12948b = null;
            }
        }

        public TdApi.ClosedVectorPath[] d() {
            return this.f12947a.outline;
        }

        public boolean e() {
            j jVar;
            return f() && (jVar = this.f12950d) != null && jVar.o() && this.f12950d.m() && !this.f12950d.v();
        }

        public boolean f() {
            return e.X0(this.f12947a.type);
        }

        public void h(int i10, b bVar, boolean z10) {
            if (!z10) {
                c l10 = bVar.l(i10);
                if (this.f12948b == null || e()) {
                    l10.clear();
                } else if (f() || !t2.T2(this.f12947a.sticker)) {
                    l10.j(null, this.f12948b);
                } else {
                    l10.clear();
                    this.f12948b = null;
                }
            }
            if (f()) {
                bVar.j(i10).r(this.f12950d);
            } else {
                bVar.k(i10).G(this.f12949c);
            }
        }
    }

    public e6(v2 v2Var, TdApi.Message message, TdApi.MessageDice messageDice) {
        super(v2Var, message);
        this.Z2 = 2;
        Ca(messageDice, false);
        this.O0.O9().b0(this);
    }

    public void ra() {
        if (!U5()) {
            Ca(this.f12940a3, true);
            x5();
        }
    }

    public void sa(View view, Rect rect) {
        m j10 = ((g1) view).getComplexReceiver().j(0L);
        if (j10 != null) {
            rect.set(j10.getLeft(), j10.getTop(), j10.getRight(), j10.getBottom());
            rect.top = (int) (rect.top + (rect.height() * (t2.G.f13581a.equals(this.f12940a3.emoji) ? 0.35f : 0.2f)));
        }
    }

    public void ta(int i10) {
        y5(i10);
    }

    public void ua() {
        View f10;
        m j10;
        if (!U5() && (f10 = this.P0.f()) != null && (j10 = ((g1) f10).getComplexReceiver().j(0L)) != null) {
            l8(j10.J0(), j10.x0());
        }
    }

    public void va(j jVar, long j10, long j11) {
        int i10 = this.f12940a3.successAnimationFrameNumber;
        if (i10 >= j10 && i10 < j10 + j11) {
            this.O0.hd().post(new Runnable() {
                @Override
                public final void run() {
                    e6.this.ua();
                }
            });
            jVar.B(null);
        }
    }

    public void wa(a aVar, int i10, s sVar) {
        if (aVar.f12950d.l(this.f12940a3.successAnimationFrameNumber)) {
            aVar.f12950d.B(new j.a() {
                @Override
                public final void a(j jVar, long j10, long j11) {
                    e6.this.va(jVar, j10, j11);
                }
            });
        }
        y5(i10);
        GifBridge.f().o(sVar);
    }

    public void xa(final int i10, a aVar, final a aVar2, final s sVar) {
        if (U5() || !b5()) {
            GifBridge.f().o(sVar);
            y5(i10);
            return;
        }
        aVar.f12950d.b(new Runnable() {
            @Override
            public final void run() {
                e6.this.wa(aVar2, i10, sVar);
            }
        });
    }

    public void ya(List list) {
        if (U5()) {
            return;
        }
        if (list == null || !b5() || this.W2 == null || list.size() != this.W2.size()) {
            x5();
        } else if (b5()) {
            final int i10 = 0;
            while (i10 < list.size()) {
                final a aVar = (a) list.get(i10);
                List<a> list2 = this.W2;
                final a aVar2 = (list2 == null || i10 >= list2.size()) ? null : this.W2.get(i10);
                if (aVar.f12950d == null) {
                    y5(i10);
                } else if (aVar2 == null || aVar2.f12950d == null) {
                    aVar.f12950d.b(new Runnable() {
                        @Override
                        public final void run() {
                            e6.this.ta(i10);
                        }
                    });
                } else {
                    GifBridge.f().h(aVar2.f12950d, new kb.j() {
                        @Override
                        public final void a(Object obj) {
                            e6.this.xa(i10, aVar, aVar2, (s) obj);
                        }
                    });
                }
                i10++;
            }
        }
    }

    public void za(AtomicInteger atomicInteger, final List list, TdApi.Object object) {
        if (atomicInteger.decrementAndGet() == 0) {
            this.O0.hd().post(new Runnable() {
                @Override
                public final void run() {
                    e6.this.ya(list);
                }
            });
        }
    }

    public boolean Aa() {
        return qa() != 0 && e.X0(pa().type) && i.c2().k1(8L) && qa() != 0;
    }

    public void Ba() {
        this.O0.hd().M8(Q0(), pa().setId);
    }

    @Override
    public int C1(View view, int i10) {
        if (this.f13449a.forwardInfo != null) {
            return super.C1(view, i10);
        }
        int oa2 = oa();
        int i11 = (this.X2 + oa2) - i10;
        return (!R9() || g6()) ? i11 : Math.max(oa2, i11);
    }

    public final void Ca(TdApi.MessageDice messageDice, boolean z10) {
        this.f12940a3 = messageDice;
        o6 o6Var = this.O0;
        String str = messageDice.emoji;
        int i10 = messageDice.value;
        TdApi.DiceStickers diceStickers = messageDice.finalState;
        if (diceStickers == null) {
            diceStickers = messageDice.initialState;
        }
        TdApi.DiceStickers n52 = o6Var.n5(str, i10, diceStickers);
        if (n52 != null) {
            Da(n52, 0, z10, messageDice.finalState != null);
        }
    }

    public final void Da(TdApi.DiceStickers diceStickers, int i10, boolean z10, boolean z11) {
        this.U2 = diceStickers;
        ArrayList arrayList = new ArrayList();
        int constructor = diceStickers.getConstructor();
        if (constructor == -740299570) {
            arrayList.add(new a(((TdApi.DiceStickersRegular) diceStickers).sticker, i10, z11, false));
        } else if (constructor == -375223124) {
            TdApi.DiceStickersSlotMachine diceStickersSlotMachine = (TdApi.DiceStickersSlotMachine) diceStickers;
            arrayList.add(new a(diceStickersSlotMachine.background, i10, z11, true));
            arrayList.add(new a(diceStickersSlotMachine.leftReel, i10, z11, false));
            arrayList.add(new a(diceStickersSlotMachine.centerReel, i10, z11, false));
            arrayList.add(new a(diceStickersSlotMachine.rightReel, i10, z11, false));
            arrayList.add(new a(diceStickersSlotMachine.lever, i10, z11, true));
        } else {
            throw new UnsupportedOperationException(diceStickers.toString());
        }
        this.W2 = arrayList;
    }

    public final boolean Ea() {
        TdApi.MessageAnimatedEmoji messageAnimatedEmoji = this.f12943d3;
        if (messageAnimatedEmoji == null) {
            messageAnimatedEmoji = this.f12942c3;
        }
        TdApi.MessageAnimatedEmoji messageAnimatedEmoji2 = this.f12941b3;
        if (messageAnimatedEmoji2 == messageAnimatedEmoji || (messageAnimatedEmoji2 != null && messageAnimatedEmoji == null)) {
            return false;
        }
        this.f12941b3 = messageAnimatedEmoji;
        Da(new TdApi.DiceStickersRegular(messageAnimatedEmoji.animatedEmoji.sticker), messageAnimatedEmoji.animatedEmoji.fitzpatrickType, false, true);
        return true;
    }

    @Override
    public void L8(b bVar, boolean z10, int i10) {
        List<a> list = this.W2;
        if (list == null || list.isEmpty()) {
            bVar.d();
        } else if (i10 < 0 || i10 >= this.W2.size()) {
            int i11 = 0;
            for (a aVar : this.W2) {
                aVar.h(i11, bVar, z10);
                i11++;
            }
            bVar.g(i11);
        } else {
            this.W2.get(i10).h(i10, bVar, z10);
        }
    }

    @Override
    public boolean L9(TdApi.Message message, TdApi.MessageContent messageContent, boolean z10) {
        if (this.Z2 == 2 && messageContent.getConstructor() == 1115779641) {
            final List<a> list = this.W2;
            TdApi.MessageDice messageDice = (TdApi.MessageDice) messageContent;
            TdApi.MessageDice messageDice2 = this.f12940a3;
            boolean z11 = (messageDice2 == null || messageDice2.finalState == null) ? false : true;
            boolean z12 = (messageDice2 == null || messageDice2.initialState == null) ? false : true;
            boolean z13 = messageDice.finalState != null;
            Ca(messageDice, true);
            if (!z12 || z11 || !z13) {
                x5();
            } else {
                d dVar = new d();
                int constructor = this.U2.getConstructor();
                if (constructor == -740299570) {
                    dVar.f(((TdApi.DiceStickersRegular) this.U2).sticker.sticker.f19913id);
                } else if (constructor == -375223124) {
                    TdApi.DiceStickersSlotMachine diceStickersSlotMachine = (TdApi.DiceStickersSlotMachine) this.U2;
                    dVar.f(diceStickersSlotMachine.background.sticker.f19913id);
                    dVar.f(diceStickersSlotMachine.leftReel.sticker.f19913id);
                    dVar.f(diceStickersSlotMachine.centerReel.sticker.f19913id);
                    dVar.f(diceStickersSlotMachine.rightReel.sticker.f19913id);
                    dVar.f(diceStickersSlotMachine.lever.sticker.f19913id);
                } else {
                    throw new UnsupportedOperationException(this.U2.toString());
                }
                final AtomicInteger atomicInteger = new AtomicInteger(dVar.size());
                Client.g b6Var = new Client.g() {
                    @Override
                    public final void r2(TdApi.Object object) {
                        e6.this.za(atomicInteger, list, object);
                    }
                };
                Iterator<Integer> it = dVar.iterator();
                while (it.hasNext()) {
                    this.O0.v4().o(new TdApi.DownloadFile(it.next().intValue(), 1, 0, 0, true), b6Var);
                }
            }
        } else if (this.Z2 == 1 && messageContent.getConstructor() == 908195298) {
            this.f12942c3 = (TdApi.MessageAnimatedEmoji) messageContent;
            if (Ea()) {
                x5();
            }
            return true;
        }
        return false;
    }

    @Override
    public boolean S0() {
        return true;
    }

    @Override
    public void S6(boolean z10) {
        super.S6(z10);
        TdApi.MessageDice messageDice = this.f12940a3;
        if (messageDice != null && messageDice.finalState != null) {
            Da(this.U2, 0, false, true);
        }
    }

    @Override
    public void V7() {
        if (this.Z2 != 0) {
            this.O0.O9().n0(this);
        }
    }

    @Override
    public int W2() {
        return Math.max(a0.i(56.0f), this.Y2) + ((this.Z2 != 2 || !R9() || T9()) ? 0 : t2() + s4.s2() + a0.i(2.0f));
    }

    @Override
    public boolean X0() {
        return true;
    }

    @Override
    public int Y1() {
        return 0;
    }

    @Override
    public int a3() {
        return this.X2;
    }

    @Override
    public int a8(long j10, long j11, int i10) {
        if (this.Z2 == 1) {
            TdApi.MessageContent Q5 = this.O0.Q5(j10, j11);
            if (Q5 == null && this.f12942c3 == null) {
                return 3;
            }
            if (Q5 != null && Q5.getConstructor() != 908195298) {
                return 3;
            }
            this.f12943d3 = (TdApi.MessageAnimatedEmoji) Q5;
            if (Ea()) {
                z8();
                x5();
                return G3() == i10 ? 1 : 2;
            }
        }
        return super.a8(j10, j11, i10);
    }

    @Override
    public void b0(int i10) {
        float f10;
        TdApi.Sticker pa2 = pa();
        float i11 = a0.i(T9() ? 120.0f : 190.0f);
        if (this.Z2 != 0 || pa2.setId == 1258816259751983L) {
            i11 = (float) (i11 * this.O0.f5());
        }
        if (pa2 != null) {
            f10 = Math.min(i11 / pa2.width, i11 / pa2.height);
            this.X2 = (int) (pa2.width * f10);
            this.Y2 = (int) (pa2.height * f10);
        } else {
            this.Y2 = 0;
            this.X2 = 0;
            f10 = 1.0f;
        }
        if (this.X2 == 0 && this.Y2 == 0) {
            int i12 = (int) i11;
            this.Y2 = i12;
            this.X2 = i12;
            f10 = i11 / 512.0f;
        }
        Path path = this.V2;
        if (path != null) {
            path.reset();
        }
        List<a> list = this.W2;
        if (list != null) {
            for (a aVar : list) {
                this.V2 = e.c(aVar.d(), f10, this.V2);
                if (aVar.f12949c != null) {
                    aVar.f12949c.t0(Math.max(this.X2, this.Y2));
                }
            }
        }
    }

    @Override
    public void b1(g1 g1Var, Canvas canvas, int i10, int i11, int i12, b bVar) {
        int oa2 = oa();
        int c32 = c3();
        int i13 = oa2 + this.X2;
        int c33 = c3() + this.Y2;
        List<a> list = this.W2;
        if (list != null) {
            if (this.V2 != null) {
                boolean z10 = false;
                int i14 = 0;
                for (a aVar : list) {
                    c l10 = bVar.l(i14);
                    long j10 = i14;
                    if ((aVar.f() ? bVar.j(j10) : bVar.k(j10)).e0() && l10.e0()) {
                        z10 = true;
                    }
                    i14++;
                }
                if (z10) {
                    canvas.save();
                    canvas.translate(oa2, c32);
                    canvas.drawPath(this.V2, y.U());
                    canvas.restore();
                }
            }
            int i15 = 0;
            for (a aVar2 : this.W2) {
                ce.b.u(canvas, bVar.l(i15), aVar2.f() ? bVar.j(i15) : bVar.k(i15), !aVar2.f(), false, oa2, c32, i13, c33);
                i15++;
            }
        }
    }

    @Override
    public boolean f8(vc.g1 r10, android.view.MotionEvent r11) {
        throw new UnsupportedOperationException("Method not decompiled: hd.e6.f8(vc.g1, android.view.MotionEvent):boolean");
    }

    @Override
    public void h(int i10) {
        if (this.Z2 == 2 && i10 == 2) {
            this.O0.hd().post(new Runnable() {
                @Override
                public final void run() {
                    e6.this.ra();
                }
            });
        }
    }

    @Override
    public boolean k7() {
        return true;
    }

    @Override
    public boolean m8(View view, float f10, float f11) {
        boolean m82 = super.m8(view, f10, f11);
        this.f12944e3 = false;
        return m82;
    }

    public final int oa() {
        return (!g6() || O9()) ? b3() : E1() - this.X2;
    }

    public final TdApi.Sticker pa() {
        TdApi.DiceStickers diceStickers = this.U2;
        if (diceStickers == null) {
            return null;
        }
        int constructor = diceStickers.getConstructor();
        if (constructor == -740299570) {
            return ((TdApi.DiceStickersRegular) this.U2).sticker;
        }
        if (constructor == -375223124) {
            return ((TdApi.DiceStickersSlotMachine) this.U2).background;
        }
        throw new UnsupportedOperationException(this.U2.toString());
    }

    public final long qa() {
        TdApi.Sticker pa2 = this.Z2 == 0 ? pa() : null;
        if (pa2 != null) {
            return pa2.setId;
        }
        return 0L;
    }

    @Override
    public int t2() {
        return a0.i(4.0f);
    }

    public e6(v2 v2Var, TdApi.Message message, TdApi.MessageAnimatedEmoji messageAnimatedEmoji, TdApi.MessageAnimatedEmoji messageAnimatedEmoji2) {
        super(v2Var, message);
        this.f12942c3 = messageAnimatedEmoji;
        this.f12943d3 = messageAnimatedEmoji2;
        this.Z2 = 1;
        Ea();
    }

    public e6(v2 v2Var, TdApi.Message message, TdApi.Sticker sticker, boolean z10, int i10) {
        super(v2Var, message);
        this.Z2 = z10 ? 1 : 0;
        Da(new TdApi.DiceStickersRegular(sticker), i10, false, true);
    }
}
