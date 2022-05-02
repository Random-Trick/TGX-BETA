package sc;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import gd.C4618d7;
import gd.C4779t2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.drinkless.p210td.libcore.telegram.Client;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import p053dd.View$OnClickListenerC4013l;

public class C8861z0 extends AbstractC8809o<Void> implements Client.AbstractC7865g, View$OnClickListenerC4013l.AbstractC4014a {
    public static final String[] f28610K0 = {"bing", "wiki", "gif", "nephobot", "vid"};
    public View$OnClickListenerC4013l f28611I0;
    public ArrayList<C4618d7> f28612J0 = new ArrayList<>(f28610K0.length);

    public C8861z0(View$OnClickListenerC8851y1 y1Var) {
        super(y1Var, (int) R.string.InlineBot);
    }

    public void m11089yg(List list) {
        this.f28611I0.m29324h0(list);
        m11285lf(this.f28611I0);
    }

    public void m11088zg() {
        m11099Bg(this.f28612J0);
    }

    public final void m11098Cg() {
        int size = this.f28612J0.size();
        String[] strArr = f28610K0;
        if (size <= strArr.length) {
            if (this.f28612J0.size() == strArr.length) {
                m9151ud(new Runnable() {
                    @Override
                    public final void run() {
                        C8861z0.this.m11088zg();
                    }
                });
            } else {
                this.f30170b.m2270r4().m14783o(new TdApi.SearchPublicChat(strArr[this.f28612J0.size()]), this);
            }
        }
    }

    @Override
    public void mo11097O1(C4618d7 d7Var) {
        this.f28443n0.m11132i2(d7Var);
    }

    @Override
    public int mo407R9() {
        return R.id.controller_media_inlineBots;
    }

    @Override
    public void mo11096f0(int i, C4618d7 d7Var, boolean z) {
    }

    @Override
    public View mo403oc(Context context) {
        m11300bf(true);
        m11288jg(new LinearLayoutManager(mo4347s(), 1, false));
        View$OnClickListenerC4013l lVar = new View$OnClickListenerC4013l(this, this, 1, this);
        this.f28611I0 = lVar;
        m11292hg(lVar);
        this.f30170b.m2270r4().m14783o(new TdApi.GetTopChats(new TdApi.TopChatCategoryInlineBots(), 50), this);
        return this.f28451v0;
    }

    @Override
    public void mo255t2(TdApi.Object object) {
        switch (object.getConstructor()) {
            case TdApi.Error.CONSTRUCTOR:
                m11291if(C4779t2.m25379z5(object), true);
                return;
            case TdApi.Chat.CONSTRUCTOR:
                m11091wg(this.f30170b.m2525b4((TdApi.Chat) object));
                return;
            case TdApi.Users.CONSTRUCTOR:
                long[] jArr = ((TdApi.Users) object).userIds;
                if (jArr.length == 0) {
                    m11098Cg();
                    return;
                }
                ArrayList<TdApi.User> T2 = this.f30170b.m2480e2().m1686T2(jArr);
                final ArrayList arrayList = new ArrayList(jArr.length);
                Iterator<TdApi.User> it = T2.iterator();
                while (it.hasNext()) {
                    arrayList.add(C4618d7.m26885e(this.f30170b, it.next()));
                }
                m9151ud(new Runnable() {
                    @Override
                    public final void run() {
                        C8861z0.this.m11099Bg(arrayList);
                    }
                });
                return;
            case TdApi.Chats.CONSTRUCTOR:
                long[] jArr2 = ((TdApi.Chats) object).chatIds;
                if (jArr2.length == 0) {
                    m11098Cg();
                    return;
                }
                final ArrayList arrayList2 = new ArrayList(jArr2.length);
                for (TdApi.Chat chat : this.f30170b.m2414i4(jArr2)) {
                    TdApi.User b4 = this.f30170b.m2525b4(chat);
                    if (b4 != null) {
                        arrayList2.add(C4618d7.m26885e(this.f30170b, b4));
                    }
                }
                if (arrayList2.isEmpty()) {
                    this.f30170b.m2270r4().m14783o(new TdApi.GetRecentInlineBots(), this);
                    return;
                } else {
                    m9151ud(new Runnable() {
                        @Override
                        public final void run() {
                            C8861z0.this.m11100Ag(arrayList2);
                        }
                    });
                    return;
                }
            default:
                return;
        }
    }

    public final void m11091wg(TdApi.User user) {
        this.f28612J0.add(C4618d7.m26885e(this.f30170b, user));
        m11098Cg();
    }

    public void m11099Bg(final List<C4618d7> list) {
        if (list.isEmpty()) {
            m11284lg(R.string.NothingFound, true);
        } else {
            m11327Hf(new Runnable() {
                @Override
                public final void run() {
                    C8861z0.this.m11089yg(list);
                }
            });
        }
    }
}
