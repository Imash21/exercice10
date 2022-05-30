import java.io.*;

public class TASK4
{
    public static void main(String []args) throws IOException
    {
        DataManagement obj = new DataManagement();
        obj.readDataImamidin57105();
        obj.WriteDataToFileImamidin57105();
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        obj.ReadDataFromFileImamidin57105();
    }
}

class DataManagement
{
    String Imamidin57105;
    void readDataImamidin57105() throws IOException
    {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ENTER UR NAME & LAST NAME");
        Imamidin57105=rd.readLine();
    }

    void WriteDataToFileImamidin57105()
    {
        try(FileWriter fr = new FileWriter("NAME.txt")) {
            fr.write(Imamidin57105);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    void ReadDataFromFileImamidin57105(){
        String result;
        try(BufferedReader br = new BufferedReader(new FileReader("NAME.txt"))) {
            while((result=br.readLine()) !=null)
            {
                System.out.println(result);
            }
        }

        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }

        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

}

