import com.sun.source.doctree.SystemPropertyTree;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


    public class TASK1
    {
    public static void main(String[] args) throws IOException {
        FileInputStream fis;
        int bajt;

        try
        {
            fis=new FileInputStream("MA.txt");
        }

        catch (FileNotFoundException e)
        {
            System.out.println("NOT FOUND ERROR");
            return;
        }

        try
        {
            do
            {
                bajt=fis.read();
                if (bajt!= -1)
                {System.out.print((char)bajt);}
            }
            while(bajt!= -1);
        }

        catch (IOException e)
        {
            System.out.println("ERROR");
        }

        finally
        {
            try
            {
                fis.close();
                System.out.println("FILE CLOSED");
            }
            catch (IOException e)
            {
                System.out.println("ERROR");
            }
        }

    }
}
