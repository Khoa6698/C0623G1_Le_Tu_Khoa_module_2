package ss16_binary_file_serialization.bai_tap.copy_file_binary;

import java.io.*;

public class CopyFileBinary {
    private static void copyFile(String sourceFile,String targetFile) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(sourceFile);
        FileOutputStream fileOutputStream = new FileOutputStream(targetFile);
        byte[] bytes = new byte[1024];
        int bytesRead;
        while ((bytesRead = fileInputStream.read())!=-1){
            fileOutputStream.write(bytes,0,bytesRead);
        }
    }

    private static boolean checkSourceFile(String sourceFilePath){
        File sourceFile = new File(sourceFilePath);
        if(!sourceFile.exists()){
            System.out.println("Loi: tep dich khong ton tai");
            return false;
        }
        return true;
    }

    private static boolean checkTargetFile(String targetFilePath){
        File targetFile = new File(targetFilePath);
        if(targetFile.exists()){
            System.out.println("Tep dich da ton tai");
            return true;
        }
        return false;
    }

    private static void displayFile(String targetFilePath){
        File targetFile = new File(targetFilePath);
        long fileSize = targetFile.length();
        System.out.println("So file trong tep dich: "+fileSize);
    }

    public static void main(String[] args) {
        String sourceFilePath = "C:\\Users\\admin\\IdeaProjects\\module2\\src\\ss16_binary_file_serialization\\bai_tap\\copy_file_binary\\source.dat";
        String targetFilePath = "C:\\Users\\admin\\IdeaProjects\\module2\\src\\ss16_binary_file_serialization\\bai_tap\\copy_file_binary\\target.dat";
        try {
            if(checkSourceFile(sourceFilePath)&&!checkTargetFile(targetFilePath)){
                copyFile(sourceFilePath,targetFilePath);
                displayFile(targetFilePath);
            }
        }catch (IOException e){
            System.out.println("Loi: Khong the sao chep tep.");
        }
    }
}
