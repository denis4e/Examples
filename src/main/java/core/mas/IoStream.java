package core.mas;

class IOStream
{
    static boolean jar; 
    static private java.io.BufferedReader jin = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
    static  String buf;
    static  Integer bufint;
    static String ReadString()
    {
        try 
        {
            buf = jin.readLine();
        } 
        catch (java.io.IOException e) 
        {
            buf = "null";
        }
        return buf;
    }
    static double ReadDouble()
    {
        double buf;
        try 
        {
            buf = Double.parseDouble(jin.readLine());
        } 
        catch (java.io.IOException e) 
        {
            buf = 0.0;
        }
        catch(NumberFormatException e)
        {
            Print("������� ������������ ������, ��������� ����!\n");
            buf = ReadDouble();
        }
        return buf;
    }
    static int ReadInt()
    {
        try 
        {
        
        	bufint = Integer.parseInt(jin.readLine());
        } 
        catch (java.io.IOException e) 
        {
            bufint = 0;
        }
        catch(NumberFormatException e)
        {
            Print("������� ������������ ������, ��������� ����!\n");
            bufint = ReadInt();
        }
       return bufint;
    }
    
   
    
    static short ReadShort()
    {
        short buf;
        try 
        {
            buf = Short.parseShort(jin.readLine());
        } 
        catch (java.io.IOException e) 
        {
            buf = 0;
        }
        catch(NumberFormatException e)
        {
            Print("������� ������������ ������, ��������� ����!\n");
            buf = ReadShort();
        }
        return buf;
    }
    static byte ReadByte()
    {
        byte buf;
        try 
        {
            buf = Byte.parseByte((jin.readLine()));          
        } 
        catch (java.io.IOException e) 
        {
            buf = 0;
        }
        catch(NumberFormatException e)
        {
            Print("������� ������������ ������, ��������� ����!\n");
            buf = ReadByte();
        }
        return buf;
    }
    static boolean ReadBool()
    {
        boolean buf1;
        try
        {
            buf = jin.readLine();
            if(Boolean.parseBoolean(buf))
                return true;
            else
                if(buf.equalsIgnoreCase("false"))
                    return false;
                else
                    throw new Exception();
        } 
        catch (Exception e) 
        {
            Print("������� ������������ ������, ��������� ����!\n");
            buf1 = ReadBool();
        }
        return buf1;
    }
    
    static void Print(String text)
    {
        if(jar)
            System.out.print(Replace(text));
        else
            System.out.print(text);
    }
    
  
    static void PrintLine(String text)
    {
        if(jar)
            System.out.println(Replace(text));
        else
            System.out.println(text);
    }
    static void PrintLine()
    {
        System.out.println();
    }
    static short ReadShort(short infinum, short supremum)
    {
        short buf;
        try 
        {
            buf = Short.parseShort(jin.readLine());
            if(buf < infinum || buf > supremum)
                throw new NumberFormatException();
        } 
        catch (java.io.IOException e) 
        {
            buf = 0;
        }
        catch(NumberFormatException e)
        {
            Print("������� ������������ ������, ��������� ����!\n");
            buf = ReadShort(infinum, supremum);
        }
        return buf;
    }
    static byte ReadByte(byte infinum, byte supremum)
    {
        byte buf;
        try 
        {
            buf = Byte.parseByte((jin.readLine())); 
            if(buf < infinum || buf > supremum)
                throw new NumberFormatException();
        } 
        catch (java.io.IOException e) 
        {
            buf = 0;
        }
        catch(NumberFormatException e)
        {
            Print("������� ������������ ������, ��������� ����!\n");
            buf = ReadByte(infinum, supremum);
        }
        return buf;
    }
    static int ReadInt(int infinum, int supremum)
    {
        int buf;
        try 
        {
            buf = Integer.parseInt(jin.readLine());
            if(buf < infinum || buf > supremum)
                throw new NumberFormatException();
        } 
        catch (java.io.IOException e) 
        {
            buf = 0;
        }
        catch(NumberFormatException e)
        {
            Print("������� ������������ ������, ��������� ����!\n");
            buf = ReadInt(infinum, supremum);
        }
        return buf;
    }
    static String Replace(String text)
    {
        String []LRus = {"�", "�", "�", "�", "�", "�", "�", "�", "�", "�", "�",
                        "�", "�", "�", "�", "�", "�", "�", "�", "�", "�", "�",
                        "�", "�", "�", "�", "�", "�", "�", "�", "�", "�", "�" };
        
        String []URus = {"�", "�", "�", "�", "�", "�", "�", "�", "�", "�", "�",
                         "�", "�", "�", "�", "�", "�", "�", "�", "�", "�", "�",
                         "�", "�", "�", "�", "�", "�", "�", "�", "�", "�", "�" };
        
        String []LEng = {"a", "b", "v", "g", "d", "e", "jo", "zh", "z", "i", "j",
                         "k", "l", "m", "n", "o", "p", "r", "s", "t", "u", "f",
                         "kh", "ts", "ch", "sh", "sch", "'", "y", "'", "e", "ju", "ja" }; 
        
        String []UEng = {"A", "B", "V", "G", "D", "E", "Jo", "Zh", "Z", "I", "J",
                         "K", "L", "M", "N", "O", "P", "R", "S", "T", "U", "F", 
                         "Kh", "Ts", "Ch", "Sh", "Sch", "'", "Y", "'", "E", "Ju", "Ja" };
        byte index;
        for(index = 0; index < 33; ++index)
        {
            text = text.replace(LRus[index], LEng[index]);
            text = text.replace(URus[index], UEng[index]);
        }
        return text;
    }
}
