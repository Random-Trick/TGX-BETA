package org.thunderdog.challegram.video.old;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaFormat;
import com.coremedia.iso.boxes.AbstractMediaHeaderBox;
import com.coremedia.iso.boxes.SampleDescriptionBox;
import com.coremedia.iso.boxes.SoundMediaHeaderBox;
import com.coremedia.iso.boxes.VideoMediaHeaderBox;
import com.coremedia.iso.boxes.sampleentry.AudioSampleEntry;
import com.coremedia.iso.boxes.sampleentry.VisualSampleEntry;
import com.googlecode.mp4parser.boxes.mp4.ESDescriptorBox;
import com.mp4parser.iso14496.part15.AvcConfigurationBox;
import d.j;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import s8.h;
import s8.n;

@TargetApi(16)
public class e {
    public static Map<Integer, Integer> f20193r;
    public long f20194a;
    public int[] f20197d;
    public String f20198e;
    public AbstractMediaHeaderBox f20199f;
    public SampleDescriptionBox f20200g;
    public LinkedList<Integer> f20201h;
    public int f20202i;
    public int f20204k;
    public int f20205l;
    public float f20206m;
    public long[] f20207n;
    public boolean f20209p;
    public ArrayList<c> f20195b = new ArrayList<>();
    public long f20196c = 0;
    public Date f20203j = new Date();
    public ArrayList<a> f20208o = new ArrayList<>();
    public boolean f20210q = true;

    public static class a {
        public int f20211a;
        public long f20212b;
        public long f20213c;

        public a(int i10, long j10) {
            this.f20211a = i10;
            this.f20212b = j10;
        }
    }

    static {
        HashMap hashMap = new HashMap();
        f20193r = hashMap;
        hashMap.put(96000, 0);
        f20193r.put(88200, 1);
        f20193r.put(64000, 2);
        f20193r.put(48000, 3);
        f20193r.put(44100, 4);
        f20193r.put(32000, 5);
        f20193r.put(24000, 6);
        f20193r.put(22050, 7);
        f20193r.put(16000, 8);
        f20193r.put(12000, 9);
        f20193r.put(11025, 10);
        f20193r.put(8000, 11);
    }

    public e(int i10, MediaFormat mediaFormat, boolean z10) {
        this.f20201h = null;
        this.f20206m = 0.0f;
        this.f20194a = i10;
        this.f20209p = z10;
        if (!z10) {
            this.f20205l = mediaFormat.getInteger("width");
            this.f20204k = mediaFormat.getInteger("height");
            this.f20202i = 90000;
            this.f20201h = new LinkedList<>();
            this.f20198e = "vide";
            this.f20199f = new VideoMediaHeaderBox();
            this.f20200g = new SampleDescriptionBox();
            String string = mediaFormat.getString("mime");
            if (string.equals("video/avc")) {
                VisualSampleEntry visualSampleEntry = new VisualSampleEntry(VisualSampleEntry.TYPE3);
                visualSampleEntry.setDataReferenceIndex(1);
                visualSampleEntry.setDepth(24);
                visualSampleEntry.setFrameCount(1);
                visualSampleEntry.setHorizresolution(72.0d);
                visualSampleEntry.setVertresolution(72.0d);
                visualSampleEntry.setWidth(this.f20205l);
                visualSampleEntry.setHeight(this.f20204k);
                AvcConfigurationBox avcConfigurationBox = new AvcConfigurationBox();
                if (mediaFormat.getByteBuffer("csd-0") != null) {
                    ArrayList arrayList = new ArrayList();
                    ByteBuffer byteBuffer = mediaFormat.getByteBuffer("csd-0");
                    byteBuffer.position(4);
                    byte[] bArr = new byte[byteBuffer.remaining()];
                    byteBuffer.get(bArr);
                    arrayList.add(bArr);
                    ArrayList arrayList2 = new ArrayList();
                    ByteBuffer byteBuffer2 = mediaFormat.getByteBuffer("csd-1");
                    byteBuffer2.position(4);
                    byte[] bArr2 = new byte[byteBuffer2.remaining()];
                    byteBuffer2.get(bArr2);
                    arrayList2.add(bArr2);
                    avcConfigurationBox.setSequenceParameterSets(arrayList);
                    avcConfigurationBox.setPictureParameterSets(arrayList2);
                }
                if (mediaFormat.containsKey("level")) {
                    int integer = mediaFormat.getInteger("level");
                    if (integer == 1) {
                        avcConfigurationBox.setAvcLevelIndication(1);
                    } else if (integer == 32) {
                        avcConfigurationBox.setAvcLevelIndication(2);
                    } else if (integer == 4) {
                        avcConfigurationBox.setAvcLevelIndication(11);
                    } else if (integer == 8) {
                        avcConfigurationBox.setAvcLevelIndication(12);
                    } else if (integer == 16) {
                        avcConfigurationBox.setAvcLevelIndication(13);
                    } else if (integer == 64) {
                        avcConfigurationBox.setAvcLevelIndication(21);
                    } else if (integer == 128) {
                        avcConfigurationBox.setAvcLevelIndication(22);
                    } else if (integer == 256) {
                        avcConfigurationBox.setAvcLevelIndication(3);
                    } else if (integer == 512) {
                        avcConfigurationBox.setAvcLevelIndication(31);
                    } else if (integer == 1024) {
                        avcConfigurationBox.setAvcLevelIndication(32);
                    } else if (integer == 2048) {
                        avcConfigurationBox.setAvcLevelIndication(4);
                    } else if (integer == 4096) {
                        avcConfigurationBox.setAvcLevelIndication(41);
                    } else if (integer == 8192) {
                        avcConfigurationBox.setAvcLevelIndication(42);
                    } else if (integer == 16384) {
                        avcConfigurationBox.setAvcLevelIndication(5);
                    } else if (integer == 32768) {
                        avcConfigurationBox.setAvcLevelIndication(51);
                    } else if (integer == 65536) {
                        avcConfigurationBox.setAvcLevelIndication(52);
                    } else if (integer == 2) {
                        avcConfigurationBox.setAvcLevelIndication(27);
                    }
                } else {
                    avcConfigurationBox.setAvcLevelIndication(13);
                }
                if (mediaFormat.containsKey("profile")) {
                    int integer2 = mediaFormat.getInteger("profile");
                    if (integer2 == 1) {
                        avcConfigurationBox.setAvcProfileIndication(66);
                    } else if (integer2 == 2) {
                        avcConfigurationBox.setAvcProfileIndication(77);
                    } else if (integer2 == 4) {
                        avcConfigurationBox.setAvcProfileIndication(88);
                    } else if (integer2 == 8) {
                        avcConfigurationBox.setAvcProfileIndication(100);
                    } else if (integer2 == 16) {
                        avcConfigurationBox.setAvcProfileIndication(110);
                    } else if (integer2 == 32) {
                        avcConfigurationBox.setAvcProfileIndication(j.N0);
                    } else if (integer2 == 64) {
                        avcConfigurationBox.setAvcProfileIndication(244);
                    }
                } else {
                    avcConfigurationBox.setAvcProfileIndication(100);
                }
                avcConfigurationBox.setBitDepthLumaMinus8(-1);
                avcConfigurationBox.setBitDepthChromaMinus8(-1);
                avcConfigurationBox.setChromaFormat(-1);
                avcConfigurationBox.setConfigurationVersion(1);
                avcConfigurationBox.setLengthSizeMinusOne(3);
                avcConfigurationBox.setProfileCompatibility(0);
                visualSampleEntry.addBox(avcConfigurationBox);
                this.f20200g.addBox(visualSampleEntry);
            } else if (string.equals("video/mp4v")) {
                VisualSampleEntry visualSampleEntry2 = new VisualSampleEntry(VisualSampleEntry.TYPE1);
                visualSampleEntry2.setDataReferenceIndex(1);
                visualSampleEntry2.setDepth(24);
                visualSampleEntry2.setFrameCount(1);
                visualSampleEntry2.setHorizresolution(72.0d);
                visualSampleEntry2.setVertresolution(72.0d);
                visualSampleEntry2.setWidth(this.f20205l);
                visualSampleEntry2.setHeight(this.f20204k);
                this.f20200g.addBox(visualSampleEntry2);
            }
        } else {
            this.f20206m = 1.0f;
            this.f20202i = mediaFormat.getInteger("sample-rate");
            this.f20198e = "soun";
            this.f20199f = new SoundMediaHeaderBox();
            this.f20200g = new SampleDescriptionBox();
            AudioSampleEntry audioSampleEntry = new AudioSampleEntry(AudioSampleEntry.TYPE3);
            audioSampleEntry.setChannelCount(mediaFormat.getInteger("channel-count"));
            audioSampleEntry.setSampleRate(mediaFormat.getInteger("sample-rate"));
            audioSampleEntry.setDataReferenceIndex(1);
            audioSampleEntry.setSampleSize(16);
            ESDescriptorBox eSDescriptorBox = new ESDescriptorBox();
            h hVar = new h();
            hVar.v(0);
            n nVar = new n();
            nVar.h(2);
            hVar.w(nVar);
            String string2 = mediaFormat.containsKey("mime") ? mediaFormat.getString("mime") : "audio/mp4-latm";
            s8.e eVar = new s8.e();
            if ("audio/mpeg".equals(string2)) {
                eVar.u(105);
            } else {
                eVar.u(64);
            }
            eVar.v(5);
            eVar.s(1536);
            if (mediaFormat.containsKey("max-bitrate")) {
                eVar.t(mediaFormat.getInteger("max-bitrate"));
            } else {
                eVar.t(96000L);
            }
            eVar.r(this.f20202i);
            s8.a aVar = new s8.a();
            aVar.p(2);
            aVar.r(f20193r.get(Integer.valueOf((int) audioSampleEntry.getSampleRate())).intValue());
            aVar.q(audioSampleEntry.getChannelCount());
            eVar.q(aVar);
            hVar.u(eVar);
            ByteBuffer s10 = hVar.s();
            eSDescriptorBox.setEsDescriptor(hVar);
            eSDescriptorBox.setData(s10);
            audioSampleEntry.addBox(eSDescriptorBox);
            this.f20200g.addBox(audioSampleEntry);
        }
    }

    public static int r(a aVar, a aVar2) {
        if (aVar.f20212b > aVar2.f20212b) {
            return 1;
        }
        return aVar.f20212b < aVar2.f20212b ? -1 : 0;
    }

    public void b(long j10, MediaCodec.BufferInfo bufferInfo) {
        boolean z10 = true;
        if (this.f20209p || (bufferInfo.flags & 1) == 0) {
            z10 = false;
        }
        this.f20195b.add(new c(j10, bufferInfo.size));
        LinkedList<Integer> linkedList = this.f20201h;
        if (linkedList != null && z10) {
            linkedList.add(Integer.valueOf(this.f20195b.size()));
        }
        ArrayList<a> arrayList = this.f20208o;
        arrayList.add(new a(arrayList.size(), ((bufferInfo.presentationTimeUs * this.f20202i) + 500000) / 1000000));
    }

    public Date c() {
        return this.f20203j;
    }

    public long d() {
        return this.f20196c;
    }

    public String e() {
        return this.f20198e;
    }

    public int f() {
        return this.f20204k;
    }

    public AbstractMediaHeaderBox g() {
        return this.f20199f;
    }

    public int[] h() {
        return this.f20197d;
    }

    public SampleDescriptionBox i() {
        return this.f20200g;
    }

    public long[] j() {
        return this.f20207n;
    }

    public ArrayList<c> k() {
        return this.f20195b;
    }

    public long[] l() {
        LinkedList<Integer> linkedList = this.f20201h;
        if (linkedList == null || linkedList.isEmpty()) {
            return null;
        }
        long[] jArr = new long[this.f20201h.size()];
        for (int i10 = 0; i10 < this.f20201h.size(); i10++) {
            jArr[i10] = this.f20201h.get(i10).intValue();
        }
        return jArr;
    }

    public int m() {
        return this.f20202i;
    }

    public long n() {
        return this.f20194a;
    }

    public float o() {
        return this.f20206m;
    }

    public int p() {
        return this.f20205l;
    }

    public boolean q() {
        return this.f20209p;
    }

    public void s() {
        int i10;
        ArrayList arrayList = new ArrayList(this.f20208o);
        Collections.sort(this.f20208o, d.f20192a);
        this.f20207n = new long[this.f20208o.size()];
        long j10 = Long.MAX_VALUE;
        long j11 = 0;
        int i11 = 0;
        boolean z10 = false;
        while (true) {
            if (i11 >= this.f20208o.size()) {
                break;
            }
            a aVar = this.f20208o.get(i11);
            long j12 = aVar.f20212b - j11;
            j11 = aVar.f20212b;
            this.f20207n[aVar.f20211a] = j12;
            long j13 = j10;
            if (aVar.f20211a != 0) {
                this.f20196c += j12;
            }
            j10 = (j12 <= 0 || j12 >= 2147483647L) ? j13 : Math.min(j13, j12);
            if (aVar.f20211a != i11) {
                z10 = true;
            }
            i11++;
        }
        long[] jArr = this.f20207n;
        if (jArr.length > 0) {
            jArr[0] = j10;
            this.f20196c += j10;
        }
        for (i10 = 1; i10 < arrayList.size(); i10++) {
            ((a) arrayList.get(i10)).f20213c = this.f20207n[i10] + ((a) arrayList.get(i10 - 1)).f20213c;
        }
        if (z10) {
            this.f20197d = new int[this.f20208o.size()];
            for (int i12 = 0; i12 < this.f20208o.size(); i12++) {
                a aVar2 = this.f20208o.get(i12);
                this.f20197d[aVar2.f20211a] = (int) (aVar2.f20212b - aVar2.f20213c);
            }
        }
    }
}
