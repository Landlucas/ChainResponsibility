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
public class Handler {

    private Handler successor;

    public void handle(String fileName) {
        if (getSuccessor() != null) {
            getSuccessor().handle(fileName);
        } else {
            System.out.println("Não foi encontrado handler para processar arquivo: " + fileName);
        }
    }

    protected boolean canHandleFile(String fileName, String format) {
        return (fileName == null) || (fileName.endsWith(format));
    }

    Handler getSuccessor() {
        return successor;
    }

    void setSuccessor(Handler successor) {
        this.successor = successor;
    }

}
