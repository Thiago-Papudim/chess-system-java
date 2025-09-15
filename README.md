# ♟️ Chess System Java

[![Java](https://img.shields.io/badge/Java-8%2B-orange)](https://www.oracle.com/java/technologies/javase-downloads.html)
[![Build](https://img.shields.io/badge/build-passing-brightgreen)](#)

A **chess system in Java**, developed to run on the **console**.
The project implements all the basic rules of chess, such as piece movement, capture, check, checkmate, and special moves.

---

## ⚙️ Functionalities

✔️ 8×8 board representation
✔️ Pieces: **Pawn, Rook, Knight, Bishop, Queen, King**
✔️ Valid moves with capture
✔️ Detection of **check** and **checkmate**
✔️ Display of captured pieces
✔️ Interactive interface via console
✔️ Exception handling and invalid inputs

---

## 🗂️ Project Structure

chess-system-java/
├── src/
│ ├── application/ # Main class and UI (input/output)
│ ├── chess/ # Chess logic: ChessMatch, ChessPiece, ChessPosition, exceptions
│ ├── chess/pieces/ # Implementations of each piece (Pawn, King, etc.)
│ └── boardgame/ # Generic classes for board, position, etc.
├── .gitignore
└── README.md

---

## 🧪 How to use / execute

1. **Prerequisites**
   - Java installed (version 8+ or as specified in the project).
   - Git (if cloning the repository).

2. **Clone the repository**

   ```bash
   git clone https://github.com/Thiago-Papudim/chess-system-java.git
   cd chess-system-java
   ```

3. **Compile**

  In the root directory (which contains src/), compile using javac. For example:

  javac -d out src/chess/*.java src/chess/pieces/*.java src/boardgame/*.java src/application/*.java

  Or use your IDE (Eclipse, IntelliJ, VSCode etc.) importing as a Java project.

4. ▶️ **Execute**

  After compilation, execute the main class:
  
  java -cp out application.Program
  Or, if using an IDE, execute Program.main(...) in the application.Program class.

5. 🖥️ **Usage example**

- The program will print the initial board.

8 R N B Q K B N R
7 P P P P P P P P
6 - - - - - - - -
5 - - - - - - - -
4 - - - - - - - -
3 - - - - - - - -
2 P P P P P P P P
1 R N B Q K B N R
  a b c d e f g h

- It will ask for a source position ("Source: "). You type something like e2.

- Then it will show the possible moves of the chosen piece.

- Then it asks for the target position ("Target: "), for example e4.

- The game continues until checkmate occurs.

👤 Author

Thiago Soares
