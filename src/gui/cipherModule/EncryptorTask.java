package gui.cipherModule;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;

import javafx.concurrent.Task;
import javafx.util.Pair;

/**
 * Class for scheduling Tasks for encryption processes to be
 * executed in background
 */
public class EncryptorTask extends CryptoTask {


    /**
     * EncryptorTask constructor
     *
     * @param encryptor FileEncryptor object used in ciphering processes
     * @param freezeGUI interface used for freezing GUI form inside Task
     * @param unfreezeGUI functional interface used for unfreezing GUI form inside Task
     */
    public EncryptorTask(FileEncryptor encryptor, INotifier freezeGUI, BiConsumer<List<String>, List<String>> unfreezeGUI) {
        super(encryptor, freezeGUI, unfreezeGUI);
    }


    /**
     * Function calling proper method for encryption
     *
     * @param src String source filepath
     * @param dst String destination filepath
     * @throws IOException     when an error occurs during file IO operations
     * @throws CryptoException when an error occurs during ciphering process
     */
    protected void methodCall(String src, String dst) throws IOException, CryptoException {
        this.encryptor.encrypt(src, dst);
    }

}
