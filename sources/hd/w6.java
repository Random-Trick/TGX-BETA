package hd;

import android.util.SparseIntArray;
import ce.c0;
import hd.b;
import java.util.ArrayList;
import java.util.Collections;
import jb.i;
import k0.e;
import ld.h;
import org.drinkless.td.libcore.telegram.TdApi;
import zd.o6;

public class w6 {
    public final o6 f13701a;
    public final e<a> f13702b = new e<>();
    public final a f13703c;
    public final a f13704d;
    public final a f13705e;
    public final a f13706f;
    public final ArrayList<a> f13707g;

    public static class a implements Comparable<a> {
        public final boolean M;
        public final boolean N;
        public final h O;
        public final b.a P;
        public long Q;
        public long R;
        public final i S;
        public final SparseIntArray T;
        public long[] U;
        public final o6 f13708a;
        public final long f13709b;
        public final String f13710c;

        public a(o6 o6Var, long j10) {
            TdApi.ChatPhotoInfo chatPhotoInfo;
            this.f13708a = o6Var;
            this.f13709b = j10;
            this.f13710c = o6Var.U3(j10);
            boolean k72 = o6Var.k7(j10);
            this.N = k72;
            TdApi.Chat W2 = o6Var.W2(j10);
            if (W2 != null) {
                this.M = ob.a.j(j10);
                if (k72 || (chatPhotoInfo = W2.photo) == null || t2.S2(chatPhotoInfo.small)) {
                    this.O = null;
                    this.P = o6Var.G3(W2, true);
                } else {
                    h hVar = new h(o6Var, W2.photo.small);
                    this.O = hVar;
                    hVar.t0(wc.a.getDefaultAvatarCacheSize());
                    this.P = null;
                }
            } else {
                this.M = false;
                this.P = new b.a();
                this.O = null;
            }
            this.S = new i();
            this.T = new SparseIntArray();
        }

        public int compareTo(a aVar) {
            long j10 = this.Q;
            long j11 = aVar.Q;
            if (j10 <= j11) {
                if (j10 < j11) {
                    return 1;
                }
                long j12 = this.R;
                long j13 = aVar.R;
                if (j12 <= j13) {
                    return j12 < j13 ? 1 : 0;
                }
            }
            return -1;
        }

        public h c() {
            return this.O;
        }

        public b.a d() {
            return this.P;
        }

        public SparseIntArray e() {
            return this.T;
        }

        public long[] f() {
            return this.U;
        }

        public long g() {
            return this.f13709b;
        }

        public long h() {
            return this.Q;
        }

        public i i() {
            return this.S;
        }

        public long[] j() {
            long j10 = this.f13709b;
            if (j10 != 0) {
                return new long[]{j10};
            }
            return null;
        }

        public String k() {
            return this.f13710c;
        }

        public boolean l() {
            return this.Q == 0;
        }

        public boolean m() {
            return this.M;
        }

        public boolean n() {
            return this.N;
        }

        public void o(TdApi.StorageStatisticsByFileType storageStatisticsByFileType, int i10) {
            if (this.f13709b == 0 || !w6.h(i10)) {
                this.Q += storageStatisticsByFileType.size;
                this.R += storageStatisticsByFileType.count;
                int d10 = this.S.d(i10);
                if (d10 >= 0) {
                    long i11 = this.S.i(d10);
                    int valueAt = this.T.valueAt(d10);
                    this.S.g(d10, i11 + storageStatisticsByFileType.size);
                    this.T.put(i10, valueAt + storageStatisticsByFileType.count);
                    return;
                }
                this.S.f(i10, storageStatisticsByFileType.size);
                this.T.put(i10, storageStatisticsByFileType.count);
            }
        }

        public void p(long[] jArr) {
            this.U = jArr;
        }
    }

    public w6(o6 o6Var, TdApi.StorageStatistics storageStatistics) {
        TdApi.StorageStatisticsByChat[] storageStatisticsByChatArr;
        TdApi.StorageStatisticsByFileType[] storageStatisticsByFileTypeArr;
        int i10;
        this.f13701a = o6Var;
        this.f13703c = new a(o6Var, 0L);
        this.f13704d = new a(o6Var, 0L);
        this.f13706f = new a(o6Var, 0L);
        this.f13705e = new a(o6Var, 0L);
        for (TdApi.StorageStatisticsByChat storageStatisticsByChat : storageStatistics.byChat) {
            for (TdApi.StorageStatisticsByFileType storageStatisticsByFileType : storageStatisticsByChat.byFileType) {
                switch (storageStatisticsByFileType.fileType.getConstructor()) {
                    case TdApi.FileTypeSecret.CONSTRUCTOR:
                        i10 = 7;
                        break;
                    case TdApi.FileTypePhoto.CONSTRUCTOR:
                        i10 = 0;
                        break;
                    case TdApi.FileTypeSecretThumbnail.CONSTRUCTOR:
                        i10 = 13;
                        break;
                    case TdApi.FileTypeAudio.CONSTRUCTOR:
                        i10 = 5;
                        break;
                    case TdApi.FileTypeVoiceNote.CONSTRUCTOR:
                        i10 = 2;
                        break;
                    case TdApi.FileTypeDocument.CONSTRUCTOR:
                        i10 = 4;
                        break;
                    case TdApi.FileTypeVideoNote.CONSTRUCTOR:
                        i10 = 3;
                        break;
                    case TdApi.FileTypeAnimation.CONSTRUCTOR:
                        i10 = 6;
                        break;
                    case TdApi.FileTypeThumbnail.CONSTRUCTOR:
                        i10 = 8;
                        break;
                    case TdApi.FileTypeSticker.CONSTRUCTOR:
                        i10 = 9;
                        break;
                    case TdApi.FileTypeVideo.CONSTRUCTOR:
                        i10 = 1;
                        break;
                    case TdApi.FileTypeProfilePhoto.CONSTRUCTOR:
                        i10 = 10;
                        break;
                    case TdApi.FileTypeWallpaper.CONSTRUCTOR:
                        i10 = 12;
                        break;
                    default:
                        i10 = 11;
                        break;
                }
                k(storageStatisticsByFileType, i10, storageStatisticsByChat.chatId);
            }
        }
        int p10 = this.f13702b.p();
        jb.e eVar = new jb.e(p10);
        this.f13707g = new ArrayList<>(p10);
        for (int i11 = 0; i11 < p10; i11++) {
            a q10 = this.f13702b.q(i11);
            if (!q10.l()) {
                this.f13707g.add(q10);
                eVar.a(q10.g());
            }
        }
        Collections.sort(this.f13707g);
        this.f13705e.p(eVar.g());
    }

    public static boolean h(int i10) {
        return i10 == 10 || i10 == 11 || i10 == 9 || i10 == 8 || i10 == 12 || i10 == 13;
    }

    public static boolean j(int i10) {
        return i10 == 10 || i10 == 9 || i10 == 8 || i10 == 12;
    }

    public ArrayList<a> b() {
        return this.f13707g;
    }

    public long c() {
        return this.f13703c.h();
    }

    public String d() {
        return c0.m(this.f13704d.Q);
    }

    public a e() {
        return this.f13705e;
    }

    public a f() {
        return this.f13706f;
    }

    public a g() {
        return this.f13704d;
    }

    public boolean i() {
        return this.f13704d.l();
    }

    public final void k(TdApi.StorageStatisticsByFileType storageStatisticsByFileType, int i10, long j10) {
        a aVar;
        this.f13704d.o(storageStatisticsByFileType, i10);
        if (j10 != 0 && !h(i10)) {
            aVar = this.f13702b.f(j10);
            if (aVar == null) {
                aVar = new a(this.f13701a, j10);
                this.f13702b.k(j10, aVar);
            }
        } else if (i10 == 13) {
            aVar = this.f13703c;
        } else if (h(i10)) {
            aVar = this.f13706f;
        } else {
            aVar = this.f13705e;
        }
        aVar.o(storageStatisticsByFileType, i10);
    }
}
