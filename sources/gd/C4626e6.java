package gd;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.view.View;
import be.C1357a0;
import be.C1359b;
import be.C1410y;
import gd.C4626e6;
import ge.C4868i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import org.drinkless.p210td.libcore.telegram.Client;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.loader.gif.GifBridge;
import p124ib.C5321d;
import p139jb.AbstractC5918j;
import p156kd.C6238b;
import p156kd.C6240c;
import p156kd.C6246h;
import p168ld.C6503j;
import p168ld.C6516s;
import p168ld.RunnableC6507m;
import p193nb.C7321e;
import p291uc.C9552h1;
import p291uc.C9678w2;
import p350yd.AbstractC10524a;
import p350yd.C10930q6;

public class C4626e6 extends AbstractC4761s4 implements AbstractC10524a {
    public TdApi.DiceStickers f15349U2;
    public Path f15350V2;
    public List<C4627a> f15351W2;
    public int f15352X2;
    public int f15353Y2;
    public final int f15354Z2;
    public TdApi.MessageDice f15355a3;
    public TdApi.MessageAnimatedEmoji f15356b3;
    public TdApi.MessageAnimatedEmoji f15357c3;
    public TdApi.MessageAnimatedEmoji f15358d3;
    public boolean f15359e3;
    public float f15360f3;
    public float f15361g3;

    public class C4627a {
        public final TdApi.Sticker f15362a;
        public C6246h f15363b;
        public C6246h f15364c;
        public C6503j f15365d;

        public C4627a(TdApi.Sticker sticker, int i, boolean z, boolean z2) {
            this.f15362a = sticker;
            if (i == 0 || !C7321e.m16976V0(sticker.type)) {
                C6246h D5 = C4779t2.m25704D5(C4626e6.this.f16099O0, sticker.thumbnail);
                this.f15363b = D5;
                if (D5 != null) {
                    D5.m20897s0(1);
                }
            }
            if (C7321e.m16976V0(sticker.type)) {
                C6503j jVar = new C6503j(C4626e6.this.f16099O0, sticker);
                this.f15365d = jVar;
                jVar.m20297I(2);
                this.f15365d.m20305A(i);
                if (z) {
                    this.f15365d.m20298H(z2 || C4626e6.this.f15354Z2 != 0 || C4868i.m24726c2().m24663k1(8L));
                    if (C4626e6.this.f15354Z2 != 2) {
                        return;
                    }
                    if (!C4626e6.this.m26162I5() || C4626e6.this.m25982a6()) {
                        this.f15365d.m20266z(true);
                        this.f15365d.m20302D(true);
                        this.f15363b = null;
                    } else if (C4626e6.this.f15355a3.value != 0) {
                        this.f15365d.m20289b(new Runnable() {
                            @Override
                            public final void run() {
                                C4626e6.C4627a.this.m26799g();
                            }
                        });
                    }
                } else if (z2) {
                    this.f15365d.m20298H(true);
                }
            } else {
                C6246h hVar = new C6246h(C4626e6.this.f16099O0, sticker.sticker);
                this.f15364c = hVar;
                hVar.m20897s0(1);
                this.f15364c.m20889x0();
            }
        }

        public void m26799g() {
            if ((C4626e6.this.f15351W2 != null ? C4626e6.this.f15351W2.indexOf(this) : -1) != -1) {
                this.f15363b = null;
            }
        }

        public TdApi.ClosedVectorPath[] m26802d() {
            return this.f15362a.outline;
        }

        public boolean m26801e() {
            C6503j jVar;
            return m26800f() && (jVar = this.f15365d) != null && jVar.m20276o() && this.f15365d.m20278m() && !this.f15365d.m20270v();
        }

        public boolean m26800f() {
            return C7321e.m16976V0(this.f15362a.type);
        }

        public void m26798h(int i, C6238b bVar, boolean z) {
            if (!z) {
                C6240c l = bVar.m20991l(i);
                if (this.f15363b == null || m26801e()) {
                    l.clear();
                } else if (m26800f() || !C4779t2.m25598T2(this.f15362a.sticker)) {
                    l.m20977j(null, this.f15363b);
                } else {
                    l.clear();
                    this.f15363b = null;
                }
            }
            if (m26800f()) {
                bVar.m20993j(i).m20231r(this.f15365d);
            } else {
                bVar.m20992k(i).m20819G(this.f15364c);
            }
        }
    }

    public C4626e6(C9678w2 w2Var, TdApi.Message message, TdApi.MessageDice messageDice) {
        super(w2Var, message);
        this.f15354Z2 = 2;
        m26832Ca(messageDice, false);
        this.f16099O0.m2781K9().m1878b0(this);
    }

    public void m26814ra() {
        if (!m26030V5()) {
            m26832Ca(this.f15355a3, true);
            m25751y5();
        }
    }

    public void m26813sa(View view, Rect rect) {
        RunnableC6507m j = ((C9552h1) view).getComplexReceiver().m20993j(0L);
        if (j != null) {
            rect.set(j.getLeft(), j.getTop(), j.getRight(), j.getBottom());
            rect.top = (int) (rect.top + (rect.height() * (C4779t2.f16222G.f16283a.equals(this.f15355a3.emoji) ? 0.35f : 0.2f)));
        }
    }

    public void m26812ta(int i) {
        m25742z5(i);
    }

    public void m26811ua() {
        View f;
        RunnableC6507m j;
        if (!m26030V5() && (f = this.f16101P0.mo28226f()) != null && (j = ((C9552h1) f).getComplexReceiver().m20993j(0L)) != null) {
            m25879l8(j.mo20257I0(), j.mo20227y0());
        }
    }

    public void m26810va(C6503j jVar, long j, long j2) {
        int i = this.f15355a3.successAnimationFrameNumber;
        if (i >= j && i < j + j2) {
            this.f16099O0.m2485dd().post(new Runnable() {
                @Override
                public final void run() {
                    C4626e6.this.m26811ua();
                }
            });
            jVar.m20304B(null);
        }
    }

    public void m26809wa(C4627a aVar, int i, C6516s sVar) {
        if (aVar.f15365d.m20279l(this.f15355a3.successAnimationFrameNumber)) {
            aVar.f15365d.m20304B(new C6503j.AbstractC6504a() {
                @Override
                public final void mo20265a(C6503j jVar, long j, long j2) {
                    C4626e6.this.m26810va(jVar, j, j2);
                }
            });
        }
        m25742z5(i);
        GifBridge.m14341f().m14332o(sVar);
    }

    public void m26808xa(final int i, C4627a aVar, final C4627a aVar2, final C6516s sVar) {
        if (m26030V5() || !m25967c5()) {
            GifBridge.m14341f().m14332o(sVar);
            m25742z5(i);
            return;
        }
        aVar.f15365d.m20289b(new Runnable() {
            @Override
            public final void run() {
                C4626e6.this.m26809wa(aVar2, i, sVar);
            }
        });
    }

    public void m26807ya(List list) {
        if (m26030V5()) {
            return;
        }
        if (list == null || !m25967c5() || this.f15351W2 == null || list.size() != this.f15351W2.size()) {
            m25751y5();
        } else if (m25967c5()) {
            final int i = 0;
            while (i < list.size()) {
                final C4627a aVar = (C4627a) list.get(i);
                List<C4627a> list2 = this.f15351W2;
                final C4627a aVar2 = (list2 == null || i >= list2.size()) ? null : this.f15351W2.get(i);
                if (aVar.f15365d == null) {
                    m25742z5(i);
                } else if (aVar2 == null || aVar2.f15365d == null) {
                    aVar.f15365d.m20289b(new Runnable() {
                        @Override
                        public final void run() {
                            C4626e6.this.m26812ta(i);
                        }
                    });
                } else {
                    GifBridge.m14341f().m14339h(aVar2.f15365d, new AbstractC5918j() {
                        @Override
                        public final void mo1330a(Object obj) {
                            C4626e6.this.m26808xa(i, aVar, aVar2, (C6516s) obj);
                        }
                    });
                }
                i++;
            }
        }
    }

    public void m26806za(AtomicInteger atomicInteger, final List list, TdApi.Object object) {
        if (atomicInteger.decrementAndGet() == 0) {
            this.f16099O0.m2485dd().post(new Runnable() {
                @Override
                public final void run() {
                    C4626e6.this.m26807ya(list);
                }
            });
        }
    }

    public boolean m26834Aa() {
        return m26815qa() != 0 && C7321e.m16976V0(m26816pa().type) && C4868i.m24726c2().m24663k1(8L) && m26815qa() != 0;
    }

    public void m26833Ba() {
        this.f16099O0.m2485dd().m3777M8(m26096P0(), m26816pa().setId);
    }

    public final void m26832Ca(TdApi.MessageDice messageDice, boolean z) {
        this.f15355a3 = messageDice;
        C10930q6 q6Var = this.f16099O0;
        String str = messageDice.emoji;
        int i = messageDice.value;
        TdApi.DiceStickers diceStickers = messageDice.finalState;
        if (diceStickers == null) {
            diceStickers = messageDice.initialState;
        }
        TdApi.DiceStickers j5 = q6Var.m2397j5(str, i, diceStickers);
        if (j5 != null) {
            m26831Da(j5, 0, z, messageDice.finalState != null);
        }
    }

    public final void m26831Da(TdApi.DiceStickers diceStickers, int i, boolean z, boolean z2) {
        this.f15349U2 = diceStickers;
        ArrayList arrayList = new ArrayList();
        int constructor = diceStickers.getConstructor();
        if (constructor == -740299570) {
            arrayList.add(new C4627a(((TdApi.DiceStickersRegular) diceStickers).sticker, i, z2, false));
        } else if (constructor == -375223124) {
            TdApi.DiceStickersSlotMachine diceStickersSlotMachine = (TdApi.DiceStickersSlotMachine) diceStickers;
            arrayList.add(new C4627a(diceStickersSlotMachine.background, i, z2, true));
            arrayList.add(new C4627a(diceStickersSlotMachine.leftReel, i, z2, false));
            arrayList.add(new C4627a(diceStickersSlotMachine.centerReel, i, z2, false));
            arrayList.add(new C4627a(diceStickersSlotMachine.rightReel, i, z2, false));
            arrayList.add(new C4627a(diceStickersSlotMachine.lever, i, z2, true));
        } else {
            throw new UnsupportedOperationException(diceStickers.toString());
        }
        this.f15351W2 = arrayList;
    }

    public final boolean m26830Ea() {
        TdApi.MessageAnimatedEmoji messageAnimatedEmoji = this.f15358d3;
        if (messageAnimatedEmoji == null) {
            messageAnimatedEmoji = this.f15357c3;
        }
        TdApi.MessageAnimatedEmoji messageAnimatedEmoji2 = this.f15356b3;
        if (messageAnimatedEmoji2 == messageAnimatedEmoji || (messageAnimatedEmoji2 != null && messageAnimatedEmoji == null)) {
            return false;
        }
        this.f15356b3 = messageAnimatedEmoji;
        m26831Da(new TdApi.DiceStickersRegular(messageAnimatedEmoji.animatedEmoji.sticker), messageAnimatedEmoji.animatedEmoji.fitzpatrickType, false, true);
        return true;
    }

    @Override
    public int mo26198F1(View view, int i) {
        if (this.f16122a.forwardInfo != null) {
            return super.mo26198F1(view, i);
        }
        int oa = m26817oa();
        int i2 = (this.f15352X2 + oa) - i;
        return (!m26068R9() || m25918h6()) ? i2 : Math.max(oa, i2);
    }

    @Override
    public void mo25334L8(C6238b bVar, boolean z, int i) {
        List<C4627a> list = this.f15351W2;
        if (list == null || list.isEmpty()) {
            bVar.m20999d();
        } else if (i < 0 || i >= this.f15351W2.size()) {
            int i2 = 0;
            for (C4627a aVar : this.f15351W2) {
                aVar.m26798h(i2, bVar, z);
                i2++;
            }
            bVar.m20996g(i2);
        } else {
            this.f15351W2.get(i).m26798h(i, bVar, z);
        }
    }

    @Override
    public boolean mo25333L9(TdApi.Message message, TdApi.MessageContent messageContent, boolean z) {
        if (this.f15354Z2 == 2 && messageContent.getConstructor() == 1115779641) {
            final List<C4627a> list = this.f15351W2;
            TdApi.MessageDice messageDice = (TdApi.MessageDice) messageContent;
            TdApi.MessageDice messageDice2 = this.f15355a3;
            boolean z2 = (messageDice2 == null || messageDice2.finalState == null) ? false : true;
            boolean z3 = (messageDice2 == null || messageDice2.initialState == null) ? false : true;
            boolean z4 = messageDice.finalState != null;
            m26832Ca(messageDice, true);
            if (!z3 || z2 || !z4) {
                m25751y5();
            } else {
                C5321d dVar = new C5321d();
                int constructor = this.f15349U2.getConstructor();
                if (constructor == -740299570) {
                    dVar.m23276h(((TdApi.DiceStickersRegular) this.f15349U2).sticker.sticker.f25373id);
                } else if (constructor == -375223124) {
                    TdApi.DiceStickersSlotMachine diceStickersSlotMachine = (TdApi.DiceStickersSlotMachine) this.f15349U2;
                    dVar.m23276h(diceStickersSlotMachine.background.sticker.f25373id);
                    dVar.m23276h(diceStickersSlotMachine.leftReel.sticker.f25373id);
                    dVar.m23276h(diceStickersSlotMachine.centerReel.sticker.f25373id);
                    dVar.m23276h(diceStickersSlotMachine.rightReel.sticker.f25373id);
                    dVar.m23276h(diceStickersSlotMachine.lever.sticker.f25373id);
                } else {
                    throw new UnsupportedOperationException(this.f15349U2.toString());
                }
                final AtomicInteger atomicInteger = new AtomicInteger(dVar.size());
                Client.AbstractC7865g b6Var = new Client.AbstractC7865g() {
                    @Override
                    public final void mo255t2(TdApi.Object object) {
                        C4626e6.this.m26806za(atomicInteger, list, object);
                    }
                };
                Iterator<Integer> it = dVar.iterator();
                while (it.hasNext()) {
                    this.f16099O0.m2270r4().m14783o(new TdApi.DownloadFile(it.next().intValue(), 1, 0, 0, true), b6Var);
                }
            }
        } else if (this.f15354Z2 == 1 && messageContent.getConstructor() == 908195298) {
            this.f15357c3 = (TdApi.MessageAnimatedEmoji) messageContent;
            if (m26830Ea()) {
                m25751y5();
            }
            return true;
        }
        return false;
    }

    @Override
    public boolean mo26066S0() {
        return true;
    }

    @Override
    public void mo26060S6(boolean z) {
        super.mo26060S6(z);
        TdApi.MessageDice messageDice = this.f15355a3;
        if (messageDice != null && messageDice.finalState != null) {
            m26831Da(this.f15349U2, 0, false, true);
        }
    }

    @Override
    public void mo25321V7() {
        if (this.f15354Z2 != 0) {
            this.f16099O0.m2781K9().m1830n0(this);
        }
    }

    @Override
    public boolean mo26016X0() {
        return true;
    }

    @Override
    public int mo25222X2() {
        return Math.max(C1357a0.m37541i(56.0f), this.f15353Y2) + ((this.f15354Z2 != 2 || !m26068R9() || m26046T9()) ? 0 : mo25784v2() + AbstractC4761s4.m25794u2() + C1357a0.m37541i(2.0f));
    }

    @Override
    public void mo25221a0(int i) {
        float f;
        TdApi.Sticker pa2 = m26816pa();
        float i2 = C1357a0.m37541i(m26046T9() ? 120.0f : 190.0f);
        if (this.f15354Z2 != 0 || pa2.setId == 1258816259751983L) {
            i2 = (float) (i2 * this.f16099O0.m2524b5());
        }
        if (pa2 != null) {
            f = Math.min(i2 / pa2.width, i2 / pa2.height);
            this.f15352X2 = (int) (pa2.width * f);
            this.f15353Y2 = (int) (pa2.height * f);
        } else {
            this.f15353Y2 = 0;
            this.f15352X2 = 0;
            f = 1.0f;
        }
        if (this.f15352X2 == 0 && this.f15353Y2 == 0) {
            int i3 = (int) i2;
            this.f15353Y2 = i3;
            this.f15352X2 = i3;
            f = i2 / 512.0f;
        }
        Path path = this.f15350V2;
        if (path != null) {
            path.reset();
        }
        List<C4627a> list = this.f15351W2;
        if (list != null) {
            for (C4627a aVar : list) {
                this.f15350V2 = C7321e.m16961c(aVar.m26802d(), f, this.f15350V2);
                if (aVar.f15364c != null) {
                    aVar.f15364c.mo20767t0(Math.max(this.f15352X2, this.f15353Y2));
                }
            }
        }
    }

    @Override
    public int mo25980a8(long j, long j2, int i) {
        if (this.f15354Z2 == 1) {
            TdApi.MessageContent M5 = this.f16099O0.m2753M5(j, j2);
            if (M5 == null && this.f15357c3 == null) {
                return 3;
            }
            if (M5 != null && M5.getConstructor() != 908195298) {
                return 3;
            }
            this.f15358d3 = (TdApi.MessageAnimatedEmoji) M5;
            if (m26830Ea()) {
                m25740z8();
                m25751y5();
                return mo25354J3() == i ? 1 : 2;
            }
        }
        return super.mo25980a8(j, j2, i);
    }

    @Override
    public int mo25219b2() {
        return 0;
    }

    @Override
    public void mo25312c1(C9552h1 h1Var, Canvas canvas, int i, int i2, int i3, C6238b bVar) {
        int oa = m26817oa();
        int e3 = m25949e3();
        int i4 = oa + this.f15352X2;
        int e32 = m25949e3() + this.f15353Y2;
        List<C4627a> list = this.f15351W2;
        if (list != null) {
            if (this.f15350V2 != null) {
                boolean z = false;
                int i5 = 0;
                for (C4627a aVar : list) {
                    C6240c l = bVar.m20991l(i5);
                    long j = i5;
                    if ((aVar.m26800f() ? bVar.m20993j(j) : bVar.m20992k(j)).mo20246c0() && l.mo20246c0()) {
                        z = true;
                    }
                    i5++;
                }
                if (z) {
                    canvas.save();
                    canvas.translate(oa, e3);
                    canvas.drawPath(this.f15350V2, C1410y.m37057U());
                    canvas.restore();
                }
            }
            int i6 = 0;
            for (C4627a aVar2 : this.f15351W2) {
                C1359b.m37498u(canvas, bVar.m20991l(i6), aVar2.m26800f() ? bVar.m20993j(i6) : bVar.m20992k(i6), !aVar2.m26800f(), false, oa, e3, i4, e32);
                i6++;
            }
        }
    }

    @Override
    public int mo25218c3() {
        return this.f15352X2;
    }

    @Override
    public boolean mo25217f8(p291uc.C9552h1 r10, android.view.MotionEvent r11) {
        throw new UnsupportedOperationException("Method not decompiled: gd.C4626e6.mo25217f8(uc.h1, android.view.MotionEvent):boolean");
    }

    @Override
    public void mo4826g(int i) {
        if (this.f15354Z2 == 2 && i == 2) {
            this.f16099O0.m2485dd().post(new Runnable() {
                @Override
                public final void run() {
                    C4626e6.this.m26814ra();
                }
            });
        }
    }

    @Override
    public boolean mo25298k7() {
        return true;
    }

    @Override
    public boolean mo25295m8(View view, float f, float f2) {
        boolean m8 = super.mo25295m8(view, f, f2);
        this.f15359e3 = false;
        return m8;
    }

    public final int m26817oa() {
        return (!m25918h6() || m26098O9()) ? m25959d3() : m26176H1() - this.f15352X2;
    }

    public final TdApi.Sticker m26816pa() {
        TdApi.DiceStickers diceStickers = this.f15349U2;
        if (diceStickers == null) {
            return null;
        }
        int constructor = diceStickers.getConstructor();
        if (constructor == -740299570) {
            return ((TdApi.DiceStickersRegular) this.f15349U2).sticker;
        }
        if (constructor == -375223124) {
            return ((TdApi.DiceStickersSlotMachine) this.f15349U2).background;
        }
        throw new UnsupportedOperationException(this.f15349U2.toString());
    }

    public final long m26815qa() {
        TdApi.Sticker pa2 = this.f15354Z2 == 0 ? m26816pa() : null;
        if (pa2 != null) {
            return pa2.setId;
        }
        return 0L;
    }

    @Override
    public int mo25784v2() {
        return C1357a0.m37541i(4.0f);
    }

    public C4626e6(C9678w2 w2Var, TdApi.Message message, TdApi.MessageAnimatedEmoji messageAnimatedEmoji, TdApi.MessageAnimatedEmoji messageAnimatedEmoji2) {
        super(w2Var, message);
        this.f15357c3 = messageAnimatedEmoji;
        this.f15358d3 = messageAnimatedEmoji2;
        this.f15354Z2 = 1;
        m26830Ea();
    }

    public C4626e6(C9678w2 w2Var, TdApi.Message message, TdApi.Sticker sticker, boolean z, int i) {
        super(w2Var, message);
        this.f15354Z2 = z ? 1 : 0;
        m26831Da(new TdApi.DiceStickersRegular(sticker), i, false, true);
    }
}
