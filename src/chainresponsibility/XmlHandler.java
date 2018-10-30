/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chainresponsibility;

/**
 *
 * @author land
 */
public class XmlHandler extends Handler {

    @Override
    public void handle(String fileName) {
        if (canHandleFile(fileName, ".xml")) {
            System.out.println("Um handler de xml está processando arquivo: " + fileName);
        } else {
            super.handle(fileName);
        }

    }

}
