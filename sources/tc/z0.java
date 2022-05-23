package tc;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import ed.l;
import hd.d7;
import hd.t2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.drinkless.td.libcore.telegram.Client;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;

public class z0 extends o<Void> implements Client.g, l.a {
    public static final String[] K0 = {"bing", "wiki", "gif", "nephobot", "vid"};
    public l I0;
    public ArrayList<d7> J0 = new ArrayList<>(K0.length);

    public z0(y1 y1Var) {
        super(y1Var, (int) R.string.InlineBot);
    }

    public void yg(List list) {
        this.I0.g0(list);
        lf(this.I0);
    }

    public void zg() {
        Bg(this.J0);
    }

    public final void Cg() {
        int size = this.J0.size();
        String[] strArr = K0;
        if (size <= strArr.length) {
            if (this.J0.size() == strArr.length) {
                ud(new Runnable() {
                    @Override
                    public final void run() {
                        z0.this.zg();
                    }
                });
            } else {
                this.f24495b.v4().o(new TdApi.SearchPublicChat(strArr[this.J0.size()]), this);
            }
        }
    }

    @Override
    public int R9() {
        return R.id.controller_media_inlineBots;
    }

    @Override
    public void n0(d7 d7Var) {
        this.f23267n0.g2(d7Var);
    }

    @Override
    public View oc(Context context) {
        bf(true);
        jg(new LinearLayoutManager(t(), 1, false));
        l lVar = new l(this, this, 1, this);
        this.I0 = lVar;
        hg(lVar);
        this.f24495b.v4().o(new TdApi.GetTopChats(new TdApi.TopChatCategoryInlineBots(), 50), this);
        return this.f23275v0;
    }

    @Override
    public void r2(TdApi.Object object) {
        switch (object.getConstructor()) {
            case TdApi.Error.CONSTRUCTOR:
                m35if(t2.z5(object), true);
                return;
            case TdApi.Chat.CONSTRUCTOR:
                wg(this.f24495b.f4((TdApi.Chat) object));
                return;
            case TdApi.Users.CONSTRUCTOR:
                long[] jArr = ((TdApi.Users) object).userIds;
                if (jArr.length == 0) {
                    Cg();
                    return;
                }
                ArrayList<TdApi.User> T2 = this.f24495b.e2().T2(jArr);
                final ArrayList arrayList = new ArrayList(jArr.length);
                Iterator<TdApi.User> it = T2.iterator();
                while (it.hasNext()) {
                    arrayList.add(d7.e(this.f24495b, it.next()));
                }
                ud(new Runnable() {
                    @Override
                    public final void run() {
                        z0.this.Bg(arrayList);
                    }
                });
                return;
            case TdApi.Chats.CONSTRUCTOR:
                long[] jArr2 = ((TdApi.Chats) object).chatIds;
                if (jArr2.length == 0) {
                    Cg();
                    return;
                }
                final ArrayList arrayList2 = new ArrayList(jArr2.length);
                for (TdApi.Chat chat : this.f24495b.m4(jArr2)) {
                    TdApi.User f42 = this.f24495b.f4(chat);
                    if (f42 != null) {
                        arrayList2.add(d7.e(this.f24495b, f42));
                    }
                }
                if (arrayList2.isEmpty()) {
                    this.f24495b.v4().o(new TdApi.GetRecentInlineBots(), this);
                    return;
                } else {
                    ud(new Runnable() {
                        @Override
                        public final void run() {
                            z0.this.Ag(arrayList2);
                        }
                    });
                    return;
                }
            default:
                return;
        }
    }

    @Override
    public void u0(int i10, d7 d7Var, boolean z10) {
    }

    public final void wg(TdApi.User user) {
        this.J0.add(d7.e(this.f24495b, user));
        Cg();
    }

    public void Bg(final List<d7> list) {
        if (list.isEmpty()) {
            lg(R.string.NothingFound, true);
        } else {
            Hf(new Runnable() {
                @Override
                public final void run() {
                    z0.this.yg(list);
                }
            });
        }
    }
}
