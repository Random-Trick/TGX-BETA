package gd;

import android.util.SparseIntArray;
import be.C1363c0;
import gd.C4587b;
import java.util.ArrayList;
import java.util.Collections;
import org.drinkless.p210td.libcore.telegram.TdApi;
import p124ib.C5322e;
import p124ib.C5326i;
import p143k0.C6035e;
import p156kd.C6246h;
import p193nb.C7316a;
import p350yd.C10930q6;
import vc.C9903a;

public class C4826w6 {
    public final C10930q6 f16443a;
    public final C6035e<C4827a> f16444b = new C6035e<>();
    public final C4827a f16445c;
    public final C4827a f16446d;
    public final C4827a f16447e;
    public final C4827a f16448f;
    public final ArrayList<C4827a> f16449g;

    public static class C4827a implements Comparable<C4827a> {
        public final boolean f16450M;
        public final boolean f16451N;
        public final C6246h f16452O;
        public final C4587b.C4588a f16453P;
        public long f16454Q;
        public long f16455R;
        public final C5326i f16456S;
        public final SparseIntArray f16457T;
        public long[] f16458U;
        public final C10930q6 f16459a;
        public final long f16460b;
        public final String f16461c;

        public C4827a(C10930q6 q6Var, long j) {
            TdApi.ChatPhotoInfo chatPhotoInfo;
            this.f16459a = q6Var;
            this.f16460b = j;
            this.f16461c = q6Var.m2691Q3(j);
            boolean g7 = q6Var.m2443g7(j);
            this.f16451N = g7;
            TdApi.Chat U2 = q6Var.m2632U2(j);
            if (U2 != null) {
                this.f16450M = C7316a.m17051j(j);
                if (g7 || (chatPhotoInfo = U2.photo) == null || C4779t2.m25605S2(chatPhotoInfo.small)) {
                    this.f16452O = null;
                    this.f16453P = q6Var.m2899D3(U2, true);
                } else {
                    C6246h hVar = new C6246h(q6Var, U2.photo.small);
                    this.f16452O = hVar;
                    hVar.mo20768t0(C9903a.getDefaultAvatarCacheSize());
                    this.f16453P = null;
                }
            } else {
                this.f16450M = false;
                this.f16453P = new C4587b.C4588a();
                this.f16452O = null;
            }
            this.f16456S = new C5326i();
            this.f16457T = new SparseIntArray();
        }

        public int compareTo(C4827a aVar) {
            long j = this.f16454Q;
            long j2 = aVar.f16454Q;
            if (j <= j2) {
                if (j < j2) {
                    return 1;
                }
                long j3 = this.f16455R;
                long j4 = aVar.f16455R;
                if (j3 <= j4) {
                    return j3 < j4 ? 1 : 0;
                }
            }
            return -1;
        }

        public C6246h m25141c() {
            return this.f16452O;
        }

        public C4587b.C4588a m25140d() {
            return this.f16453P;
        }

        public SparseIntArray m25139e() {
            return this.f16457T;
        }

        public long[] m25138f() {
            return this.f16458U;
        }

        public long m25137g() {
            return this.f16460b;
        }

        public long m25136h() {
            return this.f16454Q;
        }

        public C5326i m25135i() {
            return this.f16456S;
        }

        public long[] m25134j() {
            long j = this.f16460b;
            if (j != 0) {
                return new long[]{j};
            }
            return null;
        }

        public String m25133k() {
            return this.f16461c;
        }

        public boolean m25132l() {
            return this.f16454Q == 0;
        }

        public boolean m25131m() {
            return this.f16450M;
        }

        public boolean m25130n() {
            return this.f16451N;
        }

        public void m25129o(TdApi.StorageStatisticsByFileType storageStatisticsByFileType, int i) {
            if (this.f16460b == 0 || !C4826w6.m25147h(i)) {
                this.f16454Q += storageStatisticsByFileType.size;
                this.f16455R += storageStatisticsByFileType.count;
                int d = this.f16456S.m23236d(i);
                if (d >= 0) {
                    long i2 = this.f16456S.m23231i(d);
                    int valueAt = this.f16457T.valueAt(d);
                    this.f16456S.m23233g(d, i2 + storageStatisticsByFileType.size);
                    this.f16457T.put(i, valueAt + storageStatisticsByFileType.count);
                    return;
                }
                this.f16456S.m23234f(i, storageStatisticsByFileType.size);
                this.f16457T.put(i, storageStatisticsByFileType.count);
            }
        }

        public void m25128p(long[] jArr) {
            this.f16458U = jArr;
        }
    }

    public C4826w6(C10930q6 q6Var, TdApi.StorageStatistics storageStatistics) {
        TdApi.StorageStatisticsByChat[] storageStatisticsByChatArr;
        TdApi.StorageStatisticsByFileType[] storageStatisticsByFileTypeArr;
        int i;
        this.f16443a = q6Var;
        this.f16445c = new C4827a(q6Var, 0L);
        this.f16446d = new C4827a(q6Var, 0L);
        this.f16448f = new C4827a(q6Var, 0L);
        this.f16447e = new C4827a(q6Var, 0L);
        for (TdApi.StorageStatisticsByChat storageStatisticsByChat : storageStatistics.byChat) {
            for (TdApi.StorageStatisticsByFileType storageStatisticsByFileType : storageStatisticsByChat.byFileType) {
                switch (storageStatisticsByFileType.fileType.getConstructor()) {
                    case TdApi.FileTypeSecret.CONSTRUCTOR:
                        i = 7;
                        break;
                    case TdApi.FileTypePhoto.CONSTRUCTOR:
                        i = 0;
                        break;
                    case TdApi.FileTypeSecretThumbnail.CONSTRUCTOR:
                        i = 13;
                        break;
                    case TdApi.FileTypeAudio.CONSTRUCTOR:
                        i = 5;
                        break;
                    case TdApi.FileTypeVoiceNote.CONSTRUCTOR:
                        i = 2;
                        break;
                    case TdApi.FileTypeDocument.CONSTRUCTOR:
                        i = 4;
                        break;
                    case TdApi.FileTypeVideoNote.CONSTRUCTOR:
                        i = 3;
                        break;
                    case TdApi.FileTypeAnimation.CONSTRUCTOR:
                        i = 6;
                        break;
                    case TdApi.FileTypeThumbnail.CONSTRUCTOR:
                        i = 8;
                        break;
                    case TdApi.FileTypeSticker.CONSTRUCTOR:
                        i = 9;
                        break;
                    case TdApi.FileTypeVideo.CONSTRUCTOR:
                        i = 1;
                        break;
                    case TdApi.FileTypeProfilePhoto.CONSTRUCTOR:
                        i = 10;
                        break;
                    case TdApi.FileTypeWallpaper.CONSTRUCTOR:
                        i = 12;
                        break;
                    default:
                        i = 11;
                        break;
                }
                m25144k(storageStatisticsByFileType, i, storageStatisticsByChat.chatId);
            }
        }
        int p = this.f16444b.m21497p();
        C5322e eVar = new C5322e(p);
        this.f16449g = new ArrayList<>(p);
        for (int i2 = 0; i2 < p; i2++) {
            C4827a q = this.f16444b.m21496q(i2);
            if (!q.m25132l()) {
                this.f16449g.add(q);
                eVar.m23276a(q.m25137g());
            }
        }
        Collections.sort(this.f16449g);
        this.f16447e.m25128p(eVar.m23270g());
    }

    public static boolean m25147h(int i) {
        return i == 10 || i == 11 || i == 9 || i == 8 || i == 12 || i == 13;
    }

    public static boolean m25145j(int i) {
        return i == 10 || i == 9 || i == 8 || i == 12;
    }

    public ArrayList<C4827a> m25153b() {
        return this.f16449g;
    }

    public long m25152c() {
        return this.f16445c.m25136h();
    }

    public String m25151d() {
        return C1363c0.m37426m(this.f16446d.f16454Q);
    }

    public C4827a m25150e() {
        return this.f16447e;
    }

    public C4827a m25149f() {
        return this.f16448f;
    }

    public C4827a m25148g() {
        return this.f16446d;
    }

    public boolean m25146i() {
        return this.f16446d.m25132l();
    }

    public final void m25144k(TdApi.StorageStatisticsByFileType storageStatisticsByFileType, int i, long j) {
        C4827a aVar;
        this.f16446d.m25129o(storageStatisticsByFileType, i);
        if (j != 0 && !m25147h(i)) {
            aVar = this.f16444b.m21506f(j);
            if (aVar == null) {
                aVar = new C4827a(this.f16443a, j);
                this.f16444b.m21501k(j, aVar);
            }
        } else if (i == 13) {
            aVar = this.f16445c;
        } else if (m25147h(i)) {
            aVar = this.f16448f;
        } else {
            aVar = this.f16447e;
        }
        aVar.m25129o(storageStatisticsByFileType, i);
    }
}
