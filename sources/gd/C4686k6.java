package gd;

import be.C1363c0;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import p038ce.C2964ra;
import p082fd.C4403w;

public class C4686k6 {
    public final long[][] f15719a = {new long[14], new long[14], new long[1]};
    public final long[][] f15720b = {new long[14], new long[14], new long[1]};
    public final long[][] f15721c = {new long[14], new long[14], new long[1]};
    public final long[][] f15722d = {new long[14], new long[14], new long[1]};
    public int f15723e;

    public C4686k6(TdApi.NetworkStatistics networkStatistics) {
        TdApi.NetworkStatisticsEntry[] networkStatisticsEntryArr;
        long[] jArr;
        this.f15723e = networkStatistics.sinceDate;
        for (TdApi.NetworkStatisticsEntry networkStatisticsEntry : networkStatistics.entries) {
            int constructor = networkStatisticsEntry.getConstructor();
            if (constructor == 188452706) {
                TdApi.NetworkStatisticsEntryFile networkStatisticsEntryFile = (TdApi.NetworkStatisticsEntryFile) networkStatisticsEntry;
                long[][] r = m26475r(networkStatisticsEntryFile.networkType);
                if (r != null) {
                    switch (networkStatisticsEntryFile.fileType.getConstructor()) {
                        case TdApi.FileTypeUnknown.CONSTRUCTOR:
                        case TdApi.FileTypeThumbnail.CONSTRUCTOR:
                        case TdApi.FileTypeProfilePhoto.CONSTRUCTOR:
                            m26478o(r, 13, networkStatisticsEntryFile, true);
                            continue;
                        case TdApi.FileTypeSecret.CONSTRUCTOR:
                            m26478o(r, 3, networkStatisticsEntryFile, false);
                            continue;
                        case TdApi.FileTypePhoto.CONSTRUCTOR:
                            m26478o(r, 5, networkStatisticsEntryFile, true);
                            continue;
                        case TdApi.FileTypeAudio.CONSTRUCTOR:
                            m26478o(r, 9, networkStatisticsEntryFile, true);
                            continue;
                        case TdApi.FileTypeVoiceNote.CONSTRUCTOR:
                            m26478o(r, 10, networkStatisticsEntryFile, true);
                            continue;
                        case TdApi.FileTypeDocument.CONSTRUCTOR:
                            m26478o(r, 8, networkStatisticsEntryFile, true);
                            continue;
                        case TdApi.FileTypeVideoNote.CONSTRUCTOR:
                            m26478o(r, 11, networkStatisticsEntryFile, true);
                            continue;
                        case TdApi.FileTypeAnimation.CONSTRUCTOR:
                            m26478o(r, 7, networkStatisticsEntryFile, true);
                            continue;
                        case TdApi.FileTypeSticker.CONSTRUCTOR:
                            m26478o(r, 12, networkStatisticsEntryFile, true);
                            continue;
                        case TdApi.FileTypeVideo.CONSTRUCTOR:
                            m26478o(r, 6, networkStatisticsEntryFile, true);
                            continue;
                        case TdApi.FileTypeNone.CONSTRUCTOR:
                            m26478o(r, 2, networkStatisticsEntryFile, false);
                            continue;
                    }
                }
            } else if (constructor == 737000365) {
                TdApi.NetworkStatisticsEntryCall networkStatisticsEntryCall = (TdApi.NetworkStatisticsEntryCall) networkStatisticsEntry;
                long[][] r2 = m26475r(networkStatisticsEntryCall.networkType);
                if (r2 != null) {
                    m26479n(r2, 4, networkStatisticsEntryCall, false);
                    r2[2][0] = (long) (jArr[0] + networkStatisticsEntryCall.duration);
                }
            }
        }
    }

    public static void m26491b(ArrayList<C2964ra> arrayList, long j, int i) {
        arrayList.add(new C2964ra(5, 0, 0, i).m32847b0(C1363c0.m37423m(j)));
    }

    public static void m26490c(ArrayList<C2964ra> arrayList, long[][] jArr, int i, int i2, int i3) {
        m26491b(arrayList, jArr[1][i], i2);
        arrayList.add(new C2964ra(11));
        m26491b(arrayList, jArr[0][i], i3);
    }

    public static String m26488e(long j, long j2) {
        return C1363c0.m37423m(j + j2);
    }

    public static String m26487f(long[][] jArr) {
        return m26488e(jArr[0][1], jArr[1][1]);
    }

    public static boolean m26486g(long[][] jArr, int i) {
        return (jArr[0][i] == 0 && jArr[1][i] == 0) ? false : true;
    }

    public static void m26479n(long[][] jArr, int i, TdApi.NetworkStatisticsEntryCall networkStatisticsEntryCall, boolean z) {
        long[] jArr2 = jArr[0];
        long j = jArr2[i];
        long j2 = networkStatisticsEntryCall.receivedBytes;
        jArr2[i] = j + j2;
        long[] jArr3 = jArr[1];
        long j3 = jArr3[i];
        long j4 = networkStatisticsEntryCall.sentBytes;
        jArr3[i] = j3 + j4;
        long[] jArr4 = jArr[0];
        jArr4[1] = jArr4[1] + j2;
        long[] jArr5 = jArr[1];
        jArr5[1] = jArr5[1] + j4;
        if (z) {
            long[] jArr6 = jArr[0];
            jArr6[0] = jArr6[0] + j2;
            long[] jArr7 = jArr[1];
            jArr7[0] = jArr7[0] + j4;
        }
    }

    public static void m26478o(long[][] jArr, int i, TdApi.NetworkStatisticsEntryFile networkStatisticsEntryFile, boolean z) {
        long[] jArr2 = jArr[0];
        long j = jArr2[i];
        long j2 = networkStatisticsEntryFile.receivedBytes;
        jArr2[i] = j + j2;
        long[] jArr3 = jArr[1];
        long j3 = jArr3[i];
        long j4 = networkStatisticsEntryFile.sentBytes;
        jArr3[i] = j3 + j4;
        long[] jArr4 = jArr[0];
        jArr4[1] = jArr4[1] + j2;
        long[] jArr5 = jArr[1];
        jArr5[1] = jArr5[1] + j4;
        if (z) {
            long[] jArr6 = jArr[0];
            jArr6[0] = jArr6[0] + j2;
            long[] jArr7 = jArr[1];
            jArr7[0] = jArr7[0] + j4;
        }
    }

    public static int m26477p(long[][] jArr, Integer num, Integer num2) {
        int i = ((jArr[0][num.intValue()] + jArr[1][num2.intValue()]) > (jArr[0][num2.intValue()] + jArr[1][num2.intValue()]) ? 1 : ((jArr[0][num.intValue()] + jArr[1][num2.intValue()]) == (jArr[0][num2.intValue()] + jArr[1][num2.intValue()]) ? 0 : -1));
        if (i < 0) {
            return 1;
        }
        return i > 0 ? -1 : 0;
    }

    public void m26489d(java.util.ArrayList<p038ce.C2964ra> r21, int r22) {
        throw new UnsupportedOperationException("Method not decompiled: gd.C4686k6.m26489d(java.util.ArrayList, int):void");
    }

    public String m26485h() {
        return C4403w.m27979I(this.f15723e, TimeUnit.SECONDS);
    }

    public String m26484i() {
        return C4403w.m27865j1(R.string.NetworkUsageSince, m26485h());
    }

    public String m26483j() {
        return m26487f(this.f15720b);
    }

    public String m26482k() {
        return m26487f(this.f15721c);
    }

    public String m26481l() {
        long[][] jArr = this.f15720b;
        long j = jArr[0][1];
        long[][] jArr2 = this.f15721c;
        long[][] jArr3 = this.f15719a;
        return m26488e(j + jArr2[0][1] + jArr3[0][1], jArr[1][1] + jArr2[1][1] + jArr3[1][1]);
    }

    public String m26480m() {
        return m26487f(this.f15719a);
    }

    public final long[][] m26476q(int i) {
        if (i == 0) {
            return this.f15720b;
        }
        if (i == 1) {
            return this.f15719a;
        }
        if (i != 2) {
            return this.f15722d;
        }
        return this.f15721c;
    }

    public final long[][] m26475r(TdApi.NetworkType networkType) {
        switch (networkType.getConstructor()) {
            case TdApi.NetworkTypeMobileRoaming.CONSTRUCTOR:
                return this.f15721c;
            case TdApi.NetworkTypeWiFi.CONSTRUCTOR:
                return this.f15719a;
            case TdApi.NetworkTypeMobile.CONSTRUCTOR:
                return this.f15720b;
            case TdApi.NetworkTypeOther.CONSTRUCTOR:
                return this.f15722d;
            default:
                return null;
        }
    }
}
