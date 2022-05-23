package hd;

import ce.c0;
import de.ra;
import gd.w;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;

public class k6 {
    public final long[][] f13199a = {new long[14], new long[14], new long[1]};
    public final long[][] f13200b = {new long[14], new long[14], new long[1]};
    public final long[][] f13201c = {new long[14], new long[14], new long[1]};
    public final long[][] f13202d = {new long[14], new long[14], new long[1]};
    public int f13203e;

    public k6(TdApi.NetworkStatistics networkStatistics) {
        TdApi.NetworkStatisticsEntry[] networkStatisticsEntryArr;
        long[] jArr;
        this.f13203e = networkStatistics.sinceDate;
        for (TdApi.NetworkStatisticsEntry networkStatisticsEntry : networkStatistics.entries) {
            int constructor = networkStatisticsEntry.getConstructor();
            if (constructor == 188452706) {
                TdApi.NetworkStatisticsEntryFile networkStatisticsEntryFile = (TdApi.NetworkStatisticsEntryFile) networkStatisticsEntry;
                long[][] r10 = r(networkStatisticsEntryFile.networkType);
                if (r10 != null) {
                    switch (networkStatisticsEntryFile.fileType.getConstructor()) {
                        case TdApi.FileTypeUnknown.CONSTRUCTOR:
                        case TdApi.FileTypeThumbnail.CONSTRUCTOR:
                        case TdApi.FileTypeProfilePhoto.CONSTRUCTOR:
                            o(r10, 13, networkStatisticsEntryFile, true);
                            continue;
                        case TdApi.FileTypeSecret.CONSTRUCTOR:
                            o(r10, 3, networkStatisticsEntryFile, false);
                            continue;
                        case TdApi.FileTypePhoto.CONSTRUCTOR:
                            o(r10, 5, networkStatisticsEntryFile, true);
                            continue;
                        case TdApi.FileTypeAudio.CONSTRUCTOR:
                            o(r10, 9, networkStatisticsEntryFile, true);
                            continue;
                        case TdApi.FileTypeVoiceNote.CONSTRUCTOR:
                            o(r10, 10, networkStatisticsEntryFile, true);
                            continue;
                        case TdApi.FileTypeDocument.CONSTRUCTOR:
                            o(r10, 8, networkStatisticsEntryFile, true);
                            continue;
                        case TdApi.FileTypeVideoNote.CONSTRUCTOR:
                            o(r10, 11, networkStatisticsEntryFile, true);
                            continue;
                        case TdApi.FileTypeAnimation.CONSTRUCTOR:
                            o(r10, 7, networkStatisticsEntryFile, true);
                            continue;
                        case TdApi.FileTypeSticker.CONSTRUCTOR:
                            o(r10, 12, networkStatisticsEntryFile, true);
                            continue;
                        case TdApi.FileTypeVideo.CONSTRUCTOR:
                            o(r10, 6, networkStatisticsEntryFile, true);
                            continue;
                        case TdApi.FileTypeNone.CONSTRUCTOR:
                            o(r10, 2, networkStatisticsEntryFile, false);
                            continue;
                    }
                }
            } else if (constructor == 737000365) {
                TdApi.NetworkStatisticsEntryCall networkStatisticsEntryCall = (TdApi.NetworkStatisticsEntryCall) networkStatisticsEntry;
                long[][] r11 = r(networkStatisticsEntryCall.networkType);
                if (r11 != null) {
                    n(r11, 4, networkStatisticsEntryCall, false);
                    r11[2][0] = (long) (jArr[0] + networkStatisticsEntryCall.duration);
                }
            }
        }
    }

    public static void b(ArrayList<ra> arrayList, long j10, int i10) {
        arrayList.add(new ra(5, 0, 0, i10).b0(c0.m(j10)));
    }

    public static void c(ArrayList<ra> arrayList, long[][] jArr, int i10, int i11, int i12) {
        b(arrayList, jArr[1][i10], i11);
        arrayList.add(new ra(11));
        b(arrayList, jArr[0][i10], i12);
    }

    public static String e(long j10, long j11) {
        return c0.m(j10 + j11);
    }

    public static String f(long[][] jArr) {
        return e(jArr[0][1], jArr[1][1]);
    }

    public static boolean g(long[][] jArr, int i10) {
        return (jArr[0][i10] == 0 && jArr[1][i10] == 0) ? false : true;
    }

    public static void n(long[][] jArr, int i10, TdApi.NetworkStatisticsEntryCall networkStatisticsEntryCall, boolean z10) {
        long[] jArr2 = jArr[0];
        long j10 = jArr2[i10];
        long j11 = networkStatisticsEntryCall.receivedBytes;
        jArr2[i10] = j10 + j11;
        long[] jArr3 = jArr[1];
        long j12 = jArr3[i10];
        long j13 = networkStatisticsEntryCall.sentBytes;
        jArr3[i10] = j12 + j13;
        long[] jArr4 = jArr[0];
        jArr4[1] = jArr4[1] + j11;
        long[] jArr5 = jArr[1];
        jArr5[1] = jArr5[1] + j13;
        if (z10) {
            long[] jArr6 = jArr[0];
            jArr6[0] = jArr6[0] + j11;
            long[] jArr7 = jArr[1];
            jArr7[0] = jArr7[0] + j13;
        }
    }

    public static void o(long[][] jArr, int i10, TdApi.NetworkStatisticsEntryFile networkStatisticsEntryFile, boolean z10) {
        long[] jArr2 = jArr[0];
        long j10 = jArr2[i10];
        long j11 = networkStatisticsEntryFile.receivedBytes;
        jArr2[i10] = j10 + j11;
        long[] jArr3 = jArr[1];
        long j12 = jArr3[i10];
        long j13 = networkStatisticsEntryFile.sentBytes;
        jArr3[i10] = j12 + j13;
        long[] jArr4 = jArr[0];
        jArr4[1] = jArr4[1] + j11;
        long[] jArr5 = jArr[1];
        jArr5[1] = jArr5[1] + j13;
        if (z10) {
            long[] jArr6 = jArr[0];
            jArr6[0] = jArr6[0] + j11;
            long[] jArr7 = jArr[1];
            jArr7[0] = jArr7[0] + j13;
        }
    }

    public static int p(long[][] jArr, Integer num, Integer num2) {
        int i10 = ((jArr[0][num.intValue()] + jArr[1][num2.intValue()]) > (jArr[0][num2.intValue()] + jArr[1][num2.intValue()]) ? 1 : ((jArr[0][num.intValue()] + jArr[1][num2.intValue()]) == (jArr[0][num2.intValue()] + jArr[1][num2.intValue()]) ? 0 : -1));
        if (i10 < 0) {
            return 1;
        }
        return i10 > 0 ? -1 : 0;
    }

    public void d(java.util.ArrayList<de.ra> r21, int r22) {
        throw new UnsupportedOperationException("Method not decompiled: hd.k6.d(java.util.ArrayList, int):void");
    }

    public String h() {
        return w.I(this.f13203e, TimeUnit.SECONDS);
    }

    public String i() {
        return w.j1(R.string.NetworkUsageSince, h());
    }

    public String j() {
        return f(this.f13200b);
    }

    public String k() {
        return f(this.f13201c);
    }

    public String l() {
        long[][] jArr = this.f13200b;
        long j10 = jArr[0][1];
        long[][] jArr2 = this.f13201c;
        long[][] jArr3 = this.f13199a;
        return e(j10 + jArr2[0][1] + jArr3[0][1], jArr[1][1] + jArr2[1][1] + jArr3[1][1]);
    }

    public String m() {
        return f(this.f13199a);
    }

    public final long[][] q(int i10) {
        if (i10 == 0) {
            return this.f13200b;
        }
        if (i10 == 1) {
            return this.f13199a;
        }
        if (i10 != 2) {
            return this.f13202d;
        }
        return this.f13201c;
    }

    public final long[][] r(TdApi.NetworkType networkType) {
        switch (networkType.getConstructor()) {
            case TdApi.NetworkTypeMobileRoaming.CONSTRUCTOR:
                return this.f13201c;
            case TdApi.NetworkTypeWiFi.CONSTRUCTOR:
                return this.f13199a;
            case TdApi.NetworkTypeMobile.CONSTRUCTOR:
                return this.f13200b;
            case TdApi.NetworkTypeOther.CONSTRUCTOR:
                return this.f13202d;
            default:
                return null;
        }
    }
}
