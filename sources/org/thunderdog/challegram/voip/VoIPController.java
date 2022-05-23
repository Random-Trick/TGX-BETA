package org.thunderdog.challegram.voip;

import android.media.audiofx.AcousticEchoCanceler;
import android.media.audiofx.NoiseSuppressor;
import android.os.SystemClock;
import ib.i;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Locale;
import java.util.Objects;
import oc.v0;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import zd.ya;

public class VoIPController {
    public static final int DATA_SAVING_ALWAYS = 2;
    public static final int DATA_SAVING_MOBILE = 1;
    public static final int DATA_SAVING_NEVER = 0;
    public static final int DATA_SAVING_ROAMING = 3;
    public static final int ERROR_AUDIO_IO = 3;
    public static final int ERROR_CONNECTION_SERVICE = -5;
    public static final int ERROR_INCOMPATIBLE = 1;
    public static final int ERROR_INSECURE_UPGRADE = -4;
    public static final int ERROR_LOCALIZED = -3;
    public static final int ERROR_PEER_OUTDATED = -1;
    public static final int ERROR_PRIVACY = -2;
    public static final int ERROR_TIMEOUT = 2;
    public static final int ERROR_UNKNOWN = 0;
    public static final int NET_TYPE_3G = 3;
    public static final int NET_TYPE_DIALUP = 10;
    public static final int NET_TYPE_EDGE = 2;
    public static final int NET_TYPE_ETHERNET = 7;
    public static final int NET_TYPE_GPRS = 1;
    public static final int NET_TYPE_HSPA = 4;
    public static final int NET_TYPE_LTE = 5;
    public static final int NET_TYPE_OTHER_HIGH_SPEED = 8;
    public static final int NET_TYPE_OTHER_LOW_SPEED = 9;
    public static final int NET_TYPE_OTHER_MOBILE = 11;
    public static final int NET_TYPE_UNKNOWN = 0;
    public static final int NET_TYPE_WIFI = 6;
    public static final int PEER_CAP_GROUP_CALLS = 1;
    public static final int STATE_ESTABLISHED = 3;
    public static final int STATE_FAILED = 4;
    public static final int STATE_RECONNECTING = 5;
    public static final int STATE_WAIT_INIT = 1;
    public static final int STATE_WAIT_INIT_ACK = 2;
    public long callStartTime;
    public ConnectionStateListener listener;
    public long nativeInst;
    private int netType = 0;

    public interface ConnectionStateListener {
        void onCallUpgradeRequestReceived();

        void onConnectionStateChanged(int i10);

        void onGroupCallKeyReceived(byte[] bArr);

        void onGroupCallKeySent();

        void onSignalBarCountChanged(int i10);
    }

    public static class Stats {
        public long bytesRecvdMobile;
        public long bytesRecvdWifi;
        public long bytesSentMobile;
        public long bytesSentWifi;

        public String toString() {
            return "Stats{bytesRecvdMobile=" + this.bytesRecvdMobile + ", bytesSentWifi=" + this.bytesSentWifi + ", bytesRecvdWifi=" + this.bytesRecvdWifi + ", bytesSentMobile=" + this.bytesSentMobile + '}';
        }
    }

    public VoIPController() {
        this.nativeInst = 0L;
        this.nativeInst = nativeInit(getVoipConfigFile().getAbsolutePath());
    }

    private void callUpgradeRequestReceived() {
        ConnectionStateListener connectionStateListener = this.listener;
        if (connectionStateListener != null) {
            connectionStateListener.onCallUpgradeRequestReceived();
        }
    }

    private void cleanupLogDir(File file) {
        if (file != null) {
            File[] listFiles = file.listFiles();
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(Arrays.asList(listFiles));
            while (arrayList.size() > 20) {
                File file2 = (File) arrayList.get(0);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    File file3 = (File) it.next();
                    if (file3.getName().startsWith(Log.CALL_PREFIX) && file3.getName().endsWith(".log") && file3.lastModified() < file2.lastModified()) {
                        file2 = file3;
                    }
                }
                file2.delete();
                arrayList.remove(file2);
            }
        }
    }

    public static native int getConnectionMaxLayer();

    private String getLogFilePath() {
        Calendar calendar = Calendar.getInstance();
        cleanupLogDir(Log.getLogDir());
        return new File(Log.getLogDir(), String.format(Locale.US, "logs/%s%02d_%02d_%04d_%02d_%02d_%02d.log", Log.CALL_PREFIX, Integer.valueOf(calendar.get(5)), Integer.valueOf(calendar.get(2) + 1), Integer.valueOf(calendar.get(1)), Integer.valueOf(calendar.get(11)), Integer.valueOf(calendar.get(12)), Integer.valueOf(calendar.get(13)))).getAbsolutePath();
    }

    public static String getVersion() {
        return nativeGetVersion();
    }

    private static File getVoipConfigFile() {
        return new File(ya.V0(), "voip_persistent_state.json");
    }

    public static long getVoipConfigFileSize() {
        return getVoipConfigFile().length();
    }

    private void groupCallKeyReceived(byte[] bArr) {
        ConnectionStateListener connectionStateListener = this.listener;
        if (connectionStateListener != null) {
            connectionStateListener.onGroupCallKeyReceived(bArr);
        }
    }

    private void groupCallKeySent() {
        ConnectionStateListener connectionStateListener = this.listener;
        if (connectionStateListener != null) {
            connectionStateListener.onGroupCallKeySent();
        }
    }

    private void handleSignalBarsChange(int i10) {
        ConnectionStateListener connectionStateListener = this.listener;
        if (connectionStateListener != null) {
            connectionStateListener.onSignalBarCountChanged(i10);
        }
    }

    private void handleStateChange(int i10) {
        if (i10 == 3 && this.callStartTime == 0) {
            this.callStartTime = SystemClock.elapsedRealtime();
        }
        ConnectionStateListener connectionStateListener = this.listener;
        if (connectionStateListener != null) {
            connectionStateListener.onConnectionStateChanged(i10);
        }
    }

    private native void nativeConnect(long j10);

    private native void nativeDebugCtl(long j10, int i10, int i11);

    private native String nativeGetDebugLog(long j10);

    private native String nativeGetDebugString(long j10);

    private native int nativeGetLastError(long j10);

    private native int nativeGetPeerCapabilities(long j10);

    private native long nativeGetPreferredRelayID(long j10);

    private native void nativeGetStats(long j10, Stats stats);

    private static native String nativeGetVersion();

    private native long nativeInit(String str);

    private static native boolean nativeNeedRate(long j10);

    private native void nativeRelease(long j10);

    private native void nativeRequestCallUpgrade(long j10);

    private native void nativeSendGroupCallKey(long j10, byte[] bArr);

    private native void nativeSetAudioOutputGainControlEnabled(long j10, boolean z10);

    private native void nativeSetConfig(long j10, double d10, double d11, int i10, boolean z10, boolean z11, boolean z12, String str, String str2, boolean z13);

    private native void nativeSetEchoCancellationStrength(long j10, int i10);

    private native void nativeSetEncryptionKey(long j10, byte[] bArr, boolean z10);

    private native void nativeSetMicMute(long j10, boolean z10);

    private static native void nativeSetNativeBufferSize(int i10);

    private native void nativeSetNetworkType(long j10, int i10);

    private native void nativeSetProxy(long j10, String str, int i10, String str2, String str3);

    private native void nativeSetRemoteEndpoints(long j10, TdApi.CallServer[] callServerArr, boolean z10, boolean z11, int i10);

    private native void nativeStart(long j10);

    public static void setNativeBufferSize(int i10) {
        nativeSetNativeBufferSize(i10);
    }

    public void connect() {
        ensureNativeInstance();
        nativeConnect(this.nativeInst);
    }

    public void debugCtl(int i10, int i11) {
        ensureNativeInstance();
        nativeDebugCtl(this.nativeInst, i10, i11);
    }

    public void ensureNativeInstance() {
        if (this.nativeInst == 0) {
            throw new IllegalStateException("Native instance is not valid");
        }
    }

    public long getCallDuration() {
        if (this.callStartTime != 0) {
            return SystemClock.elapsedRealtime() - this.callStartTime;
        }
        return -1L;
    }

    public String getDebugLog() {
        ensureNativeInstance();
        return nativeGetDebugLog(this.nativeInst);
    }

    public String getDebugString() {
        ensureNativeInstance();
        return nativeGetDebugString(this.nativeInst);
    }

    public int getLastError() {
        ensureNativeInstance();
        return nativeGetLastError(this.nativeInst);
    }

    public int getNetworkType() {
        return this.netType;
    }

    public int getPeerCapabilities() {
        ensureNativeInstance();
        return nativeGetPeerCapabilities(this.nativeInst);
    }

    public long getPreferredRelayID() {
        ensureNativeInstance();
        return nativeGetPreferredRelayID(this.nativeInst);
    }

    public void getStats(Stats stats) {
        ensureNativeInstance();
        Objects.requireNonNull(stats, "You're not supposed to pass null here");
        nativeGetStats(this.nativeInst, stats);
    }

    public boolean needRate() {
        ensureNativeInstance();
        return nativeNeedRate(this.nativeInst);
    }

    public void release() {
        ensureNativeInstance();
        nativeRelease(this.nativeInst);
        this.nativeInst = 0L;
    }

    public void requestCallUpgrade() {
        ensureNativeInstance();
        nativeRequestCallUpgrade(this.nativeInst);
    }

    public void sendGroupCallKey(byte[] bArr) {
        Objects.requireNonNull(bArr, "key can not be null");
        if (bArr.length == 256) {
            ensureNativeInstance();
            nativeSendGroupCallKey(this.nativeInst, bArr);
            return;
        }
        throw new IllegalArgumentException("key must be 256 bytes long, got " + bArr.length);
    }

    public void setAudioOutputGainControlEnabled(boolean z10) {
        ensureNativeInstance();
        nativeSetAudioOutputGainControlEnabled(this.nativeInst, z10);
    }

    public void setConfig(double d10, double d11, int i10, long j10) {
        boolean z10;
        boolean z11;
        ensureNativeInstance();
        try {
            z10 = AcousticEchoCanceler.isAvailable();
        } catch (Throwable unused) {
            z10 = false;
        }
        try {
            z11 = NoiseSuppressor.isAvailable();
        } catch (Throwable unused2) {
            z11 = false;
        }
        nativeSetConfig(this.nativeInst, d10, d11, i10 == 3 ? v0.v1() ? 1 : 0 : i10, !z10 || !VoIPServerConfig.getBoolean("use_system_aec", true), !z11 || !VoIPServerConfig.getBoolean("use_system_ns", true), true, getLogFilePath(), null, false);
    }

    public void setConnectionStateListener(ConnectionStateListener connectionStateListener) {
        this.listener = connectionStateListener;
    }

    public void setEchoCancellationStrength(int i10) {
        ensureNativeInstance();
        nativeSetEchoCancellationStrength(this.nativeInst, i10);
    }

    public void setEncryptionKey(byte[] bArr, boolean z10) {
        if (bArr.length == 256) {
            ensureNativeInstance();
            nativeSetEncryptionKey(this.nativeInst, bArr, z10);
            return;
        }
        throw new IllegalArgumentException("key length must be exactly 256 bytes but is " + bArr.length);
    }

    public void setMicMute(boolean z10) {
        ensureNativeInstance();
        nativeSetMicMute(this.nativeInst, z10);
    }

    public void setNetworkType(int i10) {
        ensureNativeInstance();
        long j10 = this.nativeInst;
        this.netType = i10;
        nativeSetNetworkType(j10, i10);
    }

    public void setProxy(String str, int i10, String str2, String str3) {
        ensureNativeInstance();
        Objects.requireNonNull(str, "address can't be null");
        nativeSetProxy(this.nativeInst, str, i10, str2, str3);
    }

    public void setRemoteEndpoints(TdApi.CallServer[] callServerArr, boolean z10, boolean z11, int i10) {
        if (callServerArr.length != 0) {
            boolean z12 = false;
            for (TdApi.CallServer callServer : callServerArr) {
                if (callServer.type.getConstructor() != -1507850700) {
                    z12 = true;
                } else if (!i.i(callServer.ipAddress) || !i.i(callServer.ipv6Address)) {
                    byte[] bArr = ((TdApi.CallServerTypeTelegramReflector) callServer.type).peerTag;
                    if (!(bArr == null || bArr.length == 16)) {
                        throw new IllegalArgumentException("endpoint " + callServer + " has peer_tag of wrong length");
                    }
                } else {
                    throw new IllegalArgumentException("endpoint " + callServer + " has empty/null ipv4");
                }
            }
            if (z12) {
                ArrayList arrayList = new ArrayList();
                for (TdApi.CallServer callServer2 : callServerArr) {
                    if (callServer2.type.getConstructor() == -1507850700) {
                        arrayList.add(callServer2);
                    }
                }
                callServerArr = (TdApi.CallServer[]) arrayList.toArray(new TdApi.CallServer[0]);
                if (callServerArr.length == 0) {
                    throw new IllegalArgumentException("no CallServerTypeTelegramReflector found");
                }
            }
            ensureNativeInstance();
            nativeSetRemoteEndpoints(this.nativeInst, callServerArr, z10, z11, i10);
            return;
        }
        throw new IllegalArgumentException("endpoints size is 0");
    }

    public void start() {
        ensureNativeInstance();
        nativeStart(this.nativeInst);
    }
}
