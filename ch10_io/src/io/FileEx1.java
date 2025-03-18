package io;

import java.io.File;

public class FileEx1 {
    public static void main(String[] args) {
        File file = new File("c:/temp/test1.txt");
        File file2 = new File("c:/temp", "test1.txt");

        File dir = new File("c:temp");
        File file3 = new File(dir, "test1.txt");

        System.out.println("경로를 제외한 파일명 : " + file.getName());
        // file.getName() => String 메소드 이용
        String filename = file.getName();
        System.out.println("확장자를 제외한 파일명 : "
                + filename.substring(0, filename.lastIndexOf(".")));

        int pos = filename.lastIndexOf(".");
        System.out.println("확장자 제외" + filename.substring(0, pos));
        System.out.println("확장자" + filename.substring(pos + 1));
        System.out.println("경로 포함 " + file.getPath());
        System.out.println("절대 경로 포함 " + file.getAbsolutePath());
        System.out.println("파일의 디렉토리 " + file.getParent());

        System.out.println("" + File.separator);
        System.out.println("" + File.separatorChar);
        System.out.println("" + File.pathSeparatorChar);
        System.out.println("" + File.pathSeparator);

    }
}
