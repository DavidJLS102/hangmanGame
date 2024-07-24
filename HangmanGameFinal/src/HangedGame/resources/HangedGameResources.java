package HangedGame.resources;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.util.ArrayList;


public class HangedGameResources {
     private static final int BUTTON_COUNT = 27;
    private static final int IMAGE_COUNT = 7;
    
    private JButton[] buttons;
    private ImageIcon[] images;
    private String[] words;

    public HangedGameResources() {
        initializeButtons();
        initializeImages();
        initializeWords();
    }
    
    private void initializeButtons() {
        buttons = new JButton[BUTTON_COUNT];
        // La inicialización real de los botones se hará en la clase Main
    }
    
    private void initializeImages() {
        images = new ImageIcon[IMAGE_COUNT];
        for (int i = 0; i < IMAGE_COUNT; i++) {
            images[i] = new ImageIcon(getClass().getResource("/HangedGame/sources/" + (i+1) + ".jpg"));
        }
    }
    
    private void initializeWords() {
        DatabaseConnector dbConnector = new DatabaseConnector();
        ArrayList<String> wordList = dbConnector.getWords();
        words = new String[wordList.size()];
        words = wordList.toArray(words);
    }
    
    public JButton[] getButtons() {
        return buttons;
    }

    public ImageIcon[] getImages() {
        return images;
    }

    public String[] getWords() {
        return words;
    }
    
    public void setButton(int index, JButton button) {
        if (index >= 0 && index < BUTTON_COUNT) {
            buttons[index] = button;
        }
    }
}