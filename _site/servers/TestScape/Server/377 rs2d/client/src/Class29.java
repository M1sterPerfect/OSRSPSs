// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

public class Class29
{

    public void method308(byte byte0, ByteStream byteStream)
    {
        anInt579 = byteStream.method521();
        if(byte0 == 6)
            byte0 = 0;
        else
            throw new NullPointerException();
        anInt577 = byteStream.method526();
        anInt578 = byteStream.method526();
        method309(byteStream, 0);
    }

    public void method309(ByteStream byteStream, int i)
    {
        anInt574 = byteStream.method521();
        anIntArray575 = new int[anInt574];
        anIntArray576 = new int[anInt574];
        if(i != 0)
            return;
        for(int j = 0; j < anInt574; j++)
        {
            anIntArray575[j] = byteStream.method523();
            anIntArray576[j] = byteStream.method523();
        }

    }

    public void method310(boolean flag)
    {
        anInt580 = 0;
        anInt581 = 0;
        if(!flag)
        {
            return;
        } else
        {
            anInt582 = 0;
            anInt583 = 0;
            anInt584 = 0;
            return;
        }
    }

    public int method311(int i, int j)
    {
        if(i != 0)
        {
            for(int k = 1; k > 0; k++);
        }
        if(anInt584 >= anInt580)
        {
            anInt583 = anIntArray576[anInt581++] << 15;
            if(anInt581 >= anInt574)
                anInt581 = anInt574 - 1;
            anInt580 = (int)(((double)anIntArray575[anInt581] / 65536D) * (double)j);
            if(anInt580 > anInt584)
                anInt582 = ((anIntArray576[anInt581] << 15) - anInt583) / (anInt580 - anInt584);
        }
        anInt583 += anInt582;
        anInt584++;
        return anInt583 - anInt582 >> 15;
    }

    public Class29()
    {
        aBoolean573 = true;
    }

    public boolean aBoolean573;
    public int anInt574;
    public int anIntArray575[];
    public int anIntArray576[];
    public int anInt577;
    public int anInt578;
    public int anInt579;
    public int anInt580;
    public int anInt581;
    public int anInt582;
    public int anInt583;
    public int anInt584;
    public static int anInt585;
}
