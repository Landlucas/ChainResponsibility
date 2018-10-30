/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chainresponsibility;

import java.util.ArrayList;
import java.util.List;

public class ChainResponsibility {

    /**
     * @param args
     */
    public static void main(String[] args) {

        List<String> fileList = addFiles();

        Handler xmlHandler = new XmlHandler();
        Handler imageHandler = new ImageHandler(xmlHandler);
        Handler textHandler = new TextHandler(imageHandler);

        for (String fileName : fileList) {
            textHandler.handle(fileName);
        }

    }

    private static List<String> addFiles() {

        List<String> fileList = new ArrayList<>();
        fileList.add("arquivo.txt");
        fileList.add("arquivo.xml");
        fileList.add("arquivo.jpg");
        fileList.add("arquivo.docx");

        return fileList;
    }

}
