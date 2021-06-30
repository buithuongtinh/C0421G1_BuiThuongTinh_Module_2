package _16_IO_textfile.bai_tap;

import java.io.*;

public class CopyFileExample {
    public static void main(String[] args) throws IOException  {
        //Đường dẫn cho file nguồn và file đích.
        File source = new File("src\\_16_IO_textfile\\bai_tap\\Data\\file.txt");
        File target = new File("src\\_16_IO_textfile\\bai_tap\\Data\\file2.txt");
        //Tạo instance của class FileInputStream và FileOutputStream.
        InputStream is =  null;
        OutputStream os = null;
        try {
            is = new FileInputStream(source);
            os = new FileOutputStream(target);
            //Cấp phát 1024 byte để chứa nội dung đọc từ file.
            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer)) > 0 ){
                os.write(buffer, 0 , length);
            }
        }finally {
            if (is != null){
                is.close();
            }
            if (os != null){
                os.close();
            }
        }

    }


}
