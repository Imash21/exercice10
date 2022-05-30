import com.sun.source.doctree.SystemPropertyTree;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TASK2
{
    public static  void main(String[] args) throws IOException
    {
        int bajt;

        try (FileInputStream fs=new FileInputStream("MA.txt"))
        {
            do
            {
                bajt=fs.read();
                if (bajt!= -1)
                {System.out.print(bajt);}
            }
            while(bajt!= -1);
        }

        catch (FileNotFoundException e)
        {
            System.out.println("NOT FOUND ERROR");
            return;
        }

        catch (IOException e)
        {
            System.out.println("ERROR");
        }

    }
}
