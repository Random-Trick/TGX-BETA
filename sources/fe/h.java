package fe;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.media.CamcorderProfile;
import android.media.MediaRecorder;
import android.os.Build;
import ee.n;
import fd.b;
import ib.i;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kb.j;
import ld.l;
import mb.p;
import oc.v0;
import org.thunderdog.challegram.Log;

@TargetApi(16)
public class h extends b implements Camera.PreviewCallback, Camera.AutoFocusMoveCallback, Camera.AutoFocusCallback, Camera.ShutterCallback, Camera.PictureCallback, MediaRecorder.OnInfoListener {
    public Camera.Size B;
    public Camera.Size C;
    public Camera.Size D;
    public int E;
    public Integer[] F;
    public int J;
    public int K;
    public int L;
    public int M;
    public MediaRecorder N;
    public File O;
    public Camera f11952x;
    public int f11953y = -1;
    public final Camera.CameraInfo f11954z = new Camera.CameraInfo();
    public final Camera.CameraInfo A = new Camera.CameraInfo();
    public int G = -1;
    public int H = -1;
    public final Comparator<Integer> I = new Comparator() {
        @Override
        public final int compare(Object obj, Object obj2) {
            int E0;
            E0 = h.this.E0((Integer) obj, (Integer) obj2);
            return E0;
        }
    };

    public h(Context context, j jVar) {
        super(context, jVar);
    }

    public static void B0(int i10, Camera.CameraInfo cameraInfo) {
        cameraInfo.facing = 0;
        cameraInfo.canDisableShutterSound = false;
        cameraInfo.orientation = 0;
        Camera.getCameraInfo(i10, cameraInfo);
    }

    public static String C0(int i10) {
        return i10 != 2048 ? i10 != 4096 ? "off" : "auto" : "on";
    }

    public static int D0() {
        return b.f11905b != 10 ? 1 : 4;
    }

    public int E0(Integer num, Integer num2) {
        int intValue = num.intValue();
        int intValue2 = num2.intValue();
        if (this.f11923b.V()) {
            int i10 = this.H;
            if (i10 != -1) {
                if (intValue == i10) {
                    return -1;
                }
                if (intValue2 == i10) {
                    return 1;
                }
            }
            int i11 = this.G;
            if (i11 != -1) {
                if (intValue == i11) {
                    return -1;
                }
                if (intValue2 == i11) {
                    return 1;
                }
            }
        } else {
            int i12 = this.G;
            if (i12 != -1) {
                if (intValue == i12) {
                    return -1;
                }
                if (intValue2 == i12) {
                    return 1;
                }
            }
            int i13 = this.H;
            if (i13 != -1) {
                if (intValue == i13) {
                    return -1;
                }
                if (intValue2 == i13) {
                    return 1;
                }
            }
        }
        if (intValue < intValue2) {
            return -1;
        }
        return intValue == intValue2 ? 0 : 1;
    }

    public void F0(l lVar) {
        this.f11923b.A(lVar, false);
    }

    public static int G0(float f10, int i10, Camera.Size size, Camera.Size size2) {
        return b.k(size.width, size.height, size2.width, size2.height, f10, i10);
    }

    public static int H0(long j10, float f10, Camera.Size size, Camera.Size size2) {
        return b.l(size.width, size.height, size2.width, size2.height, j10, f10);
    }

    public static void O0(List<Camera.Size> list, final float f10, final int i10) {
        Collections.sort(list, new Comparator() {
            @Override
            public final int compare(Object obj, Object obj2) {
                int G0;
                G0 = h.G0(f10, i10, (Camera.Size) obj, (Camera.Size) obj2);
                return G0;
            }
        });
    }

    public static void P0(List<Camera.Size> list, long j10, long j11, final float f10) {
        final long j12 = j10 * j11;
        Collections.sort(list, new Comparator() {
            @Override
            public final int compare(Object obj, Object obj2) {
                int H0;
                H0 = h.H0(j12, f10, (Camera.Size) obj, (Camera.Size) obj2);
                return H0;
            }
        });
    }

    public final File A0(MediaRecorder mediaRecorder) {
        int i10 = this.f11937p;
        Camera.CameraInfo cameraInfo = this.f11954z;
        int i11 = 90;
        if (cameraInfo.facing == 1) {
            int i12 = (360 - ((cameraInfo.orientation + i10) % 360)) % 360;
            if (i12 == 90) {
                i12 = 270;
            }
            if (!"Huawei".equals(Build.MANUFACTURER) || !"angler".equals(Build.PRODUCT) || i12 != 270) {
                i11 = i12;
            }
        } else {
            i11 = ((cameraInfo.orientation - i10) + 360) % 360;
        }
        mediaRecorder.setOrientationHint(i11);
        Log.i((int) Log.TAG_CAMERA, "output video orientation: %d", Integer.valueOf(i11));
        int D0 = D0();
        if (CamcorderProfile.hasProfile(this.f11953y, D0)) {
            mediaRecorder.setProfile(CamcorderProfile.get(this.f11953y, D0));
        } else if (CamcorderProfile.hasProfile(this.f11953y, 0)) {
            mediaRecorder.setProfile(CamcorderProfile.get(this.f11953y, 0));
        } else {
            throw new IllegalStateException("Could not set camcorder profile");
        }
        return this.f11923b.r(true);
    }

    @Override
    public boolean F() {
        return true;
    }

    @Override
    public void H() {
        if (this.f11934m) {
            try {
                this.f11952x.setDisplayOrientation(e());
                L0(z0());
            } catch (Throwable th) {
                Log.critical(th);
            }
        }
    }

    @Override
    public void I(boolean z10, j<l> jVar) {
        try {
            this.f11952x.reconnect();
            this.f11952x.startPreview();
        } catch (Throwable th) {
            Log.w(Log.TAG_CAMERA, "Cannot reconnect camera", th, new Object[0]);
        }
        MediaRecorder mediaRecorder = this.N;
        if (mediaRecorder != null) {
            try {
                mediaRecorder.stop();
            } catch (Throwable th2) {
                Log.w(Log.TAG_CAMERA, "Cannot stop videoRecorder", th2, new Object[0]);
            }
        }
        File file = this.O;
        if (file != null) {
            if (z10 && file.exists()) {
                v0.R2(this.O, true, jVar);
            }
            if (!z10 && this.O.exists() && !this.O.delete()) {
                Log.w((int) Log.TAG_CAMERA, "Cannot delete video file: %s", this.O.getPath());
            }
            this.O = null;
        }
        MediaRecorder mediaRecorder2 = this.N;
        if (mediaRecorder2 != null) {
            try {
                mediaRecorder2.release();
            } catch (Throwable th3) {
                Log.w(Log.TAG_CAMERA, "Cannot release MediaRecorder", th3, new Object[0]);
            }
            this.N = null;
        }
    }

    public void I0() {
        if (this.f11934m) {
            try {
                this.f11952x.setOneShotPreviewCallback(new c(this));
            } catch (RuntimeException unused) {
            }
        }
    }

    @Override
    public void J(int i10) {
        if (this.f11934m) {
            Camera.Parameters parameters = this.f11952x.getParameters();
            parameters.setFlashMode(C0(i10));
            this.f11952x.setParameters(parameters);
        }
    }

    public void J0(byte[] bArr, Camera camera) {
        if (this.f11934m) {
            this.f11923b.J0(bArr, camera);
        }
    }

    @Override
    public void K() {
        if (this.f11934m) {
            L0(z0());
        }
    }

    public final void K0() {
        Z();
        b0();
    }

    @Override
    public void L() {
        if (this.f11934m && this.f11938q > 1) {
            K0();
            this.f11923b.O0(true);
            int v10 = v();
            B0(this.F[v10].intValue(), this.A);
            boolean z10 = v10 >= x();
            boolean z11 = this.A.facing == 1;
            this.f11923b.G0(false, z10, z11);
            g0(false);
            n0(v10);
            g0(true);
            this.f11923b.G0(true, z10, z11);
        }
    }

    public final void L0(int i10) {
        if (this.J != i10) {
            this.J = i10;
            try {
                Camera.Parameters parameters = this.f11952x.getParameters();
                parameters.setRotation(i10);
                this.f11952x.setParameters(parameters);
            } catch (Throwable th) {
                Log.e(Log.TAG_CAMERA, "Cannot set output rotation", th, new Object[0]);
            }
        }
    }

    @Override
    public void M(int i10, int i11) {
        if (this.f11934m) {
            N0(this.f11952x.getParameters());
        }
    }

    public final void M0() {
        boolean z10;
        char c10;
        char c11;
        int i10;
        n nVar = new n(false);
        Camera.Parameters parameters = this.f11952x.getParameters();
        if (this.f11954z.facing == 1) {
            nVar.a(1);
        }
        if (nVar.f(1)) {
            List<String> supportedSceneModes = parameters.getSupportedSceneModes();
            if (supportedSceneModes != null && !supportedSceneModes.isEmpty()) {
                Iterator<String> it = supportedSceneModes.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (i.c(it.next(), "portrait")) {
                            parameters.setSceneMode("portrait");
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            List<String> supportedAntibanding = parameters.getSupportedAntibanding();
            if (supportedAntibanding != null && !supportedAntibanding.isEmpty()) {
                Iterator<String> it2 = supportedAntibanding.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (i.c(it2.next(), "auto")) {
                            parameters.setAntibanding("auto");
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            List<String> supportedWhiteBalance = parameters.getSupportedWhiteBalance();
            if (supportedWhiteBalance != null && !supportedWhiteBalance.isEmpty()) {
                Iterator<String> it3 = supportedWhiteBalance.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    String next = it3.next();
                    if (i.c(next, "auto")) {
                        parameters.setWhiteBalance(next);
                        break;
                    }
                }
            }
            if (parameters.isVideoStabilizationSupported()) {
                parameters.setVideoStabilization(true);
            }
        }
        List<String> supportedFocusModes = parameters.getSupportedFocusModes();
        if (supportedFocusModes != null) {
            for (String str : supportedFocusModes) {
                if (!i.i(str)) {
                    str.hashCode();
                    switch (str.hashCode()) {
                        case -194628547:
                            if (str.equals("continuous-video")) {
                                c11 = 0;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case 3005871:
                            if (str.equals("auto")) {
                                c11 = 1;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case 910005312:
                            if (str.equals("continuous-picture")) {
                                c11 = 2;
                                break;
                            }
                            c11 = 65535;
                            break;
                        default:
                            c11 = 65535;
                            break;
                    }
                    switch (c11) {
                        case 0:
                            i10 = Log.TAG_YOUTUBE;
                            break;
                        case 1:
                            i10 = 32;
                            break;
                        case 2:
                            i10 = 64;
                            break;
                        default:
                            i10 = 0;
                            break;
                    }
                    if (i10 != 0) {
                        nVar.a(i10);
                    }
                }
            }
        }
        List<String> supportedFlashModes = parameters.getSupportedFlashModes();
        if (supportedFlashModes != null) {
            for (String str2 : supportedFlashModes) {
                if (!i.i(str2)) {
                    str2.hashCode();
                    switch (str2.hashCode()) {
                        case 3551:
                            if (str2.equals("on")) {
                                c10 = 0;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 109935:
                            if (str2.equals("off")) {
                                c10 = 1;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 3005871:
                            if (str2.equals("auto")) {
                                c10 = 2;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 110547964:
                            if (str2.equals("torch")) {
                                c10 = 3;
                                break;
                            }
                            c10 = 65535;
                            break;
                        default:
                            c10 = 65535;
                            break;
                    }
                    switch (c10) {
                        case 0:
                            nVar.a(Log.TAG_VOICE);
                            continue;
                        case 1:
                            nVar.a(Log.TAG_CAMERA);
                            continue;
                        case 2:
                            nVar.a(Log.TAG_EMOJI);
                            continue;
                        case 3:
                            nVar.a(Log.TAG_LUX);
                            continue;
                    }
                }
            }
        }
        if (parameters.isZoomSupported()) {
            nVar.a(Log.TAG_NDK);
            z10 = true;
        } else {
            z10 = false;
        }
        if (parameters.isSmoothZoomSupported()) {
            nVar.a(Log.TAG_ACCOUNTS);
            z10 = true;
        }
        if (z10) {
            nVar.g(parameters.getMaxZoom());
        }
        if (parameters.getMaxNumFocusAreas() > 0) {
            nVar.a(2);
        }
        if (parameters.getMaxNumMeteringAreas() > 0) {
            nVar.a(4);
        }
        parameters.setRecordingHint(true);
        parameters.setPictureFormat(Log.TAG_CRASH);
        int z02 = z0();
        this.J = z02;
        parameters.setRotation(z02);
        if (nVar.f(224)) {
            if (nVar.f(64)) {
                parameters.setFocusMode("continuous-picture");
            } else if (nVar.f(Log.TAG_YOUTUBE)) {
                parameters.setFocusMode("continuous-video");
            } else if (nVar.f(32)) {
                parameters.setFocusMode("auto");
            }
        }
        if (nVar.b(false)) {
            parameters.setFlashMode(C0(this.f11932k));
        } else if (nVar.f(Log.TAG_CAMERA)) {
            parameters.setFlashMode(C0(Log.TAG_CAMERA));
        }
        if (nVar.d()) {
            parameters.setZoom(this.E);
        }
        h0(nVar);
        N0(parameters);
        this.f11952x.setParameters(parameters);
    }

    @Override
    public void N() {
        this.H = -1;
        this.G = -1;
        this.E = 0;
    }

    public final void N0(Camera.Parameters parameters) {
        int i10;
        int i11;
        int i12;
        int i13 = this.f11926e;
        if (i13 != 0 && (i10 = this.f11927f) != 0) {
            int e10 = e();
            boolean x12 = v0.x1(e10);
            if (x12) {
                i10 = i13;
                i13 = i10;
            }
            Log.i((int) Log.TAG_CAMERA, "calculating output sizes; width: %d, height: %d, orientation: %d", Integer.valueOf(i13), Integer.valueOf(i10), Integer.valueOf(e10));
            ArrayList arrayList = new ArrayList();
            List<Camera.Size> supportedPreviewSizes = parameters.getSupportedPreviewSizes();
            if (supportedPreviewSizes != null && !supportedPreviewSizes.isEmpty()) {
                float f10 = i13 / i10;
                arrayList.ensureCapacity(supportedPreviewSizes.size());
                arrayList.addAll(supportedPreviewSizes);
                int n10 = this.f11923b.n();
                if (n10 != 0) {
                    long j10 = n10;
                    P0(arrayList, j10, j10, 1.7777778f);
                } else {
                    P0(arrayList, i13, i10, f10);
                }
                Camera.Size size = (Camera.Size) arrayList.get(0);
                this.B = size;
                parameters.setPreviewSize(size.width, size.height);
                arrayList.clear();
            }
            List<Camera.Size> supportedPictureSizes = parameters.getSupportedPictureSizes();
            if (supportedPictureSizes != null && !supportedPictureSizes.isEmpty()) {
                arrayList.ensureCapacity(supportedPictureSizes.size());
                arrayList.addAll(supportedPictureSizes);
                P0(arrayList, 1280L, (int) ((Math.min(i13, i10) / Math.max(i13, i10)) * 1280.0f), ib.h.a(i13, i10));
                Camera.Size size2 = (Camera.Size) arrayList.get(0);
                this.C = size2;
                parameters.setPictureSize(size2.width, size2.height);
                arrayList.clear();
            }
            List<Camera.Size> supportedVideoSizes = parameters.getSupportedVideoSizes();
            if (supportedVideoSizes == null || supportedVideoSizes.isEmpty()) {
                Log.i((int) Log.TAG_CAMERA, "output video size: unknown", new Object[0]);
                this.D = null;
            } else {
                arrayList.ensureCapacity(supportedVideoSizes.size());
                arrayList.addAll(supportedVideoSizes);
                O0(arrayList, ib.h.a(i13, i10), this.f11923b.n());
                Camera.Size size3 = (Camera.Size) arrayList.get(0);
                this.D = size3;
                Log.i((int) Log.TAG_CAMERA, "output video size: %dx%d", Integer.valueOf(size3.width), Integer.valueOf(this.D.height));
                arrayList.clear();
            }
            Log.i((int) Log.TAG_CAMERA, "preview size: %dx%d", Integer.valueOf(this.B.width), Integer.valueOf(this.B.height));
            if (x12) {
                Camera.Size size4 = this.B;
                i11 = size4.height;
                i12 = size4.width;
            } else {
                Camera.Size size5 = this.B;
                i11 = size5.width;
                i12 = size5.height;
            }
            this.f11923b.Q0(i11, i12);
        }
    }

    @Override
    public void O() {
        if (this.f11934m) {
            this.f11952x.unlock();
            MediaRecorder mediaRecorder = new MediaRecorder();
            this.N = mediaRecorder;
            mediaRecorder.setCamera(this.f11952x);
            this.N.setVideoSource(1);
            this.N.setAudioSource(5);
            File A0 = A0(this.N);
            this.O = A0;
            if (A0.createNewFile()) {
                this.N.setOutputFile(this.O.getAbsolutePath());
                this.N.setMaxFileSize(p.M.b(1.0d));
                this.N.setVideoFrameRate(30);
                this.N.setMaxDuration(0);
                this.N.setVideoEncodingBitRate(1800000);
                MediaRecorder mediaRecorder2 = this.N;
                Camera.Size size = this.D;
                mediaRecorder2.setVideoSize(size.width, size.height);
                this.N.setOnInfoListener(this);
                this.N.prepare();
                this.N.start();
                return;
            }
            throw new IllegalStateException("Could not create output file");
        }
        throw new IllegalStateException("!isCameraActive");
    }

    @Override
    public void S(int i10, int i11, int i12) {
        if (this.f11934m) {
            this.K = i10;
            this.L = i11;
            this.M = i12;
            this.f11952x.takePicture(this, null, this);
            return;
        }
        this.f11923b.z(false);
    }

    @Override
    public void T(float f10) {
        int round = Math.round(f10);
        if (this.E != round) {
            n nVar = this.f11931j;
            boolean z10 = true;
            boolean z11 = nVar == null;
            if (!z11 && nVar.f(Log.TAG_ACCOUNTS)) {
                try {
                    this.f11952x.stopSmoothZoom();
                    this.f11952x.startSmoothZoom(round);
                } catch (Throwable th) {
                    Log.w(Log.TAG_CAMERA, "Cannot change zoom smoothly", th, new Object[0]);
                }
                if (!z10 && this.f11931j.f(Log.TAG_NDK)) {
                    Camera.Parameters parameters = this.f11952x.getParameters();
                    parameters.setZoom(round);
                    this.f11952x.setParameters(parameters);
                }
                this.E = round;
            }
            z10 = z11;
            if (!z10) {
                Camera.Parameters parameters2 = this.f11952x.getParameters();
                parameters2.setZoom(round);
                this.f11952x.setParameters(parameters2);
            }
            this.E = round;
        }
    }

    @Override
    public boolean U(SurfaceTexture surfaceTexture) {
        this.f11952x.setPreviewTexture(surfaceTexture);
        this.f11952x.setAutoFocusMoveCallback(this);
        this.f11952x.setDisplayOrientation(e());
        this.f11952x.setOneShotPreviewCallback(this);
        this.f11952x.startPreview();
        return true;
    }

    @Override
    public boolean X() {
        int i10;
        l0(Camera.getNumberOfCameras());
        int i11 = this.f11938q;
        if (i11 > 0) {
            Integer[] numArr = this.F;
            if (numArr == null || numArr.length != i11) {
                this.F = new Integer[i11];
            }
            this.G = -1;
            this.H = -1;
            int i12 = 0;
            int i13 = -1;
            while (i12 < this.f11938q) {
                B0(i12, this.f11954z);
                if (this.f11954z.facing == 1) {
                    if (this.H == -1) {
                        this.H = i12;
                    }
                } else if (this.G == -1) {
                    this.G = i12;
                }
                this.F[i12] = Integer.valueOf(i12);
                i12++;
                i13 = i12;
            }
            Arrays.sort(this.F, this.I);
            i10 = this.F[x()].intValue();
            if (i13 != i10) {
                B0(i10, this.f11954z);
            }
        } else {
            i10 = -1;
        }
        if (i10 == -1) {
            this.f11923b.T0("Camera hardware failed");
            return false;
        }
        this.f11952x = Camera.open(i10);
        this.f11953y = i10;
        try {
            M0();
        } catch (Throwable th) {
            Log.w(Log.TAG_CAMERA, "Cannot start camera preview", th, new Object[0]);
            i();
        }
        return this.f11952x != null;
    }

    @Override
    public int e() {
        int i10 = this.f11928g;
        Camera.CameraInfo cameraInfo = this.f11954z;
        if (cameraInfo.facing == 1) {
            return (360 - ((cameraInfo.orientation + i10) % 360)) % 360;
        }
        return ((cameraInfo.orientation - i10) + 360) % 360;
    }

    @Override
    public void i() {
        if (this.f11952x != null) {
            try {
                if (this.f11931j.c()) {
                    this.f11952x.cancelAutoFocus();
                }
            } catch (Throwable th) {
                Log.i(Log.TAG_CAMERA, "Cannot cancel auto-focus", th, new Object[0]);
            }
            try {
                this.f11923b.O0(false);
                this.f11952x.stopPreview();
            } catch (Throwable th2) {
                Log.w(Log.TAG_CAMERA, "Cannot stop camera preview", th2, new Object[0]);
            }
            try {
                this.f11952x.release();
            } catch (Throwable th3) {
                Log.w(Log.TAG_CAMERA, "Cannot release camera", th3, new Object[0]);
            }
            this.f11952x = null;
            this.f11953y = -1;
            h0(null);
        }
    }

    @Override
    public void onAutoFocus(boolean z10, Camera camera) {
        Log.i((int) Log.TAG_CAMERA, "onAutoFocus %b", Boolean.valueOf(z10));
    }

    @Override
    public void onAutoFocusMoving(boolean z10, Camera camera) {
        Log.i((int) Log.TAG_CAMERA, "onAutoFocusMoving %b", Boolean.valueOf(z10));
    }

    @Override
    public void onInfo(MediaRecorder mediaRecorder, int i10, int i11) {
        if (i10 == 1 || i10 == 800 || i10 == 801) {
            o();
        } else {
            Log.i((int) Log.TAG_CAMERA, "unknown MediaRecorder what: %d, extra: %d", Integer.valueOf(i10), Integer.valueOf(i11));
        }
    }

    @Override
    public void onPictureTaken(byte[] r9, android.hardware.Camera r10) {
        throw new UnsupportedOperationException("Method not decompiled: fe.h.onPictureTaken(byte[], android.hardware.Camera):void");
    }

    @Override
    public void onPreviewFrame(byte[] bArr, Camera camera) {
        if (this.f11934m) {
            this.f11923b.K0();
            try {
                camera.setOneShotPreviewCallback(new c(this));
            } catch (RuntimeException unused) {
            }
        }
    }

    @Override
    public void onShutter() {
        this.f11923b.I0(false);
    }

    @Override
    public int s() {
        return this.B.height;
    }

    @Override
    public int t() {
        return this.B.width;
    }

    @Override
    public int y() {
        return this.f11954z.orientation;
    }

    public final int z0() {
        int i10 = this.f11937p;
        if (i10 == -1) {
            i10 = this.f11928g;
        }
        Camera.CameraInfo cameraInfo = this.f11954z;
        if (cameraInfo.facing == 1) {
            return (cameraInfo.orientation + i10) % 360;
        }
        return ((cameraInfo.orientation - i10) + 360) % 360;
    }
}
