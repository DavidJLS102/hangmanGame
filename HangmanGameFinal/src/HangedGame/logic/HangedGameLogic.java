package HangedGame.logic;

import java.util.Random;

public class HangedGameLogic {
    private static final int MAX_ATTEMPTS = 6;

    private String[] words;
    private String currentWord;
    private int attempts;
    private boolean[] guessedLetters;
    private boolean player1Turn;

    public HangedGameLogic(String[] words) {
        this.words = words;
        startNewGame();
    }

    public void startNewGame() {
        currentWord = selectRandomWord();
        attempts = MAX_ATTEMPTS;
        guessedLetters = new boolean[26]; // Para el alfabeto inglés
        // No cambiamos el turno aquí
    }

    private String selectRandomWord() {
        Random random = new Random();
        return words[random.nextInt(words.length)];
    }

    public boolean guessLetter(char letter) {
        int index = letter - 'A';
        if (index < 0 || index >= 26 || guessedLetters[index]) {
            return false; // Letra inválida o ya adivinada
        }

        guessedLetters[index] = true;
        
        if (currentWord.indexOf(letter) == -1) {
            attempts--;
            return false; // Letra no está en la palabra
        }      
        return true; // Letra adivinada correctamente
    }

    public void switchTurn() {
        player1Turn = !player1Turn;
    }

    public boolean shouldSwitchTurn() {
        return attempts <= 0;
    }

    public boolean isGameOver() {
        return attempts <= 0 || isWordGuessed();
    }

    public boolean isWordGuessed() {
        for (char c : currentWord.toCharArray()) {
            if (!guessedLetters[c - 'A']) {
                return false;
            }
        }
        return true;
    }

    // Getters
    public String getCurrentWord() { return currentWord; }
    public int getAttempts() { return attempts; }
    public boolean isPlayer1Turn() { return player1Turn; }
    public boolean[] getGuessedLetters() { return guessedLetters; }
    
    // Nuevo método para inicializar el juego
    public void initializeGame() {
        player1Turn = true;
        startNewGame();
    }
}