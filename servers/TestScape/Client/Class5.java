import sign.signlink;

final class Class5
{

    public static final Class5 method159(int i)
    {
        for(int j = 0; j < 20; j++)
            if(aClass5Array80[j].aLong78 == (long)i)
                return aClass5Array80[j];

        anInt56 = (anInt56 + 1) % 20;
        Class5 class5 = aClass5Array80[anInt56] = new Class5();
        aClass30_Sub2_Sub2_60.anInt1406 = anIntArray72[i];
        class5.aLong78 = i;
        class5.method165(true, aClass30_Sub2_Sub2_60);
        if(i == 3000) { // NPC ID, can be changed.
		    aClass30_Sub2_Sub2_60.anInt1406 = anIntArray72[630]; // Original NPC data, used to collect default emotes and extra NPC info. Don't change this unless you know what you are doing.
		    class5.method165(true, aClass30_Sub2_Sub2_60); // Collect original NPC data, do not change.
		    class5.aStringArray66 = new String[5];
		    class5.aStringArray66[1] = "Attack";
		    class5.anIntArray94 = new int[2]; // Number of models the NPC uses
		    int changedColors = 1; // Number of model colors changed on the NPC
		    class5.anIntArray76 = new int[changedColors];
		    class5.anIntArray70 = new int[changedColors];
		    class5.anIntArray76[0] = 61; // Original model color
		    class5.anIntArray70[0] = 926; // Changed model color
		    class5.anIntArray94[0] = 5000; // Cape model ID
		    class5.anIntArray94[1] = 5001; // Body peice 1 model ID
		    class5.aString65 = "General Graardor"; // NPC name
		    class5.anInt61 = 624; // NPC combat level
		    class5.aByteArray89 = "An huge war chief.".getBytes(); // NPC description, you must leave the .getBytes() at the end or it will not work.
}

if(i == 2678) { // NPC ID
    aClass30_Sub2_Sub2_60.anInt1406 = anIntArray72[630]; 
    class5.method165(true, aClass30_Sub2_Sub2_60); // Collect original NPC data
    class5.aStringArray66 = new String[5];
    class5.aStringArray66[1] = "Attack";
         class5.anIntArray94 = new int[5]; // Number of models the NPC uses
    int changedColors = 1; // Number of model colors changed on the NPC
    class5.anIntArray76 = new int[changedColors];
    class5.anIntArray70 = new int[changedColors];
    class5.anIntArray76[0] = 61; // Original model color
    class5.anIntArray70[0] = 926; // Changed model color
         class5.anIntArray94[0] = 10482; // 27768
         class5.anIntArray94[1] = 10483; // 27770
         class5.anIntArray94[2] = 10484; // 27772
         class5.anIntArray94[3] = 10485; // 27765
         class5.anIntArray94[4] = 10486; // 27764
    class5.aString65 = "K'ril Tsutsaroth"; // NPC name
    class5.anInt61 = 650; //combat level
    class5.aByteArray89 = "The mighty lord zamoraks demon K'ril Tsutsaroth!".getBytes(); // NPC description
}

if(i == 2679) { // NPC ID
    aClass30_Sub2_Sub2_60.anInt1406 = anIntArray72[630]; 
    class5.method165(true, aClass30_Sub2_Sub2_60); // Collect original NPC data
    class5.aStringArray66 = new String[5];
    class5.aStringArray66[1] = "Attack";
         class5.anIntArray94 = new int[3]; // Number of models the NPC uses
    int changedColors = 1; // Number of model colors changed on the NPC
    class5.anIntArray76 = new int[changedColors];
    class5.anIntArray70 = new int[changedColors];
    class5.anIntArray76[0] = 61; // Original model color
    class5.anIntArray70[0] = 926; // Changed model color
         class5.anIntArray94[0] = 10487; // 28002
         class5.anIntArray94[1] = 10488; // 28003
         class5.anIntArray94[2] = 10489; // 28004
    class5.aString65 = "Kree'arra"; // NPC name
    class5.anInt61 = 650; //combat level
    class5.aByteArray89 = "The mighty lord Armadyls general kree'arra!".getBytes(); // NPC description
}

//		if(i == 0){
//	class5.aStringArray66 = new String[5];
//	class5.aStringArray66[1] = "Attack";
//	class5.anIntArray94 = new int[9];
//	class5.anIntArray76 = new int[3];
//	class5.anIntArray70 = new int[3];
 //  	class5.anIntArray76[0] = 0xD4E7;
//	class5.anIntArray76[1] = 0xDFC0;
//	class5.anIntArray76[2] = 0xD3A7;
//	class5.anIntArray70[0] = 8128;
//	class5.anIntArray70[1] = 9126;
//	class5.anIntArray70[2] = 8128;
//	class5.anIntArray94[0] = 10399; // arms
//	class5.anIntArray94[1] = 10396; // chest
//	class5.anIntArray94[2] = 7609; // legs
//	class5.anIntArray94[3] = 5990; // Weapon
//	class5.anIntArray94[4] = 4954; // boots
//	class5.anIntArray94[5] = 13307; // gloves
//	class5.anIntArray94[6] = 10205; // helm
//	class5.anIntArray94[7] = 10401; // cape
//	class5.anIntArray94[8] = 9642; // amulet
//	class5.anInt61 = 1; // Level
//	class5.aString65 = "Player guy";
//	class5.aByteArray89 = "Wowzas!".getBytes();
//	}

if(i == 3001) { // NPC ID
    aClass30_Sub2_Sub2_60.anInt1406 = anIntArray72[630]; 
    class5.method165(true, aClass30_Sub2_Sub2_60); // Collect original NPC data
    class5.aStringArray66 = new String[5];
    class5.aStringArray66[1] = "Attack";
         class5.anIntArray94 = new int[3]; // Number of models the NPC uses
    int changedColors = 1; // Number of model colors changed on the NPC
    class5.anIntArray76 = new int[changedColors];
    class5.anIntArray70 = new int[changedColors];
    class5.anIntArray76[0] = 61; // Original model color
    class5.anIntArray70[0] = 926; // Changed model color
         class5.anIntArray94[0] = 10492; // 28078
         class5.anIntArray94[1] = 10493; // 28071
         class5.anIntArray94[2] = 10494; // 28057
    class5.aString65 = "Commander Zilyana"; // NPC name
    class5.anInt61 = 648; //combat level
    class5.aByteArray89 = "The mighty lord Saradomins commander Zilyana !".getBytes(); // NPC description
}
        return class5;
    }

    public final Class30_Sub2_Sub4_Sub6 method160(boolean flag)
    {
        if(anIntArray88 != null)
        {
            Class5 class5 = method161(anInt64);
            if(class5 == null)
                return null;
            else
                return class5.method160(true);
        }
        if(anIntArray73 == null)
            return null;
        boolean flag1 = false;
        if(!flag)
            anInt64 = 303;
        for(int i = 0; i < anIntArray73.length; i++)
            if(!Class30_Sub2_Sub4_Sub6.method463(anIntArray73[i]))
                flag1 = true;

        if(flag1)
            return null;
        Class30_Sub2_Sub4_Sub6 aclass30_sub2_sub4_sub6[] = new Class30_Sub2_Sub4_Sub6[anIntArray73.length];
        for(int j = 0; j < anIntArray73.length; j++)
            aclass30_sub2_sub4_sub6[j] = Class30_Sub2_Sub4_Sub6.method462(anInt69, anIntArray73[j]);

        Class30_Sub2_Sub4_Sub6 class30_sub2_sub4_sub6;
        if(aclass30_sub2_sub4_sub6.length == 1)
            class30_sub2_sub4_sub6 = aclass30_sub2_sub4_sub6[0];
        else
            class30_sub2_sub4_sub6 = new Class30_Sub2_Sub4_Sub6(aclass30_sub2_sub4_sub6.length, aclass30_sub2_sub4_sub6, -38);
        if(anIntArray76 != null)
        {
            for(int k = 0; k < anIntArray76.length; k++)
                class30_sub2_sub4_sub6.method476(anIntArray76[k], anIntArray70[k]);

        }
        return class30_sub2_sub4_sub6;
    }

    public final Class5 method161(int i)
    {
        int j = -1;
        if(i != 1834)
            aBoolean81 = !aBoolean81;
        if(anInt57 != -1)
        {
            Class37 class37 = Class37.aClass37Array646[anInt57];
            int k = class37.anInt648;
            int l = class37.anInt649;
            int i1 = class37.anInt650;
            int j1 = client.anIntArray1232[i1 - l];
            j = aClient82.anIntArray971[k] >> l & j1;
        } else
        if(anInt59 != -1)
            j = aClient82.anIntArray971[anInt59];
        if(j < 0 || j >= anIntArray88.length || anIntArray88[j] == -1)
            return null;
        else
            return method159(anIntArray88[j]);
    }

    public static final void method162(Class44 class44)
    {
        aClass30_Sub2_Sub2_60 = new Class30_Sub2_Sub2(class44.method571("npc.dat", null), 891);
        Class30_Sub2_Sub2 class30_sub2_sub2 = new Class30_Sub2_Sub2(class44.method571("npc.idx", null), 891);
        anInt62 = class30_sub2_sub2.method410();
        anIntArray72 = new int[anInt62];
        int i = 2;
        for(int j = 0; j < anInt62; j++)
        {
            anIntArray72[j] = i;
            i += class30_sub2_sub2.method410();
        }

        aClass5Array80 = new Class5[20];
        for(int k = 0; k < 20; k++)
            aClass5Array80[k] = new Class5();

    }

    public static final void method163(int i)
    {
        aClass12_95 = null;
        anIntArray72 = null;
        if(i >= 0)
            anInt74 = 60;
        aClass5Array80 = null;
        aClass30_Sub2_Sub2_60 = null;
    }

    public final Class30_Sub2_Sub4_Sub6 method164(int i, int j, int k, int ai[])
    {
        if(anIntArray88 != null)
        {
            Class5 class5 = method161(anInt64);
            if(class5 == null)
                return null;
            else
                return class5.method164(0, j, k, ai);
        }
        Class30_Sub2_Sub4_Sub6 class30_sub2_sub4_sub6 = (Class30_Sub2_Sub4_Sub6)aClass12_95.method222(aLong78);
        if(i != 0)
        {
            for(int l = 1; l > 0; l++);
        }
        if(class30_sub2_sub4_sub6 == null)
        {
            boolean flag = false;
            for(int i1 = 0; i1 < anIntArray94.length; i1++)
                if(!Class30_Sub2_Sub4_Sub6.method463(anIntArray94[i1]))
                    flag = true;

            if(flag)
                return null;
            Class30_Sub2_Sub4_Sub6 aclass30_sub2_sub4_sub6[] = new Class30_Sub2_Sub4_Sub6[anIntArray94.length];
            for(int j1 = 0; j1 < anIntArray94.length; j1++)
                aclass30_sub2_sub4_sub6[j1] = Class30_Sub2_Sub4_Sub6.method462(anInt69, anIntArray94[j1]);

            if(aclass30_sub2_sub4_sub6.length == 1)
                class30_sub2_sub4_sub6 = aclass30_sub2_sub4_sub6[0];
            else
                class30_sub2_sub4_sub6 = new Class30_Sub2_Sub4_Sub6(aclass30_sub2_sub4_sub6.length, aclass30_sub2_sub4_sub6, -38);
            if(anIntArray76 != null)
            {
                for(int k1 = 0; k1 < anIntArray76.length; k1++)
                    class30_sub2_sub4_sub6.method476(anIntArray76[k1], anIntArray70[k1]);

            }
            class30_sub2_sub4_sub6.method469((byte)-71);
            class30_sub2_sub4_sub6.method479(64 + anInt85, 850 + anInt92, -30, -50, -30, true);
            aClass12_95.method223(class30_sub2_sub4_sub6, aLong78, (byte)2);
        }
        Class30_Sub2_Sub4_Sub6 class30_sub2_sub4_sub6_1 = Class30_Sub2_Sub4_Sub6.aClass30_Sub2_Sub4_Sub6_1621;
        class30_sub2_sub4_sub6_1.method464(7, class30_sub2_sub4_sub6, Class36.method532(k, false) & Class36.method532(j, false));
        if(k != -1 && j != -1)
            class30_sub2_sub4_sub6_1.method471(-20491, ai, j, k);
        else
        if(k != -1)
            class30_sub2_sub4_sub6_1.method470(k, 40542);
        if(anInt91 != 128 || anInt86 != 128)
            class30_sub2_sub4_sub6_1.method478(anInt91, anInt91, anInt63, anInt86);
        class30_sub2_sub4_sub6_1.method466(false);
        class30_sub2_sub4_sub6_1.anIntArrayArray1658 = null;
        class30_sub2_sub4_sub6_1.anIntArrayArray1657 = null;
        if(aByte68 == 1)
            class30_sub2_sub4_sub6_1.aBoolean1659 = true;
        return class30_sub2_sub4_sub6_1;
    }

    private final void method165(boolean flag, Class30_Sub2_Sub2 class30_sub2_sub2)
    {
        if(!flag)
            throw new NullPointerException();
        do
        {
            int i = class30_sub2_sub2.method408();
            if(i == 0)
                return;
            if(i == 1)
            {
                int j = class30_sub2_sub2.method408();
                anIntArray94 = new int[j];
                for(int j1 = 0; j1 < j; j1++)
                    anIntArray94[j1] = class30_sub2_sub2.method410();

            } else
            if(i == 2)
                aString65 = class30_sub2_sub2.method415();
            else
            if(i == 3)
                aByteArray89 = class30_sub2_sub2.method416((byte)30);
            else
            if(i == 12)
                aByte68 = class30_sub2_sub2.method409();
            else
            if(i == 13)
                anInt77 = class30_sub2_sub2.method410();
            else
            if(i == 14)
                anInt67 = class30_sub2_sub2.method410();
            else
            if(i == 17)
            {
                anInt67 = class30_sub2_sub2.method410();
                anInt58 = class30_sub2_sub2.method410();
                anInt83 = class30_sub2_sub2.method410();
                anInt55 = class30_sub2_sub2.method410();
            } else
            if(i >= 30 && i < 40)
            {
                if(aStringArray66 == null)
                    aStringArray66 = new String[5];
                aStringArray66[i - 30] = class30_sub2_sub2.method415();
                if(aStringArray66[i - 30].equalsIgnoreCase("hidden"))
                    aStringArray66[i - 30] = null;
            } else
            if(i == 40)
            {
                int k = class30_sub2_sub2.method408();
                anIntArray76 = new int[k];
                anIntArray70 = new int[k];
                for(int k1 = 0; k1 < k; k1++)
                {
                    anIntArray76[k1] = class30_sub2_sub2.method410();
                    anIntArray70[k1] = class30_sub2_sub2.method410();
                }

            } else
            if(i == 60)
            {
                int l = class30_sub2_sub2.method408();
                anIntArray73 = new int[l];
                for(int l1 = 0; l1 < l; l1++)
                    anIntArray73[l1] = class30_sub2_sub2.method410();

            } else
            if(i == 90)
                anInt96 = class30_sub2_sub2.method410();
            else
            if(i == 91)
                anInt71 = class30_sub2_sub2.method410();
            else
            if(i == 92)
                anInt90 = class30_sub2_sub2.method410();
            else
            if(i == 93)
                aBoolean87 = false;
            else
            if(i == 95)
                anInt61 = class30_sub2_sub2.method410();
            else
            if(i == 97)
                anInt91 = class30_sub2_sub2.method410();
            else
            if(i == 98)
                anInt86 = class30_sub2_sub2.method410();
            else
            if(i == 99)
                aBoolean93 = true;
            else
            if(i == 100)
                anInt85 = class30_sub2_sub2.method409();
            else
            if(i == 101)
                anInt92 = class30_sub2_sub2.method409() * 5;
            else
            if(i == 102)
                anInt75 = class30_sub2_sub2.method410();
            else
            if(i == 103)
                anInt79 = class30_sub2_sub2.method410();
            else
            if(i == 106)
            {
                anInt57 = class30_sub2_sub2.method410();
                if(anInt57 == 65535)
                    anInt57 = -1;
                anInt59 = class30_sub2_sub2.method410();
                if(anInt59 == 65535)
                    anInt59 = -1;
                int i1 = class30_sub2_sub2.method408();
                anIntArray88 = new int[i1 + 1];
                for(int i2 = 0; i2 <= i1; i2++)
                {
                    anIntArray88[i2] = class30_sub2_sub2.method410();
                    if(anIntArray88[i2] == 65535)
                        anIntArray88[i2] = -1;
                }

            } else
            if(i == 107)
                aBoolean84 = false;
        } while(true);
    }

    Class5()
    {
        anInt55 = -1;
        anInt57 = -1;
        anInt58 = -1;
        anInt59 = -1;
        anInt61 = -1;
        anInt63 = 9;
        anInt64 = 1834;
        anInt67 = -1;
        aByte68 = 1;
        anInt69 = 9;
        anInt71 = -1;
        anInt75 = -1;
        anInt77 = -1;
        aLong78 = -1L;
        anInt79 = 32;
        aBoolean81 = false;
        anInt83 = -1;
        aBoolean84 = true;
        anInt86 = 128;
        aBoolean87 = true;
        anInt90 = -1;
        anInt91 = 128;
        aBoolean93 = false;
        anInt96 = -1;
    }

    public int anInt55;
    private static int anInt56;
    public int anInt57;
    public int anInt58;
    public int anInt59;
    private static Class30_Sub2_Sub2 aClass30_Sub2_Sub2_60;
    public int anInt61;
    public static int anInt62;
    private int anInt63;
    private int anInt64;
    public String aString65;
    public String aStringArray66[];
    public int anInt67;
    public byte aByte68;
    private int anInt69;
    private int anIntArray70[];
    public int anInt71;
    private static int anIntArray72[];
    private int anIntArray73[];
    private static int anInt74 = 748;
    public int anInt75;
    private int anIntArray76[];
    public int anInt77;
    public long aLong78;
    public int anInt79;
    private static Class5 aClass5Array80[];
    private boolean aBoolean81;
    public static client aClient82;
    public int anInt83;
    public boolean aBoolean84;
    private int anInt85;
    private int anInt86;
    public boolean aBoolean87;
    public int anIntArray88[];
    public byte aByteArray89[];
    public int anInt90;
    private int anInt91;
    private int anInt92;
    public boolean aBoolean93;
    private int anIntArray94[];
    public static Class12 aClass12_95 = new Class12(false, 30);
    public int anInt96;

}
