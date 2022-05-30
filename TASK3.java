import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class TASK3
{
    public static void main(String[] args)
    {
        int txtint;
        try (FileInputStream fs=new FileInputStream("MA.txt");
             FileOutputStream fot = new FileOutputStream("NW.txt"))
        {
            do
            {
                txtint = fs.read();

                if ((char)txtint==' ')
                {
                    txtint='-';
                }

                if (txtint != -1)
                {
                    fot.write(txtint);
                }
            }

            while (txtint != -1);
            System.out.println("COPIED");
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
