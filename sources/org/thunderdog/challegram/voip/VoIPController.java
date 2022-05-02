package org.thunderdog.challegram.voip;

import android.os.SystemClock;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Locale;
import java.util.Objects;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import p108hb.C5070i;
import p350yd.C10536ab;

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

        void onConnectionStateChanged(int i);

        void onGroupCallKeyReceived(byte[] bArr);

        void onGroupCallKeySent();

        void onSignalBarCountChanged(int i);
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
        return new File(C10536ab.m4740V0(), "voip_persistent_state.json");
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

    private void handleSignalBarsChange(int i) {
        ConnectionStateListener connectionStateListener = this.listener;
        if (connectionStateListener != null) {
            connectionStateListener.onSignalBarCountChanged(i);
        }
    }

    private void handleStateChange(int i) {
        if (i == 3 && this.callStartTime == 0) {
            this.callStartTime = SystemClock.elapsedRealtime();
        }
        ConnectionStateListener connectionStateListener = this.listener;
        if (connectionStateListener != null) {
            connectionStateListener.onConnectionStateChanged(i);
        }
    }

    private native void nativeConnect(long j);

    private native void nativeDebugCtl(long j, int i, int i2);

    private native String nativeGetDebugLog(long j);

    private native String nativeGetDebugString(long j);

    private native int nativeGetLastError(long j);

    private native int nativeGetPeerCapabilities(long j);

    private native long nativeGetPreferredRelayID(long j);

    private native void nativeGetStats(long j, Stats stats);

    private static native String nativeGetVersion();

    private native long nativeInit(String str);

    private static native boolean nativeNeedRate(long j);

    private native void nativeRelease(long j);

    private native void nativeRequestCallUpgrade(long j);

    private native void nativeSendGroupCallKey(long j, byte[] bArr);

    private native void nativeSetAudioOutputGainControlEnabled(long j, boolean z);

    private native void nativeSetConfig(long j, double d, double d2, int i, boolean z, boolean z2, boolean z3, String str, String str2, boolean z4);

    private native void nativeSetEchoCancellationStrength(long j, int i);

    private native void nativeSetEncryptionKey(long j, byte[] bArr, boolean z);

    private native void nativeSetMicMute(long j, boolean z);

    private static native void nativeSetNativeBufferSize(int i);

    private native void nativeSetNetworkType(long j, int i);

    private native void nativeSetProxy(long j, String str, int i, String str2, String str3);

    private native void nativeSetRemoteEndpoints(long j, TdApi.CallServer[] callServerArr, boolean z, boolean z2, int i);

    private native void nativeStart(long j);

    public static void setNativeBufferSize(int i) {
        nativeSetNativeBufferSize(i);
    }

    public void connect() {
        ensureNativeInstance();
        nativeConnect(this.nativeInst);
    }

    public void debugCtl(int i, int i2) {
        ensureNativeInstance();
        nativeDebugCtl(this.nativeInst, i, i2);
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

    public void setAudioOutputGainControlEnabled(boolean z) {
        ensureNativeInstance();
        nativeSetAudioOutputGainControlEnabled(this.nativeInst, z);
    }

    public void setConfig(double r18, double r20, int r22, long r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.thunderdog.challegram.voip.VoIPController.setConfig(double, double, int, long):void");
    }

    public void setConnectionStateListener(ConnectionStateListener connectionStateListener) {
        this.listener = connectionStateListener;
    }

    public void setEchoCancellationStrength(int i) {
        ensureNativeInstance();
        nativeSetEchoCancellationStrength(this.nativeInst, i);
    }

    public void setEncryptionKey(byte[] bArr, boolean z) {
        if (bArr.length == 256) {
            ensureNativeInstance();
            nativeSetEncryptionKey(this.nativeInst, bArr, z);
            return;
        }
        throw new IllegalArgumentException("key length must be exactly 256 bytes but is " + bArr.length);
    }

    public void setMicMute(boolean z) {
        ensureNativeInstance();
        nativeSetMicMute(this.nativeInst, z);
    }

    public void setNetworkType(int i) {
        ensureNativeInstance();
        long j = this.nativeInst;
        this.netType = i;
        nativeSetNetworkType(j, i);
    }

    public void setProxy(String str, int i, String str2, String str3) {
        ensureNativeInstance();
        Objects.requireNonNull(str, "address can't be null");
        nativeSetProxy(this.nativeInst, str, i, str2, str3);
    }

    public void setRemoteEndpoints(TdApi.CallServer[] callServerArr, boolean z, boolean z2, int i) {
        if (callServerArr.length != 0) {
            for (TdApi.CallServer callServer : callServerArr) {
                if (callServer.type.getConstructor() != -1507850700) {
                    throw new IllegalArgumentException();
                } else if (!C5070i.m24061i(callServer.ipAddress) || !C5070i.m24061i(callServer.ipv6Address)) {
                    byte[] bArr = ((TdApi.CallServerTypeTelegramReflector) callServer.type).peerTag;
                    if (bArr != null && bArr.length != 16) {
                        throw new IllegalArgumentException("endpoint " + callServer + " has peer_tag of wrong length");
                    }
                } else {
                    throw new IllegalArgumentException("endpoint " + callServer + " has empty/null ipv4");
                }
            }
            ensureNativeInstance();
            nativeSetRemoteEndpoints(this.nativeInst, callServerArr, z, z2, i);
            return;
        }
        throw new IllegalArgumentException("endpoints size is 0");
    }

    public void start() {
        ensureNativeInstance();
        nativeStart(this.nativeInst);
    }
}
