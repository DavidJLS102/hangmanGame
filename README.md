#                                  HangMan Game
Members: David López & Paul Cumbal

# Technologies Used
* Code: Java
* JDK version: JDK17
* IDE: Netbeans 22

# Description
Our project is a hangman game that has 3 frames:
1. The first is a welcome to the game (Image 1).
2. The second Frame (Main) is the game that consists of the Scratch character that generates body parts according to the attempts when trying to guess the letter, additionally, there are 4 rows of buttons from A to Z that are deactivated once they are pressed, the reset button resets the scores in frame 3 which can be accessed with the "Scores" button, finally a TextPanel where the letters of the The word is updated only if the pressed button contains a letter of a random word generated from a database (Image 2).
3. The third frame is a score table for players 1 and 1, it has a button to return to the game, that is, to the Main (Image 3).

## Frame1:
![image](https://github.com/DavidJLS102/hangmanGame/blob/experiment/interface/Captura%20de%20pantalla%202024-07-23%20225108.png)
## Main:
![image](https://github.com/DavidJLS102/hangmanGame/blob/experiment/interface/Captura%20de%20pantalla%202024-07-23%20225237.png)
## Frame2:
![image](https://github.com/DavidJLS102/hangmanGame/blob/experiment/interface/Captura%20de%20pantalla%202024-07-23%20225258.png)

# Usage 
* Press Play in the first menu
* In the second menu, start pressing the buttons according to the key and the letter you want to test.
* Each player has 6 attempts to guess the word
* When the attempts run out, a message appears indicating that you have exhausted your attempts and give way to the other player.
* For each word guessed, the player continues playing until he or she loses. Each word is worth 100 points to the player and is shown in the scores menu.
