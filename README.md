# ![University Logo](https://github.com/DavidJLS102/hangmanGame/blob/experiment/interface/logoU.jpeg) HangMan Game
Members: David López & Paul Cumbal

# Technologies Used
* Code: Java
* JDK version: JDK17
* IDE: Netbeans 22

> [!NOTE]
> To run the program you must install JDK version 17 or higher.

# Description
Our project is a hangman game that has 3 frames:
1. The first is a welcome to the game (Image 1).
2. The second Frame (Main) is the game that consists of the Scratch character that generates body parts according to the attempts when trying to guess the letter, additionally, there are 4 rows of buttons from A to Z that are deactivated once they are pressed, the reset button resets the scores in frame 3 which can be accessed with the "Scores" button, finally a TextPanel where the letters of the The word is updated only if the pressed button contains a letter of a random word generated from a database (Image 2).
3. The third frame is a score table for players 1 and 1, it has a button to return to the game, that is, to the Main (Image 3).

## Frame1:
![image](https://github.com/DavidJLS102/hangmanGame/blob/experiment/interface/Frame1.png)
## Main:
![image](https://github.com/DavidJLS102/hangmanGame/blob/experiment/interface/Main.png)
## Frame2:
![image](https://github.com/DavidJLS102/hangmanGame/blob/experiment/interface/Frame2.png)

# Usage 
* Press Play in the first menu
* In the second menu, start pressing the buttons according to the key and the letter you want to test.
* Each player has 6 attempts to guess the word
* When the attempts run out, a message appears indicating that you have exhausted your attempts and give way to the other player.
* For each word guessed, the player continues playing until he or she loses. Each word is worth 100 points to the player and is shown in the scores menu.
  
# Functional and non-functional requirements 

|       Functional Requirements       |       Non-functional requirements       |
|:------------------------------------|:----------------------------------------|
| *Start a new game*.- The game must be able to start a new game with a randomly selected word | *Performance*.- The game must respond quickly to user actions |
| *Guess letters*.- The program must check if the guessed letter is in the word | *Usability*.- The game interface must be intuitive and easy to use |
| *Player turn change*.- The game must allow players to change turns | *Maintainability*.- The code must be structured and commented appropriately to facilitate future modifications |
| *Check end of game*.- Check if you have finished, either because the word was guessed or because the attempts were exhausted. | *Portability*.- The game should be executable on different computers as long as you have the appropriate environment to run Java applications. | 

> [!TIP]
> If you do not have the JDK installed, install it from the official Oracle website: https://www.oracle.com/java/technologies/downloads/
 
