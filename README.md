# 🧭 HCW-PRG1-StudyMap – Programmieren 1 (Hochschule Campus Wien | University of Applied Sciences Campus Wien)

✨ Author

Marina Minkova
BB28 Computer Science
📍 Vienna, Austria

⚖️ License

This project is for educational and personal learning.
Reuse for your own study is allowed – please give credit if shared publicly.


> 📚 My current collection of **Java exercises, solutions, and study notes**  
> for *Hochschule Campus Wien – Programmieren 1 (Winter 2025)*  
> including personal elaborations, class examples, homework, and skeleton templates.

---

## 📦 Project Overview

This project is a structured IntelliJ IDEA workspace that collects everything from the course:
- 💡 Lecture examples rewritten for better understanding  
- 🧮 Exercise solutions (Übungen, Hausaufgaben, Midterm practice)  
- 🧱 Reusable **skeleton templates** for pattern tasks and logic building  
- 🗺️ “StudyMap.java” – an open-book style reference with key explanations  

Everything is written in plain **Java 21**, with heavy commenting for self-study and debugging.

---

## 🧩 Folder Structure

```text
src/
 ├── example_tasks/                         # My elaborated Midterm + Übungs examples
 │    ├── Midterm1/
 │    │    └── actualexam1b/
 │    │         ├── App.java
 │    │         ├── A1_RandomMonth.java
 │    │         ├── A1_ZipCodeChecker.java
 │    │         ├── A2_CheatSheet.java
 │    │         ├── A2_MonthMapper.java
 │    │         ├── B1_CompareDoubles.java
 │    │         ├── C1_CashRegister.java
 │    │         ├── C2_PowerOfTen.java
 │    │         ├── D1_LengthAndUnitConverter.java
 │    │         ├── D1_RotateLetters.java
 │    │         ├── D2_IncomeStatistics.java
 │    │         ├── D2_SumUp.java
 │    │         ├── PV1_VersandkostenKalkulator.java
 │    │         ├── PV2_Mustergenerator.java
 │    │         ├── PV3_GuessingGame.java
 │    │         ├── RND1_CompareDoubles.java
 │    │         ├── RND2_MagicSquare.java
 │    │         ├── RND3_Encrypt.java
 │    │         ├── RND4_DiscountCalculator.java
 │    │         └── RND5_FloatCompareExample.java
 │    │
 │    └── Midterm2/
 │         ├── cardgame/
 │         │    ├── Card.java
 │         │    ├── CardGameApp.java
 │         │    ├── Game.java
 │         │    └── Player.java
 │         │
 │         ├── mytunes/
 │         │    ├── Music.java
 │         │    ├── MusicApp.java
 │         │    └── MyTunes.java
 │         │
 │         ├── shoppingcart/
 │         │    ├── Cart.java
 │         │    ├── Product.java
 │         │    └── ShoppingApp.java
 │         │
 │         └── storynode/
 │              ├── AdventureGame.java
 │              ├── Item.java
 │              └── StoryNode.java
 │
 ├── folien/
 │    ├── datatypes_operators_controlstructures/
 │    │    ├── d1_MinOfThree.java
 │    │    ├── d2_SafeDivide.java
 │    │    ├── d3_SignClassifier.java
 │    │    ├── d4_TinyCalculatorSwitch.java
 │    │    ├── d5_StringEqualsDemo.java
 │    │    └── d6_EvenOdd_Modulo.java
 │    │
 │    ├── intro/
 │    │    └── i1_ScannerPrint.java
 │    │
 │    ├── loops/
 │    │    ├── l1_Countdown.java
 │    │    ├── l2_FactorialCalculator.java
 │    │    ├── l3_PasswordRetry.java
 │    │    ├── l4_ReversedStairs.java
 │    │    ├── l5_CountDigits.java
 │    │    └── l6_SumUntilMinusOne.java
 │    │
 │    ├── methods/
 │    │    ├── m1_PrintUntilNumber.java
 │    │    ├── m2_SumOfNumbers.java
 │    │    ├── m3_IsEvenDemo.java
 │    │    └── m4_CoimposeMethods.java
 │    │
 │    └── oop1/
 │         ├── cats/
 │         │    ├── Cat.java
 │         │    └── CatApp.java
 │         │
 │         ├── cars/
 │         │    ├── Car.java
 │         │    └── CarApp.java
 │         │
 │         └── students/
 │              ├── Student.java
 │              └── StudentApp.java
 │
 ├── homeworks/                             # Homework sets (Exercises 01–05)
 │    ├── hm1/
 │    │    └── Exercises01.java
 │    ├── hm2/
 │    │    └── Exercises02.java
 │    ├── hm3/
 │    │    └── Exercises03.java
 │    ├── hm4/
 │    │    ├── App.java
 │    │    ├── Car.java
 │    │    ├── ParkingGarage.java
 │    │    ├── ParkingSpot.java
 │    │    └── Task4.java
 │    └── hm5/
 │         ├── Player.java
 │         ├── Task5.java
 │         └── TicTacToe.java
 │
 └── skeletons/                             # Utility snippets and reusable blueprints
      ├── general/
      │    ├── CherryPicksAndTricks.java
      │    ├── CherryPicksGeneral.java
      │    ├── CherryPicksAbridged.java
      │    ├── QuickReferenceGuide
      │    └── StudyMap.java
      │
      └── oop/
           ├── OOP1SkelSimple.java
           ├── Sk_0_ReferenceMap.java
           ├── Sk_A_Entity.java
           ├── Sk_B_ArrayManager.java
           ├── Sk_C_SlotAndSlotManager.java
           ├── Sk_D_StaticTrackedEntity.java
           ├── Sk_E_CliMenuApp.java
           ├── Sk_F_GridGame.java
           └── Sk_G_StoryNodeAndController.java

```
## 💡 Topics Covered

| Category                     | Content                                             |
|------------------------------|-----------------------------------------------------|
| 🏁 **Intro**                 | Structure of a Java program, `main()`, console I/O  |
| 🔢 **Datatypes & Operators** | int, double, boolean, arithmetic, type casting      |
| ⚙️ **Control Structures**    | `if`, `else`, `switch`, logical operators           |
| 🔁 **Loops**                 | `for`, `while`, `do-while`, nested loops            |
| 🧮 **Methods**               | parameters, `void` vs return values, modular design |
| 🧮 **OOP**                   | Classes, Constructors etc                           |
| 🧠 **Practice Tasks**        | pattern printing, mini-calculators, guessing games  |
| 🗺️ **StudyMap**             | condensed cheat-sheet with sources & short examples |

---

## 🧷 Requirements

- Java 17 or newer, 21 Corretto preferred
- IntelliJ IDEA (Community Edition is fine)  
- JDK configured under *Project Structure → SDK*

---


